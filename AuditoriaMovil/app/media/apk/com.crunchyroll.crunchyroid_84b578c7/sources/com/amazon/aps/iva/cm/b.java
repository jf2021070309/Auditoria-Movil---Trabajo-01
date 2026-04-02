package com.amazon.aps.iva.cm;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.pu.f;
import com.crunchyroll.profiles.presentation.profileactivation.username.UsernameInputView;
import com.ellation.widgets.input.CenterErrorTextInputLayout;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
/* compiled from: ActivityProfileActivationV2Binding.java */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final DataInputButton c;
    public final ImageView d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final UsernameInputView g;
    public final CenterErrorTextInputLayout h;
    public final f i;
    public final TextView j;

    public b(ConstraintLayout constraintLayout, ImageView imageView, DataInputButton dataInputButton, ImageView imageView2, FrameLayout frameLayout, FrameLayout frameLayout2, UsernameInputView usernameInputView, CenterErrorTextInputLayout centerErrorTextInputLayout, f fVar, TextView textView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = dataInputButton;
        this.d = imageView2;
        this.e = frameLayout;
        this.f = frameLayout2;
        this.g = usernameInputView;
        this.h = centerErrorTextInputLayout;
        this.i = fVar;
        this.j = textView;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
