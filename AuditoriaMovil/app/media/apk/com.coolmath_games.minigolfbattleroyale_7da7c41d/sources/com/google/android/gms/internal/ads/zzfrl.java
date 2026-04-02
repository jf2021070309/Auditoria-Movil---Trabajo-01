package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfrl<V> extends zzfrn<V, List<V>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrl(zzfoe<? extends zzfsm<? extends V>> zzfoeVar, boolean z) {
        super(zzfoeVar, true);
        zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfrn
    public final /* bridge */ /* synthetic */ Object zzJ(List list) {
        ArrayList zza = zzfpb.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfrm zzfrmVar = (zzfrm) it.next();
            zza.add(zzfrmVar != null ? zzfrmVar.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
