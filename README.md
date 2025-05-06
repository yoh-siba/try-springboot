[参考サイト](https://qiita.com/smats-rd/items/ec2dc566bfb4b92f04d5)
[コードフォーマッタの準備](https://qiita.com/ryo8000/items/60714fa9c5ce261c1798)

# 構成

ビルドツール：Maven
言語：JAVA

curl http://localhost:8080

curl -X POST http://localhost:8080/api/data -H "Content-Type: application/json" -d '{"name": "John"}

[Client]
↓ (HTTP Request(http://localhost:8080/users or http://localhost:8080/user?id=1111L))
[Controller] ← リクエストを受け取る
↓
[Service] ← ビジネスロジック
↓
[Repository] ← DB アクセス
↑
[Model] ← データ構造
↓
[Controller]
↓
[View] (HTML, JSON など)
↓
[Client] ← レスポンスを返す
