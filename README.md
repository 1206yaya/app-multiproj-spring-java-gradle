SpringBootのマルチプロジェクト構成をGradleで作成しました
====

Overview

```
root
- core (domainを呼び出す)
- domain (java-utilを呼び出す)
- java-util (このプロジェクト階層から外れたところに存在するプロジェクトからもインポートできるかを確認するためのもの)
```

Point

Spring Boot のマルチプロジェクトを作成するためにはサブプロジェクトのbuild.gradleでは

```
apply plugin: 'org.springframework.boot'
```

を記述せず、代わりに

```
dependencyManagement {
    imports {
        mavenBom "org.springframework.boot:spring-boot-dependencies:$springBootVersion"
    }
}
```

を記述すること