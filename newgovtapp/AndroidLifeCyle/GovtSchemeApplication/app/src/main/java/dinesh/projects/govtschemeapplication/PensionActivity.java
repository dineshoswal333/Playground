package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PensionActivity extends AppCompatActivity {
    PDFView Pension;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pension);

        Pension=findViewById(R.id.pension_pdf);

        Pension.fromAsset("National Pension System -English.pdf").load();
    }
}
