package com.example.thomas.simon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * A placeholder fragment containing a simple view.
 */
public class main_activityFragment extends Fragment {

    public main_activityFragment() {
        ImageView image;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_main_activity, container, false);
        Button newGame = (Button)rootView.findViewById(R.id.newGame);
        Button settings = (Button)rootView.findViewById(R.id.settings);
        Button leaderBoard = (Button)rootView.findViewById(R.id.leaderboard);
        ImageView image=(ImageView)rootView.findViewById(R.id.imageView);

        newGame.setOnClickListener(createOnClickListener(Simon.class));
        leaderBoard.setOnClickListener(createOnClickListener(Leaderboard.class));

        return rootView;

    }

    public View.OnClickListener createOnClickListener(final Class next)
    {
       return new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getContext(), next);
               startActivity(intent);

           }
       } ;
    }
}
