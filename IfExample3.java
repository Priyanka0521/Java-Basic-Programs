public class IfExample3{
    public static void main(String[] args){
        int x=9;
        int y=5;// 
        int z=9;
        if(x>y && x>z) //Conditional statements if ,else if,else
            System.out.println(x);
        else if(y>x && y>z)
            System.out.println(y);
        else
        System.out.println(z);
    }
}