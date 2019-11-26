package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Prabuddha3Activity extends AppCompatActivity {
    PDFView Prabuddha3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prabuddha3);

        Prabuddha3=findViewById(R.id.prabuddha3_pdf);

        Prabuddha3.fromAsset("Karnataka Prabuddha Scheme -Kannada.pdf").load();
    }
}
