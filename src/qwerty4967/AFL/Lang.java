package qwerty4967.AFL;

public class Lang 
{

	// Contains all of the INNERMOST SECRETS
		// nice!
		// but in reality this just holds a bunch of common definitions for ziker.
		// effectively a struct.
		
		public static final String[] TYPES= {"num","string","char","bool"};
		
		public static final String[] BOOLS= {"true","false"}; // wow
		
		public static final int MAXIMUM_DEPTH =10000; //  wanted the int limit, but that gave me errors...
		
		public static enum tokenType
		{
			variable, // first 4 are 'raw text'
			function,
			type,
			bool,
			number,
			string,
			character,
			operator,
			groupPointer // also only used while parsing, specifically '(' and ')'s. TODO is required?
		}
		
		// I wasn't sure whether it would make more sense to make a series of enums or just do a two dimensional array, so
		// feel free to laugh at me, future self, if this was a bad decision 
		public static final String[][] OPERATORS = 
		{
			{"(",")" }, // organize (these operators are special)
			{"="}, // assign
			{"==","!=",">=","<=",">","<"}, // compare
			{"+","-"}, // add and subtract.
			{"*","/","%"} // multiply and divide
			
			
			
			
		};
		
		public static enum OPERATION_PRIORITY_GROUPS
		{
			organize,
			assign,
			compare,
			add,
			multiply
			
			
		}
}
