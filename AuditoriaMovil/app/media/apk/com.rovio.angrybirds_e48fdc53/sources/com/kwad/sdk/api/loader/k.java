package com.kwad.sdk.api.loader;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.kwad.sdk.api.core.IKsAdSDK;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k {
    private final String aiQ;
    private final String aiR;
    private final String aiS;
    private Resources aiT;
    private ClassLoader aiU;
    private IKsAdSDK aiV;

    private k(String str, String str2, String str3) {
        this.aiQ = str;
        this.aiR = str2;
        this.aiS = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized k a(Context context, ClassLoader classLoader, String str) {
        k b;
        synchronized (k.class) {
            try {
                b = b(context, classLoader, h.p(context, str), h.q(context, str), h.r(context, str));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return b;
    }

    private void a(Context context, ClassLoader classLoader) {
        yq();
        Resources a = q.a(context, context.getResources(), this.aiQ);
        ClassLoader a2 = e.a(context, classLoader, this.aiQ, this.aiR, this.aiS);
        IKsAdSDK a3 = Loader.a(a2);
        this.aiT = a;
        this.aiU = a2;
        this.aiV = a3;
        int sDKType = a3.getSDKType();
        if (sDKType == 1) {
            return;
        }
        throw new RuntimeException("sdkType error apiType: 1 , sdkType:" + sDKType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k b(Context context, ClassLoader classLoader, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("mApk is null");
        }
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            k kVar = new k(str, str2, str3);
            kVar.a(context, classLoader);
            return kVar;
        }
        throw new RuntimeException("mApk not a file");
    }

    private void yq() {
        if (TextUtils.isEmpty(this.aiQ)) {
            throw new RuntimeException("mApk is null");
        }
        File file = new File(this.aiQ);
        if (!file.isFile() || !file.exists()) {
            throw new RuntimeException("mApk not a file");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ClassLoader getClassLoader() {
        return this.aiU;
    }

    public final String toString() {
        return "ExternalPackage{mApk='" + this.aiQ + "', mDexDir='" + this.aiR + "', mNativeLibDir='" + this.aiS + "', mResource=" + this.aiT + ", mClassLoader=" + this.aiU + ", mKsSdk=" + this.aiV + '}';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Resources yo() {
        return this.aiT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final IKsAdSDK yp() {
        return this.aiV;
    }
}
