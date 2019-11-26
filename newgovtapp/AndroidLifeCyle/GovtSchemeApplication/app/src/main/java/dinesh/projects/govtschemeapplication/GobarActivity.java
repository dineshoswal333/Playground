package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class GobarActivity extends AppCompatActivity {
    PDFView Gobar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gobar);
        Gobar=findViewById(R.id.gobar_pdf);

        Gobar.fromAsset("Gobhar dhan scheme English.pdf").load();
    }
}
