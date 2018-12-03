package com.example.roca486.prac2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AddBikeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AddBikeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddBikeFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private EditText mBikeIdView;
    private EditText mBikeDescriptionView;

    private OnFragmentInteractionListener mListener;

    public AddBikeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AddBikeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AddBikeFragment newInstance(String param1, String param2) {
        AddBikeFragment fragment = new AddBikeFragment();
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

        View view = inflater.inflate(R.layout.fragment_add_bike, container, false);

        Button add_bike = view.findViewById(R.id.add_bike);
        mBikeIdView = view.findViewById(R.id.bike_id);
        mBikeDescriptionView = view.findViewById(R.id.bike_description);

        add_bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAddBikeButtonPressed();
            }
        });

        return view;
    }

    public void onAddBikeButtonPressed() {
        mBikeIdView.setError(null);
        mBikeDescriptionView.setError(null);

        String bikeId = mBikeIdView.getText().toString();
        String bikeDescription = mBikeDescriptionView.getText().toString();

        boolean cancel = false;
        View focusView = null;
        Bike bike;

        if (TextUtils.isEmpty(bikeDescription)) {
            mBikeDescriptionView.setError("This field cannot be empty");
            focusView = mBikeDescriptionView;
            cancel = true;
        }

        if (TextUtils.isEmpty(bikeId)) {
            mBikeIdView.setError("This field cannot be empty");
            focusView = mBikeIdView;
            cancel = true;
        }

        if (cancel) {
            focusView.requestFocus();
        } else {
            bike = new Bike(bikeId, bikeDescription);
            if (mListener != null) {
                mListener.onFragmentInteraction(bike);
            }
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
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
        boolean onFragmentInteraction(Bike bike);
    }
}
