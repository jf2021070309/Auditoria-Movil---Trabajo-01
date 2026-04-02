package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdqi extends zzbrz implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzblq {
    private View zza;
    private zzbhc zzb;
    private zzdmh zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdqi(zzdmh zzdmhVar, zzdmm zzdmmVar) {
        this.zza = zzdmmVar.zzH();
        this.zzb = zzdmmVar.zzw();
        this.zzc = zzdmhVar;
        if (zzdmmVar.zzR() != null) {
            zzdmmVar.zzR().zzaw(this);
        }
    }

    private final void zzg() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private final void zzh() {
        View view;
        zzdmh zzdmhVar = this.zzc;
        if (zzdmhVar == null || (view = this.zza) == null) {
            return;
        }
        zzdmhVar.zzr(view, Collections.emptyMap(), Collections.emptyMap(), zzdmh.zzC(this.zza));
    }

    private static final void zzi(zzbsd zzbsdVar, int i) {
        try {
            zzbsdVar.zzf(i);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final void zza() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdqg
            private final zzdqi zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.zza.zzc();
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final zzbhc zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.zze.zzf("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final void zzc() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzg();
        zzdmh zzdmhVar = this.zzc;
        if (zzdmhVar != null) {
            zzdmhVar.zzT();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final void zzd(IObjectWrapper iObjectWrapper, zzbsd zzbsdVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.zze.zzf("Instream ad can not be shown after destroy().");
            zzi(zzbsdVar, 2);
            return;
        }
        View view = this.zza;
        if (view != null && this.zzb != null) {
            if (this.zze) {
                com.google.android.gms.ads.internal.util.zze.zzf("Instream ad should not be used again.");
                zzi(zzbsdVar, 1);
                return;
            }
            this.zze = true;
            zzg();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            com.google.android.gms.ads.internal.zzt.zzz();
            zzcht.zza(this.zza, this);
            com.google.android.gms.ads.internal.zzt.zzz();
            zzcht.zzb(this.zza, this);
            zzh();
            try {
                zzbsdVar.zze();
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
                return;
            }
        }
        String str = view == null ? "can not get video view." : "can not get video controller.";
        com.google.android.gms.ads.internal.util.zze.zzf(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
        zzi(zzbsdVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzd(iObjectWrapper, new zzdqh(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final zzbme zzf() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.zze.zzf("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdmh zzdmhVar = this.zzc;
        if (zzdmhVar == null || zzdmhVar.zzJ() == null) {
            return null;
        }
        return this.zzc.zzJ().zza();
    }
}
