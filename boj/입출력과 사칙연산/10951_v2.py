# ref
#   answer: https://velog.io/@jsw8050/%EB%B0%B1%EC%A4%80-while%EB%AC%B8-10951%EB%B2%88-AB-4-Python
#   usage of map: https://blockdmask.tistory.com/531

while True:
    try:
        a, b = map(int, input().split())
        print(a + b)
    except:
        break