package com.google.android.gms.cast.tv.media;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzl {
    private int zza = 4;
    private List zzb;
    private Integer zzc;

    public final zzl zza(int i) {
        this.zza = i;
        return this;
    }

    public final zzl zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzl zzc(List list) {
        this.zzb = list;
        return this;
    }

    public final zzm zzd() {
        return new zzm(this.zza, this.zzb, this.zzc);
    }
}
