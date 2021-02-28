package cs301.birthdaycake;

public class CakeModel {
    public boolean candleIslit = true;
    public int numCand = 2;
    public boolean frost = true ;
    public boolean cand = true;
    public int x  = -100;
    public int y = -100;

    public void setCandlesLit(boolean candleIsLit){
        this.candleIslit = candleIsLit;
    }

    public boolean getCandleIsLit(){
        return candleIslit;
    }

    public void setNumCand(int numCand){
        this.numCand = numCand;
    }

    public int getNumCand(){
        return numCand;
    }

    public void setCand(boolean cand){
        this.cand = cand;
    }

    public boolean getCand(){
        return cand;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
