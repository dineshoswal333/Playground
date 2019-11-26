package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Balika3Activity extends AppCompatActivity {
    PDFView Balika3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balika3);
        Balika3=findViewById(R.id.balika3_pdf);

        Balika3.fromAsset("Kasturba Gandhi Balika Vidyalaya -Kannada.pdf").load();
    }
}