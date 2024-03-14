// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

// State variable for the button
let buttonPressed = false;

// Button object to store all of the button variable together
let myButton = {x: 0, y: 0, w: 0, h: 0, color: ""}

let ballsarray = [];

function setup() {
  createCanvas(windowWidth, windowHeight);
  
  //Set the initial properties of myButton
  //subtract 1/2 the w and h from x and y to get true center
  myButton.w = 120;
  myButton.h = 40;
  myButton.x = width/2 - myButton.w/2;
  myButton.y = height/2 - myButton.h/2;
  myButton.color = "red";
}

function draw() {
  background(220);

  if (buttonPressed===false) {
    //Calls the myButton function in the draw loop
    drawButton();
  }
}

//build in p5js funciton for mouse reactions
function mousePressed() {

  //Checks if the mouse is within the x coordinates of the button
  if (mouseX > myButton.x && mouseX < (myButton.x + myButton.w)) {
    buttonPressed = true;
    //Switch "true" out for a similar condition that checks y coordinates
    if(mouseY > myButton.y && mouseY < (myButton.y + myButton.h)) {
      buttonPressed = true;
    }
    
  }else{
buttonPressed=false;

  }

}


//custom function that draws the button when called
function drawButton() {
  fill(myButton.color);
  rect(myButton.x, myButton.y, myButton.w, myButton.h);
}


function Funy(){
if (buttonPressed=false);
  {
  function setup() {
    createCanvas(windowWidth, windowHeight);
  createball();
    
    
  
  }

  function draw() {
    background(30);


    fill(255,0,0);
  

    for (let i=0; i< ballsarray.length; i++) {
    circle(ballsarray[i].x, ballsarray[i].y, ballsarray[i].diameter);
    ballsarray[i].x += ballsarray[i].dx;
    ballsarray[i].y += ballsarray[i].dy;
    }
  }

  function createball() {
    let newBall = {
      x: random(width),
      y: random(height),
      diameter: random(25, 100),
      dx: random(-5, 5),
      dy: random(-5, 5),







  };

  ballsarray.push(newBall)
  }
  function mousePressed() {
  createball();
    ballsarray[ballsarray.length-1].x + mouseX;
    ballsarray[ballsarray.length-1].y + mouseY;

  }




}






}
