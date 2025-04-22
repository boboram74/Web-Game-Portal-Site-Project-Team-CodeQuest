<!-- logo -->

# [Servlet/JSP] Web Game Portal Site Project

[<img src="https://img.shields.io/badge/-readme.md-important?style=flat&logo=google-chrome&logoColor=white" />]() [<img src="https://img.shields.io/badge/release-v1.5.3-yellow?style=flat&logo=google-chrome&logoColor=white" />]() 
<br/> [<img src="https://img.shields.io/badge/프로젝트 기간-2025.02.17~2025.02.28-green?style=flat&logo=&logoColor=white" />]()

</div> 

## 📝 소개
CodeQuest 팀이 진행하는 [Servlet/JSP] Web Game Portal Site Project 입니다.
다양한 미니 게임을 하나의 웹 포털에서 간편하게 즐길 수 있도록 기획했으며, 회원 관리와 랭킹 시스템을 통해 플레이어들이 경쟁하고 소통할 수 있도록 구성했습니다. 또한 커뮤니티기능과 관리자 페이지를 제작하였습니다. 프로젝트는 다음과 같은 내용을 담고 있습니다.

- 프로젝트 소개
- 화면 구성
- 사용한 기술 스택
- 프로젝트 아키텍처
- ERD
- 기술적 이슈와 해결 과정
- 프로젝트 팀원

### 화면 구성
| 메인화면 #1 | 회원가입 #2 | 마이페이지 #3 | 게시판 #4 | 대시보드 #5 |
| :---: | :---: | :---: | :---: | :---: |
| <img src="https://github.com/user-attachments/assets/108f83c0-19f2-49b1-9cea-b09e267d7b4b?raw=true" width="500" height="300" alt="메인화면 #1" /> | <img src="https://github.com/user-attachments/assets/fe5e1176-66d0-477b-8067-406bf2599464?raw=true" width="500" height="300" alt="회원가입 #2" /> | <img src="https://github.com/user-attachments/assets/f11c6c34-f114-4be7-af24-5e1677f1dfc0?raw=true" width="500" height="300" alt="마이페이지 #3" /> | <img src="https://github.com/user-attachments/assets/17d23099-9a08-42e5-ad27-2121c2976cce?raw=true" width="500" height="300" alt="게시판 #4" /> | <img src="https://github.com/user-attachments/assets/50036e21-3e5f-4ec1-96c7-dccdb76d92d7?raw=true" width="500" height="300" alt="대시보드 #5" /> |

<br />

## ⚙ 기술 스택
### Back-end
<div>
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Java.png?raw=true" width="80">
</div>

### Front-end
<div>
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/HTMLCSS.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/JavaScript.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Ajax.png?raw=true" width="80">
</div>

### Infra
<div>
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/AWSEC2.png?raw=true" width="80">
</div>

### Tools
<div>
<img src="https://github.com/user-attachments/assets/16b7a208-5ef9-4149-aacd-b0a6894f3ff3?raw=true" width="75" height="95" alt="Image">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Github.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Notion.png?raw=true" width="80">
</div>

<br />

## 🏢 프로젝트 아키텍처

![프로젝트 아키텍처 이미지](https://github.com/user-attachments/assets/091cceb4-eddd-4534-8601-85640fb88219)
<br />

## 🛠️ ERD
![image](https://github.com/user-attachments/assets/5bf1c2a7-7c09-4f1e-88d6-e2a9d7563b9a)
https://www.erdcloud.com/d/9HCe4GSjjeHXT8iHu
<br>

## 🤔 기술적 이슈와 해결 과정
- 회원 정보 수정 후 마이페이지 데이터 유실 문제
    - 회원정보 수정 완료 후 forward 를 jsp가 아닌 Controller의 URL을 입력하여 마이페이지의 데이터를 재 세팅 
- 간편 가입 유저의 패스워드 재설정
    - 패스워드가 NULL인 유저만 조회하는 새 SQL 쿼리르 만들어 재설정시 간편가입 유저가 재설정하는지 비교하는 로직 추가
- Gmail SMTP 이용하여 이메일 전송하기
    - [gmail 보내기](https://velog.io/@yewo2nn16/Email-이메일-전송하기with-첨부파일)
- AWS EC2에 배포하기
    - [서버 배포하기](https://velog.io/@shawnhansh/AWS-EC2에-배포하기)

<br />

## 💁‍♂️ 프로젝트 팀원
![image-removebg-preview](https://github.com/user-attachments/assets/13c98280-3737-4482-916e-eca309f88089)
![image-removebg-preview (1)](https://github.com/user-attachments/assets/2656f388-f5d3-4c8a-9256-a9f8ba89d436)

