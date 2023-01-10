class fibnocci
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n,sum=0,count=0,n3;
int n1=0, n2=1, nc=1;
System.out.println("n= ");
n=s.nextInt();
while(count !=n)
{
n3=n1+n2;
n1=n2;
nc=nc+1;
if(nc%2==0)
{
count=count+1;
sum=sum+n3;
}
}
System.out.println("sum= ");
System.out.println(sum);
}
}
