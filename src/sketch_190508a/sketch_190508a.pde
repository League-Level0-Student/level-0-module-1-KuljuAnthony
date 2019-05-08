void setup() {
   size(800,800);
    PImage ftg = loadImage("images.jpeg");
    ftg.resize(800, 800);
  image(ftg, 0, 0); 
}
void draw()  {
  fill(255,mouseX,mouseY);
  ellipse(475,440,50,50);
  ellipse(260,385,50,50);
  fill(0,0,0);
  ellipse(475,440,20,20);
  ellipse(260,385,20,20);

  
  
  
}
  