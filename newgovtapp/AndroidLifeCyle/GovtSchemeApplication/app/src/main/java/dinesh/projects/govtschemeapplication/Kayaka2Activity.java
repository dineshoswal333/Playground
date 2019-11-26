package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Kayaka2Activity extends AppCompatActivity {
    PDFView Kayaka2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayaka2);

        Kayaka2=findViewById(R.id.kayaka2_pdf);

        Kayaka2.fromAsset("Karnataka Kayaka Yojana Loan -Hindi.pdf").load();
    }
}
