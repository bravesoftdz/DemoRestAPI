# DemoRestAPI
Demo REST API project for Spring Boot

Used: JAVA EE + Maven + Spring + Mysql(ConnectorJ) + Slf4j


Service for managing the database.
Implemented by:
1. Addition;
2. Removal;
3. Search;
4. Get the entire list of buyers.



Access CustomerService using next REST requests:

<b>GET</b>: localhost:80/api/v1/customers/ - get all customers GET: localhost:9966/api/v1/customers/1 - get customer with ID 1

<b>POST</b>: localhost:80/api/v1/customers/ Request body: { "firstName": "Olga", "lastName": "Ivanova", "address": "Miinsk", "budget": "500" }

<b>PUT</b>: localhost:80/api/v1/customers/ Request body: { "id": 2, "firstName": "Denis", "lastName": "Denisov", "address": "Minsk, Nemiga", "budget": "200" }

<b>DELETE</b>: localhost:80/api/v1/customers/2 - delete customer with ID 2


Also negative answers (not a valid request or an error):
1. HttpStatus.BAD_REQUEST
2. HttpStatus.NOT_FOUND
3. HttpStatus.NO_CONTENT

Positive answers:
1. HttpStatus.OK

!!!This project was made for educational purposes.

