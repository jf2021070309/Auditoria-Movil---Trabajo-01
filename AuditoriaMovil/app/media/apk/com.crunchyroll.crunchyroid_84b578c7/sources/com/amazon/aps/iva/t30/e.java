package com.amazon.aps.iva.t30;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
/* compiled from: ContainerSearchResultItemDelegate.kt */
/* loaded from: classes2.dex */
public final class e extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.amazon.aps.iva.r30.c cVar, com.amazon.aps.iva.nt.a aVar, com.amazon.aps.iva.r30.b bVar, com.amazon.aps.iva.xb0.a aVar2) {
        super(cVar, aVar, bVar, aVar2);
        com.amazon.aps.iva.yb0.j.f(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.amazon.aps.iva.t30.d, com.amazon.aps.iva.t30.r
    /* renamed from: c */
    public final com.amazon.aps.iva.z70.a a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new com.amazon.aps.iva.z70.a(context);
    }
}
