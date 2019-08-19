package de.gardeningplanner.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.List;

import de.gardeningplanner.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Spinner spinnerCrops = findViewById(id.spinnerCrops);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter< Crop >(this, android.R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item);

        List crops = new CropList().get();

        for(int i = 0; i<crops.size();i++){
            Object crop = crops.get(i);
            adapter.add(crop.toString()+"\n");
            adapter.notifyDataSetChanged();
        }

        spinnerCrops.setAdapter(adapter);

        setContentView(layout.activity_main);
    }
}
