package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Laptop3Activity extends AppCompatActivity {
PDFView Laptop3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop3);

        Laptop3=findViewById(R.id.laptop3_pdf);

        Laptop3.fromAsset("Karnataka Free Laptop Government -Kannada.pdf").load();
    }
}
