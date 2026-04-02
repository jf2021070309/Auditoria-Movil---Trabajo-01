package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.CollectionUtils;
import com.vungle.warren.analytics.AnalyticsEvent;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcnh extends zzbhb {
    private final zzcjb zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private zzbhf zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbnp zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcnh(zzcjb zzcjbVar, float f, boolean z, boolean z2) {
        this.zza = zzcjbVar;
        this.zzi = f;
        this.zzc = z;
        this.zzd = z2;
    }

    private final void zzw(String str, Map<String, String> map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzchg.zze.execute(new Runnable(this, hashMap) { // from class: com.google.android.gms.internal.ads.zzcnf
            private final zzcnh zza;
            private final Map zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
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

    private final void zzx(final int i, final int i2, final boolean z, final boolean z2) {
        zzchg.zze.execute(new Runnable(this, i, i2, z, z2) { // from class: com.google.android.gms.internal.ads.zzcng
            private final zzcnh zza;
            private final int zzb;
            private final int zzc;
            private final boolean zzd;
            private final boolean zze;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = i;
                this.zzc = i2;
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
        zzw("initialState", CollectionUtils.mapOf("muteStart", true != z ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1", "customControlsRequested", true != z2 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1", "clickToExpandRequested", true != z3 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1"));
    }

    public final void zzd(float f) {
        synchronized (this.zzb) {
            this.zzj = f;
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
        zzw(true != z ? AnalyticsEvent.Ad.unmute : AnalyticsEvent.Ad.mute, null);
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
        int i;
        synchronized (this.zzb) {
            i = this.zze;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final float zzj() {
        float f;
        synchronized (this.zzb) {
            f = this.zzi;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final float zzk() {
        float f;
        synchronized (this.zzb) {
            f = this.zzj;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzl(zzbhf zzbhfVar) {
        synchronized (this.zzb) {
            this.zzf = zzbhfVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final float zzm() {
        float f;
        synchronized (this.zzb) {
            f = this.zzk;
        }
        return f;
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
        int i;
        synchronized (this.zzb) {
            z = this.zzh;
            i = this.zze;
            this.zze = 3;
        }
        zzx(i, 3, z, z);
    }

    public final void zzs(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.zzb) {
            z2 = true;
            if (f2 == this.zzi && f3 == this.zzk) {
                z2 = false;
            }
            this.zzi = f2;
            this.zzj = f;
            z3 = this.zzh;
            this.zzh = z;
            i2 = this.zze;
            this.zze = i;
            float f4 = this.zzk;
            this.zzk = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.zza.zzH().invalidate();
            }
        }
        if (z2) {
            try {
                zzbnp zzbnpVar = this.zzn;
                if (zzbnpVar != null) {
                    zzbnpVar.zze();
                }
            } catch (RemoteException e) {
                zzcgt.zzl("#007 Could not call remote method.", e);
            }
        }
        zzx(i2, i, z3, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzt(int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3;
        boolean z4;
        zzbhf zzbhfVar;
        zzbhf zzbhfVar2;
        zzbhf zzbhfVar3;
        synchronized (this.zzb) {
            boolean z5 = this.zzg;
            boolean z6 = false;
            if (z5 || i2 != 1) {
                i3 = i2;
                z3 = false;
            } else {
                i3 = 1;
                z3 = true;
            }
            if (i == i2 || i3 != 1) {
                z4 = false;
            } else {
                i3 = 1;
                z4 = true;
            }
            boolean z7 = i != i2 && i3 == 2;
            boolean z8 = i != i2 && i3 == 3;
            if (z5 || z3) {
                z6 = true;
            }
            this.zzg = z6;
            if (z3) {
                try {
                    zzbhf zzbhfVar4 = this.zzf;
                    if (zzbhfVar4 != null) {
                        zzbhfVar4.zze();
                    }
                } catch (RemoteException e) {
                    zzcgt.zzl("#007 Could not call remote method.", e);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzu(Map map) {
        this.zza.zze("pubVideoCmd", map);
    }

    public final void zzv(zzbnp zzbnpVar) {
        synchronized (this.zzb) {
            this.zzn = zzbnpVar;
        }
    }
}
