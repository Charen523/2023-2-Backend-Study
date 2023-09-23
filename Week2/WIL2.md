# HTTP
## HTTP란?
    -서로 다른 시스템들 사이에서 통신을 주고 받게 해주는 application 계층의 protocol 
    -웹 전용 프로토콜 
    -HT(링크 문서)T(이동통신)P(규약)
## HTTP 특징
    -transfer layer: TCP/IP 기반 요청&응답 전송
    (TCP: 신뢰성  UDP: 속도)
    -connectionless: 응답 마치면.
    -stateless: 정보 저장x -> 클라이언트 식별x
## HTTP 연결
    1. TCP 연결 개방. (new or old)
    2. HTTP 메세지 전송
    3. 응답 확인
    4. 닫거나 재사용
## HTTP Message
    -종류: request & respond
    -구조: http method, 경로, http 버전
           헤더
## HTTP Method
    -GET    : 리소스 조회
    -POST   : 요청 데이터 처리(등록)
    -PUT    : 리소스 생성/대체
    -PATCH  : 리소스 부분 변경
    -DELETE : 리소스 삭제
    
    -HEAD   : GET에서 상태줄과 헤더만 반환
    -OPTIONS: 대상에 대한 통신가능 옵션 설명(CORS에서 사용)
    -CONNECT: 대상으로 식별되는 서버에 대한 터널 설정
    -TRACE  : 대상에 대한 경로를 따라 메세지 루프백 테스트 시행
## HTTP 상태코드
    : 요청에 관한 처리 상태 알림
    - 1XX(Informational): 요청이 수신되어 처리중
    - 2XX(Successful): 요청 정상처리
    - 3XX(Redirection): 요청을 완료하려면 추가 행동 필요
    - 4XX(Client Error): 잘못된 문법 등으로 요청 수행 불가
    - 5XX(Server Error): 서버가 정상요청을 처리 못함
    *자주 쓰는 코드
    - 200: 요청 정상 수행
    - 201: 리소스가 성공적으로 생성됨
    - 204: 리소스가 성공적으로 삭제됨
    - 400: 클라이언트 요청 부적절
    - 401: 비인증 클라이언트가 보호 리소스 요청
    - 403: 응답하고 싶지 않은 리소스 요청
    - 404: 클라이언트가 요청한 리소스에서 사용불가한 Method 이용
    - 500: 서버 문제
    - 502: 게이트웨이 오류

## REST(Representational State Transfer)    
    -웹의 장점을 최대한 활용할 수 있는 네트워크 기반 아키텍처
    -자원을 이름으로 구분하여 그 상태를 주고받는 모든 것
## REST 구성요소
    1. 자원: 각각의 데이터, 이미지.
    2. 조작: Method의 행동/결과
    3. 표현: 자원 조작 요청에 대한 응답
## REST 원칙
    -Uniform Interface: 플랫폼 종속x
    -Stateless: 상태 저장x
    -Resource Orientated Architecture: 자원 기반 복수형 명사 형태의 정의 권장
    -Client-Server Architecture
    -Cacheable: 캐싱 처리 가능
    -Layered System: 다중계층 가능, 구조상 유연성o, 중간매체o
    -Self-descriptiveness: 쉽게 이해가능

## RESTful Api 디자인 가이드
    1. URI 리소스명: 소문자/명사>동사/복수>단수
    2. 자원에 대한 행위: HTTP 메서드로 표현
    3. -은 가독성, _이용X
    4. /는 계층 관계, 마지막으로 사용X
    5. 확장자는 URI에 미포함

## Web Server
    -하드웨어: WEB 서버 설치된 컴퓨터
    -소프트웨어: HTTP요청을 받고 컨텐츠를 제공하는 프로그램
    -기능: 정적 컨텐츠 제공, 동적 컨텐츠 제공을 위한 요청 전달
## WAS (Web Application Server)
    -DB 조회 및 다양한 로직 처리 요구 시 동적 컨텐츠를 제공하기 위해 만들어진 에플리케이션 서버
    -HTTP로 에플리케이션을 수행해주는 미들웨어
    -웹 컨테이너/서블릿 컨테이너(컨테이너=JSP, Servlet 실행가능 SW)
    -역할
        1. 웹서버+웹컨테이너
        2. 웹서버 기능을 구조적으로 분리하여 처리
        3. 보안, 스레드 처리, 분산 트랜잭션 등 분산 환경에서 사용 
    -기능
        1. 실행환경 및 DB 접속기능 제공
        2. 여러 트랜잭션 관리 기능
        3. 업무 처리 비즈니스 로직 수행
## WAS와 웹서버를 구분하는 이유
    -웹서버: 정적 컨텐츠만 처리하도록 해서 서버 부담 줄임
    -WAS: 요청 데이터를 비즈니스 로직에 맞게 제공, 자원 효율적 활용
    -WAS를 웹으로 쓰지 않는 이유
        1. 서버 부하 방지
        2. 물리적 분리로 보안 강화
        3. 여러 대의 WAS 연결
        4. 여러 웹 어플 서비스 가능
        5. 웹에서 처리할 때 효율적인게 있음

# HTTPS
## HTTPS란?
    -HyperText Transfer Protocol over *Secure* Socket Layer
    -즉, S는 보안의 약자
## HTTPS VS HTTP
    -HTTP 장점: 접속 도중 끓기더라도 이어할 수 있어 시간을 낭비하지 않음.
    -HTTP 단점: 암호화되지 않은 상태로 클라이언트와 정보를 주고받을 수 있어서 정보를 가로챌 수 있는 위험 존재
    -HTTPS 장점: 보안성이 매우 강함. 은행, 쇼핑몰, 정부 사이트 등에서 주로 이용.
    -HTTPS 단점: 암호화된 정보를 교환하기 때문에 서버에 과부하가 걸리는 경우 발생, 접속이 끊기면 처음부터 시작해야 함.

    -HTTP에서 보안성을 강화한 상위버전이 HTTPS이며, 둘의 속도차이는 사용자로서 체감하기 힘듬. 따라서 HTTPS의 사용이 권장됨.

# API에 대한 RESTful한 URI 설계
    -이벤트 목록조회: GET /events/list
    -이벤트 조회: GET /events/{event-name}
    -이벤트 등록: POST /events/{event-name}
    -이벤트 수정: POST /events/{event-name}
    -이벤트 삭제: DELETE /events/{event-name}
    -이벤트 상태 변경: PATCH /events/{event-name}/status
    -특정 이벤트의 주문 목록 조회: GET /events/{event-name}/list
    -멤버 목록 조회: GET /members/list
    -특정 멤버 권한 변경: PATCH /members/{memberId}/authority
    -특정 멤버 정보 조회: GET /members/{memberId}/status
    -특정 멤버 정보 변경: PATCH /members/{memberId}/status
    -멤버 등록: POST /members/{memberId}