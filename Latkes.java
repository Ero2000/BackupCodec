/***
 * class Latkes
 * SKELETON
 * (actually: a class to implement a stack of Strings)
 * uses an array as underlying data structure
 ***/

public class Latkes 
{

    private String [] _stack;
    private int _stackSize;

    //constructor
    public Latkes(int size) 
    { 
	_stack = new String[size];
	_stackSize = 0;
    }

    //means of insertion
    public void push( String s ) 
    {
	_stack[_stackSize+1] = s;
	_stackSize++;
    }

    //means of removal
    public String pop( ) 
    { 
	_stack[_stackSize] = null;
	_stackSize--;
    }

    //chk for emptiness
    public boolean isEmpty() 
    { 
	if (_stackSize == 0)
		return true;
	return false;	
    }

    //chk for fullness
    public boolean isFull() 
    {
	if (_stackSize == _stack.length)
		return true;
	return false;
    }

}//end class Latkes
