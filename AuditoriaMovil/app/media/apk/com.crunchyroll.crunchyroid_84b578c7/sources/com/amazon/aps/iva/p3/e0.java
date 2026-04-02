package com.amazon.aps.iva.p3;

import android.text.TextUtils;
import android.view.View;
import com.amazon.aps.iva.p3.g0;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public final class e0 extends g0.b<CharSequence> {
    public e0() {
        super(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    @Override // com.amazon.aps.iva.p3.g0.b
    public final CharSequence b(View view) {
        return g0.o.b(view);
    }

    @Override // com.amazon.aps.iva.p3.g0.b
    public final void c(View view, CharSequence charSequence) {
        g0.o.f(view, charSequence);
    }

    @Override // com.amazon.aps.iva.p3.g0.b
    public final boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
