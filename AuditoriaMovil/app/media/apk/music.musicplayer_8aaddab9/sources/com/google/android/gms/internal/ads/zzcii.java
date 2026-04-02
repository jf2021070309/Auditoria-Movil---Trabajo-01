package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;
@TargetApi(14)
/* loaded from: classes.dex */
public abstract class zzcii extends TextureView implements zzcje {
    public final zzciv zza;
    public final zzcjf zzb;

    public zzcii(Context context) {
        super(context);
        this.zza = new zzciv();
        this.zzb = new zzcjf(context, this);
    }

    public void zzA(int i2) {
    }

    public void zzB(int i2) {
    }

    public abstract String zzd();

    public abstract void zze(zzcih zzcihVar);

    public abstract void zzf(String str);

    public abstract void zzg();

    public abstract void zzh();

    public abstract void zzi();

    public abstract int zzj();

    public abstract int zzk();

    public abstract void zzl(int i2);

    public abstract void zzm(float f2, float f3);

    public abstract int zzn();

    public abstract int zzo();

    public abstract long zzp();

    public abstract long zzq();

    public abstract long zzr();

    public abstract int zzs();

    public abstract void zzt();

    public void zzw(String str, String[] strArr) {
        zzf(str);
    }

    public void zzx(int i2) {
    }

    public void zzy(int i2) {
    }

    public void zzz(int i2) {
    }
}
