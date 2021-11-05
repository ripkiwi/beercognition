package org.tensorflow.lite.examples.classification.ui.details;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DetailsViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public DetailsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the details fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}