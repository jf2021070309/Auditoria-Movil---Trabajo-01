package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.j8.m;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: BrowseAllDataSource.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ int h;
    public final /* synthetic */ m.b<com.amazon.aps.iva.uz.h> i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i, m.b<com.amazon.aps.iva.uz.h> bVar, int i2) {
        super(1);
        this.h = i;
        this.i = bVar;
        this.j = i2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.uz.h> list) {
        int i;
        List<? extends com.amazon.aps.iva.uz.h> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, FirebaseAnalytics.Param.ITEMS);
        if (!list2.isEmpty()) {
            i = this.h;
        } else {
            i = 0;
        }
        this.i.a(this.j, i, list2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
