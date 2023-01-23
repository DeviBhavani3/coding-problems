class Solution:
    def myAtoi(self, s: str) -> int:
        s=s.strip()
        if not s:
            return 0
        i=0
        sign=1
        if(s[i]=="+"):
            i+=1
        elif(s[i]=="-"):
            sign=-1
            i+=1
        result=0
        while(i<len(s)):
            if not s[i].isdigit():
                break
            else:
                result=result*10+int(s[i]) 
            i+=1
        result=result*sign
        if(result>=2**31):
            return 2**31-1
        elif(result<=-2**31):
            return -2**31
        else:
            return result                           
