package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Fasal2Activity extends AppCompatActivity {
    PDFView Fasal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasal2);
        Fasal2=findViewById(R.id.fasal2_pdf);

        Fasal2.fromAsset("Pradhan mantri fasal bima Yojana-Hindi.pdf").load();
    }
}
