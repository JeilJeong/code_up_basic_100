# ref
#   https://pacific-ocean.tistory.com/35

# set은 중복을 허용하지 않으므로 간단히 해결 가능

arr = []
for i in range(10):
    n = int(input())
    arr.append(n % 42)
arr = set(arr)
print(len(arr))