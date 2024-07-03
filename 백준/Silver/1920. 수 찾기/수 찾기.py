# 수 찾기

def binary_search(element, N, start, end):
    if start>end:
        return 0
    m=(start+end)//2
    if element==N[m]:
        return 1
    elif element<N[m]:
        return binary_search(element, N, start, m-1)
    else:
        return binary_search(element, N, m+1, end)

N=int(input())
N_num=sorted(list(map(int, input().split())))
M=int(input())
M_num=list(map(int, input().split()))

for i in M_num:
    start=0
    end=len(N_num)-1
    print(binary_search(i, N_num, start, end))