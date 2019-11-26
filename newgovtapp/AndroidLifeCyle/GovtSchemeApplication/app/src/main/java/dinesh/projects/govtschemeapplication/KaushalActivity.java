package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class KaushalActivity extends AppCompatActivity {
    PDFView Kaushal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaushal);

        Kaushal=findViewById(R.id.kaushal_pdf);

        Kaushal.fromAsset("Pradhan Mantri Kaushal Vikas Yojana-English.pdf").load();

    }
}
