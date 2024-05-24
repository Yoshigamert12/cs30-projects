//declaring object
Ball[] ballGroup;
int pos = 0;

void setup() {
    size(1400,700);
    //makes array
    ballGroup = new Ball[10000];

}

void draw() {
    background(70,30,50);

    for (int i =0; i<pos; i++){
        ballGroup[i].display();
        ballGroup[i].move();
    }
}
void mousePressed (){
    //creates a new object at theis array postion
    


    if (pos < ballGroup.length) {
        ballGroup[pos]=new Ball(mouseX,mouseY, 100);
        pos++;
    }


}