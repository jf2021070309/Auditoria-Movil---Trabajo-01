package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzhz implements Runnable {
    final /* synthetic */ zzia zza;
    private final URL zzb;
    private final String zzc;
    private final zzfs zzd;

    public zzhz(zzia zziaVar, String str, URL url, byte[] bArr, Map map, zzfs zzfsVar, byte[] bArr2) {
        this.zza = zziaVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfsVar);
        this.zzb = url;
        this.zzd = zzfsVar;
        this.zzc = str;
    }

    private final void zzb(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.zza.zzs.zzav().zzh(new Runnable(this, i, exc, bArr, map) { // from class: com.google.android.gms.measurement.internal.zzhy
            private final zzhz zza;
            private final int zzb;
            private final Exception zzc;
            private final byte[] zzd;
            private final Map zze;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = i;
                this.zzc = exc;
                this.zzd = bArr;
                this.zze = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0075  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.zzia r0 = r10.zza
            r0.zzaw()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.zzia r2 = r10.zza     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L6e
            java.net.URL r3 = r10.zzb     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L6e
            java.net.HttpURLConnection r2 = r2.zzd(r3)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L6e
            int r3 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L5a
            java.util.Map r4 = r2.getHeaderFields()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L42
            r5.<init>()     // Catch: java.lang.Throwable -> L42
            java.io.InputStream r6 = r2.getInputStream()     // Catch: java.lang.Throwable -> L42
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L40
        L24:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L40
            if (r8 <= 0) goto L2e
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L40
            goto L24
        L2e:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L40
            if (r6 == 0) goto L37
            r6.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c
        L37:
            if (r2 == 0) goto L3c
            r2.disconnect()
        L3c:
            r10.zzb(r3, r1, r0, r4)
            return
        L40:
            r0 = move-exception
            goto L44
        L42:
            r0 = move-exception
            r6 = r1
        L44:
            if (r6 == 0) goto L49
            r6.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c
        L49:
            throw r0     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c
        L4a:
            r0 = move-exception
            goto L65
        L4c:
            r0 = move-exception
            goto L73
        L4e:
            r0 = move-exception
            r4 = r1
            goto L65
        L51:
            r0 = move-exception
            r4 = r1
            goto L73
        L54:
            r3 = move-exception
            r4 = r1
            r9 = r3
            r3 = r0
            r0 = r9
            goto L65
        L5a:
            r3 = move-exception
            r4 = r1
            r9 = r3
            r3 = r0
            r0 = r9
            goto L73
        L60:
            r2 = move-exception
            r3 = r0
            r4 = r1
            r0 = r2
            r2 = r4
        L65:
            if (r2 == 0) goto L6a
            r2.disconnect()
        L6a:
            r10.zzb(r3, r1, r1, r4)
            throw r0
        L6e:
            r2 = move-exception
            r3 = r0
            r4 = r1
            r0 = r2
            r2 = r4
        L73:
            if (r2 == 0) goto L78
            r2.disconnect()
        L78:
            r10.zzb(r3, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhz.run():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i, Exception exc, byte[] bArr, Map map) {
        this.zzd.zza(this.zzc, i, exc, bArr, map);
    }
}
