# Spring Boot R2DBC Example Application.
1. see: [Getting Started](https://spring.io/guides/gs/accessing-data-r2dbc/)
2. see: [gs-accessing-data-r2dbc](https://github.com/spring-guides/gs-accessing-data-r2dbc)
3. see: [R2DBC](https://r2dbc.io/)
4. see: [r2dbc-postgresql](https://github.com/r2dbc/r2dbc-postgresql)
5. see: [reactive-relational-databases-r2dbc-spring](https://dimitr.im/reactive-relational-databases-r2dbc-spring)
6. see: [R2DBC ORM Relationships Support Issue](https://github.com/spring-projects/spring-data-r2dbc/issues/99)

# 소감
1. spring data commons 에서 제공하는 query method (method 이름을 통한 쿼리 생성)를 지원하지 않는다.
 - query method에 @Query annotation을 통하여 직접 쿼리를 작성해야 한다.
2. 관계형 데이터베이스(RDBMS)를 반응형으로 사용할 수 있다는 것에만 의의를 두는것이 좋을듯.
 - 정말 관계형 데이터베이스를 NoSQL 저장소 처럼만 사용할 수 있다.(Schema-less, no relational)
 - 관계형 데이터베이스에서 제공하는 제약사항 및 Join 연산을 제공하지 않는다.
  - 사실, join은 억지스럽게 @Query annotation에 join query를 직접 작성하면 가능하긴 하다..([관련 stackoverflow 링크](https://stackoverflow.com/questions/60145595/how-to-join-tables-in-r2dbc))
  - 수많은 연관관계를 일일히 직접 쿼리로 작성해야 한다면...?
  - 그리고 N+1 문제가 발생하며, fetch 전략같은 것은 지원하지 않는다.  
 - JPA와는 다른개념.(@Entity, @OneToOne, @OneToMany, @ManyToMany 등 사용할 수 없음.)

# 결론 (2020년 03월 현재)
1. 관계형 데이터베이스를 사용하지만, 관계형 데이터베이스의 기능을 사용하지 못한다면..(e.g; 아버지를 아버지라 부르지 못하는 어디선가 들어봤던 옛날 옛적 이야기가 생각난다..)
 - 관계형 데이터베이스를 반응형으로 사용할 수 있게 되었다는 장점과, 관계형 데이베이스의 특징을 이용할 수 없다는 단점을 저울질 해 보았을 때..
 - 앞으로 어떻게 발전해 나갈지는 모르겠지만, 데이터베이스에 반응형을 사용하고 싶다면, 그냥 애초부터 NoSQL을 사용하는 것이 현재로써는 나아보인다.