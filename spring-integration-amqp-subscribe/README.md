使用spring amqp 整合 rabbitmq 和 spring integration 接收广播消息的例子
================================================================================

步骤:
-

前提,你已经安装rabbitmq 并且启用了 rabbitmq management 插件,并且服务在运行中
-

接下来继续
-
* 获取本实例代码
* 导入 Maven 工程 spring-integration-amqp-subscribe 到你的ide中, 我使用的是eclipse.
* 如果你使用eclipse, 调试junit前请通过 run -> run configurations -> SubscriberTest-> keep junit running after a test run when debugging
  选择 keep junit running after a test run when debugging 选项,保持test application 一直运行
* 通过 junit 调试 SubscriberTest 
-
ok, 接收端已经准备好了,这个时候登录http://localhost:15672/ 

点击queues,发布消息:
-
![1](http://dl.iteye.com/upload/picture/pic/128195/15d63948-f8fe-38a1-80be-7f4b6cf71bfa.png)

即可看到控制台接收到消息
[SimpleAsyncTaskExecutor-1] INFO : com.goSmarter.amqp.service.SubscriberServiceActivator -  PAYLOAD ###谁水水水水

或者通过
spring-integration-amqp-publish 实例进行发布消息也可以收到xml格式的字串




