package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
abstract class zzfrn<V, C> extends zzfrd<V, C> {
    @CheckForNull
    private List<zzfrm<V>> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrn(zzfoe<? extends zzfsm<? extends V>> zzfoeVar, boolean z) {
        super(zzfoeVar, true, true);
        List<zzfrm<V>> zza;
        if (zzfoeVar.isEmpty()) {
            zza = Collections.emptyList();
        } else {
            zza = zzfpb.zza(zzfoeVar.size());
        }
        for (int i = 0; i < zzfoeVar.size(); i++) {
            zza.add(null);
        }
        this.zza = zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfrd
    final void zzA() {
        List<zzfrm<V>> list = this.zza;
        if (list != null) {
            zzp(zzJ(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfrd
    public final void zzB(int i) {
        super.zzB(i);
        this.zza = null;
    }

    abstract C zzJ(List<zzfrm<V>> list);

    @Override // com.google.android.gms.internal.ads.zzfrd
    final void zzz(int i, V v) {
        List<zzfrm<V>> list = this.zza;
        if (list != null) {
            list.set(i, new zzfrm<>(v));
        }
    }
}
