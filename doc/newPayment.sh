curl https://api.yookassa.ru/v3/payments -v  -X POST   -u shopId:shopSecret \
  -H 'Idempotence-Key: 12312345svf23' \
  -H 'Content-Type: application/json' \
  -d '{"amount":{"value":"10.00","currency":"RUB"},"confirmation":{"type":"embedded"},"capture":true,"description":"some test payment"}'
