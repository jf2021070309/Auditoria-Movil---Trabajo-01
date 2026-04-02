package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import e.c.a.l.e;
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
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class zzbjq {
    @VisibleForTesting
    public String zzd;
    @VisibleForTesting
    public Context zze;
    @VisibleForTesting
    public String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    @VisibleForTesting
    public final BlockingQueue<zzbka> zza = new ArrayBlockingQueue(100);
    @VisibleForTesting
    public final LinkedHashMap<String, String> zzb = new LinkedHashMap<>();
    @VisibleForTesting
    public final Map<String, zzbjw> zzc = new HashMap();
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
        if (file == null) {
            zzcgt.zzi("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(uri.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (IOException e3) {
                zzcgt.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
            }
        } catch (IOException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            zzcgt.zzj("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    zzcgt.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e6) {
                    zzcgt.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e6);
                }
            }
            throw th;
        }
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

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf();
            }
        });
        Map<String, zzbjw> map2 = this.zzc;
        zzbjw zzbjwVar = zzbjw.zzb;
        map2.put("action", zzbjwVar);
        this.zzc.put("ad_format", zzbjwVar);
        this.zzc.put(e.a, zzbjw.zzc);
    }

    public final boolean zzb(zzbka zzbkaVar) {
        return this.zza.offer(zzbkaVar);
    }

    public final Map<String, String> zzc(Map<String, String> map, Map<String, String> map2) {
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

    public final /* bridge */ /* synthetic */ void zzf() {
        while (true) {
            try {
                zzbka take = this.zza.take();
                zzbjz zzc = take.zzc();
                if (!TextUtils.isEmpty(zzc.zza())) {
                    zzg(zzc(this.zzb, take.zze()), zzc);
                }
            } catch (InterruptedException e2) {
                zzcgt.zzj("CsiReporter:reporter interrupted", e2);
                return;
            }
        }
    }
}
