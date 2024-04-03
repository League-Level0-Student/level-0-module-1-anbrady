void setup() {
    size(500, 500);
}
void draw() {
    background(250, 250, 250);
    noStroke();
    
    fill(#FF0505);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    
    fill(#118325);
    rect(176, 103, 12, 32);
    
    
}

void mousePressed() {
  fill(250, 250, 250);
  ellipse(75, 200, 50, 50);
  // prevent default
 
}
