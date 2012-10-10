Publish Subscribe with vFabric RabbitMQ and Spring Integration using Spring AMQP 
================================================================================

In this project, I will demo the complete end to end Publisher/Subscriber model using Spring Integration and vFabric RabbitMQ. 

To quickly see how it works,

* Get the latest code
* Install [ERLang](http://www.erlang.org/download/otp_win32_R15B02.exe)
    Set ERLANG_HOME=[ERLang install location]
* Install [RabbitMQ](http://www.rabbitmq.com/releases/rabbitmq-server/v2.8.7/rabbitmq-server-2.8.7.exe) 
* Open RabbitMQ Command Prompt from the start menu and run below commands
    rabbitmq-plugins enable rabbitmq_management
    rabbitmq-server.bat
* Open http://localhost:55672/ just to check RabbitMQ is running
* Maven imported spring-integration-amqp-subscribe project into STS IDE 
* Add spring-integration-amqp-subscribe on the server and start the TC server and "Run on Server", you will notice that the Application Subscribed to RabbitMQ and start listening
* Run the below command on the command prompt by going to spring-integration-amqp-publish folder
    mvn -Dtest=com.goSmarter.amqp.PublisherSubscriberTest test

Volla, you started see the payload in the subscriber console

Refer this [blog](http://krishnasblog.com/) for more details on the above flow.

Feel free to modify this code and use it for your need. 
