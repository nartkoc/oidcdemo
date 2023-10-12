# spring security iodc demo app

this app demonstrates using keycloak 22 oidc with spring security 6.1 on a spring boot 3.1 app..  
this app doesn't redirect keycloak login page on requests..  
this app secures end-points by checking if there is a successful oidc login / valid jow token..  

tests hasn't been implemented in this demo..  

there are two entities in this demo and one relation for demo purposes..  

please don't forget to edit application.yml..  
either set environment variables on your system or set required parameters in yml file..  

you may need to create uuid extention on your database by using the code below  
create extension if not exists "uuid-ossp";

enjoy!  
nart
