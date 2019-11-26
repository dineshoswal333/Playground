package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class GrantsActivity extends AppCompatActivity {
    PDFView Grants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grants);

        Grants=findViewById(R.id.grants_pdf);

        Grants.fromAsset("Grants under Article 275(1) of the Constitution of India -english.pdf").load();
    }
}
