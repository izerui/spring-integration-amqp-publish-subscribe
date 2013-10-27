使用spring amqp 整合 rabbitmq 和 spring integration 发布广播消息的例子
================================================================================

步骤:

* 获取本实例代码
* 安装 erlang 运行环境 [ERLang](http://www.erlang.org/)


* 安装 [RabbitMQ] (http://www.rabbitmq.com/) 
* 打开rabbitmq 命令行, 运行:
	rabbitmq-plugins enable rabbitmq_management
* 重启rabbitmq 服务

* 进入地址 http://localhost:15672/ 并且登录 用户名/密码: guest/guest, 可看到rabbitmq 实际运行情况
* 导入 Maven 工程 spring-integration-amqp-publish 到你的ide中, 我使用的是eclipse.
* 通过 junit 调试 PublisherSubscriberTest.java 类

好了,这个时候,登录http://localhost:15672/ 便可看到如下图

![1](https://github.com/izerui/spring-integration-amqp-publish-subscribe/blob/master/spring-integration-amqp-publish/20131027164607.png)

queue.1.name 和 queue.2.name 都将收到发过来的消息

查看 具体消息 如图,我们发送的是一个xml格式的消息:

![2](https://github.com/izerui/spring-integration-amqp-publish-subscribe/blob/master/spring-integration-amqp-publish/20131027170002.png)



