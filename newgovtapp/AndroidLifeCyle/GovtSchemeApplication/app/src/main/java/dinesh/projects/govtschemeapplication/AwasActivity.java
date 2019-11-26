package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AwasActivity extends AppCompatActivity {
    PDFView Awas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awas);

        Awas=findViewById(R.id.awas_pdf);

        Awas.fromAsset("Pradhan Mantri Awas Yojana -English.pdf").load();
    }
}
