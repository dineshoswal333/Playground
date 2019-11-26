package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bijli2Activity extends AppCompatActivity {
    PDFView Bijli2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bijli2);
        Bijli2=findViewById(R.id.bijli2_pdf);

        Bijli2.fromAsset("Pradhan mantri Sahaj Bijli har ghar yojana-Hindi.pdf").load();
    }
}
