package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzag implements zzaj {
    private final boolean zza;
    private final ArrayList<zzay> zzb = new ArrayList<>(1);
    private int zzc;
    private zzan zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzag(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zza(zzay zzayVar) {
        if (zzayVar != null) {
            if (this.zzb.contains(zzayVar)) {
                return;
            }
            this.zzb.add(zzayVar);
            this.zzc++;
            return;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzb(zzan zzanVar) {
        for (int i = 0; i < this.zzc; i++) {
            this.zzb.get(i).zza(this, zzanVar, this.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzc(zzan zzanVar) {
        this.zzd = zzanVar;
        for (int i = 0; i < this.zzc; i++) {
            this.zzb.get(i).zzb(this, zzanVar, this.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzd(int i) {
        zzan zzanVar = this.zzd;
        int i2 = zzamq.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            this.zzb.get(i3).zzc(this, zzanVar, this.zza, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zze() {
        zzan zzanVar = this.zzd;
        int i = zzamq.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            this.zzb.get(i2).zzd(this, zzanVar, this.zza);
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public Map zzf() {
        return Collections.emptyMap();
    }
}
