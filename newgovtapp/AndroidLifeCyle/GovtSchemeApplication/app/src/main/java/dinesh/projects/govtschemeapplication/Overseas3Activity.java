package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Overseas3Activity extends AppCompatActivity {
    PDFView Overseas3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overseas3);

        Overseas3=findViewById(R.id.overseas3_pdf);

        Overseas3.fromAsset("National Overseas Scholarships for Scheduled Tribe Students -Kannada.pdf").load();
    }
}
