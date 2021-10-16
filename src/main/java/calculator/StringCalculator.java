package calculator;

class StringCalculator {
       
    public static void main(String[] args){
        
    }
    public int add(String input) {

       if(input.length() == 0)
        {
            return 0;
        }
        else if(input.length()==1)
        {
            return Integer.parseInt(input);
        }
        else
        {
            String[] str = input.split(",");
            return Integer.parseInt(str[0])  +Integer.parseInt(str[1]);
        }
    }

}