package com.ellation.crunchyroll.cast.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.mediarouter.app.MediaRouteButton;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.e.z;
import com.ellation.crunchyroll.cast.R;
/* loaded from: classes2.dex */
public final class CastOverlayToolbarBinding implements a {
    public final ImageView buttonSettings;
    public final ImageView buttonSkipToNext;
    public final ImageView buttonToggleFullscreen;
    public final MediaRouteButton mediaRouteButton;
    private final ConstraintLayout rootView;
    public final ImageView toolbarBackButton;

    private CastOverlayToolbarBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, MediaRouteButton mediaRouteButton, ImageView imageView4) {
        this.rootView = constraintLayout;
        this.buttonSettings = imageView;
        this.buttonSkipToNext = imageView2;
        this.buttonToggleFullscreen = imageView3;
        this.mediaRouteButton = mediaRouteButton;
        this.toolbarBackButton = imageView4;
    }

    public static CastOverlayToolbarBinding bind(View view) {
        int i = R.id.button_settings;
        ImageView imageView = (ImageView) z.u(i, view);
        if (imageView != null) {
            i = R.id.button_skip_to_next;
            ImageView imageView2 = (ImageView) z.u(i, view);
            if (imageView2 != null) {
                i = R.id.button_toggle_fullscreen;
                ImageView imageView3 = (ImageView) z.u(i, view);
                if (imageView3 != null) {
                    i = R.id.media_route_button;
                    MediaRouteButton mediaRouteButton = (MediaRouteButton) z.u(i, view);
                    if (mediaRouteButton != null) {
                        i = R.id.toolbar_back_button;
                        ImageView imageView4 = (ImageView) z.u(i, view);
                        if (imageView4 != null) {
                            return new CastOverlayToolbarBinding((ConstraintLayout) view, imageView, imageView2, imageView3, mediaRouteButton, imageView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static CastOverlayToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CastOverlayToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.cast_overlay_toolbar, viewGroup, false);
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
