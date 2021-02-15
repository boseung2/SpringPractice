package com.codechobo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("hello")
	public void main() {
		System.out.println("hello");
	}
	
	@RequestMapping("hello2")
	public void main2(HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>hello2</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	
	@RequestMapping("hello3")
	public void main3(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>id=" + id + "</h1>");
		out.println("<h1>pwd=" + pwd + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	
	@RequestMapping("/hello4")
	public String main4(@RequestParam("id") String id,@RequestParam("pwd") String pwd, Model model) {
		//@RequestParam 생략가능
		
		model.addAttribute("id", id);
		model.addAttribute("pwd", pwd);
		return "hello";
	}
	
	@RequestMapping("/hello5")
	public String main5(@ModelAttribute("name") String name, @ModelAttribute("age") int age, 
			@ModelAttribute("birth") Date birth) {
		
		return "hello2";
	}
	
	@RequestMapping("/hello6")
	public String main6(@ModelAttribute("name") String name, @ModelAttribute("age") int age, 
			@ModelAttribute("birth") Date birth) {
		
		return "hello2";
	}
	
	@RequestMapping("/hello7")
	public String main7(@ModelAttribute("name") String name, @ModelAttribute("age") int age, 
			@ModelAttribute("birth") @DateTimeFormat(pattern="yy-MM-dd") Date birth) {
		
		return "hello2";
	} 
	
	@RequestMapping("/hello8")
	public String main8(@ModelAttribute User user) {
		System.out.println(user.getBirth());
		return "hello3";
	}
	
	@RequestMapping("/hello9")
	public String main9(User user, @ModelAttribute("random") int random) {
		return "hello3";
	}
	
	/*
	 * 여기부터 과제입니다.
	 * 
	 * 
	 * 
	 * 
	 */
	
	private String getValueFromIdCookie(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
        String rememberedId = "";
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals("id")) {
                    rememberedId = cookies[i].getValue();
                }
            }
        }
        return rememberedId;
    }
	
	private void deleteIdCookie(HttpServletRequest request, HttpServletResponse response) {
		Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals("id")) {
                    Cookie cookie = new Cookie("id", "");
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                    break;
                }
            }
        }
	}
	
	private boolean checkId(UserInfo user) {
		if("asdf".equals(user.getId()) && "1234".equals(user.getPwd())) {
			return true;
		}
		return false;
	}
	
	@RequestMapping("/home")
	public void home() {
		
	}
	
	
	@RequestMapping("/loginForm")
	public void loginForm(HttpServletRequest request, Model model) {
		
		String rememberedId = getValueFromIdCookie(request);
		
		model.addAttribute("rememberedId", rememberedId);
		model.addAttribute("checked", rememberedId.equals("") ? "" : "checked");
	}
	
	
	@RequestMapping("/loginAction")
	public String loginAction(UserInfo user, 
			HttpServletRequest request, HttpServletResponse response) {
		
		// 쿠키 관련
        if ("yes".equals(user.getRemember())) {
            response.addCookie(new Cookie("id", user.getId()));
        }else {
            deleteIdCookie(request, response);
        }
        
        // 세션 관련
        String uri = "";
        if (checkId(user)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("id", user.getId());
            uri = "home";
        } else {
        	uri = "loginForm";
        }
   
		return "redirect:" + uri;
	}
	
}
