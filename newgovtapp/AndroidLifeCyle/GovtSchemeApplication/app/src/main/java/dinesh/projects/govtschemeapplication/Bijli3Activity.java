package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bijli3Activity extends AppCompatActivity {
    PDFView Bijli3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bijli3);

        Bijli3=findViewById(R.id.bijli3_pdf);

        Bijli3.fromAsset("Pradhan mantri Sahaj Bijli har ghar yojana-kannada.pdf").load();
    }
}
