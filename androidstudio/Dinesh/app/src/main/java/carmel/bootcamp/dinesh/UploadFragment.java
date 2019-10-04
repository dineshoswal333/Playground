package carmel.bootcamp.dinesh;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class UploadFragment extends Fragment {
    TextView saveDrafts;
    RecyclerView recyclerView;

//    TextView tvTextOne,tvTextTwo,tvTextThree,tvTextFour;
//    ImageView ivDelete1,ivDelete2;

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
        recyclerView=view1.findViewById(R.id.recylerView);

        String text1[]={"abc0037429023.doc                       976KB","abc003745gb9023.doc                       988KB"};
        String text2[]={"Lorem ipsum dolor sit amet, consectetur…","Lorem ipsum dolor sit amet, consectetur…"};
        RecyclerView.Adapter recylerViewadapter=new ListrecyclerViewadapter(view1.getContext(),text1,text2);
        recyclerView.setLayoutManager(new LinearLayoutManager(view1.getContext()));
        recyclerView.setAdapter(recylerViewadapter);


   return view1;
    }
}
