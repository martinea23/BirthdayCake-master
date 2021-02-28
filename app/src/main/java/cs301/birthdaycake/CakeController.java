package cs301.birthdaycake;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, SeekBar.OnSeekBarChangeListener,View.OnTouchListener {
    private CakeView cakeView;
    private CakeModel cakemodel;

    public CakeController(CakeView cakeview){
        cakeView = cakeview;
        cakemodel = cakeview.getCakeModel();
    }

    @Override
    public void onClick (View v) {
        Log.d("Button","Blow Out Works");
        cakemodel.setCandlesLit(false);
        cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
        Log.d("Button 2", "Candles Works");
        cakemodel.setCand(isChecked);
        cakeView.invalidate();
     }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean x) {
        cakemodel.setNumCand(progress);
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar){}

    @Override
    public void onStopTrackingTouch(SeekBar seekBar){}

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        System.out.println("touched");
        cakemodel.setTouch(motionEvent.getX(),motionEvent.getY());
        Log.d("Touch", "touch recieved");
        cakeView.invalidate();
        return true;
    }
}
