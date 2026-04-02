package com.google.android.gms.internal.ads;

import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzdv extends Exception {
    public final boolean zza;
    public final zzafv zzb;

    public zzdv(int i2, zzafv zzafvVar, boolean z) {
        super(a.R(36, "AudioTrack write failed: ", i2));
        this.zza = z;
        this.zzb = zzafvVar;
    }
}
