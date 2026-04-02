package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbdd extends RemoteCreator<zzbfk> {
    public zzbdd() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* bridge */ /* synthetic */ zzbfk getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof zzbfk) {
            return (zzbfk) queryLocalInterface;
        }
        return new zzbfk(iBinder);
    }

    public final zzbfj zza(Context context, String str, zzbvg zzbvgVar) {
        zzbfj zzbfhVar;
        try {
            IBinder zze = getRemoteCreatorInstance(context).zze(ObjectWrapper.wrap(context), str, zzbvgVar, 213806000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzbfj) {
                zzbfhVar = (zzbfj) queryLocalInterface;
            } else {
                zzbfhVar = new zzbfh(zze);
            }
            return zzbfhVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcgt.zzj("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
