package com.google.android.gms.flags;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzc extends com.google.android.gms.internal.flags.zza implements zze {
    public zzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    @Override // com.google.android.gms.flags.zze
    public final boolean getBooleanFlagValue(String str, boolean z, int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.flags.zzc.zza(zza, z);
        zza.writeInt(i);
        Parcel zzb = zzb(2, zza);
        boolean zzc = com.google.android.gms.internal.flags.zzc.zzc(zzb);
        zzb.recycle();
        return zzc;
    }

    @Override // com.google.android.gms.flags.zze
    public final int getIntFlagValue(String str, int i, int i2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(i2);
        Parcel zzb = zzb(3, zza);
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.flags.zze
    public final long getLongFlagValue(String str, long j, int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j);
        zza.writeInt(i);
        Parcel zzb = zzb(4, zza);
        long readLong = zzb.readLong();
        zzb.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.flags.zze
    public final String getStringFlagValue(String str, String str2, int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeInt(i);
        Parcel zzb = zzb(5, zza);
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.flags.zze
    public final void init(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.flags.zzc.zzb(zza, iObjectWrapper);
        zzc(1, zza);
    }
}
