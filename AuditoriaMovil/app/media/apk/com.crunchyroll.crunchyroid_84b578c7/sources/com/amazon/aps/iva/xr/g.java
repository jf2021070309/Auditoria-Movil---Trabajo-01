package com.amazon.aps.iva.xr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: HttpCodec.java */
/* loaded from: classes2.dex */
public final class g {

    /* compiled from: HttpCodec.java */
    /* loaded from: classes2.dex */
    public static class a implements c {
        public final List<c> a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.amazon.aps.iva.xr.g.c
        public final com.amazon.aps.iva.fb0.c b(com.amazon.aps.iva.hb0.a aVar) {
            Iterator<c> it = this.a.iterator();
            com.amazon.aps.iva.fb0.c cVar = null;
            while (it.hasNext() && ((cVar = it.next().b(aVar)) == null || !(cVar instanceof com.amazon.aps.iva.xr.d))) {
            }
            return cVar;
        }
    }

    /* compiled from: HttpCodec.java */
    /* loaded from: classes2.dex */
    public static class b implements d {
        public final List<d> a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.amazon.aps.iva.xr.g.d
        public final void a(com.amazon.aps.iva.ur.b bVar, com.amazon.aps.iva.kr.c cVar) {
            for (d dVar : this.a) {
                dVar.a(bVar, cVar);
            }
        }
    }

    /* compiled from: HttpCodec.java */
    /* loaded from: classes2.dex */
    public interface c {
        com.amazon.aps.iva.fb0.c b(com.amazon.aps.iva.hb0.a aVar);
    }

    /* compiled from: HttpCodec.java */
    /* loaded from: classes2.dex */
    public interface d {
        void a(com.amazon.aps.iva.ur.b bVar, com.amazon.aps.iva.kr.c cVar);
    }

    public static com.amazon.aps.iva.ur.f a(int i, String str) throws IllegalArgumentException {
        com.amazon.aps.iva.ur.f fVar = new com.amazon.aps.iva.ur.f(str, i);
        if (fVar.compareTo(com.amazon.aps.iva.ur.c.q) >= 0 && fVar.compareTo(com.amazon.aps.iva.ur.c.p) <= 0) {
            return fVar;
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.oa.a.a("ID out of range, must be between 0 and 2^64-1, got: ", str));
    }
}
