package ninjacats2017.windows10updatehistory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity1607 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1607);

        Button btn143931198=(Button) findViewById(R.id.btn143931198);
        btn143931198.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i =new Intent(getApplicationContext(),MainActivity14393_1198.class);
                startActivity(i);
            }
        });
    }
}
