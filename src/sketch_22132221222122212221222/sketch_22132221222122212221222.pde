int y =50;
void setup() {
  background(0,0,0);
  size(200,200);
}
void draw() {
  background(0,0,0);
  for(int i = 0; i<3; i++){
    if(i==0) {
      y =50;
    }
  text("icecream", 50,y );
  y =y+10;
  text("banana", 50,80);
  }
}