package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
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
            zzcgt.zzi("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String valueOf = String.valueOf(this.zzg.getAbsolutePath());
            zzcgt.zzi(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.zzg = null;
        } else if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
        } else {
            String valueOf2 = String.valueOf(this.zzg.getAbsolutePath());
            zzcgt.zzi(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.zzg = null;
        }
    }

    private final File zza(File file) {
        return new File(this.zzg, String.valueOf(file.getName()).concat(".done"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ab, code lost:
        r15 = "sizeExceeded";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02ad, code lost:
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02bb, code lost:
        if (r1.length() == 0) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02bd, code lost:
        r11 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02c8, code lost:
        r11 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02d0, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02d1, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02d4, code lost:
        r2 = r11;
        r1 = r14;
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02d9, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02dc, code lost:
        r11 = r4;
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x036e, code lost:
        r26 = r4;
        r24 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0374, code lost:
        r15 = "downloadTimeout";
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0376, code lost:
        r0 = java.lang.Long.toString(r10);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
        r11 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03a1, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03a2, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03a5, code lost:
        r2 = r11;
        r1 = r24;
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03bd, code lost:
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03c3, code lost:
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03cb, code lost:
        if (com.google.android.gms.internal.ads.zzcgt.zzm(3) == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03cd, code lost:
        r1 = com.google.android.gms.internal.ads.zzcld.zzf.format(r13);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r30).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r30);
        com.google.android.gms.internal.ads.zzcgt.zzd(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0403, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x040c, code lost:
        if (r0.isFile() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x040e, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0416, code lost:
        r0.createNewFile();
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04c9  */
    @Override // com.google.android.gms.internal.ads.zzcla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(final java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcld.zzd(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzm() {
        this.zzh = true;
    }
}
