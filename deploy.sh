mvn clean package -Dmaven.test.skip=true
scp -l 8192 ./target/sparrow-org-pem-server-0.0.1.jar root@sportunione.cn:/root/services/
