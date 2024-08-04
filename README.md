# My Board
이 프로젝트는 게시글 CRUD, 댓글 CRUD, 페이징, 검색, 첨부파일 업로드 및 다운로드, 회원가입 및 로그인 기능을 포함한 일반적인 게시판을 구현합니다. (수정하기)
<br>

## 1. 프로젝트 목적 및 개발 기간
### 목적 (상세하게)
스프링부트를 이용한 웹 애플리케이션 개발 연습 및 CRUD 기능 구현을 통한 전체적인 흐름 파악을 목적으로 개발하였습니다.
### 개발 기간
2024.07.01 ~ 2024.08.01

<br>

## 2. 기술 스택 및 개발 환경
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/spring%20boot-6DB33F?style=for-the-badge&logo=spring%20boot&logoColor=white"> <img src="https://img.shields.io/badge/mybatis-B7DDB5?style=for-the-badge&logo=mybatis&logoColor=black">

<img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white">

<img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"> <img src="https://img.shields.io/badge/css3-1572B6?style=for-the-badge&logo=css3&logoColor=white"> <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"> <img src="https://img.shields.io/badge/thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white">

<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">

<img src="https://img.shields.io/badge/intellij%20idea-000000?style=for-the-badge&logo=intellij%20idea&logoColor=white"> <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">

<br>

## 3. 아키텍처 및 디렉토리 구조
```
Board
│   README.md
│   build.gradle
│   ...기타 파일
├───src
│    ├───main
│    │    └──java
│    │        └───com
│    │            └───study
│    │                ├───aop
│    │                ├───common
│    │                │        ├───dto
│    │                │        ├───file
│    │                │        └───paging
│    │                ├───config
│    │                ├───domain
│    │                │        ├───comment
│    │                │        ├───file
│    │                │        ├───member
│    │                │        └───post
│    │                └───interceptor
│    └───────resources
│             ├───mappers
│             ├───static
│             │        ├───css
│             │        ├───images
│             │        └───js
│             └───templates
│                      ├───common
│                      ├───fragments
│                      ├───layout
│                      ├───member
│                      └───post
└───test
```

<br>

## 4. 화면 구성 (표로 작성 하기)
#### 메인 페이지
  ![메인 페이지](path/to/mainpage/image)
#### 게시글 작성 페이지
  ![게시글 작성 페이지](path/to/postpage/image)
#### 게시글 상세 페이지
  ![게시글 상세 페이지](path/to/detailpage/image)
#### 댓글 작성 페이지
  ![댓글 작성 페이지](path/to/postcomment/image)
#### 회원가입 및 로그인 페이지
  ![로그인 페이지](path/to/loginpage/image)

<br>

## 5. 주요 기능 (상세하게)
#### 게시글 CRUD
  - 게시글 작성, 수정, 삭제, 조회 기능
#### 댓글 CRUD
  - 댓글 작성, 수정, 삭제, 조회 기능
#### 페이징 기능
  - 게시글 리스트 페이징
#### 검색 기능
  - 게시글 제목 및 내용 검색
#### 첨부파일 기능
  - 게시글에 파일 첨부 및 다운로드 기능
#### 회원가입 및 로그인
  - 사용자 회원가입 및 로그인 기능

<br>

## 6. DB - ERD
![image](https://github.com/user-attachments/assets/164e6b67-c9d2-410c-b47b-02dc35311099)

<br>

## 7. 개선의 여지 (상세하게)
#### 보안 강화
: 사용자 인증 및 권한 부여에 대한 보안 강화
#### UI/UX 개선 
: 사용자 인터페이스 및 경험 개선
#### 성능 최적화
: 대용량 데이터 처리에 대한 성능 최적화
#### 추가 기능
: 소셜 로그인, 관리자 페이지 등 추가 기능 구현



