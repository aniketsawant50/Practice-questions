class bitchecker
{
    public static void main(String [] args)
    {
        int num = 10;
        int n = 1;


        int bitstatus=(num >> n & 1);
        
            System.out.println(+n+"bit of"+num+"is set(1)");
        
    }
}