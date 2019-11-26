package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pension2Activity extends AppCompatActivity {
    PDFView Pension2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pension2);

        Pension2=findViewById(R.id.pension2_pdf);

        Pension2.fromAsset("National Pension System -Hindi.pdf").load();
    }
}
