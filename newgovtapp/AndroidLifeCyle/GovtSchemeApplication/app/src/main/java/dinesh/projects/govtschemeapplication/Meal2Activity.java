package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Meal2Activity extends AppCompatActivity {
    PDFView Meal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal2);
        Meal2=findViewById(R.id.meal2_pdf);

        Meal2.fromAsset("Midday meal scheme-Hindi.pdf").load();
    }
}
