package starterFiles;

public class JFaganNameCase implements NameCase {
    public static void main (String [] args)
    {
    	NameCase test = new JFaganNameCase();
    	System.out.println("This is where you should test your code.");
    	System.out.println(test.titlecase("Justin"));
    	System.out.println(test.swapcase("Justin"));
    	//System.out.println(test.alternatingcase("Justin"));
    	
    }

    public String titlecase(String name)
    {
        return name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
    }
    public String swapcase(String name)
    {
        return name.substring(0,1).toLowerCase()+name.substring(1).toUpperCase();
    }
    public String alternatingcase(String name)
    {
       //String originalName=name.toLowerCase();
       String alternatingName=name.toLowerCase();;
    	for(int i=0;i<name.length();i++)
       {
    	   if(i==0 || i%2==0)
    	   {
    		   
    	   }
    	   else
    	   {
    		   alternatingName= 
    	   }
       }
    	return alternatingName;
    }

}
