package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Approach2Activity extends AppCompatActivity {
    PDFView Approach2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approach2);
        Approach2=findViewById(R.id.approach2_pdf);

        Approach2.fromAsset("Remunerative Approach for Agriculture -Hindi.pdf").load();
    }
}
