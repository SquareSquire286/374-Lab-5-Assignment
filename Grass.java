public class Grass
{
    public char identifyingChar;
    public int foodChainIndex;
    public boolean isCarnivorous;
    public int numberOfLimbs;

    public Grass()
    {
	identifyingChar = 'g'; // this character is what will appear on the 2D grid to represent position
	foodChainIndex = 0; // the 0th level implies the bottom of the food chain
	isCarnivorous = false;
	numberOfLimbs = 0; // limbs refer only to animals' arms or legs
    }

    public int getFoodChainIndex()
    {
	return foodChainIndex;
    }

    public boolean getOrganismDiet()
    {
	return isCarnivorous;
    }

    public int getNumberOfLimbs()
    {
	return numberOfLimbs;
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

	System.out.println("The grass can be found at (" + xPosGenerator + " , " + yPosGenerator + ").");
    }
}
