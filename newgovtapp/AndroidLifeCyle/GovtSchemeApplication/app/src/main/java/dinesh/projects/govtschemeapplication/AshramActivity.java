package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AshramActivity extends AppCompatActivity {
    PDFView Ashram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashram);
        Ashram=findViewById(R.id.ashram_pdf);

        Ashram.fromAsset("Ashram for Tribal people-English.pdf").load();
    }
}
