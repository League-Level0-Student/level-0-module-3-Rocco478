void setup(){
  size(1000,1000);
}
void draw(){
int a=X-10;
int b=Y-10;
int X=40;
int Y=40;
  for(int i=0;i<30;i++){

  X= X+10;
  Y=Y+10;
    noFill();

  ellipse(200,500,X,Y);
    ellipse(700,500,X,Y);

}
 


  
}