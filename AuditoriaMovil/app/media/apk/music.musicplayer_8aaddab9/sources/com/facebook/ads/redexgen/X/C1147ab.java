package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;
/* renamed from: com.facebook.ads.redexgen.X.ab  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1147ab implements InterfaceC03956v {
    public final /* synthetic */ C1134aO A00;

    public C1147ab(C1134aO c1134aO) {
        this.A00 = c1134aO;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() throws CertificateException, PackageManager.NameNotFoundException, NoSuchAlgorithmException {
        Context context;
        Context context2;
        C7A A05;
        context = this.A00.A00;
        PackageManager packageManager = context.getPackageManager();
        context2 = this.A00.A00;
        Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < signatureArr.length; i2++) {
            hashMap.put(Integer.valueOf(i2), new C1135aP(signatureArr[i2]));
        }
        A05 = this.A00.A05(hashMap);
        return A05;
    }
}
