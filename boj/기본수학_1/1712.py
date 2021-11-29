# timeout

fix, var, price = map(int, input().split())
total = fix
revenue = 0
count = 0
if var >= price:
    print(-1)
else:
    while revenue <= total:
        revenue += price
        total += var
        count += 1
    print(count)