package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Land3Activity extends AppCompatActivity {
PDFView Land3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land3);

        Land3=findViewById(R.id.land3_pdf);

        Land3.fromAsset("Karnataka Land & Building Plan Approval System Features -Kannada.pdf").load();
    }
}
