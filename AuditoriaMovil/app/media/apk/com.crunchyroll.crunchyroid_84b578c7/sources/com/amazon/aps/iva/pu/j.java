package com.amazon.aps.iva.pu;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.widgets.characterlimit.CharacterLimitTextView;
import com.ellation.widgets.input.InputUnderlineView;
import com.google.android.material.textfield.TextInputEditText;
/* compiled from: LayoutCommentsInputViewBinding.java */
/* loaded from: classes2.dex */
public final class j implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final CharacterLimitTextView c;
    public final CheckBox d;
    public final ImageView e;
    public final ProgressBar f;
    public final TextInputEditText g;
    public final ConstraintLayout h;

    public j(ConstraintLayout constraintLayout, ImageView imageView, CharacterLimitTextView characterLimitTextView, CheckBox checkBox, ImageView imageView2, ProgressBar progressBar, TextInputEditText textInputEditText, InputUnderlineView inputUnderlineView, ConstraintLayout constraintLayout2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = characterLimitTextView;
        this.d = checkBox;
        this.e = imageView2;
        this.f = progressBar;
        this.g = textInputEditText;
        this.h = constraintLayout2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
