package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Overseas2Activity extends AppCompatActivity {
    PDFView Overseas2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overseas2);
        Overseas2=findViewById(R.id.overseas2_pdf);

        Overseas2.fromAsset("National Overseas Scholarships for Scheduled Tribe Students -hindi.pdf").load();
    }
}
