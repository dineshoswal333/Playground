package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Anila2Activity extends AppCompatActivity {

    PDFView Anila2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anila2);
        Anila2=findViewById(R.id.anila2_pdf);

        Anila2.fromAsset("Mukhya mantri anila bhagya yojana-hindi.pdf").load();
    }
}
