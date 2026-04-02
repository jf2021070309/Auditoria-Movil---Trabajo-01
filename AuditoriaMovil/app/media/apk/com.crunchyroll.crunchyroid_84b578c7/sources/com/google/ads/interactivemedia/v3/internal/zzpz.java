package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.cast.CastStatusCodes;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzpz implements zzpb {
    private final Object zza;
    private final zzqa zzb;
    private final zzql zzc;
    private final zzoy zzd;

    public zzpz(Object obj, zzqa zzqaVar, zzql zzqlVar, zzoy zzoyVar) {
        this.zza = obj;
        this.zzb = zzqaVar;
        this.zzc = zzqlVar;
        this.zzd = zzoyVar;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzbo zza = zzbp.zza();
        zza.zzc(5);
        zza.zza(zzadr.zzs(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzbp) zza.zzak()).zzav(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.zzd.zzc(CastStatusCodes.MESSAGE_SEND_BUFFER_TOO_FULL, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpb
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.zzc.zza();
        zza.put("f", "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put("view", view);
        zza.put("act", activity);
        return zzi(zzj(null, zza));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpb
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map zzc;
        zzc = this.zzc.zzc();
        zzc.put("f", "v");
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put("view", view);
        zzc.put("act", activity);
        return zzi(zzj(null, zzc));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpb
    public final synchronized String zzc(Context context, String str) {
        Map zzb;
        zzb = this.zzc.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return zzi(zzj(null, zzb));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpb
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzqj {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap);
            this.zzd.zzd(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzqj((int) CastStatusCodes.APPLICATION_NOT_RUNNING, e);
        }
    }

    public final synchronized int zze() throws zzqj {
        try {
        } catch (Exception e) {
            throw new zzqj((int) CastStatusCodes.MESSAGE_TOO_LARGE, e);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }

    public final zzqa zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzqj {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzd(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzqj((int) CastStatusCodes.NOT_ALLOWED, e);
        }
    }

    public final synchronized boolean zzh() throws zzqj {
        try {
        } catch (Exception e) {
            throw new zzqj((int) CastStatusCodes.INVALID_REQUEST, e);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }
}
