package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class FellowshipActivity extends AppCompatActivity {
    PDFView Fellowship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fellowship);
        Fellowship=findViewById(R.id.fellowship_pdf);

        Fellowship.fromAsset("Rajiv Gandhi National Fellowship for ST Students -English.pdf").load();
    }
}
