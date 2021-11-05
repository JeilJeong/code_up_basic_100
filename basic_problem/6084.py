h, b, c, s = input().split()
size = int(h) * int(b) * int(c) * int(s)
print(round(size/(8*1024**2), 1), "MB")