package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Social2Activity extends AppCompatActivity {
    PDFView Social2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social2);
        Social2=findViewById(R.id.social2_pdf);

        Social2.fromAsset("National Social Assistance Scheme-Hindi.pdf").load();
    }
}
