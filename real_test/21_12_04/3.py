# 수직 수평거리

keyboard = ['q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o',\
            'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k',\
            'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm']

s = "tooth"
s_len = len(s) - 1
distance = [0 for i in range(s_len)]
for i in range(s_len):
    pre_x = 0
    pre_key_index = keyboard.index(s[i])
    pre_y = pre_key_index // 9
    pre_x = pre_key_index % 9
    post_x = 0
    post_key_index = keyboard.index(s[i + 1])
    post_y = post_key_index // 9
    post_x = post_key_index % 9
    x_y_distance = abs(pre_x - post_x) + abs(pre_y - post_y)
    distance[i] += x_y_distance
for i in range(len(distance)):
    print(distance[i])

total = 0
for k in range(s_len):
    for j in range(s_len - k):
        total += sum(distance)
        distance = [distance[i] + distance[i + 1] for i in range(len(distance) - 1)]
print(total)