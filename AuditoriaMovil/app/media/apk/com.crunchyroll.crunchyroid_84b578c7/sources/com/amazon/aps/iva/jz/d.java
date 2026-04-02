package com.amazon.aps.iva.jz;

import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: ReloadableDataSource.kt */
/* loaded from: classes2.dex */
public final class d {
    public final LinkedHashSet a = new LinkedHashSet();

    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((com.amazon.aps.iva.xb0.a) it.next()).invoke();
            it.remove();
        }
    }
}
