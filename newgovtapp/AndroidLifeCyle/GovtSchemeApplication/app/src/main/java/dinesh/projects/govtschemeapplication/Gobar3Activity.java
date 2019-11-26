package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Gobar3Activity extends AppCompatActivity {
    PDFView Gobar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gobar3);

        Gobar3=findViewById(R.id.gobar3_pdf);

        Gobar3.fromAsset("Gobhar dhan scheme-Kannada.pdf").load();
    }
}
