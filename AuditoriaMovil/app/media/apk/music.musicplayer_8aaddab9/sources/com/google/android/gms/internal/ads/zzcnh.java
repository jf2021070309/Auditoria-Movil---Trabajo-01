package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzcnh extends zzbhb {
    private final zzcjb zza;
    private final boolean zzc;
    private final boolean zzd;
    @GuardedBy("lock")
    private int zze;
    @GuardedBy("lock")
    private zzbhf zzf;
    @GuardedBy("lock")
    private boolean zzg;
    @GuardedBy("lock")
    private float zzi;
    @GuardedBy("lock")
    private float zzj;
    @GuardedBy("lock")
    private float zzk;
    @GuardedBy("lock")
    private boolean zzl;
    @GuardedBy("lock")
    private boolean zzm;
    @GuardedBy("lock")
    private zzbnp zzn;
    private final Object zzb = new Object();
    @GuardedBy("lock")
    private boolean zzh = true;

    public zzcnh(zzcjb zzcjbVar, float f2, boolean z, boolean z2) {
        this.zza = zzcjbVar;
        this.zzi = f2;
        this.zzc = z;
        this.zzd = z2;
    }

    private final void zzw(String str, Map<String, String> map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzchg.zze.execute(new Runnable(this, hashMap) { // from class: com.google.android.gms.internal.ads.zzcnf
            private final zzcnh zza;
            private final Map zzb;

            {
                this.zza = this;
                this.zzb = hashMap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzu(this.zzb);
            }
        });
    }

    private final void zzx(final int i2, final int i3, final boolean z, final boolean z2) {
        zzchg.zze.execute(new Runnable(this, i2, i3, z, z2) { // from class: com.google.android.gms.internal.ads.zzcng
            private final zzcnh zza;
            private final int zzb;
            private final int zzc;
            private final boolean zzd;
            private final boolean zze;

            {
                this.zza = this;
                this.zzb = i2;
                this.zzc = i3;
                this.zzd = z;
                this.zze = z2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzt(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
    }

    public final void zzc(zzbis zzbisVar) {
        boolean z = zzbisVar.zza;
        boolean z2 = zzbisVar.zzb;
        boolean z3 = zzbisVar.zzc;
        synchronized (this.zzb) {
            this.zzl = z2;
            this.zzm = z3;
        }
        zzw("initialState", CollectionUtils.mapOf("muteStart", true != z ? "0" : "1", "customControlsRequested", true != z2 ? "0" : "1", "clickToExpandRequested", true != z3 ? "0" : "1"));
    }

    public final void zzd(float f2) {
        synchronized (this.zzb) {
            this.zzj = f2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zze() {
        zzw("play", null);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzf() {
        zzw("pause", null);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzg(boolean z) {
        zzw(true != z ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzh() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzh;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final int zzi() {
        int i2;
        synchronized (this.zzb) {
            i2 = this.zze;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final float zzj() {
        float f2;
        synchronized (this.zzb) {
            f2 = this.zzi;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final float zzk() {
        float f2;
        synchronized (this.zzb) {
            f2 = this.zzj;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzl(zzbhf zzbhfVar) {
        synchronized (this.zzb) {
            this.zzf = zzbhfVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final float zzm() {
        float f2;
        synchronized (this.zzb) {
            f2 = this.zzk;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzn() {
        boolean z;
        synchronized (this.zzb) {
            z = false;
            if (this.zzc && this.zzl) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final zzbhf zzo() throws RemoteException {
        zzbhf zzbhfVar;
        synchronized (this.zzb) {
            zzbhfVar = this.zzf;
        }
        return zzbhfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzp() {
        boolean z;
        boolean zzn = zzn();
        synchronized (this.zzb) {
            z = false;
            if (!zzn) {
                try {
                    if (this.zzm && this.zzd) {
                        z = true;
                    }
                } finally {
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzq() {
        zzw("stop", null);
    }

    public final void zzr() {
        boolean z;
        int i2;
        synchronized (this.zzb) {
            z = this.zzh;
            i2 = this.zze;
            this.zze = 3;
        }
        zzx(i2, 3, z, z);
    }

    public final void zzs(float f2, float f3, int i2, boolean z, float f4) {
        boolean z2;
        boolean z3;
        int i3;
        synchronized (this.zzb) {
            z2 = true;
            if (f3 == this.zzi && f4 == this.zzk) {
                z2 = false;
            }
            this.zzi = f3;
            this.zzj = f2;
            z3 = this.zzh;
            this.zzh = z;
            i3 = this.zze;
            this.zze = i2;
            float f5 = this.zzk;
            this.zzk = f4;
            if (Math.abs(f4 - f5) > 1.0E-4f) {
                this.zza.zzH().invalidate();
            }
        }
        if (z2) {
            try {
                zzbnp zzbnpVar = this.zzn;
                if (zzbnpVar != null) {
                    zzbnpVar.zze();
                }
            } catch (RemoteException e2) {
                zzcgt.zzl("#007 Could not call remote method.", e2);
            }
        }
        zzx(i3, i2, z3, z);
    }

    public final /* synthetic */ void zzt(int i2, int i3, boolean z, boolean z2) {
        int i4;
        boolean z3;
        boolean z4;
        zzbhf zzbhfVar;
        zzbhf zzbhfVar2;
        zzbhf zzbhfVar3;
        synchronized (this.zzb) {
            boolean z5 = this.zzg;
            boolean z6 = false;
            if (z5 || i3 != 1) {
                i4 = i3;
                z3 = false;
            } else {
                i4 = 1;
                z3 = true;
            }
            if (i2 == i3 || i4 != 1) {
                z4 = false;
            } else {
                i4 = 1;
                z4 = true;
            }
            boolean z7 = i2 != i3 && i4 == 2;
            boolean z8 = i2 != i3 && i4 == 3;
            this.zzg = (z5 || z3) ? true : true;
            if (z3) {
                try {
                    zzbhf zzbhfVar4 = this.zzf;
                    if (zzbhfVar4 != null) {
                        zzbhfVar4.zze();
                    }
                } catch (RemoteException e2) {
                    zzcgt.zzl("#007 Could not call remote method.", e2);
                }
            }
            if (z4 && (zzbhfVar3 = this.zzf) != null) {
                zzbhfVar3.zzf();
            }
            if (z7 && (zzbhfVar2 = this.zzf) != null) {
                zzbhfVar2.zzg();
            }
            if (z8) {
                zzbhf zzbhfVar5 = this.zzf;
                if (zzbhfVar5 != null) {
                    zzbhfVar5.zzh();
                }
                this.zza.zzA();
            }
            if (z != z2 && (zzbhfVar = this.zzf) != null) {
                zzbhfVar.zzi(z2);
            }
        }
    }

    public final /* synthetic */ void zzu(Map map) {
        this.zza.zze("pubVideoCmd", map);
    }

    public final void zzv(zzbnp zzbnpVar) {
        synchronized (this.zzb) {
            this.zzn = zzbnpVar;
        }
    }
}
