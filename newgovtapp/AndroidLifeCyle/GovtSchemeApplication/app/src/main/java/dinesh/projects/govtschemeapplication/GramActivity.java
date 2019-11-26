package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class GramActivity extends AppCompatActivity {
    PDFView Gram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gram);
        Gram=findViewById(R.id.gram_pdf);

        Gram.fromAsset("Gram swaraj abhiyan-english.pdf").load();
    }
}
