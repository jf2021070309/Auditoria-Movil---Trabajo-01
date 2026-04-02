package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcds implements zzcdy {
    public static final /* synthetic */ int zzb = 0;
    private static final List<Future<Void>> zzc = Collections.synchronizedList(new ArrayList());
    public boolean zza;
    @GuardedBy("lock")
    private final zzgji zzd;
    @GuardedBy("lock")
    private final LinkedHashMap<String, zzgkc> zze;
    private final Context zzh;
    private final zzcdv zzi;
    private final zzcdu zzn;
    @GuardedBy("lock")
    private final List<String> zzf = new ArrayList();
    @GuardedBy("lock")
    private final List<String> zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet<String> zzk = new HashSet<>();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcds(Context context, zzcgz zzcgzVar, zzcdv zzcdvVar, String str, zzcdu zzcduVar, byte[] bArr) {
        Preconditions.checkNotNull(zzcdvVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap<>();
        this.zzn = zzcduVar;
        this.zzi = zzcdvVar;
        for (String str2 : zzcdvVar.zze) {
            this.zzk.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzgji zze = zzgkg.zze();
        zze.zzn(9);
        zze.zzb(str);
        zze.zzc(str);
        zzgjj zza = zzgjk.zza();
        String str3 = this.zzi.zza;
        if (str3 != null) {
            zza.zza(str3);
        }
        zze.zzd(zza.zzah());
        zzgke zza2 = zzgkf.zza();
        zza2.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str4 = zzcgzVar.zza;
        if (str4 != null) {
            zza2.zza(str4);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zza2.zzb(apkVersion);
        }
        zze.zzk(zza2.zzah());
        this.zzd = zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcdy
    public final zzcdv zzb() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcdy
    public final void zzc(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzi();
            } else {
                this.zzd.zzh(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdy
    public final boolean zzd() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzcdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzcdv r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7.zzl
            if (r0 == 0) goto Lc
            return
        Lc:
            com.google.android.gms.ads.internal.zzt.zzc()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.zzcgt.zzg(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.zzcgt.zzi(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.zzcgt.zzg(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzcdx.zza(r8)
            return
        L75:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzcdn r8 = new com.google.android.gms.internal.ads.zzcdn
            r8.<init>(r7, r1)
            com.google.android.gms.ads.internal.util.zzs.zzo(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcds.zze(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcdy
    public final void zzf(String str, Map<String, String> map, int i2) {
        synchronized (this.zzj) {
            if (i2 == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i2 == 3) {
                    this.zze.get(str).zze(zzgkb.zza(3));
                }
                return;
            }
            zzgkc zzd = zzgkd.zzd();
            int zza = zzgkb.zza(i2);
            if (zza != 0) {
                zzd.zze(zza);
            }
            zzd.zza(this.zze.size());
            zzd.zzb(str);
            zzgjn zza2 = zzgjq.zza();
            if (this.zzk.size() > 0 && map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey() != null ? entry.getKey() : "";
                    String value = entry.getValue() != null ? entry.getValue() : "";
                    if (this.zzk.contains(key.toLowerCase(Locale.ENGLISH))) {
                        zzgjl zza3 = zzgjm.zza();
                        zza3.zza(zzgex.zzv(key));
                        zza3.zzb(zzgex.zzv(value));
                        zza2.zza(zza3.zzah());
                    }
                }
            }
            zzd.zzc(zza2.zzah());
            this.zze.put(str, zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdy
    public final void zzg() {
        synchronized (this.zzj) {
            this.zze.keySet();
            zzfsm zza = zzfsd.zza(Collections.emptyMap());
            zzfrk zzfrkVar = new zzfrk(this) { // from class: com.google.android.gms.internal.ads.zzcdo
                private final zzcds zza;

                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzfrk
                public final zzfsm zza(Object obj) {
                    return this.zza.zzh((Map) obj);
                }
            };
            zzfsn zzfsnVar = zzchg.zzf;
            zzfsm zzi = zzfsd.zzi(zza, zzfrkVar, zzfsnVar);
            zzfsm zzh = zzfsd.zzh(zzi, 10L, TimeUnit.SECONDS, zzchg.zzd);
            zzfsd.zzp(zzi, new zzcdr(this, zzh), zzfsnVar);
            zzc.add(zzh);
        }
    }

    public final /* synthetic */ zzfsm zzh(Map map) throws Exception {
        zzgkc zzgkcVar;
        zzfsm zzj;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzgkcVar = this.zze.get(str);
                            }
                            if (zzgkcVar == null) {
                                String valueOf = String.valueOf(str);
                                zzcdx.zza(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                for (int i2 = 0; i2 < length; i2++) {
                                    zzgkcVar.zzd(optJSONArray.getJSONObject(i2).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                if (zzble.zzb.zze().booleanValue()) {
                    zzcgt.zze("Failed to get SafeBrowsing metadata", e2);
                }
                return zzfsd.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzfsd.zza(null);
        }
        synchronized (this.zzj) {
            for (zzgkc zzgkcVar2 : this.zze.values()) {
                this.zzd.zzf(zzgkcVar2.zzah());
            }
            this.zzd.zzl(this.zzf);
            this.zzd.zzm(this.zzg);
            if (zzcdx.zzb()) {
                String zza = this.zzd.zza();
                String zzg = this.zzd.zzg();
                StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 53 + String.valueOf(zzg).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(zza);
                sb.append("\n  clickUrl: ");
                sb.append(zzg);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (zzgkd zzgkdVar : this.zzd.zze()) {
                    sb2.append("    [");
                    sb2.append(zzgkdVar.zzc());
                    sb2.append("] ");
                    sb2.append(zzgkdVar.zza());
                }
                zzcdx.zza(sb2.toString());
            }
            zzfsm<String> zzb2 = new com.google.android.gms.ads.internal.util.zzbr(this.zzh).zzb(1, this.zzi.zzb, null, this.zzd.zzah().zzao());
            if (zzcdx.zzb()) {
                zzb2.zze(zzcdp.zza, zzchg.zza);
            }
            zzj = zzfsd.zzj(zzb2, zzcdq.zza, zzchg.zzf);
        }
        return zzj;
    }

    public final /* synthetic */ void zzi(Bitmap bitmap) {
        zzgev zzB = zzgex.zzB();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzB);
        synchronized (this.zzj) {
            zzgji zzgjiVar = this.zzd;
            zzgjv zza = zzgjx.zza();
            zza.zzb(zzB.zza());
            zza.zza("image/png");
            zza.zzc(2);
            zzgjiVar.zzj(zza.zzah());
        }
    }
}
