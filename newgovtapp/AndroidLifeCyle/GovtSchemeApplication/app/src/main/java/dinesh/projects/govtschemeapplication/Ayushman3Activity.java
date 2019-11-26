package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Ayushman3Activity extends AppCompatActivity {
    PDFView Ayushman3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayushman3);

        Ayushman3=findViewById(R.id.ayushman3_pdf);

        Ayushman3.fromAsset("Ayushman Bharat-Kannada.pdf").load();
    }
}
