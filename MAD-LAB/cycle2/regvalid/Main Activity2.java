import android.content.SharedPreferences;
import android.widget.TextView;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class Main2Activity extends AppCompatActivity {
    TextView tv,tv1,tv2,tv3,tv4,tv5,tv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv =findViewById(R.id.tv);
        tv1 =findViewById(R.id.tv1);
        tv2 =findViewById(R.id.tv2);
        tv3 =findViewById(R.id.tv3);
        tv4 =findViewById(R.id.tv4);
        tv5 =findViewById(R.id.tv5);
        tv6 =findViewById(R.id.tv6);
        Intent intent = getIntent();
        SharedPreferences mypref=getSharedPreferences("activity_main2.xml",0);
        String str = mypref.getString("fname",null);
        String str1 = mypref.getString("lname",null);
        String str2 = mypref.getString("gender",null);
        String str3 = mypref.getString("phone",null);
        String str4 = mypref.getString("pwd",null);
        String str5 = mypref.getString("email",null);
        String str6 = mypref.getString("dob",null);
        tv.setText(str);
        tv1.setText(str1);
        tv2.setText(str2);
        tv3.setText(str3);
        tv4.setText(str4);
        tv5.setText(str5);
        tv6.setText(str6);
    }
}
