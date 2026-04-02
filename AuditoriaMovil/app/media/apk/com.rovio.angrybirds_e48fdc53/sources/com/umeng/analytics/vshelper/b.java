package com.umeng.analytics.vshelper;

import android.app.Activity;
import android.os.Bundle;
import com.umeng.analytics.pro.bl;
/* compiled from: RealTimeDebugSwitch.java */
/* loaded from: classes3.dex */
public class b implements bl {
    private static final String a = "RealTimeDebugSwitch";
    private static volatile int b = 0;

    @Override // com.umeng.analytics.pro.bl
    public void a() {
    }

    @Override // com.umeng.analytics.pro.bl
    public void b() {
    }

    @Override // com.umeng.analytics.pro.bl
    public void a(Activity activity) {
    }

    @Override // com.umeng.analytics.pro.bl
    public void b(Activity activity) {
    }

    @Override // com.umeng.analytics.pro.bl
    public void c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    @Override // com.umeng.analytics.pro.bl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.app.Activity r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.vshelper.b.a(android.app.Activity, android.os.Bundle):void");
    }

    @Override // com.umeng.analytics.pro.bl
    public void c(Activity activity) {
        b++;
    }

    @Override // com.umeng.analytics.pro.bl
    public void d(Activity activity) {
        b--;
    }

    @Override // com.umeng.analytics.pro.bl
    public void e(Activity activity) {
    }

    @Override // com.umeng.analytics.pro.bl
    public void b(Activity activity, Bundle bundle) {
    }

    public static boolean d() {
        if (b > 0) {
            return true;
        }
        return false;
    }
}
