 //CSCM12J lab class
//name:
//student id:

class Item //Class is given
{
    char val;
    public Item(char c) {val=c;}
    public char value() {return val;}
}

class Stack
{
	Item[] items;   //Array of items
	int top_stack;  //point to the top of the stack
	int max_size;   //Size of stack
	
	public Stack(int max_items)
	{
	}
	
	void push(Item item)
	{
	}
	
	Item top() 
	{
		return new Item('x');
	}
	
	void pop()
	{
	}
	
	boolean isEmpty() {return false;}
	boolean isFull() {return false;}
}


public class Lab3
{
    static Stack stack;
	public static void main(String[] args) 
	{
		stack=new Stack(100);
		String rightlyFormed="public static void main(String[] args){}";
		String wronglyFormed="public static void main(String[] args)}";
		System.out.println(testBrackets(rightlyFormed));
		System.out.println(testBrackets(wronglyFormed));
		System.out.println("testing new branch");
	}
	
	static public boolean testBrackets(String s)
	{
		return false;
	}
}

// Data structure for a list of employees coded here: 


