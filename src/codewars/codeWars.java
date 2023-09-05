package codewars;

public class codeWars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primos primos = new primos();
		System.out.println(primos.solution(10));
		}	   
	}

class Binary {
	
	public String getBinary(int a, int b)
	{
		int entero = a+b;
		String binario = Integer.toBinaryString(entero);
		return binario;
	}

	
}

class Vowels {

	  public static int getCount(String str) {
	    
		  char[ ] letras = new char[str.length()];
		  int count = 0;
		  for(int i=0; i < str.length(); i++ )
		  {
			  letras[i] = str.charAt(i);
			  if (letras[i] == 'a')
			  {
				  count++;
			  }
			  
			  else if (letras[i] == 'e')
			  {
				  count++;
			  }
			  else if (letras[i] == 'i')
			  {
				  count++;
			  }
			  else if (letras[i] == 'o')
			  {
				  count++;
			  }
			  else if (letras[i] == 'u')
			  {
				  count++;
			  }
			  
		  }
		  return count;
	    
	  }
	}

class Vowels2 {

    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

}

class primos {

	  public int solution(int number) {
		  int suma = 0;
		  for(int i=1;i<number;i++)
	        {
			  if(i%3==0) {suma = i + suma; ;}
			  else if(i%5==0) {suma = i + suma;;}
			  else {}
	            
	        }
	    return suma;
	  }
	}


