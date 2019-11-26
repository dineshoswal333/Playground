package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class KishorePdfActivity extends AppCompatActivity {
    PDFView Kishore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kishore_pdf);
        Kishore=findViewById(R.id.kishore_pdf);

        Kishore.fromAsset("Kishore Vaigyanik Protsahan Yojana-English.pdf").load();
    }
}
