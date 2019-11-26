package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Digital3Activity extends AppCompatActivity {
PDFView Digital3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital3);

        Digital3=findViewById(R.id.digital3_pdf);

        Digital3.fromAsset("Digital India-Kannada.pdf").load();
    }
}
