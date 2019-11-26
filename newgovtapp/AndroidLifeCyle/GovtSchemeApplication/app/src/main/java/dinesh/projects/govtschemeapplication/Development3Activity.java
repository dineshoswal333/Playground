package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Development3Activity extends AppCompatActivity {
    PDFView Development3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_development3);

        Development3=findViewById(R.id.development3_pdf);

        Development3.fromAsset("Developmentof tribal groups-Kannada.pdf").load();

    }
}
