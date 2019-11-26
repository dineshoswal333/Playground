package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Badavara3Activity extends AppCompatActivity {
    PDFView Badavara3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badavara3);

        Badavara3=findViewById(R.id.badavara3_pdf);

        Badavara3.fromAsset("Karnataka Badavara Bandhu - Kannada.pdf").load();
    }
}
