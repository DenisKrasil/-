package Model;

public  class CalcModel  {

    int x, y;
    
    public CalcModel() {

    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
    String operation;


    public int Sum() {
        return x+y;
    }

    public int Mult(){
        return x*y;
    }

    public int Div(){
        return x/y;
    }

    public int Sub(){
        return x-y;
    }
}
