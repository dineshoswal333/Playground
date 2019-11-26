package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Kayaka3Activity extends AppCompatActivity {
    PDFView Kayaka3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayaka3);

        Kayaka3=findViewById(R.id.kayaka3_pdf);

        Kayaka3.fromAsset("Karnataka Kayaka Yojana Loan -Kannada.pdf").load();
    }
}
