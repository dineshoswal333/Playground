package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DevelopmentActivity extends AppCompatActivity {
    PDFView Development;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_development);
        Development=findViewById(R.id.development_pdf);

        Development.fromAsset("Developmentof tribal groups-English.pdf").load();
    }
}
