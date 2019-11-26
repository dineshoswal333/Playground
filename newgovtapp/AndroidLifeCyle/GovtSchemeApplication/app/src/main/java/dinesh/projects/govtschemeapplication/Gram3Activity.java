package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Gram3Activity extends AppCompatActivity {
    PDFView Gram3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gram3);

        Gram3=findViewById(R.id.gram3_pdf);

        Gram3.fromAsset("Gram swaraj abhiyan-Kannada.pdf").load();
    }
}
