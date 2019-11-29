package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AyushmanActivity extends AppCompatActivity {
    PDFView Ayushman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayushman);

        Ayushman=findViewById(R.id.ayushman_pdf);

        Ayushman.fromAsset("Ayushman bharat-English.pdf").load();
    }
}
