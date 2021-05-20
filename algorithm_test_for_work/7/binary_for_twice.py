def binary_search(array, target, start, end):
    if start>end:
        return None
    mid = (start + end) // 2 
    print(start, end)
    print(mid)
    #찾은 경우 중간점 인덱스 반환
    if array[mid] == target:
        return mid 
    #중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
    elif array[mid] > target:
       end = mid - 1
    else:
        start = mid +1 
        
#n, target (원소갯수, 찾고자 하는 값)을 입력받기     
n = int(input())
array = list(map(int, input().split()))
array.sort()
m = int(input())
x = list(map(int, input().split()))

for i in x : 
    result = binary_search(array, i , 0, n-1)
    if result !=None:
        print('yes', end=' ')
    else:
        print('no', end=' ')
