package com.google.android.gms.measurement.internal;

import c.f.f;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes2.dex */
public final class zzfj extends f<String, com.google.android.gms.internal.measurement.zzc> {
    public final /* synthetic */ zzfm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfj(zzfm zzfmVar, int i2) {
        super(20);
        this.zza = zzfmVar;
    }

    @Override // c.f.f
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc create(String str) {
        String str2 = str;
        Preconditions.checkNotEmpty(str2);
        return zzfm.zzd(this.zza, str2);
    }
}
