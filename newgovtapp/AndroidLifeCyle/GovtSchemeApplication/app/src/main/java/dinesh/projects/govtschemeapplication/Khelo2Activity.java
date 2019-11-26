package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Khelo2Activity extends AppCompatActivity {
    PDFView Khelo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khelo2);
        Khelo2=findViewById(R.id.khelo2_pdf);

        Khelo2.fromAsset("Khelo India scheme-Hindi.pdf").load();
    }
}
