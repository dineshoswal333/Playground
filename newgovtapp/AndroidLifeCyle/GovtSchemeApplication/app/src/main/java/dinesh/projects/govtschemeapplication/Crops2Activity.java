package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Crops2Activity extends AppCompatActivity {
    PDFView Crops2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crops2);

        Crops2=findViewById(R.id.crop2_pdf);

        Crops2.fromAsset("Karnataka Gruhalaxmi Crop Loan Scheme-Hindi.pdf").load();
    }
}
