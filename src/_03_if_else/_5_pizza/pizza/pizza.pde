PImage pepperoni;

void setup() {
    size(500, 500);
    
    pepperoni = loadImage("pepperoni.png");
    pepperoni.resize(80, 80);
    
}

void draw() {
    fill(#FFD276);
    ellipse(250, 250, 400,400);
    
    fill(#FFF948);
    ellipse(250, 250, 350,350);
    
    if (mousePressed) {
      image(pepperoni, 200, 200);
    }
    
    image(pepperoni, 250, 250);
    image(pepperoni, 150, 150);
}
