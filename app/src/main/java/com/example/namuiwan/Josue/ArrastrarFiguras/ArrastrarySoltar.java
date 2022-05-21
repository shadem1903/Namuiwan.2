package com.example.namuiwan.Josue.ArrastrarFiguras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.namuiwan.R;

public class ArrastrarySoltar extends AppCompatActivity {
    ImageView imageView1,imageView2,imageView3,imageView5;
    TextView txtTotal1,txtTotal2 ;
    int total,fail = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrastrary_soltar);
        referenciar();
        imageView3.setOnDragListener((view, dragEvent) -> {
            final int action = dragEvent.getAction();
            switch (action) {
                case DragEvent.ACTION_DRAG_STARTED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DROP:{
                    fail = fail + 1;
                    return (true);
                }
                case  DragEvent.ACTION_DRAG_ENDED:{
                    total = total + 1;
                    int value = total - fail;
                    txtTotal1.setText("Puntos: " + value);
                    txtTotal2.setText("Puntos: " + value);
                    return (true);
                }
                default:
                    break;
            }
            return (true);
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipData data = ClipData.newPlainText("","");
                View.DragShadowBuilder shadow = new View.DragShadowBuilder(imageView2);
                view.startDrag(data, shadow, null, 0);
            }
        });
    }

    public void referenciar(){
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView5 = findViewById(R.id.imageView5);
        txtTotal1 = findViewById(R.id.txtTotal1);
        txtTotal2 = findViewById(R.id.txtTotal2);
    }

}