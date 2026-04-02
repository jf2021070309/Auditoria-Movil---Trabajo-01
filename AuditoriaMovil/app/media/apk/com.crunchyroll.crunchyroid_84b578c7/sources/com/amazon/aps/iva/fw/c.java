package com.amazon.aps.iva.fw;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ew.i;
import com.amazon.aps.iva.ew.j;
import com.amazon.aps.iva.fg.d;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.m6.m;
import com.amazon.aps.iva.ob0.h;
import com.amazon.aps.iva.sv.q1;
import com.ellation.crunchyroll.downloading.e0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: KalturaDownloadsProvider.kt */
/* loaded from: classes2.dex */
public final class c implements q1 {
    public final com.amazon.aps.iva.gw.a a;
    public final i b;
    public final a c = a.h;

    public c(com.amazon.aps.iva.gw.a aVar, j jVar) {
        this.a = aVar;
        this.b = jVar;
    }

    @Override // com.amazon.aps.iva.sv.q1
    @SuppressLint({"UnsafeOptInUsageError"})
    public final ArrayList a(int... iArr) {
        com.amazon.aps.iva.yb0.j.f(iArr, "states");
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i == 3) {
                arrayList.add(com.amazon.aps.iva.hw.c.COMPLETED);
            }
        }
        List<com.amazon.aps.iva.hw.a> b = this.a.b(arrayList);
        ArrayList arrayList2 = new ArrayList(r.Y(b));
        for (com.amazon.aps.iva.hw.a aVar : b) {
            arrayList2.add(com.amazon.aps.iva.hw.b.a(aVar));
        }
        return arrayList2;
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final e0 b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        com.amazon.aps.iva.hw.a e = this.a.e(str);
        if (e != null) {
            return com.amazon.aps.iva.hw.b.a(e);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final void c(String str, com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.xb0.a<q> aVar2) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        com.amazon.aps.iva.yb0.j.f(aVar, "onNoItemFound");
        com.amazon.aps.iva.yb0.j.f(aVar2, "onRemoved");
        if (b(str) == null) {
            aVar.invoke();
            return;
        }
        this.a.c(str);
        aVar2.invoke();
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final ArrayList d() {
        List<com.amazon.aps.iva.hw.a> b = this.a.b(f1.K(com.amazon.aps.iva.hw.c.NEW, com.amazon.aps.iva.hw.c.INFO_LOADED, com.amazon.aps.iva.hw.c.IN_PROGRESS, com.amazon.aps.iva.hw.c.COMPLETED));
        ArrayList arrayList = new ArrayList(r.Y(b));
        for (com.amazon.aps.iva.hw.a aVar : b) {
            arrayList.add(com.amazon.aps.iva.hw.b.a(aVar));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final com.amazon.aps.iva.fg.d e(String str) {
        boolean z;
        Object e;
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        com.amazon.aps.iva.hw.a e2 = this.a.e(str);
        File file = null;
        if (e2 == null) {
            return null;
        }
        e0.c a = com.amazon.aps.iva.hw.b.a(e2);
        boolean z2 = false;
        if (a.i() && !a.j()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            e = com.amazon.aps.iva.se0.i.e(h.b, new b(this, str, null));
            if (!((Boolean) e).booleanValue()) {
                z2 = true;
            }
        }
        String str2 = e2.f;
        if (str2 != null) {
            file = new File(e2.g, str2);
        }
        return new d.b(file, z2);
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final void f(com.amazon.aps.iva.m6.c cVar, m mVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "download");
        com.amazon.aps.iva.yb0.j.f(mVar, "newDownloadRequest");
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final com.amazon.aps.iva.m6.c g(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        return null;
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final com.amazon.aps.iva.xb0.a<List<e0>> h() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final void r() {
        Iterator it = d().iterator();
        while (it.hasNext()) {
            this.a.c(((e0) it.next()).e());
        }
    }
}
