package com.ellation.crunchyroll.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.e.z;
import com.ellation.crunchyroll.ui.R;
/* loaded from: classes2.dex */
public final class LayoutSnackbarActionBinding implements a {
    private final ConstraintLayout rootView;
    public final TextView snackbarAction;
    public final ConstraintLayout snackbarConstraint;
    public final ImageView snackbarIcon;
    public final TextView snackbarText;

    private LayoutSnackbarActionBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView2) {
        this.rootView = constraintLayout;
        this.snackbarAction = textView;
        this.snackbarConstraint = constraintLayout2;
        this.snackbarIcon = imageView;
        this.snackbarText = textView2;
    }

    public static LayoutSnackbarActionBinding bind(View view) {
        int i = R.id.snackbar_action;
        TextView textView = (TextView) z.u(i, view);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.snackbar_icon;
            ImageView imageView = (ImageView) z.u(i, view);
            if (imageView != null) {
                i = R.id.snackbar_text;
                TextView textView2 = (TextView) z.u(i, view);
                if (textView2 != null) {
                    return new LayoutSnackbarActionBinding(constraintLayout, textView, constraintLayout, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LayoutSnackbarActionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutSnackbarActionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_snackbar_action, viewGroup, false);
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
