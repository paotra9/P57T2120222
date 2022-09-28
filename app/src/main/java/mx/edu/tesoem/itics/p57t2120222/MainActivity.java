package mx.edu.tesoem.itics.p57t2120222;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtnum1, txtnum2;
    Button btnsuma, btnres, btnmulti, btndiv;
    TextView lblresult;
    int num1 = 0;
    int num2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            txtnum1 = findViewById(R.id.txtnum1);
            txtnum2 = findViewById(R.id.txtnum2);

            lblresult = findViewById(R.id.lblresult);

            btnsuma = findViewById(R.id.btnsuma);
            btnres = findViewById(R.id.btnresta);
            btnmulti = findViewById(R.id.btnmulti);
            btndiv =  findViewById(R.id.btndivide);

    }
    public void suma(View view){
        if (txtnum1.getText().toString().isEmpty() || txtnum2.getText().toString().isEmpty()){
            mensaje();
        } else {
            num1 = Integer.parseInt(txtnum1.getText().toString());
            num2 = Integer.parseInt(txtnum2.getText().toString());
            lblresult.setText(String.valueOf(num1+num2).toString());
        }
    }
    public void resta(View view){
        if (txtnum1.getText().toString().isEmpty() || txtnum2.getText().toString().isEmpty()){
            mensaje();
        } else {
            num1 = Integer.parseInt(txtnum1.getText().toString());
            num2 = Integer.parseInt(txtnum2.getText().toString());
            lblresult.setText(String.valueOf(num1-num2).toString());
        }
    }
    public void multi(View view){
        if (txtnum1.getText().toString().isEmpty() || txtnum2.getText().toString().isEmpty()){
            mensaje();
        } else {
            num1 = Integer.parseInt(txtnum1.getText().toString());
            num2 = Integer.parseInt(txtnum2.getText().toString());
            lblresult.setText(String.valueOf(num1*num2).toString());
        }
    }
    public void div(View view){
        if (txtnum1.getText().toString().isEmpty() || txtnum2.getText().toString().isEmpty()){
            mensaje();
        } else {
            num1 = Integer.parseInt(txtnum1.getText().toString());
            num2 = Integer.parseInt(txtnum2.getText().toString());
            if (num2 == 0){
                Toast.makeText(this,"Error al dividir 0", Toast.LENGTH_LONG).show();
            } else {
                lblresult.setText(String.valueOf(num1/num2).toString());
            }
        }
    }
    public void mensaje(){
        Toast.makeText(this,"Porfavor llene los campos", Toast.LENGTH_LONG).show();
    }
}