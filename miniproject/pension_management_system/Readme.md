# Build the project

``` 
mvn clean install
```

# Run
```
docker-compose -f docker-compose-mysql.yml up -d

mvn spring-boot:run

docker-compose -f docker-compose-mysql.yml down
```

# Testing the application
For creating applicant or Save Data:

curl --location --request POST 'localhost:8082/create/applicant' \
--header 'Content-Type: application/json' \
--data-raw '{
"id":107,
"name":"jaydeep",
"age":62,
"balance":109000,
"mobile":"9888995522",
"empStatus":"R",
"pensionStatus":"N",
"pensionMMYY":"0922",
"installment":1020
}'

For Check applicant:
curl --location --request GET 'localhost:8082/checkApplication/107'

For issue pension:
curl --location --request GET 'localhost:8082/issuepension'

For check balance:
curl --location --request GET 'localhost:8082/checkBalance/107'

For check status:
curl --location --request GET 'localhost:8082/checkstatus/107'

For load pension:
curl --location --request GET 'localhost:8082/loadpension'


