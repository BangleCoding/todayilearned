
```python

n = 1260
count = 0 

coin_types = [500,100,50,10]

for coin in coin_types:
    print(n, "남은 돈")
    print(coin, "으로 총액을 나눕니다.")
    count += n // coin
    
    n %= coin
    
print("총갯수:", count)

```
