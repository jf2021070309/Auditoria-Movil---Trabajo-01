package com.amazon.aps.iva.u3;

import android.content.Context;
import android.view.LayoutInflater;
/* compiled from: ResourceCursorAdapter.java */
/* loaded from: classes.dex */
public abstract class c extends a {
    public final int i;
    public final int j;
    public final LayoutInflater k;

    @Deprecated
    public c(Context context, int i) {
        super(context);
        this.j = i;
        this.i = i;
        this.k = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
