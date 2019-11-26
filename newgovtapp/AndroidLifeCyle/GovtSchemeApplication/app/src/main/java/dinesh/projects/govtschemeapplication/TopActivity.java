package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class TopActivity extends AppCompatActivity {
    PDFView Top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        Top=findViewById(R.id.top_pdf);

        Top.fromAsset("EducationTop Class Education for ST Students -English.pdf").load();
    }
}
