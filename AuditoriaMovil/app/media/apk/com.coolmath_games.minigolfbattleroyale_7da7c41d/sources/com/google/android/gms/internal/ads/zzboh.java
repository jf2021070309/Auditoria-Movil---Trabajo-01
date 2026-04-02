package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzboh extends RemoteCreator<zzbmu> {
    public zzboh() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* bridge */ /* synthetic */ zzbmu getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof zzbmu) {
            return (zzbmu) queryLocalInterface;
        }
        return new zzbms(iBinder);
    }

    public final zzbmr zza(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        zzbmr zzbmpVar;
        try {
            IBinder zze = getRemoteCreatorInstance(view.getContext()).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(hashMap), ObjectWrapper.wrap(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof zzbmr) {
                zzbmpVar = (zzbmr) queryLocalInterface;
            } else {
                zzbmpVar = new zzbmp(zze);
            }
            return zzbmpVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcgt.zzj("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
