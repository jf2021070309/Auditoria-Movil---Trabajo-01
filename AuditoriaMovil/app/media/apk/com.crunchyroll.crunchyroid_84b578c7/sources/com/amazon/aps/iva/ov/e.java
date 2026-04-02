package com.amazon.aps.iva.ov;

import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.widgets.characterlimit.CharacterLimitTextView;
/* compiled from: FragmentModifyCrunchylistBinding.java */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final ScrollView b;
    public final CharacterLimitTextView c;
    public final EditText d;
    public final TextView e;
    public final com.amazon.aps.iva.pu.f f;
    public final com.amazon.aps.iva.uu.a g;

    public e(ConstraintLayout constraintLayout, ScrollView scrollView, CharacterLimitTextView characterLimitTextView, EditText editText, TextView textView, com.amazon.aps.iva.pu.f fVar, com.amazon.aps.iva.uu.a aVar) {
        this.a = constraintLayout;
        this.b = scrollView;
        this.c = characterLimitTextView;
        this.d = editText;
        this.e = textView;
        this.f = fVar;
        this.g = aVar;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
