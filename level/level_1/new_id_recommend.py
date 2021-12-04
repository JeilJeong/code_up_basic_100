# ref
#   https://yaneodoo2.tistory.com/entry/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-level-1-%EC%8B%A0%EA%B7%9C-%EC%95%84%EC%9D%B4%EB%94%94-%EC%B6%94%EC%B2%9C

def solution(new_id):
    answer = ""

    # 1) 소문자 생성하기
    new_id = new_id.lower()
    # 2) 소문자, 숫자, 빼기, 밑줄, 마침표만 사용
    for value in new_id:
        if value.islower() or value.isdigit() or value in ["-", "_", "."]:
            answer += value

    # 3) . 두 번 이상 반복되는 경우 하나로 변경
    # answer에서 하나씩 검사하는 for문과 달리 while문의 경우에는 조건문 실행과 동일
    while '..' in answer:
        answer = answer.replace('..', '.')

    # 4) . 이 처음이나 끝에 위치하면 삭제
    if answer[0] == ".":
        if len(answer) >= 2:
            answer = answer[1:]
        else:
            answer = "."

    if answer[-1] == ".":
        answer = answer[:-1]

    # 5) 빈 문자열인 경우 a 대입
    if answer == "":
        answer = "a"

    # 6) 16자리 이상인 경우 15자리까지 변경
    if len(answer) >= 16:
        answer = answer[:15]
        if answer[-1] == ".":
            answer = answer[:-1]

    # 7) 2자 이하인 경우 마지막 문자 추가
    while len(answer) < 3:
        answer += answer[-1]

    return answer

solution()