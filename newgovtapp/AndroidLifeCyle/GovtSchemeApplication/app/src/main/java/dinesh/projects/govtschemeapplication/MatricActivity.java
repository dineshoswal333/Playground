package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MatricActivity extends AppCompatActivity {
    PDFView Matric;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matric);
        Matric=findViewById(R.id.matric_pdf);

        Matric.fromAsset("Post matric scholarship(ST students)-English.pdf").load();
    }
}
