package cs301.birthdaycake;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {
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
    public boolean onTouch(View v, MotionEvent event ) {
        int x = (int) event.getRawX();
        int y = (int) event.getRawY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("TAG", "touched down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("TAG", "moving: (" + x + ", " + y + ")");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("TAG", "touched up");
                break;
        }

        cakemodel.setX(x);
        cakemodel.setY(y);
        cakeView.invalidate();

        return true;
    }



}
