class factorial{
static int fact(int n){
if(n==1){return 1;}
else{
return n*fact(n-1);
}

}
public static void main(String args[]){
int m=5;
int res=fact(5);
System.out.println("facorial of n is :- "+res);
}
}