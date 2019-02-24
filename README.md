# spring-boot-docker
```
git init
git add --all
git commit -m "Initial version"
git remote add origin https://github.com/asakchris/spring-boot-docker.git
git push -u origin master

mvnw.cmd package
java -jar target\spring-boot-docker-0.0.1-SNAPSHOT.jar com.example.demo.Application

./mvnw install dockerfile:build
docker image ls
docker run -p 8080:8080 -t asakchris/spring-boot-docker:latest
docker ps
docker stop <container-id>
docker container ls -all
docker container start <container-id>
docker container logs --tail 200 --follow <container-id>

./mvnw install
```
