package com.amazon.aps.iva.pa0;

import android.content.Context;
import com.amazon.aps.iva.b30.j;
import com.amazon.aps.iva.oa0.g0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/* compiled from: SLReflectionInstallReferrer.java */
/* loaded from: classes4.dex */
public final class e implements InvocationHandler {
    public static final /* synthetic */ int d = 0;
    public Object b;
    public final d c;

    /* compiled from: SLReflectionInstallReferrer.java */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.STATUS_OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.STATUS_FEATURE_NOT_SUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.STATUS_SERVICE_UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: SLReflectionInstallReferrer.java */
    /* loaded from: classes4.dex */
    public enum b {
        STATUS_OK(0),
        STATUS_FEATURE_NOT_SUPPORTED(1),
        STATUS_SERVICE_UNAVAILABLE(2);
        
        private int value;

        b(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    static {
        new j(e.class.getSimpleName());
    }

    public e(Context context, f fVar) {
        this.c = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r11) {
        /*
            r10 = this;
            com.amazon.aps.iva.pa0.e$b[] r0 = com.amazon.aps.iva.pa0.e.b.values()
            r11 = r0[r11]
            int[] r0 = com.amazon.aps.iva.pa0.e.a.a
            int r11 = r11.ordinal()
            r11 = r0[r11]
            r0 = 1
            com.amazon.aps.iva.pa0.d r1 = r10.c
            r2 = 0
            if (r11 == r0) goto L29
            r0 = 2
            if (r11 == r0) goto L24
            r0 = 3
            if (r11 == r0) goto L1f
            r1.a(r2)
            goto Lb1
        L1f:
            r1.a(r2)
            goto Lb1
        L24:
            r1.a(r2)
            goto Lb1
        L29:
            java.lang.Object r11 = r10.b     // Catch: java.lang.Exception -> Lad
            java.lang.String r0 = "getInstallReferrer"
            r3 = 0
            if (r11 != 0) goto L31
            goto L40
        L31:
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L3c
            java.lang.Class r5 = r11.getClass()     // Catch: java.lang.Exception -> L3c
            java.lang.Object r11 = com.amazon.aps.iva.oa0.g0.b(r5, r0, r11, r2, r4)     // Catch: java.lang.Exception -> L3c
            goto L41
        L3c:
            r11 = move-exception
            r11.getMessage()     // Catch: java.lang.Exception -> Lad
        L40:
            r11 = r2
        L41:
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Exception -> Lad
            r4.<init>()     // Catch: java.lang.Exception -> Lad
            java.lang.String r5 = "referral_url"
            if (r11 != 0) goto L4b
            goto L5c
        L4b:
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L58
            java.lang.Class r7 = r11.getClass()     // Catch: java.lang.Exception -> L58
            java.lang.Object r0 = com.amazon.aps.iva.oa0.g0.b(r7, r0, r11, r2, r6)     // Catch: java.lang.Exception -> L58
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L58
            goto L5d
        L58:
            r0 = move-exception
            r0.getMessage()     // Catch: java.lang.Exception -> Lad
        L5c:
            r0 = r2
        L5d:
            r4.put(r5, r0)     // Catch: java.lang.Exception -> Lad
            java.lang.String r0 = "click_time"
            r5 = -1
            if (r11 != 0) goto L67
            goto L7e
        L67:
            java.lang.String r7 = "getReferrerClickTimestampSeconds"
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L7a
            java.lang.Class r9 = r11.getClass()     // Catch: java.lang.Exception -> L7a
            java.lang.Object r7 = com.amazon.aps.iva.oa0.g0.b(r9, r7, r11, r2, r8)     // Catch: java.lang.Exception -> L7a
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Exception -> L7a
            long r7 = r7.longValue()     // Catch: java.lang.Exception -> L7a
            goto L7f
        L7a:
            r7 = move-exception
            r7.getMessage()     // Catch: java.lang.Exception -> Lad
        L7e:
            r7 = r5
        L7f:
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Exception -> Lad
            r4.put(r0, r7)     // Catch: java.lang.Exception -> Lad
            java.lang.String r0 = "install_time"
            if (r11 != 0) goto L8b
            goto La2
        L8b:
            java.lang.String r7 = "getInstallBeginTimestampSeconds"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L9e
            java.lang.Class r8 = r11.getClass()     // Catch: java.lang.Exception -> L9e
            java.lang.Object r11 = com.amazon.aps.iva.oa0.g0.b(r8, r7, r11, r2, r3)     // Catch: java.lang.Exception -> L9e
            java.lang.Long r11 = (java.lang.Long) r11     // Catch: java.lang.Exception -> L9e
            long r5 = r11.longValue()     // Catch: java.lang.Exception -> L9e
            goto La2
        L9e:
            r11 = move-exception
            r11.getMessage()     // Catch: java.lang.Exception -> Lad
        La2:
            java.lang.Long r11 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> Lad
            r4.put(r0, r11)     // Catch: java.lang.Exception -> Lad
            r1.a(r4)     // Catch: java.lang.Exception -> Lad
            goto Lb1
        Lad:
            r11 = move-exception
            r11.getMessage()
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.pa0.e.a(int):void");
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name;
        Object obj2;
        Integer num;
        if (method == null) {
            return null;
        }
        try {
            name = method.getName();
        } catch (Throwable th) {
            th.getMessage();
        }
        if (name == null) {
            return null;
        }
        if (name.equals("onInstallReferrerSetupFinished")) {
            if (objArr != null && objArr.length == 1) {
                Object obj3 = objArr[0];
                if (!(obj3 instanceof Integer) || (num = (Integer) obj3) == null) {
                    return null;
                }
                a(num.intValue());
            }
            return null;
        } else if (name.equals("onInstallReferrerServiceDisconnected") && (obj2 = this.b) != null) {
            try {
                g0.b(obj2.getClass(), "endConnection", obj2, null, new Object[0]);
            } catch (Exception e) {
                e.getMessage();
            }
            this.b = null;
        }
        return null;
    }
}
