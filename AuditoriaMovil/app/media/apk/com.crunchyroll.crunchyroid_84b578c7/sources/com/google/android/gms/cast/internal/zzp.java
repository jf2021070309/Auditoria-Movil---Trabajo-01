package com.google.android.gms.cast.internal;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public class zzp {
    protected final Logger zza;
    private final String zzb;
    private zzar zzc;

    public zzp(String str, String str2, String str3) {
        CastUtils.throwIfInvalidNamespace(str);
        this.zzb = str;
        this.zza = new Logger("MediaControlChannel", null);
    }

    public final long zzd() {
        zzar zzarVar = this.zzc;
        if (zzarVar == null) {
            this.zza.e("Attempt to generate requestId without a sink", new Object[0]);
            return 0L;
        }
        return zzarVar.zza();
    }

    public final String zze() {
        return this.zzb;
    }

    public void zzf() {
        throw null;
    }

    public final void zzg(String str, long j, String str2) throws IllegalStateException {
        zzar zzarVar = this.zzc;
        if (zzarVar == null) {
            this.zza.e("Attempt to send text message without a sink", new Object[0]);
        } else {
            zzarVar.zzb(this.zzb, str, j, null);
        }
    }

    public final void zzh(zzar zzarVar) {
        this.zzc = zzarVar;
        if (zzarVar == null) {
            zzf();
        }
    }
}
