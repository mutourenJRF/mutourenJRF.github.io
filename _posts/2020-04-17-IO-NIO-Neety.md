---
title: Java IO模型与Netty
description: IO模型与Netty
tags: Java、io、netty
---

IO/BIO
-
阻塞IO

NIO
-
1. 非阻塞IO
2. 组件
    - channel
    - buffer
    - selector：单个线程
3. 跟IO区别
    - IO client和server连接稳定
    - NIO client每次请求server端线程重新分配，由selector分配

4. 多路复用模型
    - reactor
        - 单线程
        - 多线程
        - 主从多线程
        
        - 多路复用组件selector
    - epoll
    - selector和epoll对比：
        - selector bitmap只有1024
        - selector每次都遍历所有，epoll只需要调用有响应码的线程
        - 参考文档：https://www.cnblogs.com/binchen-china/p/5487795.html