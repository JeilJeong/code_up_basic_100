# ref
#   https://ooyoung.tistory.com/70

# count와 index를 이용한 점에 주목

# v1 348ms > v2 116ms : 200ms 이상의 획기적인 감소가 있었음, 문자열 탐색에서 max 등 내장함수의 성능 차이 등을 추측

words = input().upper()
unique_words = list(set(words))

cnt_list = []
for x in unique_words:
    cnt = words.count(x)
    cnt_list.append(cnt)

if cnt_list.count(max(cnt_list)) > 1:
    print("?")
else:
    max_index = cnt_list.index(max(cnt_list))
    print(unique_words[max_index])