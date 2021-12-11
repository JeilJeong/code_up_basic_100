# 스케쥴러

n = 3
recipes = ["SPAGHETTI 3", "FRIEDRICE 2", "PIZZA 8"]
orders = ["PIZZA 1", "FRIEDRICE 2", "SPAGHETTI 4",
          "SPAGHETTI 6", "PIZZA 7", "SPAGHETTI 8"]

# orders에서 가장 주문 시각이 낮은 수를 찾는다.
# 이전 주문의 9개를 찾는다.
# 각 코어에서 걸리는 시간을 조사한다.

# recipes에서 가장 오래 걸리는 주문을 찾는다
# 해당 주문을 수행할 n개의 core에서 작업이 돌아가야 하기 때문에

recipes_menu = []
recipes_time = []
last_order = orders[-1]
for i in recipes:
    a, b = i.split(" ")
    recipes_menu.append(a)
    recipes_time.append(int(b))
cores = [0 for i in range(n)]
for order in orders:
    menu, order_time = order.split(" ")
    order_time = int(order_time)
    if (order == last_order):
        last_core_index = cores.index(min(cores))
        core_time = cores[last_core_index]
        if (core_time >= order_time):
            cores[last_core_index] += recipes_time[recipes_menu.index(menu)]
        else:
            cores[last_core_index] = order_time + recipes_time[recipes_menu.index(menu)]
        break
    core_time = cores[cores.index(min(cores))]
    if (core_time >= order_time):
        cores[cores.index(min(cores))] += recipes_time[recipes_menu.index(menu)]
    else:
        cores[cores.index(min(cores))] = order_time + recipes_time[recipes_menu.index(menu)]
print(cores[last_core_index])