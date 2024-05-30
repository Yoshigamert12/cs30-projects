class walker {
int x, y;// postistion
  int size;
  int speed;
  
  //Constructor
  walker(int tempx, int tempy ){
  x=tempx;
  y=tempy;
  size = 50;
  speed = 10;
  }

void display(){
  fill(233,34,45);
rect(x,y,size,size);
}

void move(int direc){
  if (direc==0){
  y= y- speed;
  }
   else if (direc==1){
  x= x + speed;
  }
  else if (direc==2){
  y= y + speed;
  }
  else if (direc==3){
  x= x - speed;
  }
}
  
}
