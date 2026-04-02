package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzbzj implements zzbzk {
    @VisibleForTesting
    @GuardedBy("lock")
    public static boolean zza;
    @VisibleForTesting
    @GuardedBy("lock")
    public static boolean zzb;
    private static final Object zzd = new Object();
    @VisibleForTesting
    public zzffy zzc;

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final boolean zza(Context context) {
        synchronized (zzd) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue()) {
                if (zza) {
                    return true;
                }
                try {
                    zzb(context);
                    boolean zze = this.zzc.zze(ObjectWrapper.wrap(context));
                    zza = zze;
                    return zze;
                } catch (RemoteException e2) {
                    e = e2;
                    zzcgt.zzl("#007 Could not call remote method.", e);
                    return false;
                } catch (NullPointerException e3) {
                    e = e3;
                    zzcgt.zzl("#007 Could not call remote method.", e);
                    return false;
                }
            }
            return false;
        }
    }

    @VisibleForTesting
    public final void zzb(Context context) {
        synchronized (zzd) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && !zzb) {
                try {
                    zzb = true;
                    this.zzc = (zzffy) zzcgx.zza(context, "com.google.android.gms.ads.omid.DynamiteOmid", zzbzi.zza);
                } catch (zzcgw e2) {
                    zzcgt.zzl("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final String zzc(Context context) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue()) {
            try {
                zzb(context);
                String valueOf = String.valueOf(this.zzc.zzh());
                return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
            } catch (RemoteException | NullPointerException e2) {
                zzcgt.zzl("#007 Could not call remote method.", e2);
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final IObjectWrapper zzd(String str, WebView webView, String str2, String str3, String str4, zzbzm zzbzmVar, zzbzl zzbzlVar, String str5) {
        synchronized (zzd) {
            try {
                try {
                    if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zza) {
                        try {
                            return this.zzc.zzl(str, ObjectWrapper.wrap(webView), "", "javascript", str4, "Google", zzbzmVar.toString(), zzbzlVar.toString(), str5);
                        } catch (RemoteException | NullPointerException e2) {
                            zzcgt.zzl("#007 Could not call remote method.", e2);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final IObjectWrapper zze(String str, WebView webView, String str2, String str3, String str4, String str5, zzbzm zzbzmVar, zzbzl zzbzlVar, String str6) {
        synchronized (zzd) {
            try {
                try {
                    if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zza) {
                        try {
                            return this.zzc.zzk(str, ObjectWrapper.wrap(webView), "", "javascript", str4, str5, zzbzmVar.toString(), zzbzlVar.toString(), str6);
                        } catch (RemoteException | NullPointerException e2) {
                            zzcgt.zzl("#007 Could not call remote method.", e2);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzf(IObjectWrapper iObjectWrapper) {
        synchronized (zzd) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zza) {
                try {
                    this.zzc.zzf(iObjectWrapper);
                } catch (RemoteException | NullPointerException e2) {
                    zzcgt.zzl("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzg(IObjectWrapper iObjectWrapper) {
        synchronized (zzd) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zza) {
                try {
                    this.zzc.zzi(iObjectWrapper);
                } catch (RemoteException | NullPointerException e2) {
                    zzcgt.zzl("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzh(IObjectWrapper iObjectWrapper, View view) {
        synchronized (zzd) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zza) {
                try {
                    this.zzc.zzg(iObjectWrapper, ObjectWrapper.wrap(view));
                } catch (RemoteException | NullPointerException e2) {
                    zzcgt.zzl("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzi(IObjectWrapper iObjectWrapper, View view) {
        synchronized (zzd) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zza) {
                try {
                    this.zzc.zzj(iObjectWrapper, ObjectWrapper.wrap(view));
                } catch (RemoteException | NullPointerException e2) {
                    zzcgt.zzl("#007 Could not call remote method.", e2);
                }
            }
        }
    }
}
