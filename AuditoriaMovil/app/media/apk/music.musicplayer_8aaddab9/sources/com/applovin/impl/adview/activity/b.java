package com.applovin.impl.adview.activity;

import android.app.Activity;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class b {
    private final Activity a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3163b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3164c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3165d;

    public b(Activity activity) {
        this.a = activity;
        int rotation = Utils.getRotation(activity);
        this.f3164c = rotation;
        boolean isTablet = AppLovinSdkUtils.isTablet(activity);
        this.f3165d = isTablet;
        this.f3163b = a(rotation, isTablet);
    }

    private int a(int i2, boolean z) {
        if (z) {
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 1) {
                return 9;
            }
            if (i2 == 2) {
                return 8;
            }
            return i2 == 3 ? 1 : -1;
        } else if (i2 == 0) {
            return 1;
        } else {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 9;
            }
            return i2 == 3 ? 8 : -1;
        }
    }

    private void a(int i2) {
        try {
            this.a.setRequestedOrientation(i2);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
        if (r6 == 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
        if (r6 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r6 != 3) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r6 != 1) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.applovin.impl.sdk.ad.e.b r5, int r6, boolean r7) {
        /*
            r4 = this;
            com.applovin.impl.sdk.ad.e$b r0 = com.applovin.impl.sdk.ad.e.b.ACTIVITY_PORTRAIT
            r1 = 3
            r2 = 2
            r3 = 1
            if (r5 != r0) goto L24
            r5 = 9
            if (r7 == 0) goto L16
            if (r6 == r3) goto L10
            if (r6 == r1) goto L10
            goto L1a
        L10:
            if (r6 != r3) goto L1a
        L12:
            r4.a(r5)
            goto L42
        L16:
            if (r6 == 0) goto L1e
            if (r6 == r2) goto L1e
        L1a:
            r4.a(r3)
            goto L42
        L1e:
            if (r6 != 0) goto L21
            goto L1a
        L21:
            r3 = 9
            goto L1a
        L24:
            com.applovin.impl.sdk.ad.e$b r0 = com.applovin.impl.sdk.ad.e.b.ACTIVITY_LANDSCAPE
            if (r5 != r0) goto L42
            r5 = 8
            r0 = 0
            if (r7 == 0) goto L37
            if (r6 == 0) goto L32
            if (r6 == r2) goto L32
            goto L3b
        L32:
            if (r6 != r2) goto L35
            goto L12
        L35:
            r5 = 0
            goto L12
        L37:
            if (r6 == r3) goto L3f
            if (r6 == r1) goto L3f
        L3b:
            r4.a(r0)
            goto L42
        L3f:
            if (r6 != r3) goto L12
            goto L35
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.activity.b.a(com.applovin.impl.sdk.ad.e$b, int, boolean):void");
    }

    public void a(e eVar) {
        int i2;
        if (!eVar.C() || (i2 = this.f3163b) == -1) {
            a(eVar.n(), this.f3164c, this.f3165d);
        } else {
            a(i2);
        }
    }
}
