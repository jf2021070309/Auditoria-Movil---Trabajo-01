package com.amazon.aps.iva.bw;

import android.annotation.SuppressLint;
import okhttp3.OkHttpClient;
/* compiled from: DashDrmLicenseDownloader.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes2.dex */
public final class d implements a {
    public final OkHttpClient a;
    public final String b;
    public final j c = new j();

    public d(String str, OkHttpClient okHttpClient) {
        this.a = okHttpClient;
        this.b = str.concat("/v1/download/license/widevine?specConform=true");
    }

    @Override // com.amazon.aps.iva.bw.a
    public final Object a(String str, String str2, String str3, com.amazon.aps.iva.ob0.d dVar) {
        return b(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    @Override // com.amazon.aps.iva.bw.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.bw.d.b(java.lang.String, java.lang.String, java.lang.String):java.lang.Object");
    }
}
