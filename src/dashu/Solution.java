package dashu;

class Solution {

    public static String add(String num1,String num2){
        String ans ="";
        int maxn = Math.max(num1.length(),num2.length());
        char[] s = new char[maxn+1];
        char[] s1 = new char[maxn+1];
        char[] s2 = new char[maxn+1];

        int x = 0;
        for(int i=num1.length()-1;i>=0;i--){
            s1[x++] = num1.charAt(i);
        }
        x = 0;
        for(int i=num2.length()-1;i>=0;i--){
            s2[x++] = num2.charAt(i);
        }

        int c = 0;
        for(int i = 0;i<maxn;i++){

            int a = 0,b = 0;
            if(i<num1.length()){
                a += s1[i] - '0';
            }
            if(i<num2.length()){
                b += s2[i] - '0';
            }

            //System.out.println(a+" "+b+" "+c);

            if(a+b+c>=10){
                s[i] += (char)(((a+b+c)%10)+'0');
                c = (char)((a+b+c)/10);

            }else {
                s[i] += (char)((a+b+c)+'0');
                c = 0;
            }
            //System.out.println(s[i]);
        }
        int i = maxn-1;
        if(c!=0) {
            s[maxn] = (char) (c + '0');
            i = maxn;
        }
        x = 0;
        for(;i>=0;i--){
            s1[x++] = s[i];
        }
        ans = new String(s1,0,x);

        return ans;
    }


    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();

        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }

        char[] s1 = new char[len1];
        char[] s2 = new char[len2];

        int x =0 ;
        for(int i = num1.length()-1;i>=0;i--){
            s1[x++] = num1.charAt(i);
        }
        x = 0;
        for(int i=num2.length()-1;i>=0;i--){
            s2[x++] = num2.charAt(i);
        }

        char ans1[] = new char[len2+len1];
        int c = 0 ;
        String r1 = "0";
        for(int i=0;i<len1;i++){
            c = 0;
            for(int j=0;j<len2;j++){
                int a = s1[i] - '0';
                int b = s2[j] - '0';
                if(a*b+c>=10){
                    ans1[j] = (char)(((a*b+c)%10)+'0');
                    c = (a*b+c)/10;
                }else{
                    ans1[j] = (char)((a*b+c)+'0');
                    c = 0;
                }
                //System.out.println(i+" "+a+" "+b+" "+c);
            }
            int len22 = len2;
            String sss;
            if(c>0){
                ans1[len22++] = (char)(c+'0');
                sss = new String(ans1,0,len22);
            }else {
                sss = new String(ans1,0,len22);
            }

            sss = new StringBuilder(sss).reverse().toString();
            for(int k=0;k<i;k++){
                sss+="0";
            }
            //System.out.println("sss:"+sss);
            r1 = add(r1,sss);
            //System.out.println("r1:"+r1);
        }

        return r1;
    }

    public static void main(String[] args) {

        System.out.println(new Solution().multiply("789","987"));
    }

}

