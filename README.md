<h1 align="center">
    kjs-common
</h1>
<p align="center">
    <strong>JAVA开发，常用工具集(默认集成 Hutool，Lombok，MapStruct ) </strong>
</p>
<p align="center">
    <a target="_blank" href="https://search.maven.org/artifact/com.mobaijun/kjs-common">
        <img src="https://img.shields.io/maven-central/v/com.mobaijun/kjs-common.svg?style=flat&logo=Apache Maven"
             alt="kjs-common"/>
    </a>
    <a target="_blank" href="https://www.apache.org/licenses/LICENSE-2.0.html">
        <img src="https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat&logo=apache" alt="apache">
    </a>
    <a target="_blank" href="https://www.oracle.com/technetwork/java/javase/downloads/index.html">
        <img src="https://img.shields.io/badge/JDK-1.8+-green.svg?style=flat&logo=Oracle" alt="jdk">
    </a>
    <a target="_blank" href='https://github.com/mobaijun/kjs-common'>
        <img src="https://img.shields.io/github/stars/mobaijun/kjs-common.svg?style=flat&logo=GitHub"
             alt="github star">
    </a>
    <a target="_blank" href='https://github.com/mobaijun/kjs-common'>
        <img src="https://komarev.com/ghpvc/?username=mobaijun&color=orange" alt="profile">
    </a>
</p>

## 其他语言

- [English](README.en.md)
- [繁体中文](README.zh-TW.md)

## 概述

kjs-common ，是一个Java开发基础工具类库，对项目开发中常用的工具进行封装，如：加密、http 请求、API 接口等。 目的是帮助开发者更快速、更快捷的开发。

本项目集成了项目中常用的优秀开源工具类：

* hutool-all （最全工具类）
* lombok （简化实体类）
* mapstruct （简化参数传递）

目标：`无侵入性`，`轻量级`，`常用功能`，`无数次测试`，`不断完善`

> 注意：kjs-common 基于 JDK1.8 开发，如果你的 JDK 版本过低，请找到相应的工具类，复制相关代码，进行使用。

## 发展

> 本项目计划在 2.0 版本支持 JDK 17 及以上版本，2.0 以内版本以 JDK 8 为基石，这表示未来 2.X 版本不会兼容 JDK 17 以下的项目，如果是
> JDK 17 以内项目推荐使用 2.0 以内版本

## 目录

~~~bash
--------------------------------------------------------------------------------------------
├─.github
│  └─workflows
├─src
│  ├─main
│  │  └─java
│  │      └─com
│  │          └─mobaijun
│  │              └─common
│  │                  ├─algorithm
│  │                  ├─annotation
│  │                  │  ├─datasource
│  │                  │  ├─i18n
│  │                  │  ├─log
│  │                  │  └─redis
│  │                  ├─cache
│  │                  │  └─map
│  │                  ├─common
│  │                  ├─constant
│  │                  ├─download
│  │                  ├─enhance
│  │                  ├─enums
│  │                  │  ├─client
│  │                  │  ├─common
│  │                  │  ├─database
│  │                  │  ├─date
│  │                  │  ├─dict
│  │                  │  ├─file
│  │                  │  ├─http
│  │                  │  ├─log
│  │                  │  ├─message
│  │                  │  ├─redis
│  │                  │  ├─regex
│  │                  │  ├─sms
│  │                  │  ├─timer
│  │                  │  └─user
│  │                  ├─function
│  │                  │  └─impl
│  │                  ├─lambda
│  │                  ├─result
│  │                  │  └─enums
│  │                  └─util
│  │                      ├─classs
│  │                      ├─collection
│  │                      ├─concurrent
│  │                      ├─converter
│  │                      ├─cron
│  │                      ├─date
│  │                      ├─enums
│  │                      ├─file
│  │                      ├─html
│  │                      ├─http
│  │                      ├─image
│  │                      ├─io
│  │                      ├─jdbc
│  │                      ├─network
│  │                      ├─number
│  │                      ├─pass
│  │                      ├─pinyin
│  │                      ├─reflect
│  │                      ├─regx
│  │                      ├─seo
│  │                      ├─sql
│  │                      ├─stream
│  │                      ├─system
│  │                      ├─text
│  │                      ├─thread
│  │                      ├─thunder
│  │                      ├─tool
│  │                      └─tree
│  └─test
│      └─java
│          └─com
│              └─mobaijun
│                  └─common
│                      └─test 
│                          ├─cache
│                          ├─classs
│                          ├─collection
│                          ├─converter
│                          ├─cron
│                          ├─date
│                          ├─download
│                          ├─function
│                          ├─seo
│                          ├─tree
│                          └─util
--------------------------------------------------------------------------------------------
~~~

> 所有依赖会同步更新最新版本

## 快速开始

如需使用，引入如下依赖即可

### maven

```xml
<dependency>
    <groupId>com.mobaijun</groupId>
    <artifactId>kjs-common</artifactId>
    <version>${latest.version}</version>
</dependency>
```

### Gradle

~~~xml
implementation 'com.mobaijun:kjs-common:latest.version'
~~~

### 中央仓库

本仓库已经同步发布 [maven 中央仓库](https://mvnrepository.com/artifact/com.mobaijun/kjs-common)，欢迎使用，欢迎 start

<iframe height=850 width=90% src="https://search.maven.org/search?q=com.mobaijun" frameborder=0 allowfullscreen></iframe>

## 贡献

* 如果你也想参加这个项目，请 fork 本仓库，修改完毕提交 pr ，审核后会同步至本仓库。

~~~bash
$ mvn clean deploy -DskipTests -P sonatype-release
~~~

## 趋势

![](https://starchart.cc/mobaijun/kjs-common.svg)
