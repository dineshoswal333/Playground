package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class LandActivity extends AppCompatActivity {
PDFView Land;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land);
        Land=findViewById(R.id.land_pdf);

        Land.fromAsset("Karnataka Land & Building Plan Approval System Features -english.pdf").load();
    }
}
