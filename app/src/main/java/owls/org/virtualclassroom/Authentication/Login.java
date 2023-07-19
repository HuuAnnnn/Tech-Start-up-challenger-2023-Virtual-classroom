package owls.org.virtualclassroom.Authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import owls.org.virtualclassroom.Home.Home;
import owls.org.virtualclassroom.R;

public class Login extends AppCompatActivity {

    private EditText edtPassword;
    private ImageView btnShowPassword;
    private TextView tvRegister;
    private MaterialButton btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnShowPassword = findViewById(R.id.btnShowPassword);
        edtPassword = findViewById(R.id.edtPassword);
        btnShowPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowHidePass(btnShowPassword);
            }
        });

        tvRegister = findViewById(R.id.tvRegister);
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Register.class);
                startActivity(intent);
            }
        });

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Home.class);
                startActivity(intent);
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
}