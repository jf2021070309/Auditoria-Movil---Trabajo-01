package com.google.ads.interactivemedia.v3.internal;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzfz implements zzga {
    private zzfz() {
    }

    public /* synthetic */ zzfz(zzfy zzfyVar) {
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d0: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:54:0x00d0 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    @Override // com.google.ads.interactivemedia.v3.internal.zzga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.impl.data.zzbj zza(com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData r9) {
        /*
            r8 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
            java.lang.String r2 = r9.url()     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
            java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
            java.lang.String r0 = "User-Agent"
            java.lang.String r2 = r9.userAgent()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
            r1.setRequestProperty(r0, r2)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
            int r0 = r9.connectionTimeoutMs()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
            r1.setConnectTimeout(r0)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
            int r0 = r9.readTimeoutMs()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
            r1.setReadTimeout(r0)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
            com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData$RequestType r0 = r9.requestType()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
            com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData$RequestType r2 = com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData.RequestType.POST     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
            if (r0 != r2) goto L5a
            r0 = 1
            r1.setDoOutput(r0)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
            r0 = 0
            r1.setChunkedStreamingMode(r0)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
            java.lang.String r0 = r9.content()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
            if (r0 == 0) goto L5a
            java.io.OutputStream r2 = r1.getOutputStream()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L4e
            byte[] r0 = r0.getBytes(r3)     // Catch: java.lang.Throwable -> L4e
            r2.write(r0)     // Catch: java.lang.Throwable -> L4e
            r2.close()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
            goto L5a
        L4e:
            r0 = move-exception
            if (r2 == 0) goto L59
            r2.close()     // Catch: java.lang.Throwable -> L55
            goto L59
        L55:
            r2 = move-exception
            com.google.ads.interactivemedia.v3.internal.zzfx.zza(r0, r2)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
        L59:
            throw r0     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
        L5a:
            java.io.InputStream r0 = r1.getInputStream()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L97
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r3.<init>()     // Catch: java.lang.Throwable -> L97
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L97
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L97
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L97
            r5.<init>(r2, r6)     // Catch: java.lang.Throwable -> L97
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L97
        L74:
            java.lang.String r2 = r4.readLine()     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L7e
            r3.append(r2)     // Catch: java.lang.Throwable -> L97
            goto L74
        L7e:
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L87
            r0.close()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
        L87:
            java.lang.String r0 = r1.getContentType()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
            r1.disconnect()
            java.lang.String r9 = r9.id()
            com.google.ads.interactivemedia.v3.impl.data.zzbj r9 = com.google.ads.interactivemedia.v3.impl.data.zzbj.forResponse(r9, r2, r0)
            return r9
        L97:
            r2 = move-exception
            if (r0 == 0) goto La2
            r0.close()     // Catch: java.lang.Throwable -> L9e
            goto La2
        L9e:
            r0 = move-exception
            com.google.ads.interactivemedia.v3.internal.zzfx.zza(r2, r0)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
        La2:
            throw r2     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lcf
        La3:
            r0 = move-exception
            goto Lab
        La5:
            r9 = move-exception
            goto Ld1
        La7:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        Lab:
            boolean r0 = r0 instanceof java.net.SocketTimeoutException     // Catch: java.lang.Throwable -> Lcf
            if (r0 == 0) goto Lbf
            java.lang.String r9 = r9.id()     // Catch: java.lang.Throwable -> Lcf
            r0 = 101(0x65, float:1.42E-43)
            com.google.ads.interactivemedia.v3.impl.data.zzbj r9 = com.google.ads.interactivemedia.v3.impl.data.zzbj.forError(r9, r0)     // Catch: java.lang.Throwable -> Lcf
            if (r1 == 0) goto Lbe
            r1.disconnect()
        Lbe:
            return r9
        Lbf:
            java.lang.String r9 = r9.id()     // Catch: java.lang.Throwable -> Lcf
            r0 = 100
            com.google.ads.interactivemedia.v3.impl.data.zzbj r9 = com.google.ads.interactivemedia.v3.impl.data.zzbj.forError(r9, r0)     // Catch: java.lang.Throwable -> Lcf
            if (r1 == 0) goto Lce
            r1.disconnect()
        Lce:
            return r9
        Lcf:
            r9 = move-exception
            r0 = r1
        Ld1:
            if (r0 == 0) goto Ld6
            r0.disconnect()
        Ld6:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzfz.zza(com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData):com.google.ads.interactivemedia.v3.impl.data.zzbj");
    }
}
