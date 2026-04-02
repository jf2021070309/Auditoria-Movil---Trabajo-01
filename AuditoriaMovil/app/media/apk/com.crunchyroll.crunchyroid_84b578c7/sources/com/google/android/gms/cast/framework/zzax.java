package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.aps.iva.d0.b2;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzax extends com.google.android.gms.internal.cast.zza implements zzay {
    public zzax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // com.google.android.gms.cast.framework.zzay
    public final int zze() throws RemoteException {
        Parcel zzb = zzb(8, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.cast.framework.zzay
    public final IObjectWrapper zzf() throws RemoteException {
        return b2.a(zzb(1, zza()));
    }

    @Override // com.google.android.gms.cast.framework.zzay
    public final IObjectWrapper zzg() throws RemoteException {
        return b2.a(zzb(7, zza()));
    }

    @Override // com.google.android.gms.cast.framework.zzay
    public final void zzh(zzao zzaoVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zze(zza, zzaoVar);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzay
    public final void zzi(zzba zzbaVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zze(zza, zzbaVar);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzay
    public final void zzj(boolean z, boolean z2) throws RemoteException {
        Parcel zza = zza();
        int i = com.google.android.gms.internal.cast.zzc.zza;
        zza.writeInt(1);
        zza.writeInt(z2 ? 1 : 0);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzay
    public final void zzk(zzao zzaoVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zze(zza, zzaoVar);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzay
    public final void zzl(zzba zzbaVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zze(zza, zzbaVar);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzay
    public final void zzm(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, bundle);
        zzc(9, zza);
    }
}
