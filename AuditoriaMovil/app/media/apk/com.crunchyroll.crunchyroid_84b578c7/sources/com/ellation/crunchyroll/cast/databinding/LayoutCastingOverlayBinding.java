package com.ellation.crunchyroll.cast.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.e.z;
import com.ellation.crunchyroll.cast.R;
import com.ellation.crunchyroll.cast.overlay.toolbar.CastOverlayToolbarLayout;
import com.ellation.widgets.FixedAspectRatioImageView;
/* loaded from: classes2.dex */
public final class LayoutCastingOverlayBinding implements a {
    public final TextView castOverlayTitle;
    public final CastOverlayToolbarLayout castOverlayToolbar;
    public final FixedAspectRatioImageView castVideoPreviewImage;
    private final RelativeLayout rootView;

    private LayoutCastingOverlayBinding(RelativeLayout relativeLayout, TextView textView, CastOverlayToolbarLayout castOverlayToolbarLayout, FixedAspectRatioImageView fixedAspectRatioImageView) {
        this.rootView = relativeLayout;
        this.castOverlayTitle = textView;
        this.castOverlayToolbar = castOverlayToolbarLayout;
        this.castVideoPreviewImage = fixedAspectRatioImageView;
    }

    public static LayoutCastingOverlayBinding bind(View view) {
        int i = R.id.cast_overlay_title;
        TextView textView = (TextView) z.u(i, view);
        if (textView != null) {
            i = R.id.cast_overlay_toolbar;
            CastOverlayToolbarLayout castOverlayToolbarLayout = (CastOverlayToolbarLayout) z.u(i, view);
            if (castOverlayToolbarLayout != null) {
                i = R.id.cast_video_preview_image;
                FixedAspectRatioImageView fixedAspectRatioImageView = (FixedAspectRatioImageView) z.u(i, view);
                if (fixedAspectRatioImageView != null) {
                    return new LayoutCastingOverlayBinding((RelativeLayout) view, textView, castOverlayToolbarLayout, fixedAspectRatioImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LayoutCastingOverlayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutCastingOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_casting_overlay, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // com.amazon.aps.iva.d9.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
