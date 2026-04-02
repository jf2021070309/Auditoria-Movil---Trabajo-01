package com.ellation.crunchyroll.cast.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.e.z;
import com.ellation.crunchyroll.cast.R;
import com.ellation.crunchyroll.cast.mini.CastMiniContentStateLayout;
/* loaded from: classes2.dex */
public final class CastMiniControllerBinding implements a {
    public final ImageView button0;
    public final ImageView button1;
    public final ImageView button2;
    public final CastMiniContentStateLayout castMiniContentStateContainer;
    public final View center;
    public final LinearLayout containerAll;
    public final RelativeLayout containerCurrent;
    public final ImageView iconView;
    public final ProgressBar progressBar;
    private final LinearLayout rootView;
    public final TextView subtitleView;
    public final TextView titleView;

    private CastMiniControllerBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, CastMiniContentStateLayout castMiniContentStateLayout, View view, LinearLayout linearLayout2, RelativeLayout relativeLayout, ImageView imageView4, ProgressBar progressBar, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.button0 = imageView;
        this.button1 = imageView2;
        this.button2 = imageView3;
        this.castMiniContentStateContainer = castMiniContentStateLayout;
        this.center = view;
        this.containerAll = linearLayout2;
        this.containerCurrent = relativeLayout;
        this.iconView = imageView4;
        this.progressBar = progressBar;
        this.subtitleView = textView;
        this.titleView = textView2;
    }

    public static CastMiniControllerBinding bind(View view) {
        View u;
        int i = R.id.button_0;
        ImageView imageView = (ImageView) z.u(i, view);
        if (imageView != null) {
            i = R.id.button_1;
            ImageView imageView2 = (ImageView) z.u(i, view);
            if (imageView2 != null) {
                i = R.id.button_2;
                ImageView imageView3 = (ImageView) z.u(i, view);
                if (imageView3 != null) {
                    i = R.id.cast_mini_content_state_container;
                    CastMiniContentStateLayout castMiniContentStateLayout = (CastMiniContentStateLayout) z.u(i, view);
                    if (castMiniContentStateLayout != null && (u = z.u((i = R.id.center), view)) != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i = R.id.container_current;
                        RelativeLayout relativeLayout = (RelativeLayout) z.u(i, view);
                        if (relativeLayout != null) {
                            i = R.id.icon_view;
                            ImageView imageView4 = (ImageView) z.u(i, view);
                            if (imageView4 != null) {
                                i = R.id.progressBar;
                                ProgressBar progressBar = (ProgressBar) z.u(i, view);
                                if (progressBar != null) {
                                    i = R.id.subtitle_view;
                                    TextView textView = (TextView) z.u(i, view);
                                    if (textView != null) {
                                        i = R.id.title_view;
                                        TextView textView2 = (TextView) z.u(i, view);
                                        if (textView2 != null) {
                                            return new CastMiniControllerBinding(linearLayout, imageView, imageView2, imageView3, castMiniContentStateLayout, u, linearLayout, relativeLayout, imageView4, progressBar, textView, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static CastMiniControllerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CastMiniControllerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.cast_mini_controller, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // com.amazon.aps.iva.d9.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
