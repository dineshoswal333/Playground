package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class UjjawalaActivity extends AppCompatActivity {
PDFView Ujjawala;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ujjawala);
        Ujjawala=findViewById(R.id.ujjawala_pdf);

        Ujjawala.fromAsset("pradhan mantri ujjawala yojana-English.pdf").load();


    }
}
