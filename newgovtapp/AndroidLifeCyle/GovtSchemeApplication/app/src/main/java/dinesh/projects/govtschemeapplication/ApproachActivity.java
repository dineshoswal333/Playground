package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ApproachActivity extends AppCompatActivity {
    PDFView Approach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approach);

        Approach=findViewById(R.id.approach_pdf);

        Approach.fromAsset("Remunerative Approach for Agriculture -English.pdf").load();

    }
}
