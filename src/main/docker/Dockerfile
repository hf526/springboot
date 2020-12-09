#获取base image
FROM  java:8
#类似于执行 linux指令
RUN mkdir /home/services
#类似于linux copy指令
COPY demo-0.0.1-SNAPSHOT.jar /home/services/
##对外端口
#EXPOSE 7070
#执行命令 java -jar /opt/app/demo-docker.jar
CMD ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]

