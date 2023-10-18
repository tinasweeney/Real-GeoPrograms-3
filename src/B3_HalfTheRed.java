public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());

        for (int row = 1; row < 527; row = row + 1) {
            for (int col = 1; col < 717; col = col + 1) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                if (red > 254 && green > 254 && blue > 254 && col > 700 && row < 717) {
//                    plane.setPixelColor(200, green / 2, 200);
//                }
                if (red > 254 && green > 254 && blue > 254 && col > 90 && row < 600) {
                    plane.setPixelColor(100, green / 2, 200);
                }
//                if (red > 133 && green > 166 && blue > 57 && col < 333 && row > 221) {
//                    plane.setPixelColor(100, green / 2, 100);
                if (red > 245 && green > 166 && blue > 56 && col > 140 && row < 510 && row > 11) {
                    plane.setPixelColor(200, green / 3, 150);
                }
                if (red > 245 && green > 166 && blue > 56 && col > 160 && row < 500 && row > 10) {
                    plane.setPixelColor(200, green / 3, 200);
                }
                if (red > 245 && green > 166 && blue > 56 && col > 180 && row < 480 && row > 9) {
                    plane.setPixelColor(200, green / 3, 250);
                }
                if (red > 245 && green > 166 && blue > 56 && col > 200 && row < 460 && row > 8) {
                    plane.setPixelColor(200, green / 2, 250);
                }
                if (red > 245 && green > 166 && blue > 56 && col > 220 && row < 440 && row > 7) {
                    plane.setPixelColor(200, green / 2, 150);
                }
                if (red > 245 && green > 166 && blue > 56 && col > 240 && row < 420 && row > 6) {
                    plane.setPixelColor(150, green / 3, 150);
                } else {
                    if (red > 244 && green > 166 && blue > 56 && col > 100 && row < 40 && row > 30) {
                        plane.setPixelColor(200, green / 3, 150);




//                            plane.startingAngle(90);
//                            plane.isTrail = true;
//                            plane.trailWidth = 10;
//                            plane.setColor(0, 0, 200);
//                            plane.move(111);
//                            plane.turn(90);
//                            plane.setColor(0, 0, 200);
//                            plane.move(111);
//                            plane.turn(90);
//                            plane.setColor(0, 0, 200);
//                            plane.move(111);
//                            plane.turn(90);
//                            plane.setColor(0, 0, 200);
//                            plane.move(111);
//                            plane.turn(90);
//                        }


//                if (red > 300 && green > 30 && green < 100 && col > 120 && row < 200) {
//                    plane.setPixelColor(10, green / 2, 100);
//                    plane.setPixelColor(100, 5, col / 4);
//                } else {
//                    if (red > 131 && green > 166 && blue > 56 && col > 140 && row < 510 && row > 15) {
//                        plane.setPixelColor(200, green / 3, 150);
//                                plane.move to add stuff 

                    }
//                        if (red > 200 && green > 5 && green < 255 && col > 220 && row < 100) {
//                            plane.setPixelColor(255, 3, 150);
//
//                            if (red > 275 && green > 5 && green < 255 && col > 300 && row < 90) {
//                                plane.setPixelColor(255, 3, 150);
//
//                                if (red > 300 && green > 10 && green < 255 && col > 476 && row < 70) {
//                                    plane.setPixelColor(row / 3, 3, 150);
//                                    int avg = (red + + blue) / 3;
//
//                                    plane.trailWidth = 5;
//                                    for (int y = 0; y < 100; y = y + 1) {
//                                        plane.teleport(300, y * 10);
//                                        plane.square(100);


//                }
//                    && col > 637 && row < 404

//                    plane.teleport(col, 527 - row);
                    //causes it to go upside down
                    //plane.setPixelColor(avg, avg, avg);

                }

            }
        }
    }
}








//col = x value, row = y value
// red green and blue; varaibles
//how much red green blue = methods
//nested loop allowing us to teleport to a grid of squares (y values and x values) line 21 cganges the actual color of the specific pixel, in example half as much red, same amout of green and blue
/*
// 0,0,0 = black, 255,255,255 = white, 100,100,100= gray : the numbers are all the same amount

// Below is a list of the variables in plane and how to set them:

   plane.anglefacing=90 ;     // Sets the angle the plane is facing
	plane.xpos=100;            // Sets the xposition of the plane
	plane.ypos=100;            // Sets the yposition of the plane
   plane.isTrail=false;       // Sets if the plane has a trail
   plane.trailWidth=1;        // Sets the width of the trail from the plane
   plane.pausetime=1;         // Sets how long the plane pauses each time it moves, 
                                 make this bigger to watch the drawing happen
   
// Below are all the methods the plane can use:

   System.out.println("fun" + variable);  // Prints text to the window + the value of the variable
   plane.drawWords("this is fun");  // Prints text to the applet at the location of the plane
   plane.circle(10);                // Draws a circle of radius 10
   plane.square(50);                // Draws a square with side length 50, 
                                      the plane finishes in the same direction it starts  
   plane.house(100);                // Draws a house with a bottom edge of 100
   plane.fillCircle(100);           // Draws a circle of radius 100 and fills it in
   plane.move(100);                 // Moves the plane forward (the direction it is facing) 100 pixels
   plane.teleport(111, 222);        // Relocates the plan to the x position 111 and the y position 222, 
                                      there is no trail with teleport
   plane.turn(90);                  // Turns the plan 90 degrees counterclockwise
   plane.setColor(255, 255, 255);   // Sets the trail color Red, Green, Blue; max value of 255, min 0
   plane.setPixelColor(255, 255, 255);  // Sets the pixel color at the plane's location to Red, Green, Blue; max value of 255, min 0
   plane.howMuchBlue();             // Returns a number between 0 and 255 describing how much blue there is
   plane.howMuchGreen();            // Returns a number between 0 and 255 describing how much green there is
   plane.howMuchRed();              // Returns a number between 0 and 255 describing how much red there is
   plane.random(0, 100);            // Returns an integer on the interval 0 to 99
   
*/