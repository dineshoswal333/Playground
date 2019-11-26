package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Samgara2Activity extends AppCompatActivity {
    PDFView Samgara2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samgara2);

        Samgara2=findViewById(R.id.samgara2_pdf);

        Samgara2.fromAsset("Samgra shiksha abhiyan-Hindi.pdf").load();
    }
}
