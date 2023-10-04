FROM ubuntu
RUN apt-get update && apt-get install -y openssh-server
EXPOSE 22
CMD ["E:\Studies\Coding\Java"]
