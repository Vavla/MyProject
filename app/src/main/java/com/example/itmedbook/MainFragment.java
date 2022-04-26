package com.example.itmedbook;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.transition.Explode;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    static public  int IsOpened;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;

    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
//    public static MainFragment newInstance(String param1, String param2) {
//        MainFragment fragment = new MainFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, null);
        return v;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView iconView = view.findViewById(R.id.menuBtn);
        iconView.setImageResource(R.drawable.menu_icon);

        ConstraintLayout layout = view.findViewById(R.id.menuUnvisib);

        iconView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int isVisible = layout.getVisibility();

                Log.d("toggle", String.valueOf(isVisible));

                Transition transition = new Slide(Gravity.LEFT);
                transition.setDuration(200);
                transition.addTarget(R.id.menuUnvisib);

                TransitionManager.beginDelayedTransition(view.findViewById(R.id.rootMenuContainer),transition);

                layout.setVisibility(isVisible == View.VISIBLE? View.GONE:View.VISIBLE);

//                if(isVisible == View.VISIBLE){
//
//                    TranslateAnimation animation = new TranslateAnimation(layout.getWidth()*2/3,0, layout.getHeight(), 52);
//                    animation.setDuration(200);
//                    animation.setFillAfter(true);
//                    layout.startAnimation(animation);
//                    layout.setVisibility(View.GONE);
//
//
//                }
//                else{
//                    layout.setVisibility(View.VISIBLE);
//                    TranslateAnimation animation = new TranslateAnimation(0,layout.getWidth()*2/3,52, layout.getHeight());
//                    animation.setDuration(200);
//                    animation.setFillAfter(true);
//                    layout.startAnimation(animation);
//
//                }


//

            }
        });
    }
}