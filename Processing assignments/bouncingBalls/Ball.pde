class Ball {
int x,y,r;
//RGB Colors
int cr,cg,cb;
// velocity
int dx,dy;
    //Constructor Method
    Ball (int ballx, int bally, int ballr){
        x=ballx;
        y=bally;
        r=ballr;
        //random colors
        cr= int( random (0,255));
        cg= int( random (0,255));
        cb= int( random (0,255));

        //velocity
        dx= int (random(-10,10));
        dy= int (random(-10,10));
    }

void display(){
    fill(cr,cg,cb);
    circle(x,y,r);

}
void move(){
    //Applying the velocity
    x= x+dx;
    y= y+dy;
}


}