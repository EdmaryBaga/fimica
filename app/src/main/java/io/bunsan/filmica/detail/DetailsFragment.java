package io.bunsan.filmica.detail;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import io.bunsan.filmica.R;

public class DetailsFragment extends Fragment {

    private OnFragmentClickListener listener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_details, container, false);
    }

    public void setOnClickListener(OnFragmentClickListener listener) {
        this.listener = listener;
    }

    public interface OnFragmentClickListener {
        void onClick();
    }
}
