package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzak extends com.google.android.gms.internal.cast.zza implements zzam {
    public zzak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zze(boolean z, int i) throws RemoteException {
        Parcel zza = zza();
        int i2 = com.google.android.gms.internal.cast.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zza.writeInt(0);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzf(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, applicationMetadata);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeInt(z ? 1 : 0);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzh(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, null);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzi(ConnectionResult connectionResult) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, connectionResult);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzj(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(2, zza);
    }
}
