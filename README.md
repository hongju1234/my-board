# My Board
이 프로젝트는 게시글 CRUD, 댓글 CRUD, 페이징, 검색, 첨부파일 업로드 및 다운로드, 회원가입 및 로그인 기능을 포함한 일반적인 게시판을 구현합니다.
<br>

## 1. 프로젝트 목적 및 개발 기간
### 목적
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

## 4. 페이지별 기능
### [게시글 목록]
- 등록된 게시글은 리스트 형식으로 나타나며, 최신순으로 보여집니다.
- 모든 게시글의 번호가 먼저 등록된 순서대로 1씩 증가하여 매겨지며, 공지글로 설정된 글은 번호로 매겨지지 않고 '공지'로 표시됩니다.
- 한 페이지 당 10개의 게시글이 나타나며, 10페이지 즉 게시글 100개가 넘어가면 꺽새를 통해 다음 페이지로 넘어갈 수 있다.
  - 하나의 꺽새를 클릭하면 페이지가 10단위로 넘어가고, 두 개의 꺽새를 클릭하면 해당 방향의 맨끝 페이지로 이동한다. 
- 페이지 이동 후에 상세 글을 조회하고 목록으로 되돌아오면 바로 이전의 페이지가 유지됩니다.
- 제목, 내용, 작성자별로 키워드 검색이 가능하며, 검색하고 나서 페이지를 이동하여 게시글을 조회한 후 되돌아오면 바로 이전의 검색창과 페이지가 유지됩니다. 

|페이징|
|:---:|
|![게시글페이징](https://github.com/user-attachments/assets/2b3728d1-1340-4c08-b59c-31a158f8d090)|

|검색|
|:---:|
|![게시글검색](https://github.com/user-attachments/assets/89617c35-fd45-41c1-bd60-d7634f5421b0)|
<br>

### [게시글 작성]
- 필수 입력 항목인 제목, 이름, 내용을 입력하지 않고 저장 버튼을 누르면 해당 항목을 입력하라는 경고 알람 메시지가 뜹니다.
- 선택사항으로는 공지글 설정과 첨부파일을 개수 제한 없이 업로드 할 수 있습니다.
- 입력 도중 '뒤로' 버튼을 클릭하면 게시글이 저장되지 않고 이전 화면으로 되돌아갑니다.
- 게시글 등록이 완료되면 게시글 목록 페이지로 이동합니다.

|게시글 작성|
|:---:|
|![게시글등록](https://github.com/user-attachments/assets/9faa20be-5536-458a-8f67-86d1c76f7755)|
<br>
 
### [게시글 상세]
- 조회수는 해당 게시글 조회 즉시 1씩 증가하며 한 아이디로 중복 조회가 가능합니다.
- 업로드된 첨부파일을 다운로드할 수 있습니다.
- 게시글 수정 및 삭제가 가능합니다.

|게시글 조회,수정,삭제|
|:---:|
|![게시글상세](https://github.com/user-attachments/assets/201d828c-600a-4170-8f35-7c21250849fa)|
<br>

### [댓글 조회 및 작성]
- 댓글은 게시글 상세 페이지에서 페이지 이동 없이 아래에서 바로 조회 가능하며, 댓글 작성 즉시 반영되어 화면에 나타난다.
- 댓글 수정은 회원가입과 동일하게 버튼을 클릭하면 레이어 팝업이 나타나 해당 창을 통해 수정이 가능하다.
- 댓글도 게시글과 마찬가지로 한 페이지 당 10개의 게시글이 나타나며, 10페이지 즉 게시글 100개가 넘어가면 꺽새를 통해 다음 페이지로 넘어갈 수 있다.
  
|댓글 없는 경우|댓글 있는 경우(페이징)|
|:---:|:---:|
|![image](https://github.com/user-attachments/assets/d9a038b7-ba5d-49ad-a27b-5612382b09d0)|![댓글페이징](https://github.com/user-attachments/assets/23373c7b-56a6-474d-8075-e0fde5efb849)|

|댓글 작성,수정,삭제|
|:---:|
|![댓글등록](https://github.com/user-attachments/assets/6dcc1143-3bf3-40ae-8be9-10f8911725fe)|
<br>

### [회원가입 및 로그인]
- 로그인은 초기 화면에서 바로 가능하며, 회원가입은 초기 화면에서 회원가입 버튼을 눌렀을 때 뜨는 레이어 팝업 창을 통해 이용할 수 있습니다.
- 유효성 검사
  - 회원가입 또는 로그인 시 필수 입력 사항을 입력하지 않고 시도하면 입력하라는 경고 메시지가 뜹니다.
  - 회원가입할 때 기존에 있는 아이디를 입력하면 이미 존재하는 아이디임을 알리는 경고 메시지가 뜹니다.  
- Intercepter를 사용한 로그인 세션 체크 기능
  - 비회원이 다른 페이지에 접속을 시도하면 로그인 페이지로 이동합니다.
- 로그인에 성공하면 게시글 목록 페이지로 이동합니다.
- 로그아웃은 헤더 부분의 로그아웃 버튼을 통해 할 수 있으며, 버튼 클릭 시 로그인 페이지로 이동합니다.

|로그인(초기화면)|회원가입|
|:---:|:---:|
|![image](https://github.com/user-attachments/assets/b870699b-9557-49e0-a228-426977dcd986)|![image](https://github.com/user-attachments/assets/e29e8331-97d2-4e45-90cc-346d9384df2d)|

|로그아웃|
|:-----------:|
|![image](https://github.com/user-attachments/assets/c4d53ae7-b2e8-4c31-af40-7e11853feaee)|

<br>

## 5. DB - ERD
![image](https://github.com/user-attachments/assets/164e6b67-c9d2-410c-b47b-02dc35311099)

<br>

## 6. 개선 목표
#### 보안 강화
: 사용자 인증 및 권한 부여에 대한 보안 강화
#### UI/UX 개선 
: 사용자 인터페이스 및 경험 개선
#### 성능 최적화
: 대용량 데이터 처리에 대한 성능 최적화
#### 추가 기능
: 소셜 로그인, 관리자 페이지 등의 추가 기능을 구현 예정



