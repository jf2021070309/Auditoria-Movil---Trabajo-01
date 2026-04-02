package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzul {
    public final int zza;
    public final String zzb;
    public final List<zzuk> zzc;
    public final byte[] zzd;

    public zzul(int i2, String str, List<zzuk> list, byte[] bArr) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zzd = bArr;
    }
}
