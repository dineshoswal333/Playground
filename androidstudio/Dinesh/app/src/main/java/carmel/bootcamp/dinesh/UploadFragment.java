package carmel.bootcamp.dinesh;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class UploadFragment extends Fragment {
    TextView saveDrafts;

    public UploadFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view1= inflater.inflate(R.layout.fragment_upload, container, false);
        saveDrafts=view1.findViewById(R.id.tvSaveDrafts);
        saveDrafts.setPaintFlags(saveDrafts.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);




   return view1;
    }
}
