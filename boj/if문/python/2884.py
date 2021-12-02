h, m = map(int, input().split())
factor = 45
m_result = 60
if (m - factor < 0):
    factor -= m
    m_result -= factor
    if (h == 0):
        h = 23
    else:
        h -= 1
else:
    m_result = m - factor

print("{0} {1}".format(h, m_result))