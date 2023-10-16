public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 0;
        plane.setColor(200, 0, 0);

//        System.out.println("hi");
        plane.startingAngle(180);

//        //example of a loop:
//        //(int x-=starting value; x<=ending value;x=x+counting interval
//        for(int x=1;x<10;x=x+1 ){
//            //the code we want to repeat
//            square();

//        for (int i = 30; i < 120; i = i + 10) {
//            System.out.println(i);
//            plane.startingAngle(0);
//            plane.triangle(i);
//        }
//        for (int i = 2; i < 14; i = i + 2) {
//            System.out.println(i);
//            plane.startingAngle(0);
//            plane.triangle(i);
//        }
//        for (int i = 2; i <= 12; i = i + 2) {
//            System.out.println(i);
//            plane.startingAngle(0);
//            plane.triangle(i);
//        }
        // rowOfSmallSquares();
        //  columnOfSmallSquares();
//        System.out.println("hi");
        gridOfSmallSquares();


    }

    public void rowOfSmallSquares() {
        plane.trailWidth = 5;
        for (int x = 0; x < 100; x = x + 10) {
            plane.teleport(x + 10, 300);
            plane.square(10);
            //the longer you want it to be the x<1000 value increases its distance
        }
    }

    public void columnOfSmallSquares() {
        //in this method, create a long column of 10 pixel by 10 pixel squares
        plane.trailWidth = 5;

        //put your loop here
        plane.trailWidth = 5;
        for (int y = 0; y < 100; y = y + 1) {
            plane.teleport(300, y * 10);
            plane.square(10);
            //the longer you want it to be the x<1000 value increases its distance
        }

    }

    public void gridOfSmallSquares() {
        System.out.println("hi");
        for(int x=0;x<800;x=x+10){
            plane.isTrail=true;
            plane.trailWidth=5;
            for(int y=0;y<500;y=y+10){
                System.out.println("x:"+",y"+y);
                plane.setColor(y/2,216,230);
                plane.teleport(x,y);
                plane.square(10);


//what is the biggest value of y?
                //500, what does 500 need to be divided by so that red is less than 255


//
            }

        }

//    public void fitness() {
//        for (int s = 0; s < 5; s = s + 1) {
//            System.out.println("sprint" + s);
//            for (int p = 0; p < 10; p = p + 1) {

    }
}





//loop warm up: predict what will happen 1) on the app window^^^^^^^^^^ little section above
//and 2) in the dos window
//start i = 30
// end i<120
// counting by ten each time, interval + = 10
//system.out.println(i); whatever is inside paranthese is going to print, or it can print v (ex. i)
// plane.starting angle/ ; sets starting angle to whatever inside parantheses
//plane.triangle(i); input distance for i (ex. 25)
//i=i+10 = the progression of the triangle getting bigger by 10 each time
//
//                for (int g = 10; g > 0; g = g - 1) {
//                    System.out.println(g);
//                }




//            public void square () {
//                plane.startingAngle(90);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(0, 0, 200);
//                plane.move(111);
//                plane.turn(90);
//                plane.setColor(0, 0, 200);
//                plane.move(111);
//                plane.turn(90);
//                plane.setColor(0, 0, 200);
//                plane.move(111);
//                plane.turn(90);
//                plane.setColor(0, 0, 200);
//                plane.move(111);
//                plane.turn(90);
//            }
//
//            //this is where I define a recipe for a triangle
//            public void triangle () {
//                plane.move(111);
//                plane.turn(120);
//                plane.setColor(0, 0, 200);
//                plane.move(111);
//                plane.turn(120);
//                plane.setColor(0, 0, 200);
//                plane.move(111);
//            }

//now ill try tp define a recipe for a house
//            public void house () {
//                square();
//                plane.teleport(205, 257);
//                plane.startingAngle(0);
//                triangle();
//
//
//            }
//            public void chair () {
//                plane.isTrail = false;
//                plane.move(200);
//                plane.turn(90);
//                plane.move(200);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(200, 10, 100);
//                plane.turn(120);
//                plane.move(40);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(200, 10, 100);
//                plane.turn(60);
//                plane.move(40);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(200, 10, 100);
//                plane.turn(60);
//                plane.move(40);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(200, 10, 100);
//                plane.turn(60);
//                plane.move(60);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(200, 10, 100);
//                plane.turn(60);
//                plane.move(60);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(200, 10, 100);
//                plane.turn(60);
//                plane.move(60);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(200, 10, 100);
//                plane.turn(120);
//                plane.move(60);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(200, 10, 100);
//                plane.turn(60);
//                plane.move(60);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(200, 10, 100);
//                plane.turn(60);
//                plane.move(60);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(200, 10, 100);
//                plane.turn(60);
//                plane.move(60);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(200, 10, 100);
//                plane.turn(60);
//                plane.move(60);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(200, 10, 100);
//                plane.turn(60);
//                plane.move(60);
//
//            }
//            public void pizza () {
//                plane.isTrail = false;
//                plane.trailWidth = 10;
//                plane.setColor(200, 0, 0);
//                plane.move(100);
//                plane.startingAngle(60);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(200, 0, 0);
//                plane.move(300);
//                plane.turn(120);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(200, 0, 0);
//                plane.move(100);
//                plane.turn(120);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.setColor(200, 0, 0);
//                plane.isTrail = true;
//                plane.trailWidth = 10;
//                plane.move(100);
//                plane.setColor(200, 0, 0);
//                plane.turn(180);
//                plane.move(100);
//                plane.turn(60);
//                plane.move(200);
//                plane.turn(120);
//                plane.move(300);
//
//
//            }
//            //teleport
//            public void smiley () {
//                plane.startingAngle(45);
//                plane.setColor(0, 0, 200);
//                plane.teleport(796, 629);
//                plane.move(111);
//                plane.turn(120);
//                plane.move(111);
//                plane.teleport(796, 629);
//
//
//            }
//            //right here add 3-5 methods that would help us draw a scene
//            //car, bird, tree, star, bush, etc, no teleport inside your method recipes
//
//            //define them here, then call them in the go method
//
//
//            // plane.turn();
//        }


/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/
