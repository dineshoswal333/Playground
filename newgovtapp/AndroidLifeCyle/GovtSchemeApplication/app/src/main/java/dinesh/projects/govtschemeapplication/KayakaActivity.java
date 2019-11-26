package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class KayakaActivity extends AppCompatActivity {
    PDFView Kayaka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayaka);

        Kayaka=findViewById(R.id.kayaka_pdf);

        Kayaka.fromAsset("Karnataka Kayaka Yojana Loan -English.pdf").load();
    }
}
