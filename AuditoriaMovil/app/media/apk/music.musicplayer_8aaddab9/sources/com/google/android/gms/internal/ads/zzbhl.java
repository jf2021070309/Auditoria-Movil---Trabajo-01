package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public final class zzbhl {
    @VisibleForTesting
    public final zzbes zza;
    private final zzbvd zzb;
    private final zzbdk zzc;
    private final AtomicBoolean zzd;
    private final VideoController zze;
    private zzbcv zzf;
    private AdListener zzg;
    private AdSize[] zzh;
    private AppEventListener zzi;
    private zzbfn zzj;
    private VideoOptions zzk;
    private String zzl;
    @NotOnlyInitialized
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    private OnPaidEventListener zzp;

    public zzbhl(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzbdk.zza, null, 0);
    }

    public zzbhl(ViewGroup viewGroup, int i2) {
        this(viewGroup, null, false, zzbdk.zza, null, i2);
    }

    public zzbhl(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzbdk.zza, null, 0);
    }

    public zzbhl(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i2) {
        this(viewGroup, attributeSet, z, zzbdk.zza, null, i2);
    }

    @VisibleForTesting
    public zzbhl(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzbdk zzbdkVar, zzbfn zzbfnVar, int i2) {
        zzbdl zzbdlVar;
        this.zzb = new zzbvd();
        this.zze = new VideoController();
        this.zza = new zzbhk(this);
        this.zzm = viewGroup;
        this.zzc = zzbdkVar;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = i2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzbdt zzbdtVar = new zzbdt(context, attributeSet);
                this.zzh = zzbdtVar.zza(z);
                this.zzl = zzbdtVar.zzb();
                if (viewGroup.isInEditMode()) {
                    zzcgm zza = zzber.zza();
                    AdSize adSize = this.zzh[0];
                    int i3 = this.zzn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzbdlVar = zzbdl.zze();
                    } else {
                        zzbdl zzbdlVar2 = new zzbdl(context, adSize);
                        zzbdlVar2.zzj = zzC(i3);
                        zzbdlVar = zzbdlVar2;
                    }
                    zza.zzc(viewGroup, zzbdlVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e2) {
                zzber.zza().zzb(viewGroup, new zzbdl(context, AdSize.BANNER), e2.getMessage(), e2.getMessage());
            }
        }
    }

    private static zzbdl zzB(Context context, AdSize[] adSizeArr, int i2) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return zzbdl.zze();
            }
        }
        zzbdl zzbdlVar = new zzbdl(context, adSizeArr);
        zzbdlVar.zzj = zzC(i2);
        return zzbdlVar;
    }

    private static boolean zzC(int i2) {
        return i2 == 1;
    }

    public final boolean zzA(zzbfn zzbfnVar) {
        try {
            IObjectWrapper zzi = zzbfnVar.zzi();
            if (zzi != null && ((View) ObjectWrapper.unwrap(zzi)).getParent() == null) {
                this.zzm.addView((View) ObjectWrapper.unwrap(zzi));
                this.zzj = zzbfnVar;
                return true;
            }
            return false;
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
            return false;
        }
    }

    public final void zzb() {
        try {
            zzbfn zzbfnVar = this.zzj;
            if (zzbfnVar != null) {
                zzbfnVar.zzj();
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final AdListener zzc() {
        return this.zzg;
    }

    public final AdSize zzd() {
        zzbdl zzu;
        try {
            zzbfn zzbfnVar = this.zzj;
            if (zzbfnVar != null && (zzu = zzbfnVar.zzu()) != null) {
                return com.google.android.gms.ads.zza.zza(zzu.zze, zzu.zzb, zzu.zza);
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
        AdSize[] adSizeArr = this.zzh;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] zze() {
        return this.zzh;
    }

    public final String zzf() {
        zzbfn zzbfnVar;
        if (this.zzl == null && (zzbfnVar = this.zzj) != null) {
            try {
                this.zzl = zzbfnVar.zzB();
            } catch (RemoteException e2) {
                zzcgt.zzl("#007 Could not call remote method.", e2);
            }
        }
        return this.zzl;
    }

    public final AppEventListener zzg() {
        return this.zzi;
    }

    public final void zzh(zzbhj zzbhjVar) {
        try {
            if (this.zzj == null) {
                if (this.zzh == null || this.zzl == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.zzm.getContext();
                zzbdl zzB = zzB(context, this.zzh, this.zzn);
                zzbfn zzd = "search_v2".equals(zzB.zza) ? new zzbee(zzber.zzb(), context, zzB, this.zzl).zzd(context, false) : new zzbec(zzber.zzb(), context, zzB, this.zzl, this.zzb).zzd(context, false);
                this.zzj = zzd;
                zzd.zzo(new zzbdb(this.zza));
                zzbcv zzbcvVar = this.zzf;
                if (zzbcvVar != null) {
                    this.zzj.zzF(new zzbcw(zzbcvVar));
                }
                AppEventListener appEventListener = this.zzi;
                if (appEventListener != null) {
                    this.zzj.zzp(new zzawr(appEventListener));
                }
                VideoOptions videoOptions = this.zzk;
                if (videoOptions != null) {
                    this.zzj.zzM(new zzbis(videoOptions));
                }
                this.zzj.zzX(new zzbil(this.zzp));
                this.zzj.zzG(this.zzo);
                zzbfn zzbfnVar = this.zzj;
                if (zzbfnVar != null) {
                    try {
                        IObjectWrapper zzi = zzbfnVar.zzi();
                        if (zzi != null) {
                            this.zzm.addView((View) ObjectWrapper.unwrap(zzi));
                        }
                    } catch (RemoteException e2) {
                        zzcgt.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
            zzbfn zzbfnVar2 = this.zzj;
            Objects.requireNonNull(zzbfnVar2);
            if (zzbfnVar2.zzl(this.zzc.zza(this.zzm.getContext(), zzbhjVar))) {
                this.zzb.zze(zzbhjVar.zzn());
            }
        } catch (RemoteException e3) {
            zzcgt.zzl("#007 Could not call remote method.", e3);
        }
    }

    public final void zzi() {
        try {
            zzbfn zzbfnVar = this.zzj;
            if (zzbfnVar != null) {
                zzbfnVar.zzm();
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzj() {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        try {
            zzbfn zzbfnVar = this.zzj;
            if (zzbfnVar != null) {
                zzbfnVar.zzt();
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzk() {
        try {
            zzbfn zzbfnVar = this.zzj;
            if (zzbfnVar != null) {
                zzbfnVar.zzn();
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzl(AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzm(zzbcv zzbcvVar) {
        try {
            this.zzf = zzbcvVar;
            zzbfn zzbfnVar = this.zzj;
            if (zzbfnVar != null) {
                zzbfnVar.zzF(zzbcvVar != null ? new zzbcw(zzbcvVar) : null);
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzn(AdSize... adSizeArr) {
        if (this.zzh != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzo(adSizeArr);
    }

    public final void zzo(AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            zzbfn zzbfnVar = this.zzj;
            if (zzbfnVar != null) {
                zzbfnVar.zzv(zzB(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
        this.zzm.requestLayout();
    }

    public final void zzp(String str) {
        if (this.zzl != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzl = str;
    }

    public final void zzq(AppEventListener appEventListener) {
        try {
            this.zzi = appEventListener;
            zzbfn zzbfnVar = this.zzj;
            if (zzbfnVar != null) {
                zzbfnVar.zzp(appEventListener != null ? new zzawr(appEventListener) : null);
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzr(boolean z) {
        this.zzo = z;
        try {
            zzbfn zzbfnVar = this.zzj;
            if (zzbfnVar != null) {
                zzbfnVar.zzG(z);
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final boolean zzs() {
        try {
            zzbfn zzbfnVar = this.zzj;
            if (zzbfnVar != null) {
                return zzbfnVar.zzH();
            }
            return false;
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
            return false;
        }
    }

    public final ResponseInfo zzt() {
        zzbgz zzbgzVar = null;
        try {
            zzbfn zzbfnVar = this.zzj;
            if (zzbfnVar != null) {
                zzbgzVar = zzbfnVar.zzA();
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
        return ResponseInfo.zzb(zzbgzVar);
    }

    public final void zzu(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            zzbfn zzbfnVar = this.zzj;
            if (zzbfnVar != null) {
                zzbfnVar.zzX(new zzbil(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final OnPaidEventListener zzv() {
        return this.zzp;
    }

    public final VideoController zzw() {
        return this.zze;
    }

    public final zzbhc zzx() {
        zzbfn zzbfnVar = this.zzj;
        if (zzbfnVar != null) {
            try {
                return zzbfnVar.zzL();
            } catch (RemoteException e2) {
                zzcgt.zzl("#007 Could not call remote method.", e2);
            }
        }
        return null;
    }

    public final void zzy(VideoOptions videoOptions) {
        this.zzk = videoOptions;
        try {
            zzbfn zzbfnVar = this.zzj;
            if (zzbfnVar != null) {
                zzbfnVar.zzM(videoOptions == null ? null : new zzbis(videoOptions));
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final VideoOptions zzz() {
        return this.zzk;
    }
}
