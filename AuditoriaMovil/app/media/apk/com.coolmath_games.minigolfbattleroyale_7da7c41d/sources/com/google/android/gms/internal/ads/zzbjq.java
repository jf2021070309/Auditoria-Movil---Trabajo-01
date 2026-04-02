package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes2.dex */
public final class zzbjq {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue<zzbka> zza = new ArrayBlockingQueue(100);
    final LinkedHashMap<String, String> zzb = new LinkedHashMap<>();
    final Map<String, zzbjw> zzc = new HashMap();
    private final HashSet<String> zzg = new HashSet<>(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    private final void zzg(Map<String, String> map, zzbjz zzbjzVar) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzbjzVar != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzbjzVar.zza())) {
                sb.append("&it=");
                sb.append(zzbjzVar.zza());
            }
            if (!TextUtils.isEmpty(zzbjzVar.zzb())) {
                sb.append("&blat=");
                sb.append(zzbjzVar.zzb());
            }
            uri = sb.toString();
        }
        if (!this.zzh.get()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzN(this.zze, this.zzf, uri);
            return;
        }
        File file = this.zzi;
        if (file != null) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file, true);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileOutputStream.write(uri.getBytes());
                fileOutputStream.write(10);
                try {
                    fileOutputStream.close();
                    return;
                } catch (IOException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                    return;
                }
            } catch (IOException e3) {
                e = e3;
                fileOutputStream2 = fileOutputStream;
                com.google.android.gms.ads.internal.util.zze.zzj("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                        return;
                    } catch (IOException e4) {
                        com.google.android.gms.ads.internal.util.zze.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                        return;
                    }
                }
                return;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e5) {
                        com.google.android.gms.ads.internal.util.zze.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                    }
                }
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zzi("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
    }

    public final void zza(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(zzbku.zzc.zze().booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.zzb.put(entry.getKey(), entry.getValue());
        }
        zzchg.zza.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbjp
            private final zzbjq zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf();
            }
        });
        this.zzc.put("action", zzbjw.zzb);
        this.zzc.put(FirebaseAnalytics.Param.AD_FORMAT, zzbjw.zzb);
        this.zzc.put("e", zzbjw.zzc);
    }

    public final boolean zzb(zzbka zzbkaVar) {
        return this.zza.offer(zzbkaVar);
    }

    final Map<String, String> zzc(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String str = (String) linkedHashMap.get(key);
            linkedHashMap.put(key, zzd(key).zza(str, entry.getValue()));
        }
        return linkedHashMap;
    }

    public final zzbjw zzd(String str) {
        zzbjw zzbjwVar = this.zzc.get(str);
        return zzbjwVar != null ? zzbjwVar : zzbjw.zza;
    }

    public final void zze(String str) {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzc(this.zzb, linkedHashMap), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void zzf() {
        while (true) {
            try {
                zzbka take = this.zza.take();
                zzbjz zzc = take.zzc();
                if (!TextUtils.isEmpty(zzc.zza())) {
                    zzg(zzc(this.zzb, take.zze()), zzc);
                }
            } catch (InterruptedException e) {
                com.google.android.gms.ads.internal.util.zze.zzj("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }
}
