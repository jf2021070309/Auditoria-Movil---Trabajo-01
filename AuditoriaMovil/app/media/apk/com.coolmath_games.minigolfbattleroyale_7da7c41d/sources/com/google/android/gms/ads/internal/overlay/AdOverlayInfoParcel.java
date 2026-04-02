package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbor;
import com.google.android.gms.internal.ads.zzbot;
import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzcml;
import com.google.android.gms.internal.ads.zzdbp;
import com.google.android.gms.internal.ads.zzdio;
import com.google.android.gms.internal.ads.zzdvi;
import com.google.android.gms.internal.ads.zzedq;
import com.google.android.gms.internal.ads.zzffc;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    public final zzc zza;
    public final zzbcv zzb;
    public final zzo zzc;
    public final zzcml zzd;
    public final zzbot zze;
    public final String zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzv zzi;
    public final int zzj;
    public final int zzk;
    public final String zzl;
    public final zzcgz zzm;
    public final String zzn;
    public final com.google.android.gms.ads.internal.zzj zzo;
    public final zzbor zzp;
    public final String zzq;
    public final zzedq zzr;
    public final zzdvi zzs;
    public final zzffc zzt;
    public final zzbu zzu;
    public final String zzv;
    public final String zzw;
    public final zzdbp zzx;
    public final zzdio zzy;

    public AdOverlayInfoParcel(zzbcv zzbcvVar, zzo zzoVar, zzbor zzborVar, zzbot zzbotVar, zzv zzvVar, zzcml zzcmlVar, boolean z, int i, String str, zzcgz zzcgzVar, zzdio zzdioVar) {
        this.zza = null;
        this.zzb = zzbcvVar;
        this.zzc = zzoVar;
        this.zzd = zzcmlVar;
        this.zzp = zzborVar;
        this.zze = zzbotVar;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzvVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = zzcgzVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdioVar;
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, ObjectWrapper.wrap(this.zzb).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.zzc).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, ObjectWrapper.wrap(this.zzd).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, ObjectWrapper.wrap(this.zze).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel, 10, ObjectWrapper.wrap(this.zzi).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i, false);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzp).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeIBinder(parcel, 20, ObjectWrapper.wrap(this.zzr).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 21, ObjectWrapper.wrap(this.zzs).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 22, ObjectWrapper.wrap(this.zzt).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 23, ObjectWrapper.wrap(this.zzu).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 24, this.zzv, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzw, false);
        SafeParcelWriter.writeIBinder(parcel, 26, ObjectWrapper.wrap(this.zzx).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 27, ObjectWrapper.wrap(this.zzy).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AdOverlayInfoParcel(zzbcv zzbcvVar, zzo zzoVar, zzbor zzborVar, zzbot zzbotVar, zzv zzvVar, zzcml zzcmlVar, boolean z, int i, String str, String str2, zzcgz zzcgzVar, zzdio zzdioVar) {
        this.zza = null;
        this.zzb = zzbcvVar;
        this.zzc = zzoVar;
        this.zzd = zzcmlVar;
        this.zzp = zzborVar;
        this.zze = zzbotVar;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = zzvVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = zzcgzVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdioVar;
    }

    public AdOverlayInfoParcel(zzbcv zzbcvVar, zzo zzoVar, zzv zzvVar, zzcml zzcmlVar, int i, zzcgz zzcgzVar, String str, com.google.android.gms.ads.internal.zzj zzjVar, String str2, String str3, String str4, zzdbp zzdbpVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzoVar;
        this.zzd = zzcmlVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = str2;
        this.zzg = false;
        this.zzh = str3;
        this.zzi = null;
        this.zzj = i;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = zzcgzVar;
        this.zzn = str;
        this.zzo = zzjVar;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = str4;
        this.zzx = zzdbpVar;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(zzbcv zzbcvVar, zzo zzoVar, zzv zzvVar, zzcml zzcmlVar, boolean z, int i, zzcgz zzcgzVar, zzdio zzdioVar) {
        this.zza = null;
        this.zzb = zzbcvVar;
        this.zzc = zzoVar;
        this.zzd = zzcmlVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzvVar;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = zzcgzVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdioVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzcgz zzcgzVar, String str4, com.google.android.gms.ads.internal.zzj zzjVar, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6, String str7, IBinder iBinder11, IBinder iBinder12) {
        this.zza = zzcVar;
        this.zzb = (zzbcv) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzc = (zzo) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzd = (zzcml) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzp = (zzbor) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zze = (zzbot) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzi = (zzv) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = zzcgzVar;
        this.zzn = str4;
        this.zzo = zzjVar;
        this.zzq = str5;
        this.zzv = str6;
        this.zzr = (zzedq) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder7));
        this.zzs = (zzdvi) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder8));
        this.zzt = (zzffc) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder9));
        this.zzu = (zzbu) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder10));
        this.zzw = str7;
        this.zzx = (zzdbp) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder11));
        this.zzy = (zzdio) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder12));
    }

    public AdOverlayInfoParcel(zzc zzcVar, zzbcv zzbcvVar, zzo zzoVar, zzv zzvVar, zzcgz zzcgzVar, zzcml zzcmlVar, zzdio zzdioVar) {
        this.zza = zzcVar;
        this.zzb = zzbcvVar;
        this.zzc = zzoVar;
        this.zzd = zzcmlVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzvVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = zzcgzVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdioVar;
    }

    public AdOverlayInfoParcel(zzo zzoVar, zzcml zzcmlVar, int i, zzcgz zzcgzVar) {
        this.zzc = zzoVar;
        this.zzd = zzcmlVar;
        this.zzj = 1;
        this.zzm = zzcgzVar;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(zzcml zzcmlVar, zzcgz zzcgzVar, zzbu zzbuVar, zzedq zzedqVar, zzdvi zzdviVar, zzffc zzffcVar, String str, String str2, int i) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcmlVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = i;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = zzcgzVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzv = str2;
        this.zzr = zzedqVar;
        this.zzs = zzdviVar;
        this.zzt = zzffcVar;
        this.zzu = zzbuVar;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }
}
