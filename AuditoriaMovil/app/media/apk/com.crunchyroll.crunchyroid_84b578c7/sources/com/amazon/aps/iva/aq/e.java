package com.amazon.aps.iva.aq;

import android.content.Context;
/* compiled from: DefaultAndroidInfoProvider.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<h> {
    public final /* synthetic */ Context h;
    public final /* synthetic */ d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, d dVar) {
        super(0);
        this.h = context;
        this.i = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    @Override // com.amazon.aps.iva.xb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.aq.h invoke() {
        /*
            r9 = this;
            android.content.Context r0 = r9.h
            java.lang.String r1 = "uimode"
            java.lang.Object r1 = r0.getSystemService(r1)
            boolean r2 = r1 instanceof android.app.UiModeManager
            r3 = 0
            if (r2 == 0) goto L10
            android.app.UiModeManager r1 = (android.app.UiModeManager) r1
            goto L11
        L10:
            r1 = r3
        L11:
            r2 = 0
            r4 = 1
            if (r1 != 0) goto L16
            goto L1f
        L16:
            int r1 = r1.getCurrentModeType()
            r5 = 4
            if (r1 != r5) goto L1f
            r1 = r4
            goto L20
        L1f:
            r1 = r2
        L20:
            if (r1 == 0) goto L23
            goto L52
        L23:
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            java.lang.String r5 = "appContext.packageManager"
            com.amazon.aps.iva.yb0.j.e(r1, r5)
            com.amazon.aps.iva.aq.d r5 = r9.i
            int r5 = r5.b()
            r6 = 21
            if (r5 < r6) goto L3f
            java.lang.String r7 = "android.software.leanback"
            boolean r7 = r1.hasSystemFeature(r7)
            if (r7 == 0) goto L3f
            goto L52
        L3f:
            if (r5 >= r6) goto L4a
            java.lang.String r5 = "android.hardware.type.television"
            boolean r5 = r1.hasSystemFeature(r5)
            if (r5 == 0) goto L4a
            goto L52
        L4a:
            java.lang.String r5 = "com.google.android.tv"
            boolean r1 = r1.hasSystemFeature(r5)
            if (r1 == 0) goto L54
        L52:
            r1 = r4
            goto L55
        L54:
            r1 = r2
        L55:
            if (r1 == 0) goto L5b
            com.amazon.aps.iva.aq.h r0 = com.amazon.aps.iva.aq.h.TV
            goto Lc7
        L5b:
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r5 = "MODEL"
            com.amazon.aps.iva.yb0.j.e(r1, r5)
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r6 = "US"
            com.amazon.aps.iva.yb0.j.e(r5, r6)
            java.lang.String r6 = r1.toLowerCase(r5)
            java.lang.String r7 = "this as java.lang.String).toLowerCase(locale)"
            com.amazon.aps.iva.yb0.j.e(r6, r7)
            java.lang.String r8 = "tablet"
            boolean r8 = com.amazon.aps.iva.oe0.q.i0(r6, r8, r2)
            if (r8 != 0) goto L94
            java.lang.String r8 = "sm-t"
            boolean r6 = com.amazon.aps.iva.oe0.q.i0(r6, r8, r2)
            if (r6 == 0) goto L83
            goto L94
        L83:
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.smallestScreenWidthDp
            r8 = 800(0x320, float:1.121E-42)
            if (r6 < r8) goto L92
            goto L94
        L92:
            r6 = r2
            goto L95
        L94:
            r6 = r4
        L95:
            if (r6 == 0) goto L9a
            com.amazon.aps.iva.aq.h r0 = com.amazon.aps.iva.aq.h.TABLET
            goto Lc7
        L9a:
            java.lang.String r1 = r1.toLowerCase(r5)
            com.amazon.aps.iva.yb0.j.e(r1, r7)
            java.lang.String r5 = "phone"
            boolean r1 = com.amazon.aps.iva.oe0.q.i0(r1, r5, r2)
            if (r1 == 0) goto Laa
            goto Lc0
        Laa:
            java.lang.Object r0 = r0.getSystemService(r5)
            boolean r1 = r0 instanceof android.telephony.TelephonyManager
            if (r1 == 0) goto Lb5
            r3 = r0
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
        Lb5:
            if (r3 != 0) goto Lb8
            goto Lbf
        Lb8:
            int r0 = r3.getPhoneType()
            if (r0 != 0) goto Lbf
            r2 = r4
        Lbf:
            r4 = r4 ^ r2
        Lc0:
            if (r4 == 0) goto Lc5
            com.amazon.aps.iva.aq.h r0 = com.amazon.aps.iva.aq.h.MOBILE
            goto Lc7
        Lc5:
            com.amazon.aps.iva.aq.h r0 = com.amazon.aps.iva.aq.h.OTHER
        Lc7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.aq.e.invoke():java.lang.Object");
    }
}
