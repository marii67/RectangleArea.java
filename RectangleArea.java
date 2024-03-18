import Java.utill.scanner;
Public class RectangleArea{
Private int length;
private int width;
Public static void main(String[]args){
RectangleArea rectangleArea=new RectangleArea();
rectangleArea.getInput();
int area=rectangleArea.computeArea();
System.out.println("Area of the rectangle:"+area);
}
Public void getInput(){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the length of the rectangle:");
length=scanner.nextInt();
System.out.println("Enter the width of the rectangle:");
width=scanner.nextInt();
}
public int ComputeArea(){
return length*width;
}
}