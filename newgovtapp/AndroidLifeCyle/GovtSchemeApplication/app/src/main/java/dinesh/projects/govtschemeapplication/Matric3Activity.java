package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Matric3Activity extends AppCompatActivity {
    PDFView Matric3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matric3);

        Matric3=findViewById(R.id.matric3_pdf);

        Matric3.fromAsset("Post matric scholarship(ST students)-Kannada.pdf").load();
    }
}
