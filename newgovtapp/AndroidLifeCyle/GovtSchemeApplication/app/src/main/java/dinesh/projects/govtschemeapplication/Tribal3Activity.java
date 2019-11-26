package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Tribal3Activity extends AppCompatActivity {
    PDFView Tribal3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tribal3);

        Tribal3=findViewById(R.id.tribal3_pdf);

        Tribal3.fromAsset("Education for tribals-Kannada.pdf").load();
    }
}
