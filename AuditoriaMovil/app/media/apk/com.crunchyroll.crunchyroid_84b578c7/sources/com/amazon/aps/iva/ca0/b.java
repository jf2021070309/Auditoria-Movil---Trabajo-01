package com.amazon.aps.iva.ca0;

import com.amazon.aps.iva.da0.i;
import com.amazon.aps.iva.da0.q;
import com.amazon.aps.iva.da0.r;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fa0.n;
import com.amazon.aps.iva.ga0.k;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
public final class b extends com.amazon.aps.iva.da0.c {
    public final k d;
    public final com.amazon.aps.iva.ga0.f e;
    public c f;
    public int g;
    public final com.amazon.aps.iva.ha0.d h;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            try {
                iArr[e.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(d dVar) {
        k kVar = new k();
        this.d = kVar;
        this.e = new com.amazon.aps.iva.ga0.f();
        this.g = 0;
        this.h = new com.amazon.aps.iva.ha0.d(dVar);
        String w = f1.w();
        if (w != null) {
            kVar.b("pinid", w);
        }
    }

    @Override // com.amazon.aps.iva.da0.c, com.amazon.aps.iva.da0.f
    public final synchronized void a(com.amazon.aps.iva.da0.e eVar) {
        if (eVar.t()) {
            r rVar = (r) eVar;
            k kVar = this.d;
            k kVar2 = new k();
            kVar2.e(rVar.h);
            kVar.e(kVar2);
            k kVar3 = this.d;
            int i = this.g + 1;
            this.g = i;
            Integer valueOf = Integer.valueOf(i);
            kVar3.getClass();
            if (valueOf != null) {
                kVar3.b("psqno", valueOf.toString());
            }
            k kVar4 = this.d;
            k kVar5 = new k();
            kVar5.e(kVar4);
            rVar.B(kVar5);
            rVar.h = kVar5;
            com.amazon.aps.iva.ga0.f fVar = this.e;
            com.amazon.aps.iva.ga0.f fVar2 = new com.amazon.aps.iva.ga0.f();
            fVar2.e(fVar);
            rVar.B(fVar2);
            rVar.i = fVar2;
            super.a(eVar);
        } else if (eVar.u()) {
            super.a(eVar);
        } else {
            if (eVar.w() || eVar.s()) {
                if (eVar.x()) {
                    com.amazon.aps.iva.ga0.f fVar3 = ((q) eVar).f;
                    com.amazon.aps.iva.ga0.f fVar4 = this.e;
                    Objects.requireNonNull(fVar4);
                    if (fVar3 != null) {
                        fVar4.e(fVar3);
                    }
                } else if (eVar.w()) {
                    n nVar = (n) eVar;
                    this.d.e(nVar.d());
                    if (Objects.equals(nVar.getType(), "viewinit")) {
                        c cVar = this.f;
                        if (cVar != null) {
                            cVar.b = new ConcurrentHashMap<>();
                            cVar.c = new HashSet<>();
                        }
                        c cVar2 = new c();
                        this.f = cVar2;
                        cVar2.b(new i(this));
                        this.d.b("percd", null);
                        this.d.b("perme", null);
                    }
                } else {
                    this.e.e(((com.amazon.aps.iva.ea0.a) eVar).g);
                }
                c cVar3 = this.f;
                if (cVar3 != null) {
                    cVar3.a(eVar);
                }
            }
        }
    }
}
