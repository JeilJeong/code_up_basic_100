# ref
#   https://j-remind.tistory.com/76

# 초기 dictionary를 이용하려 했으나 리스트와 index & in을 이용해 풀이 가능

dial  = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
target = input()
ret = 0
for j in range(len(target)):
    for i in dial:
        if target[j] in i:
            ret += dial.index(i) + 3
print(ret)