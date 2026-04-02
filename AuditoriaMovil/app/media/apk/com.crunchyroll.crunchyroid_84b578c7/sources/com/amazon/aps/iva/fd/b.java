package com.amazon.aps.iva.fd;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.amazon.aps.iva.fd.d;
/* compiled from: DrawableCrossFadeTransition.java */
/* loaded from: classes.dex */
public final class b implements d<Drawable> {
    public final int a;
    public final boolean b;

    public b(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // com.amazon.aps.iva.fd.d
    public final boolean a(Drawable drawable, d.a aVar) {
        Drawable drawable2 = drawable;
        Drawable currentDrawable = aVar.getCurrentDrawable();
        if (currentDrawable == null) {
            currentDrawable = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{currentDrawable, drawable2});
        transitionDrawable.setCrossFadeEnabled(this.b);
        transitionDrawable.startTransition(this.a);
        aVar.setDrawable(transitionDrawable);
        return true;
    }
}
