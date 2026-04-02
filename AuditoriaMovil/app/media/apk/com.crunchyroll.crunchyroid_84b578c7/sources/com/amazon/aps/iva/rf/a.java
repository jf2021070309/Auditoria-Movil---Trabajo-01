package com.amazon.aps.iva.rf;

import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.amazon.aps.iva.a0.p0;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.f1.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
/* compiled from: PremiumDubOverlay.kt */
/* loaded from: classes.dex */
public final class a {
    public static final com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.v0.b.c(1884787200, C0679a.h, false);
    public static final com.amazon.aps.iva.v0.a b = com.amazon.aps.iva.v0.b.c(-1064257229, b.h, false);

    /* compiled from: PremiumDubOverlay.kt */
    /* renamed from: com.amazon.aps.iva.rf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0679a extends l implements p<i, Integer, q> {
        public static final C0679a h = new C0679a();

        public C0679a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                p0.a(com.amazon.aps.iva.z1.b.a(R.drawable.ic_premium_subscription_button, iVar2), null, androidx.compose.foundation.layout.d.i(f.a.c, 0.0f, 0.0f, 8, 0.0f, 11), null, null, 0.0f, null, iVar2, 440, 120);
            }
            return q.a;
        }
    }

    /* compiled from: PremiumDubOverlay.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements p<i, Integer, q> {
        public static final b h = new b();

        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            BlendModeColorFilter porterDuffColorFilter;
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.a1.f i = androidx.compose.foundation.layout.d.i(f.a.c, 0.0f, 0.0f, 8, 0.0f, 11);
                com.amazon.aps.iva.i1.c a = com.amazon.aps.iva.z1.b.a(R.drawable.ic_cta_play, iVar2);
                long j = com.amazon.aps.iva.ao.a.v;
                if (Build.VERSION.SDK_INT >= 29) {
                    porterDuffColorFilter = com.amazon.aps.iva.f1.q.a.a(j, 5);
                } else {
                    porterDuffColorFilter = new PorterDuffColorFilter(i.G(j), com.amazon.aps.iva.f1.f.b(5));
                }
                p0.a(a, null, i, null, null, 0.0f, new y(porterDuffColorFilter), iVar2, 440, 56);
            }
            return q.a;
        }
    }
}
