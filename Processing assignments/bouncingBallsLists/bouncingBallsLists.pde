//declaring object
ArrayList<Ball> ballGroup = new ArrayList<Ball>();
// Ball[] ballGroup;
// int pos = 0;

void setup() {
    size(1400,700);
}

void draw() {
    background(70,30,50);
 //Drawing the balls :D
    for (int i =0; i< ballGroup.size(); i++){
        ballGroup.get(i).display();
        ballGroup.get(i).move();

        // original Array Code
        // ballGroup[i].display();
        // ballGroup[i].move();
    }


    for (Ball theBall : ballGroup){
        theBall.move();

        for (Ball otherBall : ballGroup){
            if (theBall != otherBall) {
            theBall.checkCollision(otherBall);
            }
        }

        theBall.display();
    }
}
void mousePressed (){
    // Creates a new object at the end of the array
    ballGroup.add(new Ball(mouseX, mouseY,100, width, height, false));
    //creates a new object at theis array postion
    


    // if (pos < ballGroup.length) {
    //     ballGroup[pos]=new Ball(mouseX,mouseY, 100);
    //     pos++;
    // }
}


void keyPressed(){
    if (key == 'j'){
        ballGroup.add(new Ball (width/2, height/2, 50, width, height, true));
    }




}