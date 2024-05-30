class Ball {
int x,y,d;
//RGB Colors
int cr,cg,cb;
// velocity
int dx,dy;
//for screen dimensions
int width,height;
boolean infect;
int grav;
    //Constructor Method
    Ball (int ballx, int bally, int balld, int windoww, int windowh, boolean ballInf){
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
        grav = -1;

        width=windoww;
        height=windowh;

        infect = ballInf;

    }

void display(){

 

    fill(cr,cg,cb);
    circle(x,y,d);

    if (infect == true ){
       cr = 0;
       cg=255;
       cb=50;
    }

}
void move(){
    //Applying the velocity
    x= x+dx;
    y= y+dy;
    if (infect == true) {
        dy = dy - grav;
    }
    

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

        if (otherBall.infect == true && infect == false){
            infect = true;
        }
        else if (otherBall.infect == false && infect == true){
            otherBall.infect = true;
        }

    }


       

    }



}