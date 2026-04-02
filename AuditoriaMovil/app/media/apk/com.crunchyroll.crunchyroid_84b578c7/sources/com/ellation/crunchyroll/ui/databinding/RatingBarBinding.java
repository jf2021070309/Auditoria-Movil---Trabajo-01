package com.ellation.crunchyroll.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.e.z;
import com.ellation.crunchyroll.ui.R;
/* loaded from: classes2.dex */
public final class RatingBarBinding implements a {
    private final ConstraintLayout rootView;
    public final ImageView star1;
    public final ImageView star2;
    public final ImageView star3;
    public final ImageView star4;
    public final ImageView star5;

    private RatingBarBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5) {
        this.rootView = constraintLayout;
        this.star1 = imageView;
        this.star2 = imageView2;
        this.star3 = imageView3;
        this.star4 = imageView4;
        this.star5 = imageView5;
    }

    public static RatingBarBinding bind(View view) {
        int i = R.id.star_1;
        ImageView imageView = (ImageView) z.u(i, view);
        if (imageView != null) {
            i = R.id.star_2;
            ImageView imageView2 = (ImageView) z.u(i, view);
            if (imageView2 != null) {
                i = R.id.star_3;
                ImageView imageView3 = (ImageView) z.u(i, view);
                if (imageView3 != null) {
                    i = R.id.star_4;
                    ImageView imageView4 = (ImageView) z.u(i, view);
                    if (imageView4 != null) {
                        i = R.id.star_5;
                        ImageView imageView5 = (ImageView) z.u(i, view);
                        if (imageView5 != null) {
                            return new RatingBarBinding((ConstraintLayout) view, imageView, imageView2, imageView3, imageView4, imageView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static RatingBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RatingBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.rating_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // com.amazon.aps.iva.d9.a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
