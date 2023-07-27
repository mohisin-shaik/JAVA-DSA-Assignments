class sum_of_digits{
static int sum(int n){
if(n==0){return 0;}
else{
return n%10+sum(n/10);
}
}
 
public static void main(String[] args){
int m=45;
int result=sum(m);
System.out.println(result);
}

}