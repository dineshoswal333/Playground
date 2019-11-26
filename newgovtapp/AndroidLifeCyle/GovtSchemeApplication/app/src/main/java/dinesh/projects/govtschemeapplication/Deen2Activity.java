package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Deen2Activity extends AppCompatActivity {
    PDFView Deen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deen2);
        Deen2=findViewById(R.id.deen2_pdf);

        Deen2.fromAsset("Deen Dayal Upadhyaya Grameen Kaushalya Yojana-Hindi.pdf").load();
    }
}
