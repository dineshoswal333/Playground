package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class National2Activity extends AppCompatActivity {
    PDFView National2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national2);
        National2=findViewById(R.id.national2_pdf);

        National2.fromAsset("National Education Mission -Hindi.pdf").load();
    }
}
