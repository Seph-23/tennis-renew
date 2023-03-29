## TODO LIST

#### 4월23일까지
  - JAVA11로 다운그레이드
    - 버전 별 특징 정리
    - 11 버전을 선택한 이유
  - 커뮤니티, 동호회, 대회 쳐내고
  - 매치, 랭킹, 회원가입, 로그인 - refactor

  - DTO 빌더패턴
    - DTO 사용 안하는 컨트롤러 많음 -> 엔티티 타임리프에 주입 (수정해야 함)
    - 엔티티 service 위로 안올라오게
  - 엔티티
    - 연관관계 다시 설계 (4/4)
    - JPA 다시 공부
  - 로깅 추가
    - 유저 활동 내역 
    - print문 없애기
  - 테스트
    - JUnit5, AssertJ, Mockito
    - 스케줄러 테스트

**chan**

**seph**




backend code convention : https://www.notion.so/Code-Convention-4440b33250cc47c0bc9e34cf24505ee3

git commit message convention : https://gist.github.com/brianclements/841ea7bffdb01346392c
                                https://velog.io/@outstandingboy/Git-%EC%BB%A4%EB%B0%8B-%EB%A9%94%EC%8B%9C%EC%A7%80-%EA%B7%9C%EC%95%BD-%EC%A0%95%EB%A6%AC-the-AngularJS-commit-conventions



1. println문 없애기 내부적으로 싱크로나이즈드가 걸려져 있어서 병목 현상이 일어남
   → 로그로
2. e.printStackTrace(); 사용하지 않기 이유 찾아봐라 → 로그로
3. controller에서 try catch 쓰면 어캄
4. API 겹치는 url은 class단으로 빼기
5. RequiredArgsConstructor 사용이 비일관적임
6. 왜 이슈 + PR 단위로 안 했냐
7. 컨트롤러에서 리포지토리 바로 찌르지 않기 → service 거쳐라 (왜? DDD에선 된댔는데)
8. LocalDateTime 대신 Instant 사용이 낫다. → 블로그 참고
9. 어차피 롬복 쓸거면 빌더 패턴 쓰는 것도 좋다.
10. 엔티티 웬만하면 Setter 빼고 별도의 메서드로 객체 생성해라.
11. State 정의 Enum들 안에서만 쓰는 경우 Entity 안에서 써도 됨 (본인은 그렇게 한다)
12. NoArgsConstuctor access 범위 PROTECTED 왜 적용 하다 말다 하냐
13. JPA 다시 공부 해야한다 Lecture에서 Self Join??
    → JPA가 좀 심한데, 전부 이유를 설명할 수 있어야함.
    이유를 설명할 수 없는 프로젝트는 없는 것이 낫다.
14. 내 Member에서 AllArgs 컨스트럭터가 났다
15. 런타임 익셉션 체크드 익셉션 언체크드 익셉션 공부
16. 익셉션 핸들링 전략들 찾아보고 적용하기
17. 리드는 트랜젝션 리드 온리로 처리해야 한다.
18. 검증 밸리드 로직들 빼다 안 빼다 X 걍 다 메서드로 빼라 → 한줄만 보고 검증을 하는구나
19. Authenticationl Service static 왜 있나?
    사실상 용도가 밸리데이터지 서비스가 아니다.
    널 체크도 안 하고 있다. equals 체크 하기엔 꼭 null 체크를 해줘야 한다.
    객체.equals(입력으로 들어온 필드)이런거면 ㄱㅊ은데
    입력으로 들어온 필드.equals(객체) 이런건 무모하다.

100프로 확신이 없으면 null 체크 다 해줘야함
20. Java 11 왜 안정적이냐 → 그냥 남의 추천 받고 하는건 문제 있는 습관.
    줏대가 없다. 무조건 전부 이유가 있어야 한다.
    자바 17의 경우엔 Text Block이란게 있다 → email 서비스에 고려해라
21. 매직넘버 빠트린 것들 추가 → 테스트 코드 작성할 수가 없다.
22. Redis 쓰려면 Serialize화 해야한다. 자바 독스로 내부 봐라.
    자바에서 자동으로 Serialize 해줌 → marker interface 찾아보기
23. String.valueOf 쓰면 안 된다.
    null이 들어올 경우 “null”로 만든다.
    redis 사용시 방어로직이 없다.
24. 리드하는 애들은 리드온리 트랜잭션 (true openLectureAndGetAttendentMember)
25. 프로덕션 디밸론 분리 추천 → jasypt, 볼트, jws 파라미터 스토어
26. 빌드에 대한 고민 필요
27. 결론 : 자바와 기본기를 더 공부, 알고리즘은 하던 대로, 기본이 중요. DDD도 아직 배울 때 아니다. 현직에서도 쓰네 마네 하기 때문.
    그리고 이유가 부족한게 많다. 이유가 없는데 쓴 기술은 이력서에서 빼는게 나을 정도
    많은 RDB중에 왜? 많은 Java 버전 중에 왜? 전부 명확한 대답이 있어야 한다.
    물론 필요해서 만든거지만, 이제 프로젝트는 그만.. 기술은 머리 깨져가며 고민하면 누구나 쓸 수 있다.  취준때는 기본에 더 집중하면 된다.