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
		else if (input.contains("\n") && input.contains(",") )
		{
			int result =0;
            input=input.replace("\n", ",");
			String [] str = input.split(",");
			for(int i=0; i<str.length; i++)
			{
			 result = result + Integer.parseInt(str[i]);
			}
			return result;
		} 
        else if (input.contains("//")){
			int result =0;
		input=input.replace("//","0");
  		   input=input.replace("\n","");
  		   Character split=input.charAt(1);
	
			String [] str = input.split(split.toString());
			try 
		  {
			for(int i=0; i<str.length; i++)
			{
				if(Integer.parseInt(str[i]) >=0)
					result = result + Integer.parseInt(str[i]);
					else 
						throw new Exception("negatives not allowed");
            }	
				
            } catch (Exception e) {
					
					System.out.println(e);
                    for(int i=0;i<str.length;i++) {
						if(Integer.parseInt(str[i]) <0)
							System.out.println(str[i]);
					}
			
				}		
			
			
			return result;
		}
        else {
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