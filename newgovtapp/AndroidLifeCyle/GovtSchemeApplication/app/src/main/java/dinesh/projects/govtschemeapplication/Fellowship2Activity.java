package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Fellowship2Activity extends AppCompatActivity {
    PDFView Fellowship2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fellowship2);
        Fellowship2=findViewById(R.id.fellowship2_pdf);

        Fellowship2.fromAsset("Rajiv Gandhi National Fellowship for ST Students -hindi.pdf").load();    }
}
