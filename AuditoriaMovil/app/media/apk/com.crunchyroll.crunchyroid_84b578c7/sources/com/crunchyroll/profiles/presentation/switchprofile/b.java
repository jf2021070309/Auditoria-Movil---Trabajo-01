package com.crunchyroll.profiles.presentation.switchprofile;

import com.amazon.aps.iva.e1.d;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.g8.r0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nm.j;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.ui.c;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: WhoIsWatchingActivity.kt */
/* loaded from: classes2.dex */
public final class b extends l implements p<i, Integer, q> {
    public final /* synthetic */ WhoIsWatchingActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WhoIsWatchingActivity whoIsWatchingActivity) {
        super(2);
        this.h = whoIsWatchingActivity;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            m0 k = d.k(new r0[0], iVar2);
            q qVar = q.a;
            WhoIsWatchingActivity whoIsWatchingActivity = this.h;
            x0.c(qVar, new a(k, whoIsWatchingActivity, null), iVar2);
            com.amazon.aps.iva.fc0.l<Object>[] lVarArr = WhoIsWatchingActivity.c;
            whoIsWatchingActivity.getClass();
            com.amazon.aps.iva.nm.a.a(k, (c) whoIsWatchingActivity.b.getValue(whoIsWatchingActivity, WhoIsWatchingActivity.c[0]), j.c.b, iVar2, 392);
        }
        return q.a;
    }
}
