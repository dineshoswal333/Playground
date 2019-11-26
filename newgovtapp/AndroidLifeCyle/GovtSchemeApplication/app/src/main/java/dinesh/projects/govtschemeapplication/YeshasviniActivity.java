package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class YeshasviniActivity extends AppCompatActivity {
    PDFView Yeshaswini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeshasvini);
        Yeshaswini=findViewById(R.id.yeshasvini_pdf);

        Yeshaswini.fromAsset("Karnataka Yeshasvini Health Insurance -English.pdf").load();
    }
}
