package owls.org.virtualclassroom.Authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import owls.org.virtualclassroom.R;

public class Register extends AppCompatActivity {

    private EditText edtPassword;
    private EditText edtRePassword;
    private ImageView btnShowPassword;
    private ImageView btnShowPassword1;
    private TextView tvBackLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edtPassword = findViewById(R.id.edtPassword);
        edtRePassword = findViewById(R.id.edtRePassword);
        btnShowPassword = findViewById(R.id.btnShowPassword);
        btnShowPassword1 = findViewById(R.id.btnShowPassword1);

        btnShowPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowHidePass(btnShowPassword);
            }
        });
        btnShowPassword1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowHidePass1(btnShowPassword1);
            }
        });

        tvBackLogin = findViewById(R.id.tvBackLogin);
        tvBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void ShowHidePass(ImageView showPassword) {

        if (showPassword.getId() == R.id.btnShowPassword) {

            if (edtPassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                ((ImageView) (showPassword)).setImageResource(R.drawable.show_password_icon);

                //Show Password
                edtPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                edtPassword.setSelection(edtPassword.getText().length());
            } else {
                ((ImageView) (showPassword)).setImageResource(R.drawable.hide_password_icon);

                //Hide Password
                edtPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                edtPassword.setSelection(edtPassword.getText().length());
            }
        }
    }
    public void ShowHidePass1(ImageView showPassword) {

        if (showPassword.getId() == R.id.btnShowPassword1) {

            if (edtRePassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                ((ImageView) (showPassword)).setImageResource(R.drawable.show_password_icon);

                //Show Password
                edtRePassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                edtRePassword.setSelection(edtRePassword.getText().length());
            } else {
                ((ImageView) (showPassword)).setImageResource(R.drawable.hide_password_icon);

                //Hide Password
                edtRePassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                edtRePassword.setSelection(edtRePassword.getText().length());
            }
        }
    }
}