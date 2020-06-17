# SpringBoot-CRUD
Create - retrieve - update - delete on Stundent database.

Sample project to demonstrate CRUD operation using REST API
I am not using any database here.

I am using Map to perform CRUD operations on Data.

GET: http://localhost:8080/students

GET: http://localhost:8080/students/1

POST: http://localhost:8080/students

PUT: http://localhost:8080/students

DELETE: http://localhost:8080/students/1

Postman collection : https://www.getpostman.com/collections/79b34e5606d66d88881e

curl to Add student:

    curl --location --request POST 'http://localhost:8080/students' \
    --header 'Content-Type: application/json' \
    --data-raw '{
        "id": 5,
        "name": "Hari",
        "city": "Pune"
    }'

curl to update student:

    curl --location --request PUT 'http://localhost:8080/students' \
    --header 'Content-Type: application/json' \
    --data-raw '{
        "id": 5,
        "name": "Ravi",
        "city": "Pune"
    }'
    
curl to delete student:

    curl --location --request DELETE 'http://localhost:8080/students/1'
    
 
