package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Social3Activity extends AppCompatActivity {
    PDFView Social3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social3);

        Social3=findViewById(R.id.social3_pdf);

        Social3.fromAsset("National Social Assistance Scheme-Kannada.pdf").load();
    }
}
