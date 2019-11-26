package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Crop3Activity extends AppCompatActivity {
    PDFView Crops3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop3);

        Crops3=findViewById(R.id.crop3_pdf);

        Crops3.fromAsset("Karnataka Gruhalaxmi Crop Loan Scheme-Kannada.pdf").load();
    }
}
