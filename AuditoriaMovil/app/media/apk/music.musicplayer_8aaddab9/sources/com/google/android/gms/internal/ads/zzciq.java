package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes.dex */
public final class zzciq {
    private final Context zza;
    private final zzcjb zzb;
    private final ViewGroup zzc;
    private zzcip zzd;

    public zzciq(Context context, ViewGroup viewGroup, zzcml zzcmlVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcmlVar;
        this.zzd = null;
    }

    public final void zza(int i2, int i3, int i4, int i5) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcip zzcipVar = this.zzd;
        if (zzcipVar != null) {
            zzcipVar.zzm(i2, i3, i4, i5);
        }
    }

    public final void zzb(int i2, int i3, int i4, int i5, int i6, boolean z, zzcja zzcjaVar) {
        if (this.zzd != null) {
            return;
        }
        zzbjs.zza(this.zzb.zzq().zzc(), this.zzb.zzi(), "vpr2");
        Context context = this.zza;
        zzcjb zzcjbVar = this.zzb;
        zzcip zzcipVar = new zzcip(context, zzcjbVar, i6, z, zzcjbVar.zzq().zzc(), zzcjaVar);
        this.zzd = zzcipVar;
        this.zzc.addView(zzcipVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzm(i2, i3, i4, i5);
        this.zzb.zzg(false);
    }

    public final zzcip zzc() {
        Preconditions.checkMainThread("getAdVideoUnderlay must be called from the UI thread.");
        return this.zzd;
    }

    public final void zzd() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcip zzcipVar = this.zzd;
        if (zzcipVar != null) {
            zzcipVar.zzq();
        }
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcip zzcipVar = this.zzd;
        if (zzcipVar != null) {
            zzcipVar.zzD();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf(int i2) {
        Preconditions.checkMainThread("setPlayerBackgroundColor must be called from the UI thread.");
        zzcip zzcipVar = this.zzd;
        if (zzcipVar != null) {
            zzcipVar.zzl(i2);
        }
    }
}
