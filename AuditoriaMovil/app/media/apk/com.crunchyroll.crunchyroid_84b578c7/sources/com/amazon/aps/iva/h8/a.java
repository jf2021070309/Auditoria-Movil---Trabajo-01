package com.amazon.aps.iva.h8;

import androidx.lifecycle.p;
import com.amazon.aps.iva.i5.f0;
import java.lang.ref.WeakReference;
import java.util.UUID;
/* compiled from: NavBackStackEntryProvider.kt */
/* loaded from: classes.dex */
public final class a extends f0 {
    public final UUID b;
    public WeakReference<com.amazon.aps.iva.x0.e> c;

    public a(p pVar) {
        UUID uuid = (UUID) pVar.b("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            pVar.d(uuid, "SaveableStateHolder_BackStackEntryKey");
        }
        this.b = uuid;
    }

    @Override // com.amazon.aps.iva.i5.f0
    public final void onCleared() {
        super.onCleared();
        WeakReference<com.amazon.aps.iva.x0.e> weakReference = this.c;
        if (weakReference != null) {
            com.amazon.aps.iva.x0.e eVar = weakReference.get();
            if (eVar != null) {
                eVar.c(this.b);
            }
            WeakReference<com.amazon.aps.iva.x0.e> weakReference2 = this.c;
            if (weakReference2 != null) {
                weakReference2.clear();
                return;
            } else {
                com.amazon.aps.iva.yb0.j.m("saveableStateHolderRef");
                throw null;
            }
        }
        com.amazon.aps.iva.yb0.j.m("saveableStateHolderRef");
        throw null;
    }
}
