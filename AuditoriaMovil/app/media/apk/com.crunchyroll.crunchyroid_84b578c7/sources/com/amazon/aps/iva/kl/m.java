package com.amazon.aps.iva.kl;

import com.amazon.aps.iva.ab.x;
import com.google.android.gms.cast.framework.media.NotificationOptions;
/* compiled from: UpNextBannerViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.upnext.banner.UpNextBannerViewModelImpl$isVisible$3", f = "UpNextBannerViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.t<com.amazon.aps.iva.kj.e, com.amazon.aps.iva.nk.j, Boolean, Boolean, Boolean, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> {
    public /* synthetic */ com.amazon.aps.iva.kj.e h;
    public /* synthetic */ com.amazon.aps.iva.nk.j i;
    public /* synthetic */ boolean j;
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;

    public m(com.amazon.aps.iva.ob0.d<? super m> dVar) {
        super(6, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.t
    public final Object S(com.amazon.aps.iva.kj.e eVar, com.amazon.aps.iva.nk.j jVar, Boolean bool, Boolean bool2, Boolean bool3, com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        boolean booleanValue3 = bool3.booleanValue();
        m mVar = new m(dVar);
        mVar.h = eVar;
        mVar.i = jVar;
        mVar.j = booleanValue;
        mVar.k = booleanValue2;
        mVar.l = booleanValue3;
        return mVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.kj.e eVar = this.h;
        com.amazon.aps.iva.nk.j jVar = this.i;
        boolean z2 = this.j;
        boolean z3 = this.k;
        boolean z4 = this.l;
        boolean z5 = false;
        if (z2 && !z4 && !z3) {
            if (eVar != null && (str = eVar.a) != null && (!com.amazon.aps.iva.oe0.m.b0(str))) {
                z = true;
            } else {
                z = false;
            }
            if (z && jVar.c > 0) {
                long j = jVar.b;
                if (j <= NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS && j >= 0 && jVar.e > 0.0f && !jVar.m.b) {
                    z5 = true;
                }
            }
        }
        return Boolean.valueOf(z5);
    }
}
