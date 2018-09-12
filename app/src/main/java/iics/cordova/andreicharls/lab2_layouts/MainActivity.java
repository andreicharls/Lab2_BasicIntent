package iics.cordova.andreicharls.lab2_layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLinear = (Button) findViewById(R.id.buttonLinear);
        buttonLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveLinear = new Intent(getApplicationContext(), Linear.class);
                startActivity(moveLinear);
            }
        });

        Button buttonConstraint = (Button) findViewById(R.id.buttonConstraint);
        buttonConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveConstraint = new Intent(getApplicationContext(), Constraint.class);
                startActivity(moveConstraint);
            }
        });

        Button buttonRelative = (Button) findViewById(R.id.buttonRelative);
        buttonRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveRelative = new Intent(getApplicationContext(), Relative.class);
                startActivity(moveRelative);
            }
        });

    }
}
