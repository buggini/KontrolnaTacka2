package fragments;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androiddevelopment.kontrolnatacka2.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import model.Filmovi;
import providers.FilmoviProvider;
import providers.GlumacProvider;

public class DetailFragment extends Fragment {


    private int position = 0;

    @Override
    public void onAttach(Activity activity) {

        super.onAttach(activity);

        Toast.makeText(getActivity(), "DetailFragment.onAttach()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onCreate()", Toast.LENGTH_SHORT).show();

        if (savedInstanceState != null) {
            position = savedInstanceState.getInt("position");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onCreateView()", Toast.LENGTH_SHORT).show();

        // Finds view in the view hierarchy and returns it.
        return inflater.inflate(R.layout.fragment_detail, container, false);

    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        Toast.makeText(getActivity(), "DetailFragment.onActivityCreated()", Toast.LENGTH_SHORT).show();

        if (savedInstanceState != null) {
            position = savedInstanceState.getInt("position", 0);
        }

        ImageView ivImage= (ImageView) getView().findViewById(R.id.iv_image);
        InputStream is =null;
        try {
            is = getActivity().getAssets().open(GlumacProvider.getGlumacById(position).getFotografija());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
        TextView tvName = (TextView) getView().findViewById(R.id.tv_name);
        tvName.setText(GlumacProvider.getGlumacById(position).getIme());


        TextView tvDescription = (TextView) getView().findViewById(R.id.tv_prezime);
        tvDescription.setText(GlumacProvider.getGlumacById(position).getPrezime());

        TextView kaloriskVr= (TextView) getView().findViewById(R.id.tv_biografija);
        String kaloStr =GlumacProvider.getGlumacById(position).getBiografija();
        kaloriskVr.setText(kaloStr);

        TextView datumRodjenja= (TextView) getView().findViewById(R.id.tv_datum_rodjenja);
        String cenaStr = String.valueOf(GlumacProvider.getGlumacById(position).getDatumRodjenja());
        datumRodjenja.setText(cenaStr);

        TextView datumSmrti= (TextView) getView().findViewById(R.id.tv_datum_smrti);
        String cenasStr = String.valueOf(GlumacProvider.getGlumacById(position).getDatumSmrti());
        datumSmrti.setText(cenasStr);

        RatingBar rbRating = (RatingBar) getView().findViewById(R.id.rb_rating);
        rbRating.setRating(GlumacProvider.getGlumacById(position).getRating());


        Spinner category = (Spinner) getView().findViewById(R.id.sp_Filmovi);
        List<String> filmoviNames = FilmoviProvider.getFilmNames();
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, filmoviNames);
        category.setAdapter(adapter);
        category.setSelection((int)GlumacProvider.getGlumacById(position).getFilmovi().getId();
//
}
    @Override
    public void onStart() {
        super.onStart();

        Toast.makeText(getActivity(), "DetailFragment.onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();

        Toast.makeText(getActivity(), "DetailFragment.onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();

        Toast.makeText(getActivity(), "DetailFragment.onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();

        Toast.makeText(getActivity(), "DetailFragment.onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();

        Toast.makeText(getActivity(), "DetailFragment.onDestroyView()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Toast.makeText(getActivity(), "DetailFragment.onDestroy()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();

        Toast.makeText(getActivity(), "DetailFragment.onDetach()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        super.onSaveInstanceState(savedInstanceState);

        Toast.makeText(getActivity(), "DetailFragment.onSaveInstanceState()", Toast.LENGTH_SHORT).show();

        savedInstanceState.putInt("position", position);
    }
    public void setContent(final int position) {

        this.position = position;

        Log.v("DetailFragment", "setContent() sets position to " + position);
    }

    // Called to update fragment's content.
    public void updateContent(final int position) {

        this.position = position;

        Log.v("DetailFragment", "updateContent() sets position to " + position);

    // Finds "tvName" TextView and sets "text" property
    ImageView ivImage= (ImageView) getView().findViewById(R.id.iv_image);
    InputStream is =null;
        try {
        is = getActivity().getAssets().open(GlumacProvider.getGlumacById(position).getFotografija());
        Drawable drawable = Drawable.createFromStream(is, null);
        ivImage.setImageDrawable(drawable);
    } catch (IOException e) {
        e.printStackTrace();
    }
    TextView tvName = (TextView) getView().findViewById(R.id.tv_name);
        tvName.setText(GlumacProvider.getGlumacById(position).getIme());


    // Finds "tvDescription" TextView and sets "text" property
    TextView tvDescription = (TextView) getView().findViewById(R.id.tv_prezime);
        tvDescription.setText(GlumacProvider.getGlumacById(position).getPrezime());

    TextView kaloriskVr= (TextView) getView().findViewById(R.id.tv_biografija);
    String kaloStr =GlumacProvider.getGlumacById(position).getBiografija();
        kaloriskVr.setText(kaloStr);

    TextView cena= (TextView) getView().findViewById(R.id.tv_datum_rodjenja);
    String cenaStr = String.valueOf(GlumacProvider.getGlumacById(position).getDatumRodjenja());
        cena.setText(cenaStr);

    TextView cena1= (TextView) getView().findViewById(R.id.tv_datum_rodjenja);
    String cenasStr = String.valueOf(GlumacProvider.getGlumacById(position).getDatumRodjenja());
        cena1.setText(cenasStr);

    // Finds "rbRating" RatingBar and sets "rating" property
    RatingBar rbRating = (RatingBar) getView().findViewById(R.id.rb_rating);
        rbRating.setRating(GlumacProvider.getGlumacById(position).getRating());


    // Finds "spCategory" Spiner and sets "selection" property
    Spinner category = (Spinner) getView().findViewById(R.id.sp_Filmovi);
    List<String> filmoviNames = FilmoviProvider.getFilmNames();
    ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, filmoviNames);
        category.setAdapter(adapter);
        category.setSelection((int)GlumacProvider.getGlumacById(position).getFilmovi().getId();
    }
}