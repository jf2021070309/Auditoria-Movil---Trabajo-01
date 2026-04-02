package com.ellation.crunchyroll.cast.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.e.z;
import com.ellation.crunchyroll.cast.R;
/* loaded from: classes2.dex */
public final class LayoutCastMiniContentStateBinding implements a {
    public final ImageView castMiniContentStateIcon;
    private final FrameLayout rootView;

    private LayoutCastMiniContentStateBinding(FrameLayout frameLayout, ImageView imageView) {
        this.rootView = frameLayout;
        this.castMiniContentStateIcon = imageView;
    }

    public static LayoutCastMiniContentStateBinding bind(View view) {
        int i = R.id.cast_mini_content_state_icon;
        ImageView imageView = (ImageView) z.u(i, view);
        if (imageView != null) {
            return new LayoutCastMiniContentStateBinding((FrameLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LayoutCastMiniContentStateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutCastMiniContentStateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_cast_mini_content_state, viewGroup, false);
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
