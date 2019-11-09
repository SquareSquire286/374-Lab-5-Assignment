public class Squirrel extends Grass
{
    public Squirrel()
    {
	identifyingChar = 'S';
	foodChainIndex = 1;
	isCarnivorous = false;
	numberOfLimbs = 4;
    }

    public void DisplayHabitat(char[] displayGrid1, char[] displayGrid2, char[] displayGrid3, char[] displayGrid4, char[] displayGrid5, char[] displayGrid6, char[] displayGrid7, char[] displayGrid8, char[] displayGrid9, char[] displayGrid10)
    {
	int minimum = 1; // these are used to generate coordinates for the 2D environment
	int maximum = 10;
	int range = maximum + minimum - 1;

	int xPosGenerator = (int) (Math.random() * range) + minimum;
	int yPosGenerator = (int) (Math.random() * range) + minimum;

	switch (xPosGenerator)
	    {
	    case 1: displayGrid1[yPosGenerator - 1] = identifyingChar; break;
	    case 2: displayGrid2[yPosGenerator - 1] = identifyingChar; break;
	    case 3: displayGrid3[yPosGenerator - 1] = identifyingChar; break;
	    case 4: displayGrid4[yPosGenerator - 1] = identifyingChar; break;
	    case 5: displayGrid5[yPosGenerator - 1] = identifyingChar; break;
	    case 6: displayGrid6[yPosGenerator - 1] = identifyingChar; break;
	    case 7: displayGrid7[yPosGenerator - 1] = identifyingChar; break;
	    case 8: displayGrid8[yPosGenerator - 1] = identifyingChar; break;
	    case 9: displayGrid9[yPosGenerator - 1] = identifyingChar; break;
	    case 10: displayGrid10[yPosGenerator - 1] = identifyingChar; break;
	    }

	System.out.println("The squirrel can be found at (" + xPosGenerator + " , " + yPosGenerator + ").");
    }
}

