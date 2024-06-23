##
![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black)

# Java Deployment with Tomcat
[![en](https://img.shields.io/badge/lang-english-green)](https://github.com/kinhhodev/java-deployment/blob/main/README.md)
[![vi](https://img.shields.io/badge/lang-vietnam-red)](https://github.com/kinhhodev/java-deployment/blob/main/README-vi.md)
***
#### 1. Install Tomcat on MacOS
> (**Source:** - [codejava.net - tomcat server](https://www.codejava.net/tomcat-tutorials))

> [![macOS](https://img.shields.io/badge/mac%20os-000000?style=for-the-badge&logo=macos&logoColor=F0F0F0)](https://www.codejava.net/servers/tomcat/install-tomcat-10-on-macos)

#### 2. Maven MVC Project

* a. Deploy method #1: copying Java web application archive file (.war)
    * We use the command `mvn clean package` to build the `.war` file.
    * Access the `{tomcat}/webapps` folder and paste the `{project_name/target/}project_name.war` file of the projec into it.
    * Restart tomcat server
        * 1. If using `Terminal` -> use command `sh shutdown.sh` in folder `tomcat/bin`
        * 2. Nếu dùng `IDE` thì restart tomcat application
    * Open server with port 8080
* b. DeployDeploy method #2: copying unpacked Java web application directory
    * We use the command `mvn clean package` to build project in the `project_name/target` folder.
    * Copy folder `project_name/target/project_name` and paste it into `{tomcat/webapps}`
* c. Deploy method #3: using Tomcat’s manager application
    * [Tomcat’s manager application](https://www.codejava.net/servers/tomcat/how-to-deploy-a-java-web-application-on-tomcat)