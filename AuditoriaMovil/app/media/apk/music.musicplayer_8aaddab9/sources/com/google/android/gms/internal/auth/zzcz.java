package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class zzcz<T> {
    public static final /* synthetic */ int zzd = 0;
    @Nullable
    private static volatile zzcy zze;
    private static volatile boolean zzf;
    public final zzcx zzb;
    public final String zzc;
    private final T zzj;
    private volatile int zzk = -1;
    private volatile T zzl;
    private final boolean zzm;
    private static final Object zza = new Object();
    private static final AtomicReference<Collection<zzcz<?>>> zzg = new AtomicReference<>();
    private static final zzdb zzh = new zzdb(new Object() { // from class: com.google.android.gms.internal.auth.zzcr
    }, null);
    private static final AtomicInteger zzi = new AtomicInteger();

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzcz(zzcx zzcxVar, String str, Object obj, boolean z, zzct zzctVar) {
        if (zzcxVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zzb = zzcxVar;
        this.zzc = str;
        this.zzj = obj;
        this.zzm = true;
    }

    public static void zzd() {
        zzi.incrementAndGet();
    }

    public static void zze(final Context context) {
        if (zze == null) {
            Object obj = zza;
            synchronized (obj) {
                if (zze == null) {
                    synchronized (obj) {
                        zzcy zzcyVar = zze;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzcyVar == null || zzcyVar.zza() != context) {
                            zzcg.zzd();
                            zzda.zzc();
                            zzcn.zze();
                            zze = new zzcd(context, zzdk.zza(new zzdg() { // from class: com.google.android.gms.internal.auth.zzcs
                                @Override // com.google.android.gms.internal.auth.zzdg
                                public final Object zza() {
                                    zzde zzc;
                                    zzde zzc2;
                                    Context context2 = context;
                                    int i2 = zzcz.zzd;
                                    String str = Build.TYPE;
                                    String str2 = Build.TAGS;
                                    if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                                        if (zzcc.zza() && !context2.isDeviceProtectedStorage()) {
                                            context2 = context2.createDeviceProtectedStorageContext();
                                        }
                                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                        try {
                                            StrictMode.allowThreadDiskWrites();
                                            try {
                                                File file = new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                                                zzc = file.exists() ? zzde.zzd(file) : zzde.zzc();
                                            } catch (RuntimeException e2) {
                                                Log.e("HermeticFileOverrides", "no data dir", e2);
                                                zzc = zzde.zzc();
                                            }
                                            if (zzc.zzb()) {
                                                File file2 = (File) zzc.zza();
                                                try {
                                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                                    try {
                                                        HashMap hashMap = new HashMap();
                                                        HashMap hashMap2 = new HashMap();
                                                        while (true) {
                                                            String readLine = bufferedReader.readLine();
                                                            if (readLine == null) {
                                                                break;
                                                            }
                                                            String[] split = readLine.split(" ", 3);
                                                            if (split.length != 3) {
                                                                Log.e("HermeticFileOverrides", readLine.length() != 0 ? "Invalid: ".concat(readLine) : new String("Invalid: "));
                                                            } else {
                                                                String str3 = new String(split[0]);
                                                                String decode = Uri.decode(new String(split[1]));
                                                                String str4 = (String) hashMap2.get(split[2]);
                                                                if (str4 == null) {
                                                                    String str5 = new String(split[2]);
                                                                    str4 = Uri.decode(str5);
                                                                    if (str4.length() < 1024 || str4 == str5) {
                                                                        hashMap2.put(str5, str4);
                                                                    }
                                                                }
                                                                if (!hashMap.containsKey(str3)) {
                                                                    hashMap.put(str3, new HashMap());
                                                                }
                                                                ((Map) hashMap.get(str3)).put(decode, str4);
                                                            }
                                                        }
                                                        String.valueOf(file2).length();
                                                        zzco zzcoVar = new zzco(hashMap);
                                                        bufferedReader.close();
                                                        zzc2 = zzde.zzd(zzcoVar);
                                                    } catch (Throwable th) {
                                                        try {
                                                            bufferedReader.close();
                                                        } catch (Throwable th2) {
                                                            th.addSuppressed(th2);
                                                        }
                                                        throw th;
                                                    }
                                                } catch (IOException e3) {
                                                    throw new RuntimeException(e3);
                                                }
                                            } else {
                                                zzc2 = zzde.zzc();
                                            }
                                            return zzc2;
                                        } finally {
                                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                                        }
                                    }
                                    return zzde.zzc();
                                }
                            }));
                            zzi.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    public abstract T zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af A[Catch: all -> 0x010f, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005a, B:21:0x005e, B:48:0x00d7, B:50:0x00e7, B:52:0x00fb, B:53:0x00fe, B:54:0x0102, B:36:0x00af, B:38:0x00b5, B:42:0x00c7, B:44:0x00cd, B:47:0x00d5, B:41:0x00c5, B:23:0x0065, B:25:0x006b, B:27:0x0079, B:31:0x009e, B:33:0x00a8, B:29:0x0090, B:55:0x0107, B:56:0x010c, B:57:0x010d), top: B:64:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5 A[Catch: all -> 0x010f, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005a, B:21:0x005e, B:48:0x00d7, B:50:0x00e7, B:52:0x00fb, B:53:0x00fe, B:54:0x0102, B:36:0x00af, B:38:0x00b5, B:42:0x00c7, B:44:0x00cd, B:47:0x00d5, B:41:0x00c5, B:23:0x0065, B:25:0x006b, B:27:0x0079, B:31:0x009e, B:33:0x00a8, B:29:0x0090, B:55:0x0107, B:56:0x010c, B:57:0x010d), top: B:64:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7 A[Catch: all -> 0x010f, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005a, B:21:0x005e, B:48:0x00d7, B:50:0x00e7, B:52:0x00fb, B:53:0x00fe, B:54:0x0102, B:36:0x00af, B:38:0x00b5, B:42:0x00c7, B:44:0x00cd, B:47:0x00d5, B:41:0x00c5, B:23:0x0065, B:25:0x006b, B:27:0x0079, B:31:0x009e, B:33:0x00a8, B:29:0x0090, B:55:0x0107, B:56:0x010c, B:57:0x010d), top: B:64:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T zzb() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcz.zzb():java.lang.Object");
    }

    public final String zzc() {
        String str = this.zzb.zzd;
        return this.zzc;
    }
}
