package com.google.android.gms.internal.measurement;

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
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public abstract class zzht<T> {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    @Nullable
    private static volatile zzhs zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicReference<Collection<zzht<?>>> zzg = new AtomicReference<>();
    private static final zzhv zzh = new zzhv(zzhm.zza);
    private static final AtomicInteger zzj = new AtomicInteger();
    final zzhr zza;
    final String zzb;
    private final T zzi;
    private volatile int zzk = -1;
    private volatile T zzl;
    private final boolean zzm;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzht(zzhr zzhrVar, String str, Object obj, boolean z, zzhn zzhnVar) {
        if (zzhrVar.zzb != null) {
            this.zza = zzhrVar;
            this.zzb = str;
            this.zzi = obj;
            this.zzm = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    @Deprecated
    public static void zzb(final Context context) {
        synchronized (zzd) {
            zzhs zzhsVar = zze;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (zzhsVar == null || zzhsVar.zza() != context) {
                zzha.zzd();
                zzhu.zzb();
                zzhh.zzc();
                zze = new zzgx(context, zzif.zza(new zzib(context) { // from class: com.google.android.gms.internal.measurement.zzhl
                    private final Context zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = context;
                    }

                    @Override // com.google.android.gms.internal.measurement.zzib
                    public final Object zza() {
                        zzhz zzc2;
                        zzhz zzc3;
                        Context context2 = this.zza;
                        int i = zzht.zzc;
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                            return zzhz.zzc();
                        }
                        if (zzgw.zza() && !context2.isDeviceProtectedStorage()) {
                            context2 = context2.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                                zzc2 = file.exists() ? zzhz.zzd(file) : zzhz.zzc();
                            } catch (RuntimeException e) {
                                Log.e("HermeticFileOverrides", "no data dir", e);
                                zzc2 = zzhz.zzc();
                            }
                            if (zzc2.zza()) {
                                File file2 = (File) zzc2.zzb();
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
                                        String valueOf = String.valueOf(file2);
                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
                                        sb.append("Parsed ");
                                        sb.append(valueOf);
                                        Log.i("HermeticFileOverrides", sb.toString());
                                        zzhi zzhiVar = new zzhi(hashMap);
                                        bufferedReader.close();
                                        zzc3 = zzhz.zzd(zzhiVar);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th2) {
                                            zzim.zza(th, th2);
                                        }
                                        throw th;
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else {
                                zzc3 = zzhz.zzc();
                            }
                            return zzc3;
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    }
                }));
                zzj.incrementAndGet();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzc() {
        zzj.incrementAndGet();
    }

    abstract T zza(Object obj);

    public final String zzd() {
        String str = this.zza.zzd;
        return this.zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be A[Catch: all -> 0x011e, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003d, B:20:0x0049, B:22:0x0052, B:24:0x0064, B:26:0x006f, B:25:0x0069, B:47:0x00e4, B:49:0x00f4, B:51:0x010a, B:52:0x010d, B:53:0x0111, B:41:0x00be, B:43:0x00da, B:46:0x00e2, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:36:0x00ad, B:38:0x00b7, B:34:0x009f, B:54:0x0116, B:55:0x011b, B:56:0x011c), top: B:63:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4 A[Catch: all -> 0x011e, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003d, B:20:0x0049, B:22:0x0052, B:24:0x0064, B:26:0x006f, B:25:0x0069, B:47:0x00e4, B:49:0x00f4, B:51:0x010a, B:52:0x010d, B:53:0x0111, B:41:0x00be, B:43:0x00da, B:46:0x00e2, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:36:0x00ad, B:38:0x00b7, B:34:0x009f, B:54:0x0116, B:55:0x011b, B:56:0x011c), top: B:63:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T zze() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzht.zze():java.lang.Object");
    }
}
