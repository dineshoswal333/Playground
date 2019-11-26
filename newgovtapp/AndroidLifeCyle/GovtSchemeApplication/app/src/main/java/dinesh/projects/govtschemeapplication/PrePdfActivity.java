package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PrePdfActivity extends AppCompatActivity {
    PDFView Pre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_pdf);

        Pre=findViewById(R.id.pre_pdf);

        Pre.fromAsset("PRE-MATRIC SCHOLARSHIP -English.pdf").load();
    }
}
