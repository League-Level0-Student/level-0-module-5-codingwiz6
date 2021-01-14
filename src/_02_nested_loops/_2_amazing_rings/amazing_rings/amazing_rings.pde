
  /*** Go to the recipe to run the demonstration before starting this program ***/
int x = 200;
int speed = 1;
int sizeW=855;
int z=-30;
void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(1000,500);
  /* Call the noFill() command so all the ellipses will be transparent */
  noFill();
}

void draw() {
background(23,230,255);
        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/    
  
int h=300;

  for(int b=0;b<8;b++){
    ellipse(x,200,h,h);
    h-=30; //decrease h by 30
  }
        
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
 x+=speed;
        
        /*When the rings reach the right side of the sketch, reverse the direction so they move.
        Hint: speed = -speed */
if(x>=sizeW){
      speed=-speed;   
}
        /*When the rings reach the left side of the sketch, reverse the direction again */
      if(x<=z){
       speed=-speed; 
      }
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
}
