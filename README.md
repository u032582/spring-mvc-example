# Springbootサンプル
以下の機能を組み込んでいます
* SpringMvcの簡単なコントローラ
* SpringDataJpaの簡単な実装（H2DB）
* SpringRESTの簡単なコントローラ
* SpringRESTのOpenAPIドキュメントを公開
* SpringRESTのOpenAPIドキュメントをJavadocコメントから生成

# 起動方法
コマンドラインにて以下を実行
```
gradlew bootRun
```

# OpenAPIドキュメント
起動後、ブラウザで以下のURLにアクセス
```
http://localhost:8080/swagger/
```

# H2DB
データベースを参照する場合は以下にアクセス
```
http://localhost:8080/h2-console
```
JDBC URLは毎回変わる。起動時のログを参照。
