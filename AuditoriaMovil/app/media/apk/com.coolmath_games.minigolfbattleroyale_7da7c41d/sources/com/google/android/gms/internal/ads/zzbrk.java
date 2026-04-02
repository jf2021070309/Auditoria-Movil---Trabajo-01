package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbrk implements zzvv {
    private volatile zzbqx zza;
    private final Context zzb;

    public zzbrk(Context context) {
        this.zzb = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
        int i = 0;
        int i2 = 0;
        for (Map.Entry<String, String> entry : zzn.entrySet()) {
            strArr[i2] = entry.getKey();
            strArr2[i2] = entry.getValue();
            i2++;
        }
        zzbqy zzbqyVar = new zzbqy(zzwcVar.zzi(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
        try {
            zzchl zzchlVar = new zzchl();
            this.zza = new zzbqx(this.zzb, com.google.android.gms.ads.internal.zzt.zzq().zza(), new zzbri(this, zzchlVar), new zzbrj(this, zzchlVar));
            this.zza.checkAvailabilityAndConnect();
            zzfsm zzh = zzfsd.zzh(zzfsd.zzi(zzchlVar, new zzbrg(this, zzbqyVar), zzchg.zza), ((Integer) zzbet.zzc().zzc(zzbjl.zzcS)).intValue(), TimeUnit.MILLISECONDS, zzchg.zzd);
            zzh.zze(new zzbrh(this), zzchg.zza);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzh.get();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2 - elapsedRealtime);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
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
                if (i < strArr3.length) {
                    hashMap.put(strArr3[i], zzbraVar.zzf[i]);
                    i++;
                } else {
                    return new zzvy(zzbraVar.zzc, zzbraVar.zzd, hashMap, zzbraVar.zzg, zzbraVar.zzh);
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(elapsedRealtime3 - elapsedRealtime);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            return null;
        } catch (Throwable th) {
            long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime4 - elapsedRealtime);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
            throw th;
        }
    }
}
