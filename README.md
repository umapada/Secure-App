# Secure-App
This Spring boot secure app with jwt

Create Token:

curl --location --request POST 'http://localhost:9191/security/authenticate' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=CDEB64BA3E1B25570A6916BEBD5CFE59' \
--data-raw '{
"username" : "umapada",
"password" : "manna"
}'



Access Service: ( Use the jwt token created above as bearer token below)

curl --location --request GET 'http://localhost:9191/hello' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1bWFwYWRhIiwiZXhwIjoxNjYyOTEyMzg5LCJpYXQiOjE2NjI5MTIzNjl9.yPvfODtxTPwl_cjx4ZA1kDc8WOQYG0LX34b4-Fycp2Q' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=CDEB64BA3E1B25570A6916BEBD5CFE59'
