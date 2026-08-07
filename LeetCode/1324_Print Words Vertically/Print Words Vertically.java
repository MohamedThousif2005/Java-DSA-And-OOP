class Solution {
    public List<String> printVertically(String s) {
        List<String> ansList = new ArrayList<>();
        int maxLength = 0;
        String[] str = s.split(" ");
        for(int i = 0; i < str.length; i++)
        {
            if(str[i].length() > maxLength) maxLength =  str[i].length();
        }
        for(int i = 0; i < maxLength; i++)
        {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < str.length; j++)
            {
                if(str[j].length() <= i)
                {
                    sb.append(" ");
                    continue;
                }
                sb.append(str[j].charAt(i));
            }
            ansList.add(sb.toString().stripTrailing());
        }
        return ansList;
    }
}
