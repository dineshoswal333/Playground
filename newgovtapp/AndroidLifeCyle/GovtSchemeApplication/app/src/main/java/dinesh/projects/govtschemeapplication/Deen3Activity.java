package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Deen3Activity extends AppCompatActivity {
    PDFView Deen3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deen3);

        Deen3=findViewById(R.id.deen3_pdf);

        Deen3.fromAsset("Deen Dayal Upadhyaya Grameen Kaushalya Yojana-Kannada.pdf").load();
    }
}
