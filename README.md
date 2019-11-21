#### 这是我学习Java springboot的第一个小demo

#### 一、先从maven创建项目开始

通过maven创建一个纯净的项目

##### 二、 创建第一个controller

实现一个say hello的小功能


##### 三、集成swagger2
  - 1. 安装swagger2的相关依赖
  - 2. 新建一个swagger2的配置类SwaggerConfig.java
  - 3. 新建swagger的控制类，用于显示在页面上


##### 四、 创建第二个controller

实现查询数据库user表的用户信息
  - 1. 安装mybatis依赖包 jdbc驱动包
  - 2. 新增application.properties的配置文件，配置mybatis相关信息
  - 3. 在resources下新增generatorConfig.xml文件，配置mybits配置
  - 4. 新建一个user model,列好user表的字段
  - 5. 新增UserMapper接口

