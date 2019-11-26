package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class OverseasActivity extends AppCompatActivity {
    PDFView Overseas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overseas);
        Overseas=findViewById(R.id.overseas_pdf);

        Overseas.fromAsset("National Overseas Scholarships for Scheduled Tribe Students -English.pdf").load();
    }
}
