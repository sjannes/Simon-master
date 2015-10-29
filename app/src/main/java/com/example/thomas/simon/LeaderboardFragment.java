package com.example.thomas.simon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * A placeholder fragment containing a simple view.
 */
public class LeaderboardFragment extends Fragment {

    private ArrayAdapter<String> HighScoreAdapter;

    public LeaderboardFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Add this line in order for this fragment to handle menu events.
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Create some dummy data for the ListView.  Here's a sample weekly forecast
        String[] data = {
                "Empty - 0",
                "Empty - 0",
                "Empty - 0",
                "Empty - 0",
                "Empty - 0",
                "Empty - 0",
                "Empty - 0"
        };
        List<String> Leaderboard = new ArrayList<String>(Arrays.asList(data));

        HighScoreAdapter =
                new ArrayAdapter<String>(
                        getActivity(), // The current context (this activity)
                        R.layout.list_item_leaderboard, // The name of the layout ID.
                        R.id.list_item_leaderboard_textview, // The ID of the textview to populate.
                        Leaderboard);

        View rootView = inflater.inflate(R.layout.fragment_leaderboard, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.list_item_leaderboard);
        listView.setAdapter(HighScoreAdapter);


        return rootView;
    }
}