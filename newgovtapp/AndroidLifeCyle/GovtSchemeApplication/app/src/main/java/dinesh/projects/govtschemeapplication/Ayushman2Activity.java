package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Ayushman2Activity extends AppCompatActivity {
    PDFView Ayushman2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayushman2);
        Ayushman2=findViewById(R.id.ayushman2_pdf);

        Ayushman2.fromAsset("Ayushman bharat-Hindi.pdf").load();
    }
}
