# spring-boot-docker
```
mvnw.cmd package
java -jar target\spring-boot-docker-0.0.1-SNAPSHOT.jar com.example.demo.Application

./mvnw install dockerfile:build
docker run -p 8080:8080 -t asakchris/spring-boot-docker:latest
docker ps
docker stop <container-id>

./mvnw install

git init
git add --all
git commit -m "Initial version"
git remote add origin https://github.com/asakchris/spring-boot-docker.git
git push -u origin master
```
