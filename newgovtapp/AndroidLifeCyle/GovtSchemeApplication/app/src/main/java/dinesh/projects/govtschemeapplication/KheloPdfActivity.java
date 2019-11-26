package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class KheloPdfActivity extends AppCompatActivity {
    PDFView Khelo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khelo_pdf);

        Khelo=findViewById(R.id.khelo_pdf);

        Khelo.fromAsset("Khelo India scheme India-English.pdf").load();
    }
}
