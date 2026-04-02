package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbdf extends RemoteCreator<zzbfo> {
    private zzcat zza;

    public zzbdf() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* bridge */ /* synthetic */ zzbfo getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzbfo) {
            return (zzbfo) queryLocalInterface;
        }
        return new zzbfo(iBinder);
    }

    public final zzbfn zza(Context context, zzbdl zzbdlVar, String str, zzbvg zzbvgVar, int i) {
        zzbfn zzbflVar;
        zzbfn zzbflVar2;
        zzbjl.zza(context);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgW)).booleanValue()) {
            try {
                IBinder zze = ((zzbfo) zzcgx.zza(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzbde.zza)).zze(ObjectWrapper.wrap(context), zzbdlVar, str, zzbvgVar, 213806000, i);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface instanceof zzbfn) {
                    zzbflVar = (zzbfn) queryLocalInterface;
                } else {
                    zzbflVar = new zzbfl(zze);
                }
                return zzbflVar;
            } catch (RemoteException | zzcgw | NullPointerException e) {
                zzcat zza = zzcar.zza(context);
                this.zza = zza;
                zza.zzd(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                zzcgt.zzl("#007 Could not call remote method.", e);
                return null;
            }
        }
        try {
            IBinder zze2 = getRemoteCreatorInstance(context).zze(ObjectWrapper.wrap(context), zzbdlVar, str, zzbvgVar, 213806000, i);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface2 instanceof zzbfn) {
                zzbflVar2 = (zzbfn) queryLocalInterface2;
            } else {
                zzbflVar2 = new zzbfl(zze2);
            }
            return zzbflVar2;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzcgt.zze("Could not create remote AdManager.", e2);
            return null;
        }
    }
}
