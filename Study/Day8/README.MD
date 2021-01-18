# 21.01.11
1. HTML복습 및 예습
2. java복습 및 예습

# 메모

* layout - blocklevel inlinelevel maxsize minsize (css레이아웃잡기가 어렵다 ㅠ)
div, li, table, li, ul 블럭레벨

````css
li {
    display: inline;
}
````
  

* 학원진도계획    
자바(+html,css)-jsp-spring   
js - sql - db설계 - 프로젝트
  

* 링크드리스트에서 트리로 가면 찾는데 시간이 덜걸리네 그래서 검색이 유리해진다
  (n- logn으로 n2-nlogn으로 시간을 단축시키는것) 자료구조의 방향

# 21.01.12
1. 미션2개 복습
2. 지네릭스복습
3. 람다14장 공부 
4. html예습 css까지

# 메모

* 초기화할떄 null은 예외발생확률이 크니깐 피하는게 좋음

  Object[] objArr = null / object[0]   
  String str = null / ""   
  null 보다는 뒤에께 좋은듯(null예외발생확률적음)
  
* 예외발생했는지 테스트 @Test(expected = exception)

# 21.01.13
1. 쓰레드복습
2. 람다, 스트림 예습

# 메모

* t extends fruit  이거는 클래스 생성할때   
  ? extends fruit 와일드 카드는 참조변수지정할때   
  용도가다름   
  지네릭타입은 무조건 같아야됨 와일드카드제외
  

* 대충진도목록(선택)   
  자바의정석   
  이펙티브자바   
  이자인패턴   
  tcp/ip   
  http   
  db모델링   
  sql튜닝   
  스프링부트   
  자료구조   


* 대충진도속도   
- (1월)   
  2주 자바의정석 끝(html,css쭉)   
  3주 jsp   
  4주 spring

- (2월)   
  spring/springboot


- (3월)   
  sql/db모델링   
  중순부터 프로젝트시작


- (4월부터)   
  프로젝트더불어서 백그라운드진도
  
# 21.01.14

1. day8 indexof null일때 아닐때-확인필요
2. css복습 - borders전까지
3. 13장쓰레드 동기화부터 예제
4. 람다&스트림 읽기
5. 람다&스트림 연습문제풀기

* HTML
  ````html
  inner html <p>여기</p>
  outer html  전부 <p></p>
  element 아얘 모두
  ````

* js로 바꾼내용은 원본이 바뀌는게 아니라 올라온 저장소가 달라지게 주무르는것     

* <a href="https://www.mediaqueri.es">mediaqueri.es</a> 참고해서 반응형 레이아웃 디자인하면 좋음    
  

* css초기화 *{} 브라우저마다 초깃값이 달라서    


* w3s 오른쪽에 howto 하나씩 해보면 좋을듯


* css selector test  w3s에 검색해서 테스트해보면좋음
  https://www.w3schools.com/cssref/trysel.asp
  

* css reflow와 repaint 경우 잘 구분하기(ex border - 레이아웃이 완전히 바뀜, outline- 페인트칠만해줌 레이아웃안바뀜)

# 21.01.18

1. java로 ftp서버 만들기 시도해보기
2. w3s css공부

# 메모

* try-with-resources를 이용한 try(여기){}에 자동close()호출됨 편함


* 가능하다면 간단한 ftp서비스 만들어보기 상대방 pc접속해서 