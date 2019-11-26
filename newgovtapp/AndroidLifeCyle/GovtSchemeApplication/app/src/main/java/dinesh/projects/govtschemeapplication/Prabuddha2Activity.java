package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Prabuddha2Activity extends AppCompatActivity {
    PDFView Prabuddha2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prabuddha2);

        Prabuddha2=findViewById(R.id.prabuddha2_pdf);

        Prabuddha2.fromAsset("Karnataka Prabuddha Scheme -Hindi.pdf").load();
    }
}
