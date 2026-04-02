package com.amazon.aps.iva.v1;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: InspectableValue.kt */
/* loaded from: classes.dex */
public final class p2 implements com.amazon.aps.iva.ne0.h<o2> {
    public final ArrayList a = new ArrayList();

    public final void b(Object obj, String str) {
        this.a.add(new o2(str, obj));
    }

    @Override // com.amazon.aps.iva.ne0.h
    public final Iterator<o2> iterator() {
        return this.a.iterator();
    }
}
