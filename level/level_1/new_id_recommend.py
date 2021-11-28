def solution(new_id):
    low_id = new_id.lower()
    for c in low_id:
        if c.isalpha() == False \
            or c.isdigit == False \
            or c == "-" \
            or c == "_" \
                or c == "." == False:
                c.replace(c, "")
    return low_id
