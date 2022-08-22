package com.example.project_44;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.project_44.databinding.ActivityMainBinding;

public class m001_act_main extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding binding ;
    @Override
    protected void onCreate(@Nullable Bundle saveData) {
        super.onCreate(saveData);
            binding = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            initview();
    }

    private void initview() {
        binding.btSub.setOnClickListener(this);
        binding.btSum.setOnClickListener(this);
    }
    public void sum(String numA,String numB)
    {
          Double A = Double.parseDouble(numA) + Double.parseDouble(numB) ;
        Toast.makeText(this, "result = "+ A, Toast.LENGTH_SHORT).show();
    }
    public void sub(String numA,String numB)
    {
          Double B = Double.parseDouble(numA) - Double.parseDouble(numB) ;
        Toast.makeText(this, "result = "+ B, Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View view) {
             String numA = binding.edtNumA.getText().toString() ;
             String numB = binding.edtNumB.getText().toString() ;
             if (numA.isEmpty() || numB.isEmpty()) {
                 Toast.makeText(this, "Please input A&B", Toast.LENGTH_SHORT).show();
                        return ;
             }
             if (view.getId() == R.id.bt_sum)
                 sum(numA,numB);
             if (view.getId() == R.id.bt_sub)
                 sub(numA,numB);
    }
}
