package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Kaushal2Activity extends AppCompatActivity {
    PDFView Kaushal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaushal2);

        Kaushal2=findViewById(R.id.kaushal2_pdf);

        Kaushal2.fromAsset("Pradhan Mantri Kaushal Vikas Yojana-Hindi.pdf").load();
    }
}
