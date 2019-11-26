package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Gram2Activity extends AppCompatActivity {

    PDFView Gram2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gram2);

        Gram2=findViewById(R.id.gram2_pdf);

        Gram2.fromAsset("Gram swaraj abhiyan-hindi.pdf").load();
    }
}
