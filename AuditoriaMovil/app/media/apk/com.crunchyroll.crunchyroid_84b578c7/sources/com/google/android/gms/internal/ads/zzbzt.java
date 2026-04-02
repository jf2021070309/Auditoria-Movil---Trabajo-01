package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public class zzbzt implements zzbzg {
    private final String zza;

    public zzbzt(String str) {
        this.zza = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    @Override // com.google.android.gms.internal.ads.zzbzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean zza(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = ". "
            java.lang.String r1 = "Received non-success response code "
            java.lang.String r2 = "Error while pinging URL: "
            java.lang.String r3 = "Error while parsing ping URL: "
            java.lang.String r4 = "Pinging URL: "
            r5 = 0
            boolean r6 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d java.lang.IndexOutOfBoundsException -> L8f java.lang.Throwable -> L96
            if (r6 == 0) goto L16
            r6 = 263(0x107, float:3.69E-43)
            android.net.TrafficStats.setThreadStatsTag(r6)     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d java.lang.IndexOutOfBoundsException -> L8f java.lang.Throwable -> L96
        L16:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d java.lang.IndexOutOfBoundsException -> L8f java.lang.Throwable -> L96
            r6.<init>(r4)     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d java.lang.IndexOutOfBoundsException -> L8f java.lang.Throwable -> L96
            r6.append(r10)     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d java.lang.IndexOutOfBoundsException -> L8f java.lang.Throwable -> L96
            java.lang.String r4 = r6.toString()     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d java.lang.IndexOutOfBoundsException -> L8f java.lang.Throwable -> L96
            com.google.android.gms.internal.ads.zzbzo.zze(r4)     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d java.lang.IndexOutOfBoundsException -> L8f java.lang.Throwable -> L96
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d java.lang.IndexOutOfBoundsException -> L8f java.lang.Throwable -> L96
            r4.<init>(r10)     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d java.lang.IndexOutOfBoundsException -> L8f java.lang.Throwable -> L96
            java.net.URLConnection r4 = r4.openConnection()     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d java.lang.IndexOutOfBoundsException -> L8f java.lang.Throwable -> L96
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d java.lang.IndexOutOfBoundsException -> L8f java.lang.Throwable -> L96
            com.google.android.gms.ads.internal.client.zzay.zzb()     // Catch: java.lang.Throwable -> L91
            java.lang.String r6 = r9.zza     // Catch: java.lang.Throwable -> L91
            r7 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r7)     // Catch: java.lang.Throwable -> L91
            r8 = 1
            r4.setInstanceFollowRedirects(r8)     // Catch: java.lang.Throwable -> L91
            r4.setReadTimeout(r7)     // Catch: java.lang.Throwable -> L91
            if (r6 == 0) goto L49
            java.lang.String r7 = "User-Agent"
            r4.setRequestProperty(r7, r6)     // Catch: java.lang.Throwable -> L91
        L49:
            r4.setUseCaches(r5)     // Catch: java.lang.Throwable -> L91
            com.google.android.gms.internal.ads.zzbzn r6 = new com.google.android.gms.internal.ads.zzbzn     // Catch: java.lang.Throwable -> L91
            r7 = 0
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L91
            r6.zzc(r4, r7)     // Catch: java.lang.Throwable -> L91
            int r7 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L91
            r6.zze(r4, r7)     // Catch: java.lang.Throwable -> L91
            r6 = 200(0xc8, float:2.8E-43)
            if (r7 < r6) goto L67
            r6 = 300(0x12c, float:4.2E-43)
            if (r7 < r6) goto L65
            goto L67
        L65:
            r5 = r8
            goto L7e
        L67:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L91
            r6.append(r7)     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = " from pinging URL: "
            r6.append(r1)     // Catch: java.lang.Throwable -> L91
            r6.append(r10)     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L91
            com.google.android.gms.internal.ads.zzbzo.zzj(r1)     // Catch: java.lang.Throwable -> L91
        L7e:
            r4.disconnect()     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d java.lang.IndexOutOfBoundsException -> L8f java.lang.Throwable -> L96
            boolean r10 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r10 == 0) goto Ldb
            android.net.TrafficStats.clearThreadStatsTag()
            return r5
        L8b:
            r1 = move-exception
            goto L98
        L8d:
            r1 = move-exception
            goto L98
        L8f:
            r1 = move-exception
            goto Lbc
        L91:
            r1 = move-exception
            r4.disconnect()     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d java.lang.IndexOutOfBoundsException -> L8f java.lang.Throwable -> L96
            throw r1     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d java.lang.IndexOutOfBoundsException -> L8f java.lang.Throwable -> L96
        L96:
            r10 = move-exception
            goto Le0
        L98:
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L96
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L96
            r3.append(r10)     // Catch: java.lang.Throwable -> L96
            r3.append(r0)     // Catch: java.lang.Throwable -> L96
            r3.append(r1)     // Catch: java.lang.Throwable -> L96
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> L96
            com.google.android.gms.internal.ads.zzbzo.zzj(r10)     // Catch: java.lang.Throwable -> L96
            boolean r10 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r10 != 0) goto Lb8
            goto Ldb
        Lb8:
            android.net.TrafficStats.clearThreadStatsTag()
            return r5
        Lbc:
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L96
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L96
            r2.append(r10)     // Catch: java.lang.Throwable -> L96
            r2.append(r0)     // Catch: java.lang.Throwable -> L96
            r2.append(r1)     // Catch: java.lang.Throwable -> L96
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L96
            com.google.android.gms.internal.ads.zzbzo.zzj(r10)     // Catch: java.lang.Throwable -> L96
            boolean r10 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r10 != 0) goto Ldc
        Ldb:
            return r5
        Ldc:
            android.net.TrafficStats.clearThreadStatsTag()
            return r5
        Le0:
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r0 == 0) goto Le9
            android.net.TrafficStats.clearThreadStatsTag()
        Le9:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzt.zza(java.lang.String):boolean");
    }

    public zzbzt() {
        this.zza = null;
    }
}
