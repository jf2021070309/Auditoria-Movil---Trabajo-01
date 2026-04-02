package com.amazon.aps.iva.g8;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
/* compiled from: NavController.kt */
/* loaded from: classes.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<f, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.yb0.z h;
    public final /* synthetic */ List<f> i;
    public final /* synthetic */ com.amazon.aps.iva.yb0.b0 j;
    public final /* synthetic */ i k;
    public final /* synthetic */ Bundle l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.amazon.aps.iva.yb0.z zVar, ArrayList arrayList, com.amazon.aps.iva.yb0.b0 b0Var, i iVar, Bundle bundle) {
        super(1);
        this.h = zVar;
        this.i = arrayList;
        this.j = b0Var;
        this.k = iVar;
        this.l = bundle;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(f fVar) {
        List<f> list;
        f fVar2 = fVar;
        com.amazon.aps.iva.yb0.j.f(fVar2, "entry");
        this.h.b = true;
        List<f> list2 = this.i;
        int indexOf = list2.indexOf(fVar2);
        if (indexOf != -1) {
            com.amazon.aps.iva.yb0.b0 b0Var = this.j;
            int i = indexOf + 1;
            list = list2.subList(b0Var.b, i);
            b0Var.b = i;
        } else {
            list = com.amazon.aps.iva.lb0.z.b;
        }
        this.k.a(fVar2.c, this.l, fVar2, list);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
