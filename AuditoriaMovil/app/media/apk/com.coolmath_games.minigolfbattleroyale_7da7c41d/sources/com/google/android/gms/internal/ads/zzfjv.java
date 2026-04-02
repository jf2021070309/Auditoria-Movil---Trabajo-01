package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.warren.ui.JavascriptBridge;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfjv implements zzfil {
    private final Object zza;
    private final zzfjw zzb;
    private final zzfkh zzc;
    private final zzfii zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
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
        } catch (Exception e) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final synchronized String zza(Context context, String str) {
        Map<String, Object> zzb;
        zzb = this.zzc.zzb();
        zzb.put(InneractiveMediationDefs.GENDER_FEMALE, "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return zzi(zzj(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map<String, Object> zzc;
        zzc = this.zzc.zzc();
        zzc.put(InneractiveMediationDefs.GENDER_FEMALE, "v");
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put(ViewHierarchyConstants.VIEW_KEY, view);
        zzc.put("act", null);
        return zzi(zzj(null, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> zzd;
        zzd = this.zzc.zzd();
        zzd.put(InneractiveMediationDefs.GENDER_FEMALE, "c");
        zzd.put("ctx", context);
        zzd.put("cs", str2);
        zzd.put("aid", null);
        zzd.put(ViewHierarchyConstants.VIEW_KEY, view);
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
            this.zzd.zzb(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfkf((int) IronSourceConstants.IS_INSTANCE_OPENED, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfjw zze() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzf() throws zzfkf {
        try {
        } catch (Exception e) {
            throw new zzfkf(2001, e);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }

    public final synchronized void zzg() throws zzfkf {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod(JavascriptBridge.MraidHandler.CLOSE_ACTION, new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzb(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfkf((int) IronSourceConstants.IS_INSTANCE_LOAD_SUCCESS, e);
        }
    }

    public final synchronized int zzh() throws zzfkf {
        try {
        } catch (Exception e) {
            throw new zzfkf((int) IronSourceConstants.IS_INSTANCE_CLICKED, e);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }
}
