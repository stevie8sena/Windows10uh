package ninjacats2017.windows10updatehistory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity1703 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1703);

        Button btn15063250=(Button) findViewById(R.id.btn15063250);
        btn15063250.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i =new Intent(getApplicationContext(),MainActivity15063_250.class);
                startActivity(i);
            }
        });

        Button btn15063138=(Button) findViewById(R.id.btn15063138);
        btn15063138.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i =new Intent(getApplicationContext(),MainActivity15063_138.class);
                startActivity(i);
            }
        });

        Button btn1506313=(Button) findViewById(R.id.btn1506313);
        btn1506313.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i =new Intent(getApplicationContext(),MainActivity15063_13.class);
                startActivity(i);
            }
        });

        Button btn15063296=(Button) findViewById(R.id.btn15063296);
        btn15063296.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i =new Intent(getApplicationContext(),MainActivity15063_296.class);
                startActivity(i);
            }
        });
    }
}
