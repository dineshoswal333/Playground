package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PaintFlagsDrawFilter;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Awas2Activity extends AppCompatActivity {
    PDFView Awas2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awas2);
        Awas2=findViewById(R.id.awas2_pdf);

        Awas2.fromAsset("Pradhan Mantri Awas Yojana -Hindi.pdf").load();
    }
}
