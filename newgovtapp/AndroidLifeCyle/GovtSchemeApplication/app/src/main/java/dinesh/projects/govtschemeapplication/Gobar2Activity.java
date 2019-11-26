package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Gobar2Activity extends AppCompatActivity {
    PDFView Gobar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gobar2);
        Gobar2=findViewById(R.id.gobar2_pdf);

        Gobar2.fromAsset("Gobhar dhan scheme-Hindi.pdf").load();
    }
}
