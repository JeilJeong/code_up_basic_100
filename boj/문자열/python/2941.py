li = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
target = input()
for i in li:
    target = target.replace(i, '_')
print(len(target))