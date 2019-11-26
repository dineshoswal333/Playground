package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Grant3Activity extends AppCompatActivity {
    PDFView Grants3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grant3);
        Grants3 =findViewById(R.id.grants3_pdf);

        Grants3.fromAsset("Grants under Article 275(1) of the Constitution of India -Kannada.pdf").load();
    }
}
