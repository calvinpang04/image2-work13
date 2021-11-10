package com.example.image2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageView img1;
   private Button b1;
   private EditText t1;
   private int imgID=0;
   ArrayList<String> img=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=new ArrayList<String>();
        img.add("im1");
        img.add("im2");
        img.add("im3");
        img.add("im4");
        img.add("im5");
        img.add("im6");
        img.add("im7");
        img.add("im8");
        img.add("im9");
        img.add("im10");
        GetImg();
        t1=(EditText)findViewById(R.id.editTextNumber) ;
        b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int tt = (int) (Double.parseDouble(t1.getText().toString())+0);
               imgID=tt;
                GetImg();
            }
        });
    }
    private void GetImg(){
        img1 = (ImageView) findViewById(R.id.imageView);
        String[] fruitarray = new String[imgID]; //喧告字串陣列大小
        fruitarray = img.toArray(fruitarray); //將List放到字串陣列裡來
        String uri = "@drawable/" + fruitarray[imgID].toString(); //圖片路徑和名稱
        int iR = getResources().getIdentifier(uri, null, getPackageName()); //取得圖片Resource位子
        img1.setImageResource(iR);

    }

}