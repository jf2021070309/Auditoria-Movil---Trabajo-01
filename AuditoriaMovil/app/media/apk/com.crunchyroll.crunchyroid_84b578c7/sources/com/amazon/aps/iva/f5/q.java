package com.amazon.aps.iva.f5;

import android.util.Property;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: Parallax.java */
/* loaded from: classes.dex */
public abstract class q<PropertyT extends Property> {
    public final ArrayList a;
    public final List<PropertyT> b;
    public final float[] c;
    public final ArrayList d;

    public q() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = Collections.unmodifiableList(arrayList);
        this.c = new float[4];
        this.d = new ArrayList(4);
    }
}
