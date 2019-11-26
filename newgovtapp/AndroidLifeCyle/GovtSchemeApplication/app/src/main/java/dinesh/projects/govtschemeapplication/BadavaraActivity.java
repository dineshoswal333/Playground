package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BadavaraActivity extends AppCompatActivity {
    PDFView Badavara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badavara);
        Badavara=findViewById(R.id.badavara_pdf);

        Badavara.fromAsset("Karnataka Badavara Bandhu -English.pdf").load();
    }
}
