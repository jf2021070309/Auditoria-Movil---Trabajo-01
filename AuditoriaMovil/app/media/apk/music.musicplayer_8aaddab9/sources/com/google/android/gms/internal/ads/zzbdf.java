package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* loaded from: classes.dex */
public final class zzbdf extends RemoteCreator<zzbfo> {
    private zzcat zza;

    @VisibleForTesting
    public zzbdf() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* bridge */ /* synthetic */ zzbfo getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzbfo ? (zzbfo) queryLocalInterface : new zzbfo(iBinder);
    }

    public final zzbfn zza(Context context, zzbdl zzbdlVar, String str, zzbvg zzbvgVar, int i2) {
        zzbjl.zza(context);
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgW)).booleanValue()) {
            try {
                IBinder zze = getRemoteCreatorInstance(context).zze(ObjectWrapper.wrap(context), zzbdlVar, str, zzbvgVar, 213806000, i2);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof zzbfn ? (zzbfn) queryLocalInterface : new zzbfl(zze);
            } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
                zzcgt.zze("Could not create remote AdManager.", e2);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzbfo) zzcgx.zza(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzbde.zza)).zze(ObjectWrapper.wrap(context), zzbdlVar, str, zzbvgVar, 213806000, i2);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof zzbfn ? (zzbfn) queryLocalInterface2 : new zzbfl(zze2);
        } catch (RemoteException | zzcgw | NullPointerException e3) {
            zzcat zza = zzcar.zza(context);
            this.zza = zza;
            zza.zzd(e3, "AdManagerCreator.newAdManagerByDynamiteLoader");
            zzcgt.zzl("#007 Could not call remote method.", e3);
            return null;
        }
    }
}
