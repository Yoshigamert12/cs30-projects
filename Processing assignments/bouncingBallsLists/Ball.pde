class Ball {
int x,y,d;
//RGB Colors
int cr,cg,cb;
// velocity
int dx,dy;
//for screen dimensions
int width,height;
    //Constructor Method
    Ball (int ballx, int bally, int balld, int windoww, int windowh){
        x=ballx;
        y=bally;
        d=balld;
        //random colors
        cr= int( random (0,255));
        cg= int( random (0,255));
        cb= int( random (0,255));

        //velocity
        dx= int (random(-10,10));
        dy= int (random(-10,10));

        width=windoww;
        height=windowh;

    }

void display(){
    fill(cr,cg,cb);
    circle(x,y,d);

}
void move(){
    //Applying the velocity
    x= x+dx;
    y= y+dy;

    if (x<=0 + d/2 || x>= width - d/2 ){
        //reverses directrion
        dx= dx*-1;
    }
    if (y<= 0 + d/2 || y>= height -d/2 ){
        dy= dy*-1;

    }


}
    void checkCollision(Ball otherBall){
        double distanceApart = dist(x,y,otherBall.x,otherBall.y);
    
    
        if (distanceApart < d){
        int tempdx = dx;
        int tempdy = dy;

        dx = otherBall.dx;
        dy = otherBall.dy;




        otherBall.dx = tempdx;
        otherBall.dy = tempdy;
    }
    }



}