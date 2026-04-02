package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class zzfrn<V, C> extends zzfrd<V, C> {
    @CheckForNull
    private List<zzfrm<V>> zza;

    public zzfrn(zzfoe<? extends zzfsm<? extends V>> zzfoeVar, boolean z) {
        super(zzfoeVar, true, true);
        List<zzfrm<V>> emptyList = zzfoeVar.isEmpty() ? Collections.emptyList() : zzfpb.zza(zzfoeVar.size());
        for (int i2 = 0; i2 < zzfoeVar.size(); i2++) {
            emptyList.add(null);
        }
        this.zza = emptyList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfrd
    public final void zzA() {
        List<zzfrm<V>> list = this.zza;
        if (list != null) {
            zzp(zzJ(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrd
    public final void zzB(int i2) {
        super.zzB(i2);
        this.zza = null;
    }

    public abstract C zzJ(List<zzfrm<V>> list);

    @Override // com.google.android.gms.internal.ads.zzfrd
    public final void zzz(int i2, V v) {
        List<zzfrm<V>> list = this.zza;
        if (list != null) {
            list.set(i2, new zzfrm<>(v));
        }
    }
}
