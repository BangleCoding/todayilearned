coin_types = [500, 100, 50, 10]

n = 1260
count = 0

coin_result ={}

for coin in coin_types :
    count += n // coin
    coin_result[coin] = n // coin
    n %= coin
    
     

print("total coin :",  count)
print(coin_result)
