package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Ashram3Activity extends AppCompatActivity {
    PDFView Ashram3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashram3);

        Ashram3=findViewById(R.id.ashram3_pdf);

        Ashram3.fromAsset("Ashram for Tribal people-kannada.pdf").load();
    }
}
