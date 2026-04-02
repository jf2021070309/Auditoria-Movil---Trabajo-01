package com.kwad.sdk.utils;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.InstalledAppInfoManager;
import com.kwad.sdk.utils.bq;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public final class au {
    public static String aJm = "";

    public static com.kwad.sdk.k.a.b Hi() {
        return com.kwad.sdk.k.a.b.Hi();
    }

    public static com.kwad.sdk.k.a.f Hj() {
        return com.kwad.sdk.k.a.f.Hj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String Jh() {
        com.kwad.sdk.k.a.f Hj = com.kwad.sdk.k.a.f.Hj();
        int i = Hj != null ? Hj.aGF : -1;
        if (i >= 0) {
            return com.kwad.sdk.f.b.a(false, String.valueOf(i), 0);
        }
        boolean xt = ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).xt();
        String valueOf = String.valueOf(i);
        return !xt ? com.kwad.sdk.f.b.a(false, valueOf, 1) : com.kwad.sdk.f.b.a(false, valueOf, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String Ji() {
        com.kwad.sdk.k.a.b Hi = com.kwad.sdk.k.a.b.Hi();
        return Hi != null ? com.kwad.sdk.f.b.a(false, Hi.toJson(), 0) : !((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).xv() ? com.kwad.sdk.f.b.a(false, "", 1) : com.kwad.sdk.f.b.a(false, "", 2);
    }

    public static List<com.kwad.sdk.k.a.e> Jj() {
        return ax.Jj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String Jk() {
        return com.kwad.sdk.f.b.a(false, "1", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String Jl() {
        return com.kwad.sdk.f.b.a(false, String.valueOf(getSdkVersion()), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String Jm() {
        return com.kwad.sdk.f.b.a(false, String.valueOf(getAppId()), 0);
    }

    private static String bF(boolean z) {
        String bQ = be.bQ(z);
        if (!z) {
            return TextUtils.isEmpty(bQ) ? "" : bQ;
        }
        boolean z2 = true;
        if (TextUtils.isEmpty(bQ)) {
            return (at.Jb() || ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(2048L)) ? com.kwad.sdk.f.b.a(false, bQ, 1) : com.kwad.sdk.f.b.a(false, bQ, 5);
        }
        if (!at.Jb() || TextUtils.isEmpty(at.Jc())) {
            z2 = false;
        }
        return com.kwad.sdk.f.b.a(z2, bQ, 0);
    }

    private static String bG(boolean z) {
        if (!com.kwad.framework.a.a.mp.booleanValue() || TextUtils.isEmpty(bf.getDeviceId())) {
            String deviceId = be.getDeviceId();
            if (!z) {
                return TextUtils.isEmpty(deviceId) ? "" : deviceId;
            }
            boolean z2 = true;
            if (TextUtils.isEmpty(deviceId)) {
                return (at.IV() || !o.HU()) ? com.kwad.sdk.f.b.a(false, deviceId, 1) : com.kwad.sdk.f.b.a(false, deviceId, 5);
            }
            if (!at.IV() || TextUtils.isEmpty(at.IY())) {
                z2 = false;
            }
            return com.kwad.sdk.f.b.a(z2, deviceId, 0);
        }
        return bf.getDeviceId();
    }

    private static String bH(boolean z) {
        String JU = be.JU();
        return !z ? TextUtils.isEmpty(JU) ? "" : JU : !TextUtils.isEmpty(JU) ? com.kwad.sdk.f.b.a(at.Jd(), JU, 0) : (at.Jd() || ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(8L)) ? com.kwad.sdk.f.b.a(false, JU, 1) : com.kwad.sdk.f.b.a(false, JU, 2);
    }

    static /* synthetic */ String bI(boolean z) {
        return bF(true);
    }

    static /* synthetic */ String bJ(boolean z) {
        return Jh();
    }

    static /* synthetic */ String bK(boolean z) {
        return Ji();
    }

    static /* synthetic */ String bL(boolean z) {
        return bG(true);
    }

    static /* synthetic */ String bM(boolean z) {
        return bH(true);
    }

    static /* synthetic */ String bN(boolean z) {
        return Jk();
    }

    static /* synthetic */ String bO(boolean z) {
        return Jl();
    }

    static /* synthetic */ String bP(boolean z) {
        return Jm();
    }

    public static Location bW(Context context) {
        return r.bW(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Context context, boolean z) {
        String u = be.u(context, z);
        if (!z) {
            return TextUtils.isEmpty(u) ? "" : u;
        }
        boolean z2 = true;
        if (!TextUtils.isEmpty(u)) {
            if (!at.IV() || TextUtils.isEmpty(at.IW())) {
                z2 = false;
            }
            return com.kwad.sdk.f.b.a(z2, u, 0);
        } else if (Build.VERSION.SDK_INT >= 29) {
            return com.kwad.sdk.f.b.a(false, u, 4);
        } else {
            if (at.IV() || !o.HZ()) {
                return com.kwad.sdk.f.b.a(false, u, 1);
            }
            return com.kwad.sdk.f.b.a(false, u, SystemUtil.cZ(context) ? 3 : 1);
        }
    }

    public static String cA(Context context) {
        return g(context, false);
    }

    public static String cB(Context context) {
        return h(context, false);
    }

    public static String cC(Context context) {
        return i(context, false);
    }

    public static int cD(Context context) {
        return be.dg(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String cE(Context context) {
        int dg = be.dg(context);
        if (dg > 0) {
            return com.kwad.sdk.f.b.a(false, String.valueOf(dg), 0);
        }
        int i = Build.VERSION.SDK_INT;
        String valueOf = String.valueOf(dg);
        return i < 23 ? com.kwad.sdk.f.b.a(false, valueOf, 1) : com.kwad.sdk.f.b.a(false, valueOf, 3);
    }

    public static int cF(Context context) {
        return be.dh(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String cG(Context context) {
        List<bq.a> m = m(context, 15);
        if (m == null || m.size() <= 0) {
            if (at.Jd() || ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(32L)) {
                return com.kwad.sdk.f.b.a(false, "", 1);
            }
            return com.kwad.sdk.f.b.a(false, "", bq.m22do(context) ? 1 : 3);
        }
        return com.kwad.sdk.f.b.a(at.Jd(), t.I(m), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String cH(Context context) {
        Map<String, InstalledAppInfoManager.AppPackageInfo> bX = InstalledAppInfoManager.bX(context);
        boolean z = true;
        if (bX.size() > 0) {
            if (!at.Jf() || at.Jg() == null) {
                z = false;
            }
            return com.kwad.sdk.f.b.a(z, InstalledAppInfoManager.f(bX), 0);
        } else if (at.Jf() || !o.HX()) {
            return com.kwad.sdk.f.b.a(false, "", 1);
        } else {
            return com.kwad.sdk.f.b.a(false, "", be.dn(context) ? 3 : 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String cI(Context context) {
        Location bW = r.bW(context);
        boolean z = true;
        if (bW == null) {
            if (at.IT() || ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(64L)) {
                return com.kwad.sdk.f.b.a(false, "", 1);
            }
            return com.kwad.sdk.f.b.a(false, "", (ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.g) == 0 ? 1 : null) != null ? 3 : 1);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("latitude", String.valueOf(bW.getLatitude()));
        hashMap.put("longitude", String.valueOf(bW.getLongitude()));
        if (!at.IT() || at.IU() == null) {
            z = false;
        }
        return com.kwad.sdk.f.b.a(z, t.parseMap2JSON(hashMap), 0);
    }

    private static com.kwad.sdk.f.c cJ(final Context context) {
        return new com.kwad.sdk.f.c() { // from class: com.kwad.sdk.utils.au.1
            @Override // com.kwad.sdk.f.a
            public final String Fn() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getIMEI:" + au.c(context, true));
                return au.c(context, true);
            }

            @Override // com.kwad.sdk.f.a
            public final String Fo() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getAndroidID:" + au.d(context, true));
                return au.d(context, true);
            }

            @Override // com.kwad.sdk.f.a
            public final String Fp() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getMac:" + au.e(context, true));
                return au.e(context, true);
            }

            @Override // com.kwad.sdk.f.a
            public final String Fq() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getIMEI2:" + au.f(context, true));
                return au.f(context, true);
            }

            @Override // com.kwad.sdk.f.a
            public final String Fr() {
                String g = au.g(context, true);
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getIMEI2:" + g);
                return g;
            }

            @Override // com.kwad.sdk.f.a
            public final String Fs() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getIMSI:" + au.h(context, true));
                return au.h(context, true);
            }

            @Override // com.kwad.sdk.f.a
            public final String Ft() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getSimCardPhoneCount:" + au.cE(context));
                return au.cE(context);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.kwad.sdk.utils.au.bJ(boolean):java.lang.String
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
                	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
                Caused by: java.lang.IndexOutOfBoundsException: Index: 0
                	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
                	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
                	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
                	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
                	... 1 more
                */
            @Override // com.kwad.sdk.f.a
            public final java.lang.String Fu() {
                /*
                    r3 = this;
                    r0 = 1
                    java.lang.String r0 = com.kwad.sdk.utils.au.bJ(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "getSimCardActivePhoneCount:"
                    r1.<init>(r2)
                    r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "SDKPrivateSafetyDataUtil"
                    com.kwad.sdk.core.e.c.d(r2, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.au.AnonymousClass1.Fu():java.lang.String");
            }

            /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.kwad.sdk.utils.au.bK(boolean):java.lang.String
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
                	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
                Caused by: java.lang.IndexOutOfBoundsException: Index: 0
                	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
                	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
                	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
                	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
                	... 1 more
                */
            @Override // com.kwad.sdk.f.a
            public final java.lang.String Fv() {
                /*
                    r3 = this;
                    r0 = 1
                    java.lang.String r0 = com.kwad.sdk.utils.au.bK(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "getBaseStationInfo:"
                    r1.<init>(r2)
                    r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "SDKPrivateSafetyDataUtil"
                    com.kwad.sdk.core.e.c.d(r2, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.au.AnonymousClass1.Fv():java.lang.String");
            }

            @Override // com.kwad.sdk.f.a
            public final String Fw() {
                String cG = au.cG(context);
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getWifiList:" + cG);
                return cG;
            }

            @Override // com.kwad.sdk.f.a
            public final String Fx() {
                String cH = au.cH(context);
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getAppList:" + cH);
                return cH;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.kwad.sdk.utils.au.bN(boolean):java.lang.String
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
                	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
                Caused by: java.lang.IndexOutOfBoundsException: Index: 0
                	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
                	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
                	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
                	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
                	... 1 more
                */
            @Override // com.kwad.sdk.f.a
            public final java.lang.String Fy() {
                /*
                    r3 = this;
                    r0 = 1
                    java.lang.String r0 = com.kwad.sdk.utils.au.bN(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "getSdkType:"
                    r1.<init>(r2)
                    r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "SDKPrivateSafetyDataUtil"
                    com.kwad.sdk.core.e.c.d(r2, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.au.AnonymousClass1.Fy():java.lang.String");
            }

            /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.kwad.sdk.utils.au.bP(boolean):java.lang.String
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
                	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
                Caused by: java.lang.IndexOutOfBoundsException: Index: 0
                	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
                	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
                	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
                	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
                	... 1 more
                */
            @Override // com.kwad.sdk.f.a
            public final java.lang.String getAppId() {
                /*
                    r3 = this;
                    r0 = 1
                    java.lang.String r0 = com.kwad.sdk.utils.au.bP(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "getAppId:"
                    r1.<init>(r2)
                    r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "SDKPrivateSafetyDataUtil"
                    com.kwad.sdk.core.e.c.d(r2, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.au.AnonymousClass1.getAppId():java.lang.String");
            }

            @Override // com.kwad.sdk.f.a
            public final String getDeviceId() {
                String bL = au.bL(true);
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getDeviceId:" + bL);
                return bL;
            }

            @Override // com.kwad.sdk.f.a
            public final String getIccId() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getIccId:" + au.i(context, true));
                return au.i(context, true);
            }

            @Override // com.kwad.sdk.f.a
            public final String getIp() {
                String bM = au.bM(true);
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getIp:" + bM);
                return bM;
            }

            @Override // com.kwad.sdk.f.a
            public final String getLocation() {
                String cI = au.cI(context);
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getLocation:" + cI);
                return cI;
            }

            @Override // com.kwad.sdk.f.a
            public final String getOaid() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getOaid:" + au.bI(true));
                return au.bI(true);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.kwad.sdk.utils.au.bO(boolean):java.lang.String
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
                	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
                Caused by: java.lang.IndexOutOfBoundsException: Index: 0
                	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
                	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
                	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
                	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
                	... 1 more
                */
            @Override // com.kwad.sdk.f.a
            public final java.lang.String getSdkVersion() {
                /*
                    r3 = this;
                    r0 = 1
                    java.lang.String r0 = com.kwad.sdk.utils.au.bO(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "getSdkVersion:"
                    r1.<init>(r2)
                    r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "SDKPrivateSafetyDataUtil"
                    com.kwad.sdk.core.e.c.d(r2, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.au.AnonymousClass1.getSdkVersion():java.lang.String");
            }
        };
    }

    public static String cw(Context context) {
        return c(context, false);
    }

    public static String cx(Context context) {
        return d(context, false);
    }

    public static String cy(Context context) {
        return e(context, false);
    }

    public static String cz(Context context) {
        return f(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(Context context, boolean z) {
        String cx = be.cx(context);
        if (!z) {
            return TextUtils.isEmpty(cx) ? "" : cx;
        }
        boolean z2 = true;
        if (TextUtils.isEmpty(cx)) {
            return (at.IV() || !o.HU()) ? com.kwad.sdk.f.b.a(false, cx, 1) : com.kwad.sdk.f.b.a(false, cx, 5);
        }
        if (!at.IV() || TextUtils.isEmpty(at.IY())) {
            z2 = false;
        }
        return com.kwad.sdk.f.b.a(z2, cx, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(Context context, boolean z) {
        String dl = be.dl(context);
        if (!z) {
            return TextUtils.isEmpty(dl) ? "" : dl;
        }
        boolean z2 = true;
        if (TextUtils.isEmpty(dl)) {
            if (at.IZ() || !o.HV()) {
                return com.kwad.sdk.f.b.a(false, dl, 0);
            }
            return com.kwad.sdk.f.b.a(false, dl, al.ao(context, com.kuaishou.weapon.p0.g.d) == 0 ? 3 : 1);
        }
        if (!at.IZ() || TextUtils.isEmpty(at.Ja())) {
            z2 = false;
        }
        return com.kwad.sdk.f.b.a(z2, dl.toLowerCase(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(Context context, boolean z) {
        String[] df = be.df(context);
        String str = (df == null || df.length <= 0) ? null : df[0];
        if (!z) {
            return TextUtils.isEmpty(str) ? "" : str;
        }
        boolean z2 = true;
        if (!TextUtils.isEmpty(str)) {
            if (!at.IV() || TextUtils.isEmpty(at.IW())) {
                z2 = false;
            }
            return com.kwad.sdk.f.b.a(z2, str, 0);
        } else if (Build.VERSION.SDK_INT >= 29) {
            return com.kwad.sdk.f.b.a(false, str, 4);
        } else {
            if (at.IV() || !o.HZ()) {
                return com.kwad.sdk.f.b.a(false, str, 1);
            }
            return com.kwad.sdk.f.b.a(false, str, SystemUtil.cZ(context) ? 3 : 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(Context context, boolean z) {
        String[] df = be.df(context);
        boolean z2 = true;
        String str = (df == null || df.length <= 1) ? null : df[1];
        if (!z) {
            return TextUtils.isEmpty(str) ? "" : str;
        } else if (!TextUtils.isEmpty(str)) {
            if (!at.IV() || TextUtils.isEmpty(at.IW())) {
                z2 = false;
            }
            return com.kwad.sdk.f.b.a(z2, str, 0);
        } else if (Build.VERSION.SDK_INT >= 29) {
            return com.kwad.sdk.f.b.a(false, str, 4);
        } else {
            if (at.IV() || !o.HZ()) {
                return com.kwad.sdk.f.b.a(false, str, 1);
            }
            return com.kwad.sdk.f.b.a(false, str, SystemUtil.cZ(context) ? 3 : 1);
        }
    }

    private static String getAppId() {
        return ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).getAppId();
    }

    public static String getDeviceId() {
        return bG(false);
    }

    public static String getOaid() {
        return bF(false);
    }

    private static String getSdkVersion() {
        return BuildConfig.VERSION_NAME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String h(Context context, boolean z) {
        String cB = be.cB(context);
        if (!z) {
            return TextUtils.isEmpty(cB) ? "" : cB;
        } else if (TextUtils.isEmpty(cB)) {
            if (Build.VERSION.SDK_INT >= 29) {
                return com.kwad.sdk.f.b.a(false, cB, 4);
            }
            if (at.IV() || !o.Ia()) {
                return com.kwad.sdk.f.b.a(false, cB, 1);
            }
            return com.kwad.sdk.f.b.a(false, cB, SystemUtil.cZ(context) ? 3 : 1);
        } else {
            return com.kwad.sdk.f.b.a(at.IV(), cB, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i(Context context, boolean z) {
        String di = be.di(context);
        if (!z) {
            return TextUtils.isEmpty(di) ? "" : di;
        } else if (TextUtils.isEmpty(di)) {
            if (at.IV() || !o.Ib()) {
                return com.kwad.sdk.f.b.a(false, di, 1);
            }
            return com.kwad.sdk.f.b.a(false, di, SystemUtil.cZ(context) ? 3 : 1);
        } else {
            return com.kwad.sdk.f.b.a(at.IV(), di, 0);
        }
    }

    public static void init(Context context) {
        com.kwad.sdk.f.b.a(cJ(context));
    }

    public static List<bq.a> m(Context context, int i) {
        return bq.m(context, 15);
    }
}
