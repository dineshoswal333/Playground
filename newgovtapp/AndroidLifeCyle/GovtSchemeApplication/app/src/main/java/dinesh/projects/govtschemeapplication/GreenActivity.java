package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class GreenActivity extends AppCompatActivity {
    PDFView Green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green);

        Green=findViewById(R.id.green_pdf);

        Green.fromAsset("operation greens-English.pdf").load();
    }
}
