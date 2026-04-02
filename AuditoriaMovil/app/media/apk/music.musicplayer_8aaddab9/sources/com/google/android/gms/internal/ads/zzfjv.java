package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzfjv implements zzfil {
    private final Object zza;
    private final zzfjw zzb;
    private final zzfkh zzc;
    private final zzfii zzd;

    public zzfjv(Object obj, zzfjw zzfjwVar, zzfkh zzfkhVar, zzfii zzfiiVar) {
        this.zza = obj;
        this.zzb = zzfjwVar;
        this.zzc = zzfkhVar;
        this.zzd = zzfiiVar;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzzl zza = zzzm.zza();
        zza.zzc(5);
        zza.zza(zzgex.zzt(bArr));
        return Base64.encodeToString(zza.zzah().zzao(), 11);
    }

    private final synchronized byte[] zzj(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e2) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e2);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final synchronized String zza(Context context, String str) {
        Map<String, Object> zzb;
        zzb = this.zzc.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return zzi(zzj(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map<String, Object> zzc;
        zzc = this.zzc.zzc();
        zzc.put("f", "v");
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put("view", view);
        zzc.put("act", null);
        return zzi(zzj(null, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> zzd;
        zzd = this.zzc.zzd();
        zzd.put("f", "c");
        zzd.put("ctx", context);
        zzd.put("cs", str2);
        zzd.put("aid", null);
        zzd.put("view", view);
        zzd.put("act", activity);
        return zzi(zzj(null, zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfkf {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap);
            this.zzd.zzb(AuthApiStatusCodes.AUTH_API_SERVER_ERROR, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e2) {
            throw new zzfkf(2005, e2);
        }
    }

    public final zzfjw zze() {
        return this.zzb;
    }

    public final synchronized boolean zzf() throws zzfkf {
        try {
        } catch (Exception e2) {
            throw new zzfkf((int) AdError.INTERNAL_ERROR_CODE, e2);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }

    public final synchronized void zzg() throws zzfkf {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzb(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e2) {
            throw new zzfkf((int) AdError.INTERNAL_ERROR_2003, e2);
        }
    }

    public final synchronized int zzh() throws zzfkf {
        try {
        } catch (Exception e2) {
            throw new zzfkf((int) AdError.INTERNAL_ERROR_2006, e2);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }
}
