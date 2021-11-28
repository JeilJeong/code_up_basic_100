# def solution(participant, completion):
#     answer = list()
#     for man in participant:
#         flag = 0
#         for com_man in completion:
#             if man == com_man:
#                 flag = 1
#         if (flag == 0):
#             answer.append(man)
#     return answer

def solution(participant, completion):
    answer = list()
    for man in participant:
        flag = 0
        for com_man in completion:
            if man == com_man:
                flag = 1
        if (flag == 0):
            answer.append(man)
    return answer