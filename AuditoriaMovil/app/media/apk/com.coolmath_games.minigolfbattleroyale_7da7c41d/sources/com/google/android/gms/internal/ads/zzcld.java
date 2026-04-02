package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcld extends zzcla {
    public static final /* synthetic */ int zzd = 0;
    private static final Set<String> zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcld(zzcjb zzcjbVar) {
        super(zzcjbVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.zzg = file;
        if (file.isDirectory() || this.zzg.mkdirs()) {
            if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
                return;
            }
            String valueOf = String.valueOf(this.zzg.getAbsolutePath());
            com.google.android.gms.ads.internal.util.zze.zzi(valueOf.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf) : new String("Could not set cache file permissions at "));
            this.zzg = null;
            return;
        }
        String valueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        com.google.android.gms.ads.internal.util.zze.zzi(valueOf2.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf2) : new String("Could not create preload cache directory at "));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(this.zzg, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzm() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02b3, code lost:
        r15 = "sizeExceeded";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02b5, code lost:
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02c3, code lost:
        if (r1.length() == 0) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02c5, code lost:
        r11 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d0, code lost:
        r11 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02d8, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02d9, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02dc, code lost:
        r2 = r11;
        r1 = r14;
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e1, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02e4, code lost:
        r11 = r4;
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0376, code lost:
        r26 = r4;
        r24 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x037c, code lost:
        r15 = "downloadTimeout";
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x037e, code lost:
        r0 = java.lang.Long.toString(r10);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
        r11 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03a9, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03ac, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03ad, code lost:
        r2 = r11;
        r1 = r24;
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03c5, code lost:
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03cb, code lost:
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03d3, code lost:
        if (com.google.android.gms.ads.internal.util.zze.zzm(3) == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03d5, code lost:
        r1 = com.google.android.gms.internal.ads.zzcld.zzf.format(r13);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r30).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r30);
        com.google.android.gms.ads.internal.util.zze.zzd(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x040b, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0414, code lost:
        if (r0.isFile() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0416, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x041e, code lost:
        r0.createNewFile();
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04cf  */
    @Override // com.google.android.gms.internal.ads.zzcla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(final java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcld.zzd(java.lang.String):boolean");
    }
}
