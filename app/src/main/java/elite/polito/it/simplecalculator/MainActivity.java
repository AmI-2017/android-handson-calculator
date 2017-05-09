package elite.polito.it.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //event handler for the plus button
    public void plus(View view) {

        //get the first number from the EditText element with id number1
        EditText firstNumber = (EditText) findViewById(R.id.number1);
        int number1 = Integer.parseInt(firstNumber.getText().toString());
        //get the second number from the EditText element with id number2
        EditText secondNumber = (EditText) findViewById(R.id.number2);
        int number2 = Integer.parseInt(secondNumber.getText().toString());
        //perform the operation
        int result = number1 + number2;
        //print the result in the TextView with id result
        TextView resultTextView = (TextView) findViewById(R.id.result);
        resultTextView.setText(String.valueOf(result));
    }

    //event handler for the minus button
    public void minus(View view) {

        //get the first number from the EditText element with id number1
        EditText firstNumber = (EditText) findViewById(R.id.number1);
        int number1 = Integer.parseInt(firstNumber.getText().toString());
        //get the second number from the EditText element with id number2
        EditText secondNumber = (EditText) findViewById(R.id.number2);
        int number2 = Integer.parseInt(secondNumber.getText().toString());
        //perform the operation
        int result = number1 - number2;
        //print the result in the TextView with id result
        TextView resultTextView = (TextView) findViewById(R.id.result);
        resultTextView.setText(String.valueOf(result));
    }


    //event handler for the times button
    public void times(View view) {

        //get the first number from the EditText element with id number1
        EditText firstNumber = (EditText) findViewById(R.id.number1);
        int number1 = Integer.parseInt(firstNumber.getText().toString());
        //get the second number from the EditText element with id number2
        EditText secondNumber = (EditText) findViewById(R.id.number2);
        int number2 = Integer.parseInt(secondNumber.getText().toString());
        //perform the operation
        int result = number1 * number2;
        //print the result in the TextView with id result
        TextView resultTextView = (TextView) findViewById(R.id.result);
        resultTextView.setText(String.valueOf(result));
    }

    //event handler for the obelus (division) button
    public void division(View view) {
        //get the first number from the EditText element with id number1
        EditText firstNumber = (EditText) findViewById(R.id.number1);
        int number1 = Integer.parseInt(firstNumber.getText().toString());
        //get the second number from the EditText element with id number2
        EditText secondNumber = (EditText) findViewById(R.id.number2);
        int number2 = Integer.parseInt(secondNumber.getText().toString());
        //perform the operation
        int result = number1 / number2;
        //print the result in the TextView with id result
        TextView resultTextView = (TextView) findViewById(R.id.result);
        resultTextView.setText(String.valueOf(result));
    }
}
