package com.ellation.crunchyroll.cast.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amazon.aps.iva.d9.a;
import com.ellation.crunchyroll.cast.R;
/* loaded from: classes2.dex */
public final class FragmentCastMiniControllerBinding implements a {
    private final FrameLayout rootView;

    private FragmentCastMiniControllerBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    public static FragmentCastMiniControllerBinding bind(View view) {
        if (view != null) {
            return new FragmentCastMiniControllerBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static FragmentCastMiniControllerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCastMiniControllerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_cast_mini_controller, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // com.amazon.aps.iva.d9.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
