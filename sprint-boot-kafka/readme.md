启动zk  
启动kafka  
启动程序  
访问  
http://127.0.0.1:8700/message/send?message=zhang3

结果  
2020-05-26 20:02:33.752  INFO 12040 --- [nio-8700-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 7 ms
[ 收到请求 ]
2020-05-26 20:02:33.794  INFO 12040 --- [nio-8700-exec-1] o.a.k.clients.producer.ProducerConfig    : ProducerConfig values:
    acks = 1
    batch.size = 16384
    bootstrap.servers = [127.0.0.1:9092]
    buffer.memory = 33554432
    client.dns.lookup = default
    ...
    ...  
    transactional.id = null
    value.serializer = class org.apache.kafka.common.serialization.StringSerializer


2020-05-26 20:02:33.823  INFO 12040 --- [nio-8700-exec-1] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.3.1
2020-05-26 20:02:33.823  INFO 12040 --- [nio-8700-exec-1] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 18a913733fb71c01
2020-05-26 20:02:33.823  INFO 12040 --- [nio-8700-exec-1] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1590494553822
2020-05-26 20:02:33.836  INFO 12040 --- [ad | producer-1] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-1] Cluster ID: uqRkSs4PTAiGNhuv2I4OeA
[ 返回响应 ]
[ 处理器开始处理消息 ]1590494553877
zhang3
[ 处理器处理消息完成 ]1590494558881

