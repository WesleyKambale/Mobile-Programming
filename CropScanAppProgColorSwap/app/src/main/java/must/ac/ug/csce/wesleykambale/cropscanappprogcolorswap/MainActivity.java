package must.ac.ug.csce.wesleykambale.cropscanappprogcolorswap;

import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.R.color;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import  android.widget.Button;
import  android.*;
import android.graphics.Color;
import java.util.Random;
import android.widget.RelativeLayout;
public class MainActivity extends Activity  {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        Button btn = new Button(this);
        btn.setText("Tap Me!");

        TextView txt = new TextView(this);
        txt.setText("Tap to Change Color");

        final Random rdm= new Random();

        btn.setOnClickListener((v )-> {
            float red= rdm.nextFloat();

            float green= rdm.nextFloat();
            float blue= rdm.nextFloat();
            txt.setText("r"+String.valueOf(red)+"   g"+String.valueOf(green+" b"+String.valueOf(blue)  ));
            txt.setTextColor(Color.rgb(red,green,blue));
            //txt.setTextColor(Color);

        });
        LinearLayout linear = new LinearLayout(this);
        linear.setOrientation(LinearLayout.VERTICAL);

        linear.addView(txt);
        linear.addView(btn);
        setContentView(linear);

    }





    }






