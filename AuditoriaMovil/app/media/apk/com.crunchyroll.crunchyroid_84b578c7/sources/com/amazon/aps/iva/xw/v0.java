package com.amazon.aps.iva.xw;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* compiled from: ViewGroupExtensions.kt */
/* loaded from: classes2.dex */
public final class v0 implements Iterable<View>, com.amazon.aps.iva.zb0.a {
    public final /* synthetic */ ViewGroup b;

    public v0(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // java.lang.Iterable
    public final Iterator<View> iterator() {
        return new u0(this.b);
    }
}
