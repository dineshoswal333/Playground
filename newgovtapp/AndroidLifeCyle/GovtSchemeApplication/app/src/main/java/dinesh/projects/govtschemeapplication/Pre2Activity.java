package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pre2Activity extends AppCompatActivity {
    PDFView Pre2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre2);
        Pre2=findViewById(R.id.pre2_pdf);

        Pre2.fromAsset("PRE-MATRIC SCHOLARSHIP -Hindi.pdf").load();
    }
}
