class CommandLineArgsDemo{
public static void main(String [] args){

//String k[]={"30","10","40"};
Long a=Long.parseLong(args[0]);
Long b=Long.parseLong(args[1]);

CommandLineArgsDemo commandLineArgsDemo= new CommandLineArgsDemo();
int response= commandLineArgsDemo.add(a, b);
System.out.println("The response :" +response);



}
//static void test(String[] a){
//System.out.println(a[1]);
//} 

int add(Long a,  Long b){
return (int)(a+b);

}
}