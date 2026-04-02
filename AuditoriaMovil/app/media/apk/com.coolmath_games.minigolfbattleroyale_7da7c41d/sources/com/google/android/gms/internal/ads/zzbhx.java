package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbhx extends RemoteCreator<zzbgf> {
    public zzbhx() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* bridge */ /* synthetic */ zzbgf getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof zzbgf) {
            return (zzbgf) queryLocalInterface;
        }
        return new zzbgf(iBinder);
    }

    public final zzbge zza(Context context) {
        zzbge zzbgcVar;
        try {
            IBinder zze = getRemoteCreatorInstance(context).zze(ObjectWrapper.wrap(context), 213806000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzbge) {
                zzbgcVar = (zzbge) queryLocalInterface;
            } else {
                zzbgcVar = new zzbgc(zze);
            }
            return zzbgcVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcgt.zzj("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
