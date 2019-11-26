package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BijliActivity extends AppCompatActivity {
    PDFView Bijli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bijli);

        Bijli=findViewById(R.id.bijli_pdf);

        Bijli.fromAsset("Pradhan mantri Sahaj Bijli har ghar yojana-English.pdf").load();

    }
}
