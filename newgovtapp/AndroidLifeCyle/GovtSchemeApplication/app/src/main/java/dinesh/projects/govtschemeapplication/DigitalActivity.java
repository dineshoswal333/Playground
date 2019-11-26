package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DigitalActivity extends AppCompatActivity {
    PDFView Digital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital);
        Digital=findViewById(R.id.digital_pdf);

        Digital.fromAsset("Digital India-English.pdf").load();
    }
}
