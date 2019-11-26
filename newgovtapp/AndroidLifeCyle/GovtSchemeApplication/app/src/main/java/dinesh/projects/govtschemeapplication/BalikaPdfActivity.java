package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BalikaPdfActivity extends AppCompatActivity {
    PDFView Balika;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balika_pdf);

        Balika=findViewById(R.id.balika_pdf);

        Balika.fromAsset("Kasturba Gandhi Balika Vidyalaya -English.pdf").load();
    }
}
