package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* loaded from: classes.dex */
public final class zzbhx extends RemoteCreator<zzbgf> {
    public zzbhx() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* bridge */ /* synthetic */ zzbgf getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof zzbgf ? (zzbgf) queryLocalInterface : new zzbgf(iBinder);
    }

    public final zzbge zza(Context context) {
        try {
            IBinder zze = getRemoteCreatorInstance(context).zze(ObjectWrapper.wrap(context), 213806000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzbge ? (zzbge) queryLocalInterface : new zzbgc(zze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzcgt.zzj("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        }
    }
}
