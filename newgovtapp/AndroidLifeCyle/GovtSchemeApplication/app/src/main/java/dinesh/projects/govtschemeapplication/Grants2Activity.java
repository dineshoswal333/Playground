package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Grants2Activity extends AppCompatActivity {
    PDFView Grants2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grants2);
        Grants2=findViewById(R.id.grants2_pdf);

        Grants2.fromAsset("Grants under Article 275(1) of the Constitution of India -Hindi.pdf").load();
    }
}
