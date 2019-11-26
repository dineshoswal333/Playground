package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Green2Activity extends AppCompatActivity {
    PDFView Green2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green2);

        Green2=findViewById(R.id.green2_pdf);

        Green2.fromAsset("operation greens-Hindi.pdf").load();
    }
}
