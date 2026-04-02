package com.amazon.aps.iva.z3;

import java.io.File;
import java.util.LinkedHashSet;
/* compiled from: SingleProcessDataStore.kt */
/* loaded from: classes.dex */
public final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<File> {
    public final /* synthetic */ q<Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(q<Object> qVar) {
        super(0);
        this.h = qVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final File invoke() {
        File invoke = this.h.a.invoke();
        String absolutePath = invoke.getAbsolutePath();
        synchronized (q.l) {
            LinkedHashSet linkedHashSet = q.k;
            if (!linkedHashSet.contains(absolutePath)) {
                com.amazon.aps.iva.yb0.j.e(absolutePath, "it");
                linkedHashSet.add(absolutePath);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + invoke + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        return invoke;
    }
}
