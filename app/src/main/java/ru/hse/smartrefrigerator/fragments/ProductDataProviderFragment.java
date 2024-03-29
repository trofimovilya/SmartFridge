package ru.hse.smartrefrigerator.fragments;

/**
 * @author Ilya Trofimov
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import ru.hse.smartrefrigerator.controllers.ProductDataProvider;

public class ProductDataProviderFragment extends Fragment {
    private ProductDataProvider mDataProvider;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRetainInstance(true);  // keep the mDataProvider instance
        mDataProvider = new ProductDataProvider();
    }


    public ProductDataProvider getDataProvider() {
        return mDataProvider;
    }
}
