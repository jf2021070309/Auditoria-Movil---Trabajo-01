package com.amazon.aps.iva.zm;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: WelcomeScreenContent.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.v0.b.c(-783866138, C0923a.h, false);

    /* compiled from: WelcomeScreenContent.kt */
    /* renamed from: com.amazon.aps.iva.zm.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0923a extends l implements q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public static final C0923a h = new C0923a();

        public C0923a() {
            super(3);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            int i;
            com.amazon.aps.iva.a1.f fVar2 = fVar;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            int intValue = num.intValue();
            j.f(fVar2, "it");
            if ((intValue & 14) == 0) {
                if (iVar2.H(fVar2)) {
                    i = 4;
                } else {
                    i = 2;
                }
                intValue |= i;
            }
            if ((intValue & 91) == 18 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.d0.f.a(fVar2, iVar2, intValue & 14);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }
}
