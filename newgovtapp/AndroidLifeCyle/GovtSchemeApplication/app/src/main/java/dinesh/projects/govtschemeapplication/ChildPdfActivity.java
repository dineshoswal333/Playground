package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ChildPdfActivity extends AppCompatActivity {
    PDFView Child;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_pdf);

        Child=findViewById(R.id.child_pdf);

        Child.fromAsset("Integrated Child Development Services-English.pdf").load();
    }
}
