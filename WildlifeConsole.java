import java.lang.Math;

public class WildlifeConsole
{
    // Declare an instance of every organism to be represented on the grid
    public static Grass grass = new Grass();
    public static Tree tree = new Tree();
    public static Caterpillar caterpillar = new Caterpillar();
    public static Grasshopper grasshopper = new Grasshopper();
    public static Mouse mouse = new Mouse();
    public static Rabbit rabbit = new Rabbit();
    public Deer deer = new Deer();
    public static Squirrel squirrel = new Squirrel();
    public static Bluejay bluejay = new Bluejay();
    public static Hawk hawk = new Hawk();
    public static Wolf wolf = new Wolf();
    public static Fox fox = new Fox();
    
    public static void main(String[] args)
    {
	// Declare an instance of the console application itself
	WildlifeConsole console = new WildlifeConsole();

	int arraySize = 10;

	char[] consoleGrid1 = new char[arraySize];
	char[] consoleGrid2 = new char[arraySize];
	char[] consoleGrid3 = new char[arraySize];
	char[] consoleGrid4 = new char[arraySize];
	char[] consoleGrid5 = new char[arraySize];
	char[] consoleGrid6 = new char[arraySize];
	char[] consoleGrid7 = new char[arraySize];
	char[] consoleGrid8 = new char[arraySize];
	char[] consoleGrid9 = new char[arraySize];
	char[] consoleGrid10 = new char[arraySize];

	// The 2D environment is stored in a 10 by 10 matrix of characters.
	
	for (int indexCounter = 0; indexCounter < arraySize; indexCounter++)
	    {
		consoleGrid1[indexCounter] = 'X';
		consoleGrid2[indexCounter] = 'X';
		consoleGrid3[indexCounter] = 'X';
		consoleGrid4[indexCounter] = 'X';
		consoleGrid5[indexCounter] = 'X';
		consoleGrid6[indexCounter] = 'X';
		consoleGrid7[indexCounter] = 'X';
		consoleGrid8[indexCounter] = 'X';
		consoleGrid9[indexCounter] = 'X';
		consoleGrid10[indexCounter] = 'X';
	    }

	console.grass.DisplayHabitat(consoleGrid1, consoleGrid2, consoleGrid3, consoleGrid4, consoleGrid5, consoleGrid6, consoleGrid7, consoleGrid8, consoleGrid9, consoleGrid10);
	console.tree.DisplayHabitat(consoleGrid1, consoleGrid2, consoleGrid3, consoleGrid4, consoleGrid5, consoleGrid6, consoleGrid7, consoleGrid8, consoleGrid9, consoleGrid10);
	console.caterpillar.DisplayHabitat(consoleGrid1, consoleGrid2, consoleGrid3, consoleGrid4, consoleGrid5, consoleGrid6, consoleGrid7, consoleGrid8, consoleGrid9, consoleGrid10);
	console.grasshopper.DisplayHabitat(consoleGrid1, consoleGrid2, consoleGrid3, consoleGrid4, consoleGrid5, consoleGrid6, consoleGrid7, consoleGrid8, consoleGrid9, consoleGrid10);
	console.mouse.DisplayHabitat(consoleGrid1, consoleGrid2, consoleGrid3, consoleGrid4, consoleGrid5, consoleGrid6, consoleGrid7, consoleGrid8, consoleGrid9, consoleGrid10);
	console.rabbit.DisplayHabitat(consoleGrid1, consoleGrid2, consoleGrid3, consoleGrid4, consoleGrid5, consoleGrid6, consoleGrid7, consoleGrid8, consoleGrid9, consoleGrid10);
	console.deer.DisplayHabitat(consoleGrid1, consoleGrid2, consoleGrid3, consoleGrid4, consoleGrid5, consoleGrid6, consoleGrid7, consoleGrid8, consoleGrid9, consoleGrid10);
	console.squirrel.DisplayHabitat(consoleGrid1, consoleGrid2, consoleGrid3, consoleGrid4, consoleGrid5, consoleGrid6, consoleGrid7, consoleGrid8, consoleGrid9, consoleGrid10);
	console.bluejay.DisplayHabitat(consoleGrid1, consoleGrid2, consoleGrid3, consoleGrid4, consoleGrid5, consoleGrid6, consoleGrid7, consoleGrid8, consoleGrid9, consoleGrid10);
	console.hawk.DisplayHabitat(consoleGrid1, consoleGrid2, consoleGrid3, consoleGrid4, consoleGrid5, consoleGrid6, consoleGrid7, consoleGrid8, consoleGrid9, consoleGrid10);
	console.fox.DisplayHabitat(consoleGrid1, consoleGrid2, consoleGrid3, consoleGrid4, consoleGrid5, consoleGrid6, consoleGrid7, consoleGrid8, consoleGrid9, consoleGrid10);
	console.wolf.DisplayHabitat(consoleGrid1, consoleGrid2, consoleGrid3, consoleGrid4, consoleGrid5, consoleGrid6, consoleGrid7, consoleGrid8, consoleGrid9, consoleGrid10);
	
	for (int indexCounter = 0; indexCounter < arraySize; indexCounter++)
	    System.out.print(consoleGrid1[indexCounter] + " ");
	System.out.println("");
	
	for (int indexCounter = 0; indexCounter < arraySize; indexCounter++)
	    System.out.print(consoleGrid2[indexCounter] + " ");
	System.out.println("");
	
	for (int indexCounter = 0; indexCounter < arraySize; indexCounter++)
	    System.out.print(consoleGrid3[indexCounter] + " ");
	System.out.println("");
	
	for (int indexCounter = 0; indexCounter < arraySize; indexCounter++)
	    System.out.print(consoleGrid4[indexCounter] + " ");
	System.out.println("");

	for (int indexCounter = 0; indexCounter < arraySize; indexCounter++)
	    System.out.print(consoleGrid5[indexCounter] + " ");
	System.out.println("");
	
	for (int indexCounter = 0; indexCounter < arraySize; indexCounter++)
	    System.out.print(consoleGrid6[indexCounter] + " ");
	System.out.println("");
	
	for (int indexCounter = 0; indexCounter < arraySize; indexCounter++)
	    System.out.print(consoleGrid7[indexCounter] + " ");
	System.out.println("");
	
	for (int indexCounter = 0; indexCounter < arraySize; indexCounter++)
	    System.out.print(consoleGrid8[indexCounter] + " ");
	System.out.println("");

	for (int indexCounter = 0; indexCounter < arraySize; indexCounter++)
	    System.out.print(consoleGrid9[indexCounter] + " ");
	System.out.println("");
	
	for (int indexCounter = 0; indexCounter < arraySize; indexCounter++)
	    System.out.print(consoleGrid10[indexCounter] + " ");
	System.out.println("");	
    }
}
