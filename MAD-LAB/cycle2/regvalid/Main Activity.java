import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.content.SharedPreferences;
public class MainActivity extends AppCompatActivity {
     EditText editTextName, editTextlName,editTextEmail, editTextMobile,
            editTextDob, editTextgender,editTextpassword;
     Button buttonSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSubmit =findViewById(R.id.buttonSubmit);
        editTextName =findViewById(R.id.editTextName);
        editTextlName =findViewById(R.id.editTextlName);
        editTextEmail =findViewById(R.id.editTextEmail);
        editTextMobile =findViewById(R.id.editTextMobile);
        editTextDob =findViewById(R.id.editTextDob);
        editTextgender =findViewById(R.id.editTextgender);
        editTextpassword =findViewById(R.id.editTextpassword);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkDataEntered();
                SharedPreferences mypref=getSharedPreferences("activity_main2.xml",0);
                SharedPreferences.Editor editor=mypref.edit();//only write editor
                editor.putString("fname",editTextName.getText().toString()); //bundle the data
                editor.putString("lname",editTextlName.getText().toString());
                editor.putString("gender",editTextgender.getText().toString());
                editor.putString("phone",editTextMobile.getText().toString());
                editor.putString("pwd",editTextpassword.getText().toString());
                editor.putString("email",editTextEmail.getText().toString());
                editor.putString("dob",editTextDob.getText().toString());
                editor.commit();
                // String str = editTextName.getText().toString();
                //String str1 = editTextName.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
               intent.putExtra("fname",editTextName.getText().toString());
                intent.putExtra("lname",editTextlName.getText().toString());
                intent.putExtra("gender",editTextgender.getText().toString());
                intent.putExtra("phone",editTextMobile.getText().toString());
                intent.putExtra("pwd",editTextpassword.getText().toString());
                intent.putExtra("email",editTextEmail.getText().toString());
                intent.putExtra("dob",editTextDob.getText().toString());
               startActivity(intent);
            }
        });
    }
    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }
    void checkDataEntered() {
        if (isEmpty(editTextName)) {
            Toast t = Toast.makeText(this, "You must enter first name to register!", Toast.LENGTH_SHORT);
            t.show();
        }
        if (isEmpty(editTextlName)) {
            editTextlName.setError("Last name is required!");
        }
        if (isEmpty(editTextMobile)) {
            editTextMobile.setError("mobile number is required!");
        }
        if (isEmpty(editTextgender)) {
            editTextgender.setError("Gender is required!");
        }
        if (isEmpty(editTextpassword)) {
            editTextpassword.setError("Password is required!");
        }
        if (isEmpty(editTextDob)) {
            editTextDob.setError("DOB is required!");
        }
        if (isEmail(editTextEmail) == false) {
            editTextEmail.setError("Enter valid email!");
        }
    }
}
