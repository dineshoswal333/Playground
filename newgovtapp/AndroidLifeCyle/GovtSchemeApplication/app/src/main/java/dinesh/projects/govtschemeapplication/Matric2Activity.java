package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Matric2Activity extends AppCompatActivity {
    PDFView Matric2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matric2);
        Matric2=findViewById(R.id.matric2_pdf);

        Matric2.fromAsset("Post matric scholarship(ST students)-Hindi.pdf").load();
    }
}
