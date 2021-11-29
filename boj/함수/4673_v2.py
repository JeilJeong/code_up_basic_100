# ref
#   https://www.acmicpc.net/status?user_id=s02145s&problem_id=4673&from_mine=1

# Key: 중복된 값을 처리할 때 set을 이용하기, sorted 사용
# v1에서 80ms => v2에서 76ms : 4ms 단축

natural_num = set(range(1, 10001))
generated_num = set()

for i in range(1, 10001):
    for j in str(i):
        i += int(j)
    generated_num.add(i)

self_num = sorted(natural_num - generated_num)
for i in self_num:
    print(i)