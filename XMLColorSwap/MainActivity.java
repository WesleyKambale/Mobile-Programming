package must.ac.ug.csce.wesleykambale.cropscanappxmlcolorswap;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView txt;
Button btn;
float red, blue, green;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView  txt = (TextView) findViewById(R.id.tV);
         btn = (Button) findViewById(R.id.btn1) ;

        final Random rdm = new Random();
        btn.setOnClickListener((v )-> {
                    float red= rdm.nextFloat();

                    float green= rdm.nextFloat();
                    float blue= rdm.nextFloat();
                    txt.setText("r"+String.valueOf(red)+"   g"+String.valueOf(green+" b"+String.valueOf(blue)));
                    txt.setTextColor(Color.rgb(red,green,blue));

        });

    }
}
