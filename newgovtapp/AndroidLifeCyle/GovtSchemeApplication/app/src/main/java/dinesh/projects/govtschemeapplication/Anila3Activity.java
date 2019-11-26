package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Anila3Activity extends AppCompatActivity {
    PDFView Anila3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anila3);

        Anila3=findViewById(R.id.anila3_pdf);

        Anila3.fromAsset("Mukhya mantri anila bhagya yojana-Kannada.pdf").load();
    }
}
