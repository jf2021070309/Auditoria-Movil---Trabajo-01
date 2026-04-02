package com.amazon.aps.iva.p3;

import android.view.View;
import com.amazon.aps.iva.p3.g0;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public final class f0 extends g0.b<Boolean> {
    public f0() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    @Override // com.amazon.aps.iva.p3.g0.b
    public final Boolean b(View view) {
        return Boolean.valueOf(g0.m.c(view));
    }

    @Override // com.amazon.aps.iva.p3.g0.b
    public final void c(View view, Boolean bool) {
        g0.m.g(view, bool.booleanValue());
    }

    @Override // com.amazon.aps.iva.p3.g0.b
    public final boolean f(Boolean bool, Boolean bool2) {
        return !g0.b.a(bool, bool2);
    }
}
