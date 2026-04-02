package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.r4.z;
import com.google.android.gms.cast.MediaError;
/* compiled from: GlanceAppWidgetManager.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidgetManager", f = "GlanceAppWidgetManager.kt", l = {MediaError.DetailedErrorCode.MEDIA_DECODE}, m = "getGlanceIds")
/* loaded from: classes.dex */
public final class k0<T extends z> extends com.amazon.aps.iva.qb0.c {
    public i0 h;
    public Class i;
    public /* synthetic */ Object j;
    public final /* synthetic */ i0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(i0 i0Var, com.amazon.aps.iva.ob0.d<? super k0> dVar) {
        super(dVar);
        this.k = i0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
