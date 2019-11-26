package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Top3Activity extends AppCompatActivity {
    PDFView Top3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top3);

        Top3=findViewById(R.id.top3_pdf);

        Top3.fromAsset("EducationTop Class Education for ST Students -Kannada.pdf").load();
    }
}
