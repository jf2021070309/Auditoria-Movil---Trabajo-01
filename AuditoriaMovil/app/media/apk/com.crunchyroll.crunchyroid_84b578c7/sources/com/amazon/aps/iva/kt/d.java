package com.amazon.aps.iva.kt;

import com.amazon.aps.iva.a0.p0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
/* compiled from: BigFeedContainerCard.kt */
/* loaded from: classes2.dex */
public final class d {
    public static final com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.v0.b.c(570057485, a.h, false);

    /* compiled from: BigFeedContainerCard.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<i, Integer, q> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                p0.a(com.amazon.aps.iva.z1.b.a(R.drawable.ic_play_pointy, iVar2), null, null, null, null, 0.0f, null, iVar2, 56, 124);
            }
            return q.a;
        }
    }
}
