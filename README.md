# ms-cloud-config-server

Here I am encrypting and decrypting values from git config repo

Step 1) use keytool -genkeypair -alias mytestkey -keyalg RSA \
              -dname "CN=Web Server,OU=Unit,O=Organization,L=City,S=State,C=US" \
              -keypass changeme -keystore server.jks -storepass letmein
              
Step 2) Put the server.jks file in the classpath (for instance) and then in your application.yml for the Config Server:
        
        encrypt:
          keyStore:
            location: classpath:/server.jks
            password: letmein
            alias: mytestkey
            secret: changeme

Step 3) after running this microservices, Please use 

curl --location --request POST 'http://localhost:8888/encrypt' \
                                                     --header 'Authorization: Basic c2FuamF5c3VmaTpDbG91ZFN1ZmlAZmZmLTIwMjE=' \
                                                     --header 'Content-Type: text/plain' \
                                                     --data-raw 'secret'   
                                                               
Step 4) put the same values to your properties variables into git cloud repo

Step 5) for verification go to http://localhost:8888/ms-config-client/dev


#Reference 
https://projects.spring.io/spring-cloud/spring-cloud.html#_encryption_and_decryption_2