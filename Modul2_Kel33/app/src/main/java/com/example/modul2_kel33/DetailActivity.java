package com.example.modul2_kel33;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {

    private CircleImageView imgProfile;
    private TextView tvNama;
    private TextView tvNamaAkhir;
    private TextView tvEmail;
    public static final String EXTRA_ACCOUNT = "extra_account";
    String ava;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgProfile = findViewById(R.id.img_photo_user);
        tvNama = findViewById(R.id.tv_item_first_name);
        tvNamaAkhir = findViewById(R.id.tv_item_last_name);
        tvEmail = findViewById(R.id.tv_item_email);

        getData();
        setData();

        if (getIntent().hasExtra("name") && getIntent().hasExtra("name2") && getIntent().hasExtra("email")) {

            String nama = getIntent().getStringExtra("name");
            String nama2 = getIntent().getStringExtra("name2");
            String email = getIntent().getStringExtra("email");
            tvNama.setText(nama);
            tvNamaAkhir.setText(nama2);
            tvEmail.setText("Email: " + email);

        }
    }
    private void getData(){
        ParcelAccount pass = getIntent().getParcelableExtra(EXTRA_ACCOUNT);
        ava = pass.getAvatar();
    }

    private void setData(){
        Glide.with(this).
                load(ava).
                error(R.drawable.ic_launcher_background).
                into(imgProfile);
    }
}

