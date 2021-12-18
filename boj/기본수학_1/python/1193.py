# ref
#    https://deokkk9.tistory.com/11

# 규칙을 코드로 옮기는 과정이 쉽지 않았음
# 1) 핵심은 n까지의 while문을 전부 반복하지 않는다는 것
# 2) 즉, line을 1, 2, 3 ... +1씩 증가시키지만 n에서 빼면서 빠르게 반복문을 줄임
# 3) n의 값이 line보다 작아졌을 때, line의 숫자가 홀짝수 여부에 따라 분모, 분자의 진행 방향이 달라짐
# 4) 분자는 짝수일 때 순방향, 분모는 홀수일 때 순방향이다 => line에서 -n만큼 해주는 것이 역방향 index와 유사하다

n = int(input())

line = 1
while n > line:
    n -= line
    line += 1

if line % 2 == 0:
    a = n
    b = line - n + 1
else:
    a = line - n + 1
    b = n

print(a, '/', b, sep='')