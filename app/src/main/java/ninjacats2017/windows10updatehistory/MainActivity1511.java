package ninjacats2017.windows10updatehistory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity1511 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1511);

        Button btn10586916=(Button) findViewById(R.id.btn10586916);
        btn10586916.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i =new Intent(getApplicationContext(),MainActivity10586_916.class);
                startActivity(i);
            }
        });
    }
}
