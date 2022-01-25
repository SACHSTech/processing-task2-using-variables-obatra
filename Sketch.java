import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.  test
   */
  public void setup() {
	// grass/sky   
    background(0,255,128);
    noStroke();
    fill(135,206,235);
    rect(0,0,600,300);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes   #
   */
  public void draw() {
	 // sun drawing 
	 stroke(150);
	 fill(253,184,19);
	 ellipse(0/width,0/height,180,180);
	 // house
	 fill(155,99,76);
	 rect((float)(width/3.4),height/4,200,200);
	 // roof
	 noStroke();
	 fill(242,223,180);
	 triangle((float)(width/3.4),height/4,(float)(width/1.45),height/4,(float)(width/2.18),height/8);
	 // door
	 noStroke();
	 fill(0,0,0);
	 rect((float)(width/2.9),(float)(height/2.72),130,130);
	 //windows
	 rect((float)(width/2.6),(float)(height/3.3),30,30);
	 rect((float)(width/2.14),(float)(height/3.3),30,30);
	 
  }
}
