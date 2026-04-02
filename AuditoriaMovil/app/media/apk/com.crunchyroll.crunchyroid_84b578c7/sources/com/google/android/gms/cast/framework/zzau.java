package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.aps.iva.d0.b2;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzau extends com.google.android.gms.internal.cast.zza implements zzaw {
    public zzau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final int zze() throws RemoteException {
        Parcel zzb = zzb(17, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final int zzf() throws RemoteException {
        Parcel zzb = zzb(18, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final IObjectWrapper zzg() throws RemoteException {
        return b2.a(zzb(1, zza()));
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final String zzh() throws RemoteException {
        Parcel zzb = zzb(2, zza());
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final String zzi() throws RemoteException {
        Parcel zzb = zzb(3, zza());
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final void zzj(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(15, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final void zzk(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final void zzl(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final void zzm(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = com.google.android.gms.internal.cast.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(14, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final void zzn(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final void zzo(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(16, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final boolean zzp() throws RemoteException {
        Parcel zzb = zzb(5, zza());
        boolean zzf = com.google.android.gms.internal.cast.zzc.zzf(zzb);
        zzb.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final boolean zzq() throws RemoteException {
        Parcel zzb = zzb(6, zza());
        boolean zzf = com.google.android.gms.internal.cast.zzc.zzf(zzb);
        zzb.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final boolean zzr() throws RemoteException {
        Parcel zzb = zzb(8, zza());
        boolean zzf = com.google.android.gms.internal.cast.zzc.zzf(zzb);
        zzb.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final boolean zzs() throws RemoteException {
        Parcel zzb = zzb(7, zza());
        boolean zzf = com.google.android.gms.internal.cast.zzc.zzf(zzb);
        zzb.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final boolean zzt() throws RemoteException {
        Parcel zzb = zzb(9, zza());
        boolean zzf = com.google.android.gms.internal.cast.zzc.zzf(zzb);
        zzb.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final boolean zzu() throws RemoteException {
        Parcel zzb = zzb(10, zza());
        boolean zzf = com.google.android.gms.internal.cast.zzc.zzf(zzb);
        zzb.recycle();
        return zzf;
    }
}
