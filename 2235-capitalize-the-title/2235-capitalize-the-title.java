class Solution {
    public String capitalizeTitle(String title) {
        char arr[]= title.toCharArray();
        int start = 0;
        int n = arr.length;
        for( int i = 0; i<=n;i++)
        {
            if(i ==n || arr[i]==' '){
            int length = i-start;
            if(length>=3)
            {
                if(arr[start]>='a'&& arr[start]<='z')
                {
                    arr[start] = (char)(arr[start]-32);
                }
            }
            start=i+1;
        }
         else{
            if(arr[i]>='A' && arr[i]<='Z'){
                arr[i]= (char)(arr[i]+32);
            }
        }
    }
    return new String(arr);
}
}