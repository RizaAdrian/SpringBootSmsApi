# SpringBootSmsApi
Creating a sms application with an external service

Requirements:
Java 17
Maven
Account on Twilio

Open Project

run: -> mvn clean install


request Body:
url path for the request: /api/v1/sms

{
    "phoneNumber": "your phone number HERE",
    "message": " Message to send via SMS HERE"
}
