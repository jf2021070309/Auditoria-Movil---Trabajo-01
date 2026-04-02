package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* loaded from: classes.dex */
public final class zzbdd extends RemoteCreator<zzbfk> {
    public zzbdd() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* bridge */ /* synthetic */ zzbfk getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof zzbfk ? (zzbfk) queryLocalInterface : new zzbfk(iBinder);
    }

    public final zzbfj zza(Context context, String str, zzbvg zzbvgVar) {
        try {
            IBinder zze = getRemoteCreatorInstance(context).zze(ObjectWrapper.wrap(context), str, zzbvgVar, 213806000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbfj ? (zzbfj) queryLocalInterface : new zzbfh(zze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzcgt.zzj("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }
}
