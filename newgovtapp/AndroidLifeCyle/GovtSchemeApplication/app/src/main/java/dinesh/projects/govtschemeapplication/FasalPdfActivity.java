package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class FasalPdfActivity extends AppCompatActivity {
    PDFView Fasal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasal_pdf);
        Fasal=findViewById(R.id.fasal_pdf);

        Fasal.fromAsset("Pradhan mantri fasal bima Yojana-English.pdf").load();
    }
}




