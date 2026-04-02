package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzxa {
    private final int zza;
    private final List<zzvu> zzb;
    private final int zzc;
    private final InputStream zzd;

    public zzxa(int i2, List<zzvu> list, int i3, InputStream inputStream) {
        this.zza = i2;
        this.zzb = list;
        this.zzc = i3;
        this.zzd = inputStream;
    }

    public final int zza() {
        return this.zza;
    }

    public final List<zzvu> zzb() {
        return Collections.unmodifiableList(this.zzb);
    }

    public final int zzc() {
        return this.zzc;
    }

    public final InputStream zzd() {
        InputStream inputStream = this.zzd;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }
}
