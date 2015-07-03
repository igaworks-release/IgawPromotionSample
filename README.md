# 프로모션(인하우스)
프로모션 서비스는 자사의 A앱 광고를 B앱에서 노출할 수 있도록 도와주는 서비스입니다. 프로모션 서비스를 이용하여 기존 앱의 유저를 신규 앱으로 유입시킬 수 있습니다. 
인하우스 광고만을 지원합니다.

# Igaworks Sample 불러오기
### 방법 1
1. Click **"Download ZIP"** button
1. Unzip files
1. Open Android Studio
1. File > Open...
1. Click download folder

### 방법 2
1. Copy **"HTTPS clone URL"**
1. Open Android Studio
1. VCS > Checkout from Version Control > Git
1. Paste to Vcs Repository URL, Clone

# Promotion Sample 실행
1. IGAW 홈페이지에서 발급받은 **앱키, 해시키**를 AndroidManifest.xml 파일에 입력
1. IGAW 홈페이지에서 발급받은 **애드 스페이스 키**를 MainActivity.java 파일에 입력
1. 실행
1. 운영 > 크로스 프로모션 > 퍼블리싱 > 노출위치 메뉴에서 "테스트 광고 송출 및 세부 설정하기" 진행
1. 테스트 프로모션 광고 확인

# Igaworks Promotion 연동하기
연동 가이드와 샘플 프로젝트를 참고하여 연동을 진행합니다. </br>
<a href="http://help.igaworks.com/hc/ko/3_3/Content/Article/promotion_aos" target="_blank">Igaworks Promotion 연동문서 바로가기</a>

프로모션 서비스는 리워드 지급 처리가 필요합니다.</br> 
리워드 연동은 다음문서를 참고하여 진행합니다.</br>
<a href="http://help.igaworks.com/hc/ko/3_3/Content/Article/reward_callback_server_guide" target="_blank">Rward Server 연동문서 바로가기</a>
