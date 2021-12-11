# ref
#   https://ooyoung.tistory.com/72

# step :: 의 사용과 -1일 경우 reverse 의미, 양수는 뛰어넘을 단계를 의미
# 삼항 연산자 표현식 코드를 사용

a,b = input().split()
a = int(a[::-1])
b = int(b[::-1])

print(a) if a > b else print(b)