# ref
#   https://ooyoung.tistory.com/79

# 새로운 단어로 추출하여 index count 검사가 주효

n = int(input())

group_word = 0
for _ in range(n):
    word = input()
    error = 0
    for index in range(len(word) - 1): # 인덱스 범위 생성: 0부터 단어개수 -1까지
        if word[index] != word[index + 1]: # 연이은 두 문자가 다르다면(즉, 현재 문자가 아래서 생성되는 새로운 단어에 등장하면 그룹단어가 아님)
            new_word = word[index + 1:] # 현재 글자 이후 문자열을 새로운 단어로 생성
            if new_word.count(word[index]) > 0: # 남은 문자열에서 현재 글자가 있다면
                error += 1 # error에 1씩 증가
    if error == 0:
        group_word += 1 # error가 0이면 그룹단어
print(group_word)