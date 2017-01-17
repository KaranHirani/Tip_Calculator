package karanhirani.tipcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;


public class TipActivity extends AppCompatActivity implements View.OnClickListener{

    private Button calculate_final,per_5,per_10,per_15,per_20;
    private ImageButton  tip_up,tip_down;
    private TextView tipresult,just_tip;
    private EditText saleval,tipval;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);
        calctip();
    }

    private void calctip()
    {
        saleval = (EditText)findViewById(R.id.sales_value);
        tipval = (EditText)findViewById(R.id.tip_value);

        calculate_final = (Button)findViewById(R.id.calculate_final);
        per_5 = (Button)findViewById(R.id.per_5);
        per_10 = (Button)findViewById(R.id.per_10);
        per_15 = (Button)findViewById(R.id.per_15);
        per_20 = (Button)findViewById(R.id.per_20);
        tip_up = (ImageButton)findViewById(R.id.tip_up);
        tip_down = (ImageButton)findViewById(R.id.tip_down);

        calculate_final.setOnClickListener(this);
        per_5.setOnClickListener(this);
        per_10.setOnClickListener(this);
        per_15.setOnClickListener(this);
        per_20.setOnClickListener(this);
        tip_up.setOnClickListener(this);
        tip_down.setOnClickListener(this);


        tipresult = (TextView)findViewById(R.id.tipResult);
        just_tip = (TextView)findViewById(R.id.just_tip_value);

    }
    @Override
    public void onClick(View view) {

        String num1 = saleval.getText().toString();
        String num2 = tipval.getText().toString();
        EditText tiptip = (EditText) findViewById(R.id.tip_value);
        if (tiptip.getText().toString() != ("")) {
            switch (view.getId()) {
                case R.id.calculate_final:
                    double divide_tipval = Double.parseDouble(num2) / 100;
                    double mult = Double.parseDouble(num1) * divide_tipval + Double.parseDouble(num1);
                    String b = String.format("%.2f%n", mult);
                    double tip = divide_tipval * Double.parseDouble(num1);
                    String c = String.format("%.2f%n", tip);

                    tipresult.setText("Final Sale is: $" + b);
                    just_tip.setText("Tip Value is: $" + c);
                    break;
                case R.id.per_5:
                    tipval.setText("5.00");

                    mult = Double.parseDouble(num1) * .05 + Double.parseDouble(num1);
                    b = String.format("%.2f%n", mult);
                    tip = .05 * Double.parseDouble(num1);
                    c = String.format("%.2f%n", tip);

                    tipresult.setText("Final Sale is: $" + b);
                    just_tip.setText("Tip Value is: $" + c);
                    break;

                case R.id.per_10:
                    tipval.setText("10.00");

                    mult = Double.parseDouble(num1) * .1 + Double.parseDouble(num1);
                    b = String.format("%.2f%n", mult);
                    tip = .1 * Double.parseDouble(num1);
                    c = String.format("%.2f%n", tip);

                    tipresult.setText("Final Sale is: $" + b);
                    just_tip.setText("Tip Value is: $" + c);
                    break;

                case R.id.per_15:
                    tipval.setText("15.00");

                    mult = Double.parseDouble(num1) * .15 + Double.parseDouble(num1);
                    b = String.format("%.2f%n", mult);
                    tip = .15 * Double.parseDouble(num1);
                    c = String.format("%.2f%n", tip);

                    tipresult.setText("Final Sale is: $" + b);
                    just_tip.setText("Tip Value is: $" + c);
                    break;

                case R.id.per_20:
                    tipval.setText("20.00");

                    mult = Double.parseDouble(num1) * .20 + Double.parseDouble(num1);
                    b = String.format("%.2f%n", mult);
                    tip = .20 * Double.parseDouble(num1);
                    c = String.format("%.2f%n", tip);

                    tipresult.setText("Final Sale is: $" + b);
                    just_tip.setText("Tip Value is: $" + c);
                    break;

                case R.id.tip_up:


                    double numup = Double.parseDouble(num2) + 1.00;
                    mult = Double.parseDouble(num1) * (numup / 100) + Double.parseDouble(num1);
                    b = String.format("%.2f%n", mult);
                    tip = numup / 100 * Double.parseDouble(num1);
                    c = String.format("%.2f%n", tip);


                    tipval.setText(Double.toString(numup));
                    tipresult.setText("Final Sale is: $" + b);
                    just_tip.setText("Tip Value is: $" + c);
                    break;

                case R.id.tip_down:


                    double numdown = Double.parseDouble(num2) - 1.00;
                    mult = Double.parseDouble(num1) * (numdown / 100) + Double.parseDouble(num1);
                    b = String.format("%.2f%n", mult);
                    tip = numdown / 100 * Double.parseDouble(num1);
                    c = String.format("%.2f%n", tip);


                    tipval.setText(Double.toString(numdown));
                    tipresult.setText("Final Sale is: $" + b);
                    just_tip.setText("Tip Value is: $" + c);


                    break;


            }
        }
    }
}
