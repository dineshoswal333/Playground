package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Top2Activity extends AppCompatActivity {
    PDFView Top2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top2);
        Top2=findViewById(R.id.top2_pdf);

        Top2.fromAsset("EducationTop Class Education for ST Students -Hindi.pdf").load();
    }
}
