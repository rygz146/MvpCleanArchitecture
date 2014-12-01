package com.github.glomadrian.mvpcleanarchitecture.ui.activity;

import android.os.Bundle;
import android.os.Parcelable;

import com.github.glomadrian.mvpcleanarchitecture.R;
import com.github.glomadrian.mvpcleanarchitecture.app.BaseActivity;
import com.github.glomadrian.mvpcleanarchitecture.domain.model.MarvelCharacter;
import com.github.glomadrian.mvpcleanarchitecture.ui.fragment.CharacterInfoFragment;

import org.parceler.Parcels;

/**
 * @author glomadrian
 */
public class ModelInfoActivity extends BaseActivity {

<<<<<<< HEAD
    public static final String KEY_CHARACTER = "character";
=======
    public final static String KEY_CHARACTER = "character";
>>>>>>> 546c101c57264276a397087a22e9847094903ffc

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_info_activity);

        addInfoFragment();
    }

    public void addInfoFragment() {

        Parcelable marvelCharacterParcelable = getIntent().getExtras().getParcelable(KEY_CHARACTER);
        MarvelCharacter marvelCharacter = Parcels.unwrap(marvelCharacterParcelable);

        CharacterInfoFragment characterInfoFragment = CharacterInfoFragment.newInstance(marvelCharacter);

        getFragmentManager()
                .beginTransaction()
                .add(R.id.info_frame, characterInfoFragment)
                .commit();
    }

}
