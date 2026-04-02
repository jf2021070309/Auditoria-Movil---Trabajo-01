package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbgk extends RemoteCreator {
    @VisibleForTesting
    public zzbgk() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof zzbes) {
            return (zzbes) queryLocalInterface;
        }
        return new zzbeq(iBinder);
    }

    public final zzbep zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        zzbep zzbenVar;
        try {
            IBinder zze = ((zzbes) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(frameLayout), ObjectWrapper.wrap(frameLayout2), 231004000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof zzbep) {
                zzbenVar = (zzbep) queryLocalInterface;
            } else {
                zzbenVar = new zzben(zze);
            }
            return zzbenVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzbzo.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
