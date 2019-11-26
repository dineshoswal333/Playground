package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Land2Activity extends AppCompatActivity {
    PDFView Land2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land2);
        Land2=findViewById(R.id.land2_pdf);

        Land2.fromAsset("Karnataka Land & Building Plan Approval System Features -Hindi.pdf").load();
    }
}
