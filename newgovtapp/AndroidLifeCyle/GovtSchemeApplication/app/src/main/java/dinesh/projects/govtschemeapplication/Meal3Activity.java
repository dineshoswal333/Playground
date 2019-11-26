package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Meal3Activity extends AppCompatActivity {
    PDFView Meal3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal3);

        Meal3=findViewById(R.id.meal3_pdf);

        Meal3.fromAsset("Midday meal scheme-Kannada.pdf").load();
    }
}
