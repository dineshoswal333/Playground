package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Green3Activity extends AppCompatActivity {
    PDFView Green3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green3);

        Green3=findViewById(R.id.green3_pdf);

        Green3.fromAsset("operation greens-Kannada.pdf").load();
    }
}
