public class ContinueExample {  
public static void main(String[] args) {  
    //for loop  
    for(int i=1;i<=10;i++){  
        if(i==5){  
            //using continue statement  
            continue;//it will not skip rest of the program like break
        }  
        System.out.println(i);  
    }  
}  
}  