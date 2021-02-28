package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView myCakeView = findViewById(R.id.cakeview);
        CakeController cakeController = new CakeController(myCakeView) ;
        myCakeView.setOnTouchListener(cakeController);


        Button blowOut = (Button)findViewById(R.id.blowOut);
        blowOut.setOnClickListener(cakeController);

        Switch SwitchV = findViewById(R.id.Candles);
        SwitchV.setOnCheckedChangeListener(cakeController);

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(cakeController);

        myCakeView.setOnTouchListener(cakeController);

    }
    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }

}
