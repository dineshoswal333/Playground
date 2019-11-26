package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AnilaActivity extends AppCompatActivity {
    PDFView Anila;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anila);
        Anila=findViewById(R.id.anila_pdf);

        Anila.fromAsset("Mukhya mantri anila bhagya yojana-English.pdf").load();
    }
}
