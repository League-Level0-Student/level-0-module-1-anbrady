String myStr = "ice cream";

void setup() {
  size(200, 200);
}

void draw() {
  background(#ED2DC4);
  
  textSize(30);
  
  for (int i = 0; i < 3; ++i) {
    text(myStr, 40, 50 + (30*i));
  }
  text("banana", 40, 50 + (30*3));
}
