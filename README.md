SpringBootのマルチプロジェクト構成をGradleで作成しました
====

Overview

```
root
- core (domainを呼び出す)
- domain (java-utilを呼び出す)
- java-util (このプロジェクト階層から外れたところに存在するプロジェクトからもインポートできるかを確認するためのもの)
```

