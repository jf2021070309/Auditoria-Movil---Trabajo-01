package com.amazon.aps.iva.v60;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.crunchyroll.crunchyroid.R;
/* compiled from: LayoutCancellationRescueDialogBinding.java */
/* loaded from: classes2.dex */
public final class h implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;

    public h(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
    }

    public static h a(View view) {
        int i = R.id.dialog_close_button;
        ImageView imageView = (ImageView) z.u(R.id.dialog_close_button, view);
        if (imageView != null) {
            i = R.id.dialog_cta;
            TextView textView = (TextView) z.u(R.id.dialog_cta, view);
            if (textView != null) {
                i = R.id.dialog_option_history_checkmark;
                if (((ImageView) z.u(R.id.dialog_option_history_checkmark, view)) != null) {
                    i = R.id.dialog_option_history_text;
                    if (((TextView) z.u(R.id.dialog_option_history_text, view)) != null) {
                        i = R.id.dialog_option_pause_checkmark;
                        if (((ImageView) z.u(R.id.dialog_option_pause_checkmark, view)) != null) {
                            i = R.id.dialog_option_pause_text;
                            if (((TextView) z.u(R.id.dialog_option_pause_text, view)) != null) {
                                i = R.id.dialog_option_resume_checkmark;
                                if (((ImageView) z.u(R.id.dialog_option_resume_checkmark, view)) != null) {
                                    i = R.id.dialog_option_resume_text;
                                    if (((TextView) z.u(R.id.dialog_option_resume_text, view)) != null) {
                                        i = R.id.dialog_subtitle;
                                        if (((TextView) z.u(R.id.dialog_subtitle, view)) != null) {
                                            i = R.id.dialog_subtitle2;
                                            if (((TextView) z.u(R.id.dialog_subtitle2, view)) != null) {
                                                i = R.id.dialog_title;
                                                if (((TextView) z.u(R.id.dialog_title, view)) != null) {
                                                    return new h((ConstraintLayout) view, imageView, textView);
                                                }
                                            }
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

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
