package carmel.bootcamp.dinesh;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class MainRequisitionFragment extends Fragment {

    ImageView attachmentIcon;

    public MainRequisitionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_requisition, container, false);


        attachmentIcon = view.findViewById(R.id.ivAttachmentIcon);
        attachmentIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AttachmentFragment attachmentFragment = new AttachmentFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.mainlayout, attachmentFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    return view;
    }
}
