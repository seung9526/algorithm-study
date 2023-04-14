N=int(input())
arr=list(map(int,input().split())) #입력형태에 따라
ans=[]

for i in range(N) :
  ans.insert(-arr[i],i+1)
  
for k in ans:
  print(k, end=' ') #출력 형태에 따라
