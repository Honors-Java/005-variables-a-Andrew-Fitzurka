int lowNum = 125;
int highNum = 375;
int diameter = 125;
int xValue = random(15, 25);
int yValue = random(15, 25);
int numRandom = xValue + yValue;

void setup() {
	size(500, 500);
}

void draw() {
// Step 1: Write code that draws the screenshot in the files 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 
// Try different expressions and see what happens!
  background(255);
  stroke(0);
  fill(31, 184, 72);

// int highNum = 165;
// int lowNum = 150;
// int diameter = highNum - lowNum;

//Top-left ellipse
  ellipse(lowNum, lowNum, diameter, numRandom);
//Top-right ellipse  
  ellipse(highNum, lowNum, numRandom, diameter);
//Bottom-left ellipse
  ellipse(lowNum, highNum, numRandom, diameter);
//Bottom-right ellipse
  ellipse(highNum, highNum, diameter, numRandom);
}