package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Tribal2Activity extends AppCompatActivity {
    PDFView Tribal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tribal2);

        Tribal2=findViewById(R.id.tribal2_pdf);

        Tribal2.fromAsset("Education for tribals-Hindi.pdf").load();
    }
}
