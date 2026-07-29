class Solution {
    public String convert(String s, int nr) {
        if(nr==1 || s.length()<=nr ) return s;
        StringBuilder r[] = new StringBuilder[nr];
         for (int i = 0; i < nr; i++) {
            r[i] = new StringBuilder();
        }
        int cr = 0;
        boolean d=false;
        for(char ch:s.toCharArray())
        {
            r[cr].append(ch);
            if( cr==0 || cr == nr - 1 )
            {
                d =!d;
            }
            cr+=d?1:-1;
        }
         StringBuilder rs = new StringBuilder();
         for(StringBuilder sb:r)
         {
            rs.append(sb);
         }
         return rs.toString();
    }
}
