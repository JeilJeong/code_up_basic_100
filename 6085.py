w, h, b = input().split()
result = int(w) * int(h) * int(b) / 8 / 1024 / 1024
print("%.2f"%result, "MB")