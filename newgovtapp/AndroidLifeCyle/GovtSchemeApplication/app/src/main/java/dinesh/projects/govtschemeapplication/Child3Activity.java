package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Child3Activity extends AppCompatActivity {
    PDFView Child3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child3);

        Child3=findViewById(R.id.child3_pdf);

        Child3.fromAsset("Integrated Child Development Services-Kannada.pdf").load();

    }
}
