// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"


let x, y
let time =0;
let timex;
let timey;
let timew;


function setup() {
  createCanvas(windowWidth, windowHeight);
  x= width/2;
  y=height/2;
}

function draw() {
  background(220);

x= noise(timex) *width;
y= noise(timey) *height;


  fill(noise(timex)*255,noise(timey)*255,noise(timew)*255);
  
  circle(x,y,w)
  timex+=0.01;
  timey+=0.02;
  timew= timew+0.00000000005;
}
