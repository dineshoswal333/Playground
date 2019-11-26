package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Laptop2Activity extends AppCompatActivity {
    PDFView Laptop2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop2);
        Laptop2=findViewById(R.id.laptop2_pdf);

        Laptop2.fromAsset("Karnataka Free Laptop Government -hindi.pdf").load();
    }
}
