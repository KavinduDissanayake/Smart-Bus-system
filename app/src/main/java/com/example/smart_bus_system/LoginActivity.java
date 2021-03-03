package com.example.smart_bus_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.smart_bus_system.Conection.RetroClient;
import com.example.smart_bus_system.Conection.UserCreditial;
import com.example.smart_bus_system.User.UserMainNav;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    EditText login_user_name;
    EditText login_password;
    Button loginbtn;



    //session preparing for Set the values
    SharedPreferences sharedpreferences;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
    }

    private void init() {
        login_user_name=findViewById(R.id.login_user_name);
        login_password=findViewById(R.id.login_password);
        loginbtn=findViewById(R.id.loginBtn);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
    }



    public void Login() {

//        if (TextUtils.isEmpty(login_user_name.getText().toString())) {
//            login_user_name.setError("User name is required !");
//            return;
//        }
//
//
//        if(login_password.getText().length()<8 &&!isValidPassword(login_password.getText().toString())){
//            login_password.setError( "Password must be 8 characters" );
//            return;
//        }


        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("uname", login_user_name.getText().toString());
        hashMap.put("pass", login_password.getText().toString());

        Call<UserCreditial> authenticateUserh= RetroClient.getInstance().getApi().authenticateUserh(hashMap);

        authenticateUserh.enqueue(new Callback<UserCreditial>() {
            @Override
            public void onResponse(Call<UserCreditial> call, Response<UserCreditial> response) {
                if(response.body().getSuccess().equals("true")) {
                    //set the session
                    sharedpreferences =getSharedPreferences("user_details", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putBoolean("isLoggedIn",true);
                    editor.putString("usertype",response.body().getUsertype());
                    editor.putString("uid",response.body().getUid());
                    editor.putString("bus_number",response.body().getBus_number());
                    editor.putString("route_id",response.body().getRoute_id());
                    editor.commit();

                    //to check user type
                    if (response.body().getUsertype().equals("user")) {


                        startActivity(new Intent(LoginActivity.this, UserMainNav.class));
                        finish();
                        //  Toast.makeText(SignInActivity.this,"User Login Success   !",Toast.LENGTH_SHORT).show();

                    } else if (response.body().getUsertype().equals("time_keeper")) {

//                        startActivity(new Intent(LoginActivity.this, PharmacyMainActivity.class));
//                        finish();
                        //T

                    } else {

//                        startActivity(new Intent(LoginActivity.this, AdminMainActivity.class));
//                        finish();
                        //


                    }

                }else{

                    Toast.makeText(LoginActivity.this,"Login Failed  !",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<UserCreditial> call, Throwable t) {

            }
        });
    }
}