package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public class zzadl {
    private static final zzacm zzb = zzacm.zza();
    protected volatile zzaef zza;
    private volatile zzaby zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzadl)) {
            return false;
        }
        zzadl zzadlVar = (zzadl) obj;
        zzaef zzaefVar = this.zza;
        zzaef zzaefVar2 = zzadlVar.zza;
        if (zzaefVar == null && zzaefVar2 == null) {
            return zzb().equals(zzadlVar.zzb());
        }
        if (zzaefVar != null && zzaefVar2 != null) {
            return zzaefVar.equals(zzaefVar2);
        }
        if (zzaefVar != null) {
            zzadlVar.zzc(zzaefVar.zzaq());
            return zzaefVar.equals(zzadlVar.zza);
        }
        zzc(zzaefVar2.zzaq());
        return this.zza.equals(zzaefVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzabv) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzat();
        }
        return 0;
    }

    public final zzaby zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzaby.zzb;
            } else {
                this.zzc = this.zza.zzaI();
            }
            return this.zzc;
        }
    }

    public final void zzc(zzaef zzaefVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzaefVar;
                    this.zzc = zzaby.zzb;
                } catch (zzadi unused) {
                    this.zza = zzaefVar;
                    this.zzc = zzaby.zzb;
                }
            }
        }
    }
}
