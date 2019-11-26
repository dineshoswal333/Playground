package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Development2Activity extends AppCompatActivity {
    PDFView Development2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_development2);
        Development2=findViewById(R.id.development2_pdf);

        Development2.fromAsset("Developmentof tribal groups-Hindi.pdf").load();
    }
}
