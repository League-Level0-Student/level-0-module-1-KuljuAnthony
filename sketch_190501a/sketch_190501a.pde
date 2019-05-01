void setup() {
  size(800,800);
    fill(#E89F2A);
  ellipse(400,400,400,400);
  fill(255,0,0);
  ellipse(400,400,350,350);
  fill(#FFE200);
  ellipse(400,400,300,300);
}
void draw() {
  PImage pepperoni = loadImage("pizza.jpg");
    int e=mouseX;
 int a=mouseY;
  pepperoni.resize(50,50);
   if(mousePressed) {
     
  image(pepperoni, e, a);
 }
  //background(255,255,255);


  
  
image(pepperoni, 400, 400);
image(pepperoni, 300, 400);
image(pepperoni, 400, 300);
image(pepperoni, 300, 300);

}