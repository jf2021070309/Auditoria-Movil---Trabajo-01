package com.amazon.aps.iva.q3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {
    public final int a;
    public final l b;
    public final int c;

    public a(int i, l lVar, int i2) {
        this.a = i;
        this.b = lVar;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}
