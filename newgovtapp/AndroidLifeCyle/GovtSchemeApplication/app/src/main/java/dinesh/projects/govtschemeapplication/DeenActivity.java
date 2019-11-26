package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DeenActivity extends AppCompatActivity {
    PDFView Deen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deen);
        Deen=findViewById(R.id.deen_pdf);

        Deen.fromAsset("Deen Dayal Upadhyaya Grameen Kaushalya Yojana-English.pdf").load();
    }
}
