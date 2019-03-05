package perez.smc.caketranslator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class questions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }

    public void onHintClick(View view) {
        Toast toasty = Toast.makeText(getApplicationContext(), getString(R.string.H1), Toast.LENGTH_SHORT);
        toasty.show();
    }
    public void onAnswerClick(View view) {

        String answer = ((EditText)findViewById(R.id.answer)).getText().toString();
        String correctanswer = getString(R.string.A1);
        answer = answer.toLowerCase();

        if (answer.equals(correctanswer)) {
            Toast toasty = Toast.makeText(getApplicationContext(), "That's debatable. There are basically two schools of thought.", Toast.LENGTH_SHORT);
            toasty.show();
        }
        else {
            Toast toasty = Toast.makeText(getApplicationContext(), "FALSE! Black bear!", Toast.LENGTH_SHORT);
            toasty.show();
        }
    }


}
