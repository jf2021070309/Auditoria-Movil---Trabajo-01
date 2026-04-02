package com.amazon.aps.iva.p0;

import android.content.Context;
import android.content.res.Resources;
import com.amazon.aps.iva.e6.i;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.f1.g;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.me0.a;
import com.amazon.aps.iva.nc.w;
import com.amazon.aps.iva.nc0.k;
import com.amazon.aps.iva.oc0.h;
import com.amazon.aps.iva.uc.v;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
/* compiled from: ActualIntMap.android.kt */
/* loaded from: classes.dex */
public final class e implements com.amazon.aps.iva.d6.d, com.amazon.aps.iva.zc.c, a.c {
    public final Object b;

    public /* synthetic */ e(Object obj) {
        this.b = obj;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long a(long j) {
        return 0L;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long c(long j, long j2) {
        return 0L;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long d(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final i e(long j) {
        return (i) this.b;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long f(long j, long j2) {
        return 0L;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long g(long j) {
        return 1L;
    }

    @Override // com.amazon.aps.iva.me0.a.c
    public final Iterable h(Object obj) {
        h hVar;
        com.amazon.aps.iva.oc0.e eVar;
        k kVar = (k) this.b;
        l<Object>[] lVarArr = k.h;
        j.f(kVar, "this$0");
        Collection<e0> g = ((com.amazon.aps.iva.oc0.e) obj).h().g();
        j.e(g, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        for (e0 e0Var : g) {
            h k = e0Var.I0().k();
            com.amazon.aps.iva.bd0.e eVar2 = null;
            if (k != null) {
                hVar = k.a();
            } else {
                hVar = null;
            }
            if (hVar instanceof com.amazon.aps.iva.oc0.e) {
                eVar = (com.amazon.aps.iva.oc0.e) hVar;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                eVar2 = kVar.f(eVar);
            }
            if (eVar2 != null) {
                arrayList.add(eVar2);
            }
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.zc.c
    public final w i(w wVar, com.amazon.aps.iva.kc.h hVar) {
        Resources resources = (Resources) this.b;
        if (wVar == null) {
            return null;
        }
        return new v(resources, wVar);
    }

    @Override // com.amazon.aps.iva.d6.d
    public final boolean j() {
        return true;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long k() {
        return 0L;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long l(long j, long j2) {
        return 1L;
    }

    public final g m() {
        return (g) this.b;
    }

    public final float n(Object obj, String str) {
        HashMap hashMap;
        float[] fArr;
        HashMap hashMap2 = (HashMap) this.b;
        if (!hashMap2.containsKey(obj) || (hashMap = (HashMap) hashMap2.get(obj)) == null || !hashMap.containsKey(str) || (fArr = (float[]) hashMap.get(str)) == null || fArr.length <= 0) {
            return Float.NaN;
        }
        return fArr[0];
    }

    public e(com.amazon.aps.iva.yj.a aVar) {
        this.b = aVar;
    }

    public e(Context context) {
        this.b = context;
    }

    public e(com.amazon.aps.iva.zj.e eVar) {
        this.b = eVar;
    }

    public e(Resources resources) {
        this.b = resources;
    }

    public e(int i) {
        if (i == 2) {
            this.b = new HashMap();
        } else if (i != 7) {
            this.b = new g();
        } else {
            this.b = new ArrayList();
        }
    }

    public e(com.amazon.aps.iva.ja0.a aVar) {
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long b(long j, long j2) {
        return j2;
    }
}
