package com.amazon.aps.iva.i2;

import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
/* compiled from: InputMethodManager.kt */
/* loaded from: classes.dex */
public final class p implements n {
    public final View a;
    public final com.amazon.aps.iva.kb0.e b;
    public final com.amazon.aps.iva.y1.c c;

    public p(AndroidComposeView androidComposeView) {
        com.amazon.aps.iva.yb0.j.f(androidComposeView, "view");
        this.a = androidComposeView;
        this.b = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.NONE, new o(this));
        this.c = new com.amazon.aps.iva.y1.c(androidComposeView);
    }

    @Override // com.amazon.aps.iva.i2.n
    public final void a(int i, ExtractedText extractedText) {
        ((InputMethodManager) this.b.getValue()).updateExtractedText(this.a, i, extractedText);
    }

    @Override // com.amazon.aps.iva.i2.n
    public final void b() {
        this.c.a.b();
    }

    @Override // com.amazon.aps.iva.i2.n
    public final void c(int i, int i2, int i3, int i4) {
        ((InputMethodManager) this.b.getValue()).updateSelection(this.a, i, i2, i3, i4);
    }

    @Override // com.amazon.aps.iva.i2.n
    public final void d() {
        ((InputMethodManager) this.b.getValue()).restartInput(this.a);
    }

    @Override // com.amazon.aps.iva.i2.n
    public final void e() {
        this.c.a.a();
    }
}
