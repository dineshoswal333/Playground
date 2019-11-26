package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PrabuddhaActivity extends AppCompatActivity {
    PDFView Prabuddha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prabuddha);
       Prabuddha=findViewById(R.id.prabuddha_pdf);

        Prabuddha.fromAsset("Karnataka Prabuddha Scheme -English.pdf").load();
    }
}
