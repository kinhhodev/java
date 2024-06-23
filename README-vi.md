##
![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black)

# Triển khai Java bằng Tomcat
[![en](https://img.shields.io/badge/lang-english-green)](https://github.com/kinhhodev/java-deployment/blob/main/README.md)
![vi](https://img.shields.io/badge/lang-vietnam-red)
***
#### 1. Cài đặt Tomcat trên MacOS
> (**Nguồn:** - [codejava.net - máy chủ tomcat](https://www.codejava.net/tomcat-tutorials))

> [![macOS](https://img.shields.io/badge/mac%20os-000000?style=for-the-badge&logo=macos&logoColor=F0F0F0)](https://www.codejava.net/servers/tomcat/install-tomcat-10-on-macos)

#### 2. Dự án Maven MVC

* a. Chiến lược triển khai 1: Sao chép `Java Website application archive` (.war) file vào thư mục `tomcat/webapps` của tomcat 
    * Mọi người sử dụng câu lệnh `mvn clean package` để tạo ra `.war` file.
    * Truy cập vào thư mục `{tomcat}/webapps` và dán file `project_name/target/project_name.war` vào trong folder `tomcat/webapps`.
    * Khởi động lại tomcat
        * 1. Nếu đang dùng `Terminal` -> sử dụng lệnh `sh shutdown.sh` và lệnh `sh startup.sh` ở trong folder bin của tomcat
        * 2. Nếu dùng `IDE` thì tắt tomcat và chạy lại tomcat
    * Truy cập vào tomcat với cổng 8080 ( cổng mặc định của tomcat )
* b. Chiến lược triển khai 2: copying unpacked Java web application directory - Sao chép dự án sau khi build vào thư mục webapps của tomcat
    * Mọi người sử dụng câu lệnh `mvn clean package` để tạo ra `project_name/target` folder.
    * Sao chép thư mục `project_name/target/project_name` và dán vào bên trong folder `{tomcat/webapps}`
* c. Chiến lược triển khai 3: Sử dụng trình quản lý ứng dụng của Tomcat
    * Đọc phần này tại - [Tomcat’s manager application](https://www.codejava.net/servers/tomcat/how-to-deploy-a-java-web-application-on-tomcat)