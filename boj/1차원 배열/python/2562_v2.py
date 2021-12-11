# ref
#   https://yongku.tistory.com/entry/%EB%B0%B1%EC%A4%80-2562%EB%B2%88-%EC%B5%9C%EB%8C%93%EA%B0%92-%ED%8C%8C%EC%9D%B4%EC%8D%ACPython

n_list = []
for i in range(9):
    n_list.append(int(input()))
print(max(n_list))
print(n_list.index(max(n_list)) + 1)