package com.amazon.aps.iva.h40;

import com.amazon.aps.iva.fz.j;
import com.amazon.aps.iva.fz.k;
import com.amazon.aps.iva.fz.l;
import java.util.ArrayList;
import java.util.List;
/* compiled from: NotificationSettingsInteractor.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    public final j b;
    public final com.amazon.aps.iva.hz.a c;

    public d(k kVar, com.amazon.aps.iva.hz.b bVar) {
        this.b = kVar;
        this.c = bVar;
    }

    @Override // com.amazon.aps.iva.h40.c
    public final List<a> R() {
        boolean z;
        l[] values = l.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (l lVar : values) {
            if (this.b.l(lVar) && this.c.a()) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(new a(lVar, z));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.wy.j
    public final void cancelRunningApiCalls() {
    }

    @Override // com.amazon.aps.iva.h40.c
    public final boolean e(l lVar) {
        if (this.c.a()) {
            this.b.e(lVar);
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.h40.c
    public final void h(l lVar) {
        this.b.h(lVar);
    }

    @Override // com.amazon.aps.iva.h40.c
    public final void i() {
        this.b.i();
    }
}
