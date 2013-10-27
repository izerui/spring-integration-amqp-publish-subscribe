一个发布,接受消息的实例, spring-integration spring amqp rabbitmq 整合测试例子
=====================================================

这个例子中,将使用 Spring Integration 来演示通过rabbitmq 发送接收消息

很快你将会看到它是如何工作的,

步骤:

* 获取本实例代码
* 安装 erlang 运行环境 [ERLang](http://www.erlang.org/)


* 安装 [RabbitMQ] (http://www.rabbitmq.com/) 
* 打开rabbitmq 命令行, 运行:
	rabbitmq-plugins enable rabbitmq_management
* 重启rabbitmq 服务

* 进入地址 http://localhost:15672/ 并且登录 用户名/密码: guest/guest, 保证rabbitmq 运行中并可看到rabbitmq 实际运行情况.
* 导入 Maven 工程 spring-integration-amqp-publish-subscribe 到你的ide中, 我使用的是eclipse.
* 你会发现应用通过两个通道订阅rabbitmq, 这两个: pub-sub-channel, p2p-pollable-channel
* 例子中 发送/接收 模式, 发送一个消息到 通道: (p2p-pollable-channel) , 这个时候此通道的消息会被转发到 广播通道(pub-sub-channel).
然后订阅广播通道的两个activator 将会都收到该消息

请参阅 [blog](http://krishnasblog.com/2012/10/18/amqp-backed-spring-integration-using-vfabric-rabbitmq/) 获取更多消息.

版权声明:

如果需要,你可以随意修改并使用它
