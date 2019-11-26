package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SamgaraPdfActivity extends AppCompatActivity {
    PDFView Samgara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samgara_pdf);

        Samgara=findViewById(R.id.samgara_pdf);

        Samgara.fromAsset("Samgara shiksha abhiyan-English.pdf").load();
    }
}
