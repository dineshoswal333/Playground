package carmel.bootcamp.dinesh;

import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class AttachmentFragment extends Fragment {

    Button uploadButton;
    TextView saveDrafts;
    ImageView attachmentIconTwo;

    public AttachmentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View views = inflater.inflate(R.layout.fragment_attachment, container, false);

        saveDrafts = views.findViewById(R.id.tvSaveDrafts);
        saveDrafts.setPaintFlags(saveDrafts.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        uploadButton = views.findViewById(R.id.uploadButton);
        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UploadFragment uploadFragment = new UploadFragment();
                FragmentManager fragmentManager1=getFragmentManager();
//                fragmentManager1.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                FragmentTransaction fragmentTransaction = fragmentManager1.beginTransaction();
                fragmentTransaction.replace(R.id.mainlayout, uploadFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        attachmentIconTwo = views.findViewById(R.id.secondAttachmentIcon);
        attachmentIconTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UploadFragment uploadFragment = new UploadFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainlayout, uploadFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        return views;
    }
}

