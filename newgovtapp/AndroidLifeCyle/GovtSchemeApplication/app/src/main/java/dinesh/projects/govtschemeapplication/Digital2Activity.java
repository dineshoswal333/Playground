package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Digital2Activity extends AppCompatActivity {
    PDFView Digital2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital2);

        Digital2=findViewById(R.id.digital2_pdf);

        Digital2.fromAsset("Digital India-Hindi.pdf").load();
    }
}
