package com.amazon.aps.iva.q;

import android.graphics.Typeface;
import android.widget.TextView;
/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public final class e0 implements Runnable {
    public final /* synthetic */ TextView b;
    public final /* synthetic */ Typeface c;
    public final /* synthetic */ int d;

    public e0(TextView textView, Typeface typeface, int i) {
        this.b = textView;
        this.c = typeface;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.setTypeface(this.c, this.d);
    }
}
