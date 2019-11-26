package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Ashram2Activity extends AppCompatActivity {
PDFView Ashram2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashram2);

        Ashram2=findViewById(R.id.ashram2_pdf);

        Ashram2.fromAsset("Ashram for Tribal people-Hindi.pdf").load();
    }
}
