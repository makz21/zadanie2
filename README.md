# ZADANIE 2 - API DOCUMENTATION
<b>BASE url:</b> <br>http://localhost:8080/

<b>GET</b> /validate<br>
<b>Resource URL:</b><br>
http://localhost:8080/validate?stringToValidate={your_string}

<b>Parameters(required: true):</b><br>
stringToValidate<br>
description: String that user needs to send to check string type<br>

<b>Returns:</b><br>
Returns string description (with response status)about input string

<b>Response formats:</b> <br>String<br>
<b>Response status:</b> <br>200 <b>OK</b><br>

<b>Example Request:</b><br>
http://localhost:8080/validate?stringToValidate=yourstring<br>
<b>Example Response:</b><br>
200 OK<br>
"it is lower case string"<br>
