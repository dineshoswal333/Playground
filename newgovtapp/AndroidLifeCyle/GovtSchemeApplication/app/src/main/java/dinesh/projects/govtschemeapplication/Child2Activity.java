package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Child2Activity extends AppCompatActivity {
PDFView Child2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child2);
        Child2=findViewById(R.id.child2_pdf);

        Child2.fromAsset("Integrated Child Development Services-Hindi.pdf").load();
    }
}
