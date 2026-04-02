package com.amazon.aps.iva.nf;

import com.amazon.aps.iva.a0.p0;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
/* compiled from: StreamsLimitReachedOverlay.kt */
/* loaded from: classes.dex */
public final class a {
    public static final com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.v0.b.c(998354012, C0536a.h, false);

    /* compiled from: StreamsLimitReachedOverlay.kt */
    /* renamed from: com.amazon.aps.iva.nf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0536a extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public static final C0536a h = new C0536a();

        public C0536a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                p0.a(com.amazon.aps.iva.z1.b.a(R.drawable.ic_premium_subscription_button, iVar2), null, androidx.compose.foundation.layout.d.i(f.a.c, 0.0f, 0.0f, 8, 0.0f, 11), null, null, 0.0f, null, iVar2, 440, 120);
            }
            return q.a;
        }
    }
}
