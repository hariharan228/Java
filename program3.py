import re
import operator

rel = input("\nEnter the recurrence relation : like 1(n+1)+n.\nWhere 1 is coefficient, (n+1) is expression, n is constant:\n")
res = r'{}'.format(rel)

coef = re.split('\(',res)[0]
exp_var = re.split('[+-/*]',re.split('\)',re.split('\(',res)[1])[0])[0]
exp_const = re.split('[+-/*]',re.split('\)',re.split('\(',res)[1])[0])[1]
operator = re.findall('[+-/*]',res)
def recur(coef,exp_var,exp_const,ope):
    oper = ope[0]
    
    for i in range(len(oper)):
        if(oper=='+'):
            ops = { str(oper):lambda x,y:x+y}
        elif(oper=='-'):
            ops = { str(oper):lambda x,y:x-y}
        elif(oper=='*'):
            ops = { str(oper):lambda x,y:x*y}
        elif(oper=='/'):
            ops = { str(oper):lambda x,y:x/y}
    
    result = []
    for i in range(1,exp_var+1):
        exp = ops[oper](i,int(exp_const))
        rs = int(coef) * int(exp) 
        rs = rs + i
        result.append(rs)
    print(result)

  
exp_var = int(input("Enter the number of elements : "))
recur(coef,exp_var,exp_const,operator)
