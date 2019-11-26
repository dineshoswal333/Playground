package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Badavara2Activity extends AppCompatActivity {
    PDFView Badavara2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badavara2);

        Badavara2=findViewById(R.id.badavara2_pdf);

        Badavara2.fromAsset("Karnataka Badavara Bandhu -Hindi.pdf").load();
    }
}
