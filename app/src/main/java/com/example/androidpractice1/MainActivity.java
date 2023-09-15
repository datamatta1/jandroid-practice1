package com.example.androidpractice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.example.androidpractice1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context = binding.getRoot().getContext();

        binding.tvName.setText(getString(R.string.first_name_label));
        binding.tvSurname.setText(getString(R.string.last_name_label));
        binding.tvEmail.setText(getString(R.string.email_label));
    }

    public void onBtnPressed(View view) {
        binding.tvName.setText(getString(R.string.first_name_label) + binding.etName.getText().toString());
        binding.tvSurname.setText(getString(R.string.last_name_label) + binding.etSurname.getText().toString());
        binding.tvEmail.setText(getString(R.string.email_label) + binding.etEmail.getText().toString());
    }
}