package com.amazon.aps.iva.xd;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.crunchyroll.crunchyroid.R;
import com.ellation.widgets.input.InputUnderlineView;
import com.ellation.widgets.seekbar.EasySeekSeekBar;
/* compiled from: ItemOtpTextBinding.java */
/* loaded from: classes.dex */
public final class c implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a = 1;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;

    public c(RelativeLayout relativeLayout, TextView textView, RelativeLayout relativeLayout2, EasySeekSeekBar easySeekSeekBar, TextView textView2) {
        this.b = relativeLayout;
        this.c = textView;
        this.d = relativeLayout2;
        this.e = easySeekSeekBar;
        this.f = textView2;
    }

    public static c a(View view) {
        int i = R.id.item_otp_text_background;
        ImageView imageView = (ImageView) z.u(R.id.item_otp_text_background, view);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.item_otp_text_input;
            EditText editText = (EditText) z.u(R.id.item_otp_text_input, view);
            if (editText != null) {
                i = R.id.item_otp_text_underline;
                InputUnderlineView inputUnderlineView = (InputUnderlineView) z.u(R.id.item_otp_text_underline, view);
                if (inputUnderlineView != null) {
                    return new c(constraintLayout, imageView, constraintLayout, editText, inputUnderlineView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                return (ConstraintLayout) viewGroup;
            default:
                return (RelativeLayout) viewGroup;
        }
    }

    public c(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, EditText editText, InputUnderlineView inputUnderlineView) {
        this.b = constraintLayout;
        this.d = imageView;
        this.c = constraintLayout2;
        this.e = editText;
        this.f = inputUnderlineView;
    }
}
