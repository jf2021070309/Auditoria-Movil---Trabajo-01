package com.applovin.impl.adview.activity;

import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.sdk.a.g;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class b {
    private final AppLovinFullscreenActivity a;
    private final int b;
    private final int c;
    private final boolean d;

    public b(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        this.a = appLovinFullscreenActivity;
        this.c = Utils.getRotation(appLovinFullscreenActivity);
        boolean isTablet = AppLovinSdkUtils.isTablet(appLovinFullscreenActivity);
        this.d = isTablet;
        this.b = a(this.c, isTablet);
    }

    private int a(int i, boolean z) {
        if (z) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 9;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 1 : -1;
        } else if (i == 0) {
            return 1;
        } else {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 9;
            }
            return i == 3 ? 8 : -1;
        }
    }

    private void a(int i) {
        try {
            this.a.setRequestedOrientation(i);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
        if (r6 == 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003e, code lost:
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
    private void a(com.applovin.impl.sdk.a.g.b r5, int r6, boolean r7) {
        /*
            r4 = this;
            com.applovin.impl.sdk.a.g$b r0 = com.applovin.impl.sdk.a.g.b.ACTIVITY_PORTRAIT
            r1 = 3
            r2 = 2
            r3 = 1
            if (r5 != r0) goto L23
            r5 = 9
            if (r7 == 0) goto L16
            if (r6 == r3) goto L10
            if (r6 == r1) goto L10
            goto L1a
        L10:
            if (r6 != r3) goto L1a
        L12:
            r4.a(r5)
            goto L41
        L16:
            if (r6 == 0) goto L1e
            if (r6 == r2) goto L1e
        L1a:
            r4.a(r3)
            goto L41
        L1e:
            if (r6 != 0) goto L21
            goto L1a
        L21:
            r3 = r5
            goto L1a
        L23:
            com.applovin.impl.sdk.a.g$b r0 = com.applovin.impl.sdk.a.g.b.ACTIVITY_LANDSCAPE
            if (r5 != r0) goto L41
            r5 = 8
            r0 = 0
            if (r7 == 0) goto L36
            if (r6 == 0) goto L31
            if (r6 == r2) goto L31
            goto L3a
        L31:
            if (r6 != r2) goto L34
            goto L12
        L34:
            r5 = r0
            goto L12
        L36:
            if (r6 == r3) goto L3e
            if (r6 == r1) goto L3e
        L3a:
            r4.a(r0)
            goto L41
        L3e:
            if (r6 != r3) goto L12
            goto L34
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.activity.b.a(com.applovin.impl.sdk.a.g$b, int, boolean):void");
    }

    public void a(g gVar) {
        int i;
        if (!gVar.E() || (i = this.b) == -1) {
            a(gVar.q(), this.c, this.d);
        } else {
            a(i);
        }
    }
}
