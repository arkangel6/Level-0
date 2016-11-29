
void setup(){
size(400, 600);
  PImage catPic = loadImage("tabby.jpg");
    catPic.resize(400, 600);  // to match your size
background(catPic);
  
  
  
} 
  int x1 = 244;
  int x2 = 150;
  int y1 = 127;
  int y2 = 153;

void keyPressed(){

 x1++;
 x2++;
 y1++;
 y2++;
 noStroke();
}
void draw(){
  
  ellipse(x1, y1, 40, 40);
  ellipse(x2,y2,40,40);
  fill(255,0,0);
  
}
  
  
  


