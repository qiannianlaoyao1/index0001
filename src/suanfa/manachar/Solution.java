package suanfa.manachar;

class Solution {
    public String longestPalindrome(String s) {
        StringBuilder ss = new StringBuilder();
        ss.append("@");
        for(int i=0;i<s.length();i++){
            ss.append("#");
            ss.append(s.charAt(i));
        }
        ss.append("#");
        ss.append("$");
        String sss = ss.toString();
        int ans = -1;
        int flag = -1;
        int p[] = new int[sss.length()+2];
        int mx = 0;
        int id = 0;
        for(int i = 1;i <= 2*s.length()+1;i++){
            if(mx>i){
                p[i] = Math.min(mx-i,p[2*id-i]);
            }else {
                p[i] = 1;
            }
            while(sss.charAt(i-p[i])==sss.charAt(i+p[i])){
                p[i]++;
            }
            if(p[i]+i>mx){
                mx= p[i]+i;
                id = i;
            }
            if(p[i]>ans){
                ans = p[i];
                flag = i;
            }
        }

        if(flag == -1) {
            return "";
        }

        StringBuilder q = new StringBuilder();
        for(int i = flag-(ans-1);i<=flag+(ans-1);i++){
            if(sss.charAt(i)!='#'){
                q.append(sss.charAt(i));
            }
        }
        return q.toString();

    }
}