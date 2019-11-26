package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class EducationPdfActivity extends AppCompatActivity {
    PDFView Tribal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_pdf);

        Tribal=findViewById(R.id.educationTribals_pdf);

        Tribal.fromAsset("Education for tribals-English.pdf").load();
    }
}
