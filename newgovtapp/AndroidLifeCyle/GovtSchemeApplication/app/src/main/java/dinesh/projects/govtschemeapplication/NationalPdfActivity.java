package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class NationalPdfActivity extends AppCompatActivity {
    PDFView National;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national_pdf);

        National=findViewById(R.id.national_pdf);

        National.fromAsset("National Education Mission -English.pdf").load();
    }
}
