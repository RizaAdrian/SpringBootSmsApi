# SpringBootSmsApi
Creating a sms application with an external service
</br>
Requirements:
<ul>
<li>Java 17</li>
<li>Maven</li>
<li>Account on Twilio</li>
<li>Add twilio properties to application.yml </li>
</ul>
Open Project
</br>
run: -> mvn clean install</br>


request Body:</br>
url path for the request: /api/v1/sms</br>
```
{
    "phoneNumber": "your phone number HERE",
    "message": " Message to send via SMS HERE"
}
```
