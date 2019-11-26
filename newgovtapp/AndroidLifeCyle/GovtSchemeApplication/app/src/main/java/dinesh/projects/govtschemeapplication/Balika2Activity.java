package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Balika2Activity extends AppCompatActivity {
    PDFView Balika2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balika2);
        Balika2=findViewById(R.id.balika2_pdf);

        Balika2.fromAsset("Kasturba Gandhi Balika Vidyalaya -Hindi.pdf").load();
    }
}
