package com.saurabhpatel.sampledatabinding;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.saurabhpatel.sampledatabinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private User user;
    private static int index;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        user = new User();
        user.setName("Saurabh Patel");
        user.setEmail("test@test.com");
        user.setF1("f1");
        user.setF2("f2");
        index = 1;

        binding.setUser(user);
    }

    public void onClickBtn(View v) {
        index++;
        user.setName("Saurabh Patel" + String.valueOf(index));
        user.setF2("f2-new " + String.valueOf(index));
    }

    public void onClickNotifyChange(View v) {
        user.notifyChange();
    }
}
