# Spring Boot Prefix Path

1. server setting (application.yaml)
2. SpEL
3. Annotation

## Blog DESC
URL : https://l-eazzy.tistory.com/30
<br>
<br>

### 1. Server Setting
file
* TestController
* application.yaml -> server.servlet.context-path: /api

### 2. SpEL
fie
* SpELController
* application.yaml -> api-prefix: /api

### 3. Annotation
file
* AnnotationController
* ApiPreFixController
* application.yaml -> api-prefix: /api