package shaolizhi.shaolizhigraduationdesign.view;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import shaolizhi.shaolizhigraduationdesign.R;

/**
 * Created by shaol on 2017/4/7.
 */

public class CView extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View rootView = inflater.inflate(R.layout.c_fragment, viewGroup, false);

        return rootView;
    }
}