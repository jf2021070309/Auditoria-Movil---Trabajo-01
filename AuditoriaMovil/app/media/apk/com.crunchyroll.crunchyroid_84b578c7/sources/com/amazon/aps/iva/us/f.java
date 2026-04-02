package com.amazon.aps.iva.us;

import android.content.Intent;
/* compiled from: BottomBarScreenAnalyticsImpl.kt */
/* loaded from: classes2.dex */
public abstract class f extends b implements c {
    public final com.amazon.aps.iva.xb0.a<Boolean> e;
    public final com.amazon.aps.iva.xb0.l<Intent, Boolean> f;

    public /* synthetic */ f(com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.d10.x xVar, com.amazon.aps.iva.xb0.l lVar, int i) {
        this((i & 1) != 0 ? d.h : aVar, (i & 2) != 0 ? e.h : xVar, lVar);
    }

    @Override // com.amazon.aps.iva.us.b, com.amazon.aps.iva.us.r
    public final void c() {
        if (this.c) {
            this.c = false;
            com.amazon.aps.iva.xb0.a<Boolean> aVar = this.e;
            if (aVar.invoke().booleanValue()) {
                O(this.d.a());
            }
            this.b = aVar.invoke().booleanValue();
        }
    }

    @Override // com.amazon.aps.iva.us.c
    public final void onNewIntent(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        if (this.f.invoke(intent).booleanValue() && !this.c && this.e.invoke().booleanValue()) {
            O(0.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.fs.c> aVar, com.amazon.aps.iva.xb0.a<Boolean> aVar2, com.amazon.aps.iva.xb0.l<? super Intent, Boolean> lVar) {
        super(aVar);
        com.amazon.aps.iva.yb0.j.f(aVar, "createTimer");
        com.amazon.aps.iva.yb0.j.f(aVar2, "isScreenVisible");
        com.amazon.aps.iva.yb0.j.f(lVar, "isFromBottomNavBar");
        this.e = aVar2;
        this.f = lVar;
    }
}
