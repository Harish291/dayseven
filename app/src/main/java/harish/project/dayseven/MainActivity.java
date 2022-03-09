package harish.project.dayseven;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button simplequest,toughquest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Codes to add Action Bar

        LinearLayout front_ll =  findViewById(R.id.front_page_titlebar);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.frontpage_title_bar);

        simplequest=findViewById(R.id.bsq);
        toughquest=findViewById(R.id.btq);

        simplequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent_s = new Intent(MainActivity.this,SimpleQuestion.class);
                startActivity(intent_s);
            }
        });
        toughquest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_t = new Intent(MainActivity.this,ToughQuestion.class);
                startActivity(intent_t);
            }
        });

    }
}