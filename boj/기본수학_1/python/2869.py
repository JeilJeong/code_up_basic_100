# time limit: 0.15s

a, b, v = map(int, input().split())

if (v == a):
    print(1)
else:
    jump_point = v - a  # 마지막날 a만큼 올라갈 수 있기 전 마지막 포인트 위치를 정함
    gap = a - b # gap은 하룻밤에 올라갈 수 있는 거리
    if (jump_point % gap == 0): # 만약 jump point가 gap으로 나누어 떨어지면, 마지막 날에 a만큼만 더 올라가면 됨
        count = jump_point // gap # 따라서 추가적인 +1이 필요 없음
    else:  # 그러나 jump point가 gap으로 나눌 때 나머지가 있다는 것은, jump point를 지나서 조금 더 올라가게 되고, 마지막 날에 a를 올라 정상을 초과한다는 의미
        count = jump_point // gap + 1 # 그러므로 몫을 구하고, +1만큼 더 올라가야 함
    print(count + 1) # 마지막 날 a만큼 올라가기에 +1을 추가해줌