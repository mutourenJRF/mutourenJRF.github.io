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
    