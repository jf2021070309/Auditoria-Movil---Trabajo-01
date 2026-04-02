package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import e.a.d.a.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class zzbrk implements zzvv {
    private volatile zzbqx zza;
    private final Context zzb;

    public zzbrk(Context context) {
        this.zzb = context;
    }

    public static /* synthetic */ void zzc(zzbrk zzbrkVar) {
        if (zzbrkVar.zza == null) {
            return;
        }
        zzbrkVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzvv
    public final zzvy zza(zzwc<?> zzwcVar) throws zzwl {
        Parcelable.Creator<zzbqy> creator = zzbqy.CREATOR;
        Map<String, String> zzn = zzwcVar.zzn();
        int size = zzn.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry<String, String> entry : zzn.entrySet()) {
            strArr[i3] = entry.getKey();
            strArr2[i3] = entry.getValue();
            i3++;
        }
        zzbqy zzbqyVar = new zzbqy(zzwcVar.zzi(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
        try {
            zzchl zzchlVar = new zzchl();
            this.zza = new zzbqx(this.zzb, com.google.android.gms.ads.internal.zzt.zzq().zza(), new zzbri(this, zzchlVar), new zzbrj(this, zzchlVar));
            this.zza.checkAvailabilityAndConnect();
            zzbrg zzbrgVar = new zzbrg(this, zzbqyVar);
            zzfsn zzfsnVar = zzchg.zza;
            zzfsm zzh = zzfsd.zzh(zzfsd.zzi(zzchlVar, zzbrgVar, zzfsnVar), ((Integer) zzbet.zzc().zzc(zzbjl.zzcS)).intValue(), TimeUnit.MILLISECONDS, zzchg.zzd);
            zzh.zze(new zzbrh(this), zzfsnVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzh.get();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
            StringBuilder v = a.v(52, "Http assets remote cache took ");
            v.append(elapsedRealtime2 - elapsedRealtime);
            v.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(v.toString());
            zzbra zzbraVar = (zzbra) new zzcbh(parcelFileDescriptor).zza(zzbra.CREATOR);
            if (zzbraVar == null) {
                return null;
            }
            if (zzbraVar.zza) {
                throw new zzwl(zzbraVar.zzb);
            }
            if (zzbraVar.zze.length != zzbraVar.zzf.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = zzbraVar.zze;
                if (i2 >= strArr3.length) {
                    return new zzvy(zzbraVar.zzc, zzbraVar.zzd, hashMap, zzbraVar.zzg, zzbraVar.zzh);
                }
                hashMap.put(strArr3[i2], zzbraVar.zzf[i2]);
                i2++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
            StringBuilder v2 = a.v(52, "Http assets remote cache took ");
            v2.append(elapsedRealtime3 - elapsedRealtime);
            v2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(v2.toString());
            return null;
        } catch (Throwable th) {
            long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
            StringBuilder v3 = a.v(52, "Http assets remote cache took ");
            v3.append(elapsedRealtime4 - elapsedRealtime);
            v3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(v3.toString());
            throw th;
        }
    }
}
