package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Yeshasvini2Activity extends AppCompatActivity {
    PDFView Yeshasvini2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeshasvini2);
        Yeshasvini2=findViewById(R.id.yeshasvini2_pdf);

        Yeshasvini2.fromAsset("Karnataka Yeshasvini Health Insurance -Hindi.pdf").load();
    }
}
