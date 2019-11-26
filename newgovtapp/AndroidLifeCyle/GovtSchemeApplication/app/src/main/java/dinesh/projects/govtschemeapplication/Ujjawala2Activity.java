package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Ujjawala2Activity extends AppCompatActivity {
    PDFView Ujjawala2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ujjawala2);

        Ujjawala2=findViewById(R.id.ujjawala2_pdf);

        Ujjawala2.fromAsset("pradhan mantri ujjawala yojana-Hindi.pdf").load();
    }
}
