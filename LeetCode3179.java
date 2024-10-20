class  LeetCode3179{
    public int valueAfterKSeconds(int n, int k) {
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=1;
        }
        int sum=0;
        for(int i=0;i<k;i++){            
            for(int j=0;j<n;j++){
                if(j==0){
                    a[0]=1;
                    sum=1;
                }
                else{
                    a[j]=(sum+a[j])%1000000007;//to prevent overflow we are using modulo operator
                    sum=a[j];
                }
            }
        }
        
        return a[n-1];
    }
}
