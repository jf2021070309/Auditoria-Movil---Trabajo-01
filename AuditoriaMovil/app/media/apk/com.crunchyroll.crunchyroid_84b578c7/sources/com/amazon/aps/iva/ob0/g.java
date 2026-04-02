package com.amazon.aps.iva.ob0;

import com.amazon.aps.iva.ob0.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CoroutineContext.kt */
/* loaded from: classes4.dex */
public interface g {

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* compiled from: CoroutineContext.kt */
        /* renamed from: com.amazon.aps.iva.ob0.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0567a extends l implements p<g, b, g> {
            public static final C0567a h = new C0567a();

            public C0567a() {
                super(2);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final g invoke(g gVar, b bVar) {
                com.amazon.aps.iva.ob0.c cVar;
                g gVar2 = gVar;
                b bVar2 = bVar;
                j.f(gVar2, "acc");
                j.f(bVar2, "element");
                g minusKey = gVar2.minusKey(bVar2.getKey());
                h hVar = h.b;
                if (minusKey != hVar) {
                    int i = e.h0;
                    e.a aVar = e.a.b;
                    e eVar = (e) minusKey.get(aVar);
                    if (eVar == null) {
                        cVar = new com.amazon.aps.iva.ob0.c(bVar2, minusKey);
                    } else {
                        g minusKey2 = minusKey.minusKey(aVar);
                        if (minusKey2 == hVar) {
                            return new com.amazon.aps.iva.ob0.c(eVar, bVar2);
                        }
                        cVar = new com.amazon.aps.iva.ob0.c(eVar, new com.amazon.aps.iva.ob0.c(bVar2, minusKey2));
                    }
                    return cVar;
                }
                return bVar2;
            }
        }

        public static g a(g gVar, g gVar2) {
            j.f(gVar2, "context");
            if (gVar2 != h.b) {
                return (g) gVar2.fold(gVar, C0567a.h);
            }
            return gVar;
        }
    }

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes4.dex */
    public interface b extends g {

        /* compiled from: CoroutineContext.kt */
        /* loaded from: classes4.dex */
        public static final class a {
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E a(b bVar, c<E> cVar) {
                j.f(cVar, "key");
                if (!j.a(bVar.getKey(), cVar)) {
                    return null;
                }
                return bVar;
            }

            public static g b(b bVar, c<?> cVar) {
                j.f(cVar, "key");
                if (j.a(bVar.getKey(), cVar)) {
                    return h.b;
                }
                return bVar;
            }
        }

        c<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes4.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}
