package tomer.edu.fragmentssearch;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {

    EditText etQuery;
    Button btnSearch;

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_search, container, false);

        etQuery = (EditText) v.findViewById(R.id.edtSearch);
        btnSearch = (Button) v.findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = etQuery.getText().toString();
                Uri address = Uri.parse("https://www.google.co.il/search?q=" + query);

                Intent intent = new Intent(Intent.ACTION_VIEW, address);
                getActivity().startActivity(intent);

            }
        });


        return v;
    }


}
