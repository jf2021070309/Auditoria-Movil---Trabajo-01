package com.amazon.aps.iva.pc0;

import com.amazon.aps.iva.lb0.y;
import java.util.Iterator;
/* compiled from: Annotations.kt */
/* loaded from: classes4.dex */
public interface h extends Iterable<c>, com.amazon.aps.iva.zb0.a {

    /* compiled from: Annotations.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static final C0609a a = new C0609a();

        /* compiled from: Annotations.kt */
        /* renamed from: com.amazon.aps.iva.pc0.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0609a implements h {
            @Override // com.amazon.aps.iva.pc0.h
            public final boolean A(com.amazon.aps.iva.nd0.c cVar) {
                return b.b(this, cVar);
            }

            @Override // com.amazon.aps.iva.pc0.h
            public final c h(com.amazon.aps.iva.nd0.c cVar) {
                com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
                return null;
            }

            @Override // com.amazon.aps.iva.pc0.h
            public final boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public final Iterator<c> iterator() {
                return y.b;
            }

            public final String toString() {
                return "EMPTY";
            }
        }
    }

    /* compiled from: Annotations.kt */
    /* loaded from: classes4.dex */
    public static final class b {
        public static c a(h hVar, com.amazon.aps.iva.nd0.c cVar) {
            c cVar2;
            com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
            Iterator<c> it = hVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    cVar2 = it.next();
                    if (com.amazon.aps.iva.yb0.j.a(cVar2.c(), cVar)) {
                        break;
                    }
                } else {
                    cVar2 = null;
                    break;
                }
            }
            return cVar2;
        }

        public static boolean b(h hVar, com.amazon.aps.iva.nd0.c cVar) {
            com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
            if (hVar.h(cVar) != null) {
                return true;
            }
            return false;
        }
    }

    boolean A(com.amazon.aps.iva.nd0.c cVar);

    c h(com.amazon.aps.iva.nd0.c cVar);

    boolean isEmpty();
}
