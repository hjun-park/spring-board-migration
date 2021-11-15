# spring-board-migration
[코멘토] 스프링 마이그레이션



1차 피드백
[pom.xml]
- 버전을5.2.3, mysql connect 버전 수정해야할 것 같다. 

[root-context.xml] 
 - properties를 가지고 계정정보를 저장할 필요

 
[mapper]
parameter type


<jdbc template와 mybatis 차이> 
db담당자와 백엔드 간 할 때 spring jdbc template는 자바코드도 봐야한다.
 근데 mybatis를 이용하면 sql만 볼 수 있게되므로,  좀 더 간편하게 작업이 된다.
jdbc template의 경우 쿼리와 자바코드를 같이봐야하는 것이 문제가 된다.
단점은, 같이 협업 시에 조금 더 불편해지고 템플릿을 쓰는 회사는 없을 것이다. 
