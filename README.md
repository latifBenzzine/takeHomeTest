# takeHomeTest
Take Home Test


This Spring boost example expose two end points for a get and a post operations.

To test it out Please use Postman 

first run the app from your IDE or on the command line

POST:

http://localhost:8080/users/

{
"name":"test1",
"email":"test@climate.com",
"phoneNumber":"314-685-5308",
"locale":"US",
"birthDate":"1989-03-02"
}


check the location in the heather to identify : id then send a Get to retrieve user created

GET:

http://localhost:8080/users/1


Response:

{
    "id": 1,
    "name": "test1",
    "email": "test@climate.com",
    "phoneNumber": "314-685-5308",
    "locale": "us",
    "birthDate": "1989-03-02"
}

