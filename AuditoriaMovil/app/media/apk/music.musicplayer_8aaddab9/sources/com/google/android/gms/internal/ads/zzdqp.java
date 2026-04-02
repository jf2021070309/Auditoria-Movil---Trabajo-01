package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import c.f.a;
import c.f.h;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class zzdqp extends zzbna {
    private final Context zza;
    private final zzdmm zzb;
    private zzdnl zzc;
    private zzdmh zzd;

    public zzdqp(Context context, zzdmm zzdmmVar, zzdnl zzdnlVar, zzdmh zzdmhVar) {
        this.zza = context;
        this.zzb = zzdmmVar;
        this.zzc = zzdnlVar;
        this.zzd = zzdmhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final String zze(String str) {
        return this.zzb.zzY().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final zzbmh zzf(String str) {
        return this.zzb.zzV().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final List<String> zzg() {
        h<String, zzblr> zzV = this.zzb.zzV();
        h<String, String> zzY = this.zzb.zzY();
        String[] strArr = new String[zzV.f1665g + zzY.f1665g];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < zzV.f1665g) {
            strArr[i4] = zzV.h(i3);
            i3++;
            i4++;
        }
        while (i2 < zzY.f1665g) {
            strArr[i4] = zzY.h(i2);
            i2++;
            i4++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final String zzh() {
        return this.zzb.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzi(String str) {
        zzdmh zzdmhVar = this.zzd;
        if (zzdmhVar != null) {
            zzdmhVar.zzc(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzj() {
        zzdmh zzdmhVar = this.zzd;
        if (zzdmhVar != null) {
            zzdmhVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final zzbhc zzk() {
        return this.zzb.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzl() {
        zzdmh zzdmhVar = this.zzd;
        if (zzdmhVar != null) {
            zzdmhVar.zzT();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final boolean zzn(IObjectWrapper iObjectWrapper) {
        zzdnl zzdnlVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof ViewGroup) && (zzdnlVar = this.zzc) != null && zzdnlVar.zzd((ViewGroup) unwrap)) {
            this.zzb.zzR().zzap(new zzdqo(this));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final boolean zzo() {
        zzdmh zzdmhVar = this.zzd;
        return (zzdmhVar == null || zzdmhVar.zzG()) && this.zzb.zzT() != null && this.zzb.zzR() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final boolean zzp() {
        IObjectWrapper zzU = this.zzb.zzU();
        if (zzU == null) {
            zzcgt.zzi("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzr().zzf(zzU);
        if (this.zzb.zzT() != null) {
            this.zzb.zzT().zze("onSdkLoaded", new a());
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzq(IObjectWrapper iObjectWrapper) {
        zzdmh zzdmhVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof View) || this.zzb.zzU() == null || (zzdmhVar = this.zzd) == null) {
            return;
        }
        zzdmhVar.zzH((View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzr() {
        String zzX = this.zzb.zzX();
        if ("Google".equals(zzX)) {
            zzcgt.zzi("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(zzX)) {
            zzcgt.zzi("Not starting OMID session. OM partner name has not been configured.");
        } else {
            zzdmh zzdmhVar = this.zzd;
            if (zzdmhVar != null) {
                zzdmhVar.zzF(zzX, false);
            }
        }
    }
}
