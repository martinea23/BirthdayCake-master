package cs301.birthdaycake;

public class CakeModel {
    public boolean candleIslit = true;
    public int numCand = 2;
    public boolean frost = true ;
    public boolean cand = true;
    public float xTouch = -100.0f;
    public float yTouch = -100.0f;


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

    public void setTouch(float x, float y){
        this.xTouch = x;
        this.yTouch = y;
    }
}
