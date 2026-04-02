package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class zzboh extends RemoteCreator<zzbmu> {
    @VisibleForTesting
    public zzboh() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* bridge */ /* synthetic */ zzbmu getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof zzbmu ? (zzbmu) queryLocalInterface : new zzbms(iBinder);
    }

    public final zzbmr zza(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        try {
            IBinder zze = getRemoteCreatorInstance(view.getContext()).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(hashMap), ObjectWrapper.wrap(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof zzbmr ? (zzbmr) queryLocalInterface : new zzbmp(zze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzcgt.zzj("Could not create remote NativeAdViewHolderDelegate.", e2);
            return null;
        }
    }
}
