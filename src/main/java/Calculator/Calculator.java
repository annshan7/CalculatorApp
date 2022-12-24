package Calculator;

public class Calculator {
	float result;
	
	float addCal(float a, float b)
	{
		return (a+b);
	}
	
    float subCal(float a, float b)
    { 
    	return (a-b);
    	
    }
	
    float mulCal(float a, float b)
    { 
    	return (a*b);
    	
    }
    
    
    float divCal(float a, float b)
    { 
    	try {
    		result =a/b;
        }
        catch (ArithmeticException e) {
          
            System.out.println(
                "Divided by zero operation cannot possible");
    	 }
    	
    	return(result);
    }
    
	void displayHeader() {
		
		System.out.println("Calculator App");
	}
	

}


