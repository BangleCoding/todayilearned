# n = 배열의 크기 5
# m = 합하는 횟수 6
# k = 한 번에 더할 수 있는 횟수 3
n, m, k = map(int, input().split())

data = list(map(int, input().split()))

#입력받은 수 정렬 
data.sort()

#배열에서 가장 큰 수 
first = data[n-1]
#배열에서 두번째로 큰 수 
second = data[n - 2]



count = int(m / (k+1)) * k
print(count)
count += m %( k +1 )
print(count)
#반복되는 수열의 길이 : k+1
#수열이 반복되는 횟수 : m/(k+1)
#가장 큰 수가 등장하는 횟수 : int(m/(k+1))*k



result = 0
result += (count) * first #반복횟수 * 가장 큰 수   
result += (m-count) * second #나머지 횟수 * 두번째로 큰 수

print(result)
