# 2019-Unit-Test
단위 테스트 연습 파일입니다.

# 오늘 배운 내용 정리

>> Junit 테스트 프레임워크를 사용합니다.

# 개발자들은 왜 Unit Test를 안 만드는 이유 => 테스트를 만들 줄 모름 => 내 이야기

# 테스트 코드 위치 

![](https://user-images.githubusercontent.com/11308147/56121251-b22ec780-5faa-11e9-87c8-db69d5ee7dc0.PNG)

# JUnit Annotation

* @Test
  * 가장 기본이 되는 annotation으로 테스트하고자 하는 method에 선언함
  
* @BeforeClass, @AfterClass 
  * 해당 테스트 class가 실행전과 후에 동작할 class를 선언합니다. static 선언 필요 
  
* @Before, @After 
  * class내 test method들이 실행되기 전과 후에 동작할 class를 선언
  
* @FixMethodOrder
  * 테스트가 실행되는 순서를 정의
  
* @SuiteClasses(Class[])
  * 테스트 클래스들을 묶어서 실행할 때 사용함
  
 
 # 테스트 메소드명 이름 명명법
 
 1. 테스트 메소드명은 간결한 것보단 명확하게 설명해 주는 것이 좋음, 길더라도 테스트의 목적을 명확히 설명하길, 의미없는 메소드명은 금물
 
 2. 예전에는 메소드명 끝이나 앞에 Test를 붙여야 했지만, 최근에는 사용하지 않는 경우도 많음, 취향에 맞춰 선택하면 됨.
 
 3. 영어가 익숙하지 않아 이름 짓는데 투자하는 시간이 많다면 그냥 한글로 작성해도 무방함
 
 4. 정답은 없지만, 가장 많이 사용되는 Convention을 따르는 것을 추천
