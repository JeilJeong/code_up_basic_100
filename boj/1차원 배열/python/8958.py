# 15분 정도 소요

n =  int(input())
result_score = [0 for i in range(n)]
li = [input() for i in range(n)]
for i in range(n):
    stack_score = 0
    for j in range(len(li[i])):
        if li[i][j] == 'O':
            stack_score += 1
        else:
            stack_score = 0
        result_score[i] += stack_score
for i in range(n):
    print(result_score[i])