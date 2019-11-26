package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SocialActivity extends AppCompatActivity {
    PDFView Social;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
        Social=findViewById(R.id.social_pdf);

        Social.fromAsset("National social assistance scheme-English.pdf").load();
    }
}
