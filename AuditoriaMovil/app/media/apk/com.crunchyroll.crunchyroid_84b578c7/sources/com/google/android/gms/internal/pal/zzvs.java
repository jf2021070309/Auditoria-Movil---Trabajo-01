package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzvs extends zzacv implements zzaeg {
    private zzvs() {
        super(zzvt.zzc());
    }

    public final zzvs zza(String str) {
        if (this.zzb) {
            zzar();
            this.zzb = false;
        }
        zzvt.zzg((zzvt) this.zza, str);
        return this;
    }

    public final zzvs zzb(zzaby zzabyVar) {
        if (this.zzb) {
            zzar();
            this.zzb = false;
        }
        zzvt.zzh((zzvt) this.zza, zzabyVar);
        return this;
    }

    public final zzvs zzc(int i) {
        if (this.zzb) {
            zzar();
            this.zzb = false;
        }
        zzvt.zzj((zzvt) this.zza, i);
        return this;
    }

    public /* synthetic */ zzvs(zzvr zzvrVar) {
        super(zzvt.zzc());
    }
}
