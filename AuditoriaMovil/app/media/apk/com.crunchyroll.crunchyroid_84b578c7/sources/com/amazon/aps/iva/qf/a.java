package com.amazon.aps.iva.qf;

import androidx.compose.foundation.layout.d;
import com.amazon.aps.iva.a0.p0;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
/* compiled from: PremiumOverlay.kt */
/* loaded from: classes.dex */
public final class a {
    public static final com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.v0.b.c(-582551226, C0645a.h, false);

    /* compiled from: PremiumOverlay.kt */
    /* renamed from: com.amazon.aps.iva.qf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0645a extends l implements p<i, Integer, q> {
        public static final C0645a h = new C0645a();

        public C0645a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                p0.a(com.amazon.aps.iva.z1.b.a(R.drawable.ic_premium_subscription_button, iVar2), null, d.i(f.a.c, 0.0f, 0.0f, 8, 0.0f, 11), null, null, 0.0f, null, iVar2, 440, 120);
            }
            return q.a;
        }
    }
}
