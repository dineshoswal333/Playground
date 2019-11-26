package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Fellowship3Activity extends AppCompatActivity {
    PDFView Fellowship3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fellowship3);

        Fellowship3=findViewById(R.id.fellowship3_pdf);

        Fellowship3.fromAsset("Rajiv Gandhi National Fellowship for ST Students -Kannada.pdf").load();
    }
}
