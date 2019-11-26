package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PaintFlagsDrawFilter;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Kishore2Activity extends AppCompatActivity {
    PDFView Kishore2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kishore2);
        Kishore2=findViewById(R.id.kishore2_pdf);

        Kishore2.fromAsset("Kishore Vaigyanik Protsahan Yojana-Hindi.pdf").load();
    }
}
