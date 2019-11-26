package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Yeshasvini3Activity extends AppCompatActivity {
    PDFView Yeshasvini3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeshasvini3);

        Yeshasvini3=findViewById(R.id.yeshasvini3_pdf);

        Yeshasvini3.fromAsset("Karnataka Yeshasvini Health Insurance -Kannada.pdf").load();
    }
}
