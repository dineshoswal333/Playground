package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pension3Activity extends AppCompatActivity {
    PDFView Pension3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pension3);

        Pension3=findViewById(R.id.pension3_pdf);

        Pension3.fromAsset("National Pension System -Kannada.pdf").load();
    }
}
