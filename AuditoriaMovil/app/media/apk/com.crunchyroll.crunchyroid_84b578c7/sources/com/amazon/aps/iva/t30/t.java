package com.amazon.aps.iva.t30;

import android.content.Context;
import android.view.ViewGroup;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
/* compiled from: EpisodeSearchResultItemDelegate.kt */
/* loaded from: classes2.dex */
public final class t extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.amazon.aps.iva.r30.c cVar, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.mt.o oVar, DurationFormatter durationFormatter, com.amazon.aps.iva.nt.a aVar2) {
        super(cVar, aVar, oVar, durationFormatter, aVar2);
        com.amazon.aps.iva.yb0.j.f(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.amazon.aps.iva.yb0.j.f(durationFormatter, "durationFormatter");
    }

    @Override // com.amazon.aps.iva.t30.i, com.amazon.aps.iva.t30.r
    /* renamed from: c */
    public final com.amazon.aps.iva.z70.a a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new com.amazon.aps.iva.z70.a(context);
    }
}
