package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class LaptopPdfActivity extends AppCompatActivity {
    PDFView Laptop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop_pdf);

        Laptop=findViewById(R.id.laptop_pdf);

        Laptop.fromAsset("Karnataka Free Laptop Government -English.pdf").load();
    }
}
