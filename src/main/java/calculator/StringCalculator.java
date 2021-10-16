package calculator;

class StringCalculator {
       
    
    public int add(String input) {

       if(input.length() == 0)
        {
            return 0;
        }
        else if(input.length()==1)
        {
            return Integer.parseInt(input);
        }
        else if (input.length() == 2)
		{
			String[] str = input.split(",");
			return Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
		}
		else 
		{
			int result =0;
			String [] str = input.split(",");
			for(int i=0; i<str.length; i++)
			{
			 result = result + Integer.parseInt(str[i]);
			}
			return result;
		} 
    }

}