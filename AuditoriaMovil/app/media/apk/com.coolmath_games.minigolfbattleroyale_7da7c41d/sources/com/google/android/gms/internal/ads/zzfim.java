package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfim extends zzfij {
    private String zza;
    private Boolean zzb;
    private Boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzfij
    public final zzfij zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        throw new NullPointerException("Null clientVersion");
    }

    @Override // com.google.android.gms.internal.ads.zzfij
    public final zzfij zzb(boolean z) {
        this.zzb = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfij
    public final zzfij zzc(boolean z) {
        this.zzc = true;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfij
    public final zzfik zzd() {
        Boolean bool;
        String str = this.zza;
        if (str == null || (bool = this.zzb) == null || this.zzc == null) {
            StringBuilder sb = new StringBuilder();
            if (this.zza == null) {
                sb.append(" clientVersion");
            }
            if (this.zzb == null) {
                sb.append(" shouldGetAdvertisingId");
            }
            if (this.zzc == null) {
                sb.append(" isGooglePlayServicesAvailable");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new zzfio(str, bool.booleanValue(), this.zzc.booleanValue(), null);
    }
}
