class walker {
int x, y;// postistion
  int size;
  int speed;
  
  //Constructor
  walker(int tempx, int tempy ){
  x=tempx;
  y=tempy;
  size = 10;
  speed = 5;
  }

void display(){
rect(x,y,size,size);
}

void move(int direc){
  if (direc==0){
  y= y+ speed;
  }
   else if (direc==1){
  x= x + speed;
  }
  else if (direc==2){
  y= y - speed;
  }
  else if (direc==3){
  x= x - speed;
  }
}
  
}
