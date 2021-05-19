#n 행, m 열의 행렬을 입력받는다.
#한 행에서 가장 작은 숫자를 고른 후 그 숫자들 중에서 가장 큰 수를 구한다. 

n, m = map(int, input().split())

result = 0

for i in range(n):
    data = list(map(int, input().split()))
    min_value = 10001
    for a in data:
        min_value = min(min_value, a)
        result = max(result, min_value)

print(result)
