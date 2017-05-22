package ninjacats2017.windows10updatehistory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn1703=(ImageButton) findViewById(R.id.btn1703);
        btn1703.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i =new Intent(getApplicationContext(),MainActivity1703.class);
                startActivity(i);
            }
        });

        ImageButton btn1607=(ImageButton) findViewById(R.id.btn1607);
        btn1607.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i =new Intent(getApplicationContext(),MainActivity1607.class);
                startActivity(i);
            }
        });

        ImageButton btn1511=(ImageButton) findViewById(R.id.btn1511);
        btn1511.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i =new Intent(getApplicationContext(),MainActivity1511.class);
                startActivity(i);
            }
        });
    }
}
