package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CropActivity extends AppCompatActivity {
    PDFView Crop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop);

        Crop=findViewById(R.id.crop_pdf);

        Crop.fromAsset("Karnataka Gruhalaxmi Crop Loan Scheme-English.pdf").load();
    }
}
