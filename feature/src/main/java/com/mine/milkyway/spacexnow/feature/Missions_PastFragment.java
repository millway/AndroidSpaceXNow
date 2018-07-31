package com.mine.milkyway.spacexnow.feature;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Missions_PastFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Missions_PastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Missions_PastFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView mRecyclerView;

    private Missions_RecyclerView_ItemAdapter missions_recyclerView_itemAdapter;
    List<Missions_RecyclerView_Item> missions_recyclerView_items;


    private OnFragmentInteractionListener mListener;

    public Missions_PastFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Missions_PastFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Missions_PastFragment newInstance(String param1, String param2) {
        Missions_PastFragment fragment = new Missions_PastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_missions__past, container, false);

        missions_recyclerView_items = new ArrayList<>();
        mRecyclerView = (RecyclerView) view.findViewById(R.id.past_mission_recycler_view);

        //set this to fixed size to improve performance if the the content do not change the layout.
        mRecyclerView.setHasFixedSize(false);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        for (int i = 0 ; i <20 ; i++)
            missions_recyclerView_items.add(
                    new Missions_RecyclerView_Item(
                            i,
                            R.drawable.bfr,
                            "SRS Moon","SATCOM",
                            "Kenedy Space Station",
                            "GTO"
                            ,"2018.8.14"
                            ,"3 days, 10 hours, 4 minutes")
            );



        missions_recyclerView_itemAdapter = new Missions_RecyclerView_ItemAdapter(view.getContext(),missions_recyclerView_items);
        mRecyclerView.setAdapter(missions_recyclerView_itemAdapter);


        return  view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
