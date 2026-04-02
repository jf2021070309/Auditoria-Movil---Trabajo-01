package com.bytedance.pangle.b.b;

import com.bytedance.pangle.log.ZeusLogger;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class a {
    private static Method a;
    private static Method b;
    private static Method c;
    private static Method d;

    static {
        try {
            a = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            c = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            d = Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable th) {
            ZeusLogger.errReport(ZeusLogger.TAG_INIT, "DoubleReflectorinit failed", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Field a(java.lang.Class<?> r8, java.lang.String r9) {
        /*
            java.lang.reflect.Method r0 = com.bytedance.pangle.b.b.a.a
            r1 = 0
            if (r0 == 0) goto L45
            r2 = 0
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1c
            r4[r2] = r9     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.invoke(r8, r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1a
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r1 = move-exception
            goto L20
        L1a:
            r1 = r0
            goto L45
        L1c:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L20:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DoubleReflector"
            r4.<init>(r5)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r8.getName()
            r5[r2] = r6
            r5[r3] = r9
            java.lang.String r2 = "getField %s#%s failed !!!"
            java.lang.String r2 = java.lang.String.format(r2, r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "Zeus_pangle"
            com.bytedance.pangle.log.ZeusLogger.w(r3, r2, r1)
            r1 = r0
        L45:
            if (r1 == 0) goto L48
            return r1
        L48:
            java.lang.reflect.Field r8 = com.bytedance.pangle.b.a.a.a(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.b.b.a.a(java.lang.Class, java.lang.String):java.lang.reflect.Field");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Method a(java.lang.Class<?> r8, java.lang.String r9, java.lang.Class<?>... r10) {
        /*
            java.lang.reflect.Method r0 = com.bytedance.pangle.b.b.a.b
            r1 = 0
            if (r0 == 0) goto L47
            r2 = 0
            r3 = 2
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1f
            r5[r2] = r9     // Catch: java.lang.Throwable -> L1f
            r5[r4] = r10     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.invoke(r8, r5)     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1d
            r0.setAccessible(r4)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r1 = move-exception
            goto L23
        L1d:
            r1 = r0
            goto L47
        L1f:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L23:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DoubleReflector"
            r5.<init>(r6)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = r8.getName()
            r3[r2] = r6
            r3[r4] = r9
            java.lang.String r2 = "getMethod %s#%s failed !!!"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "Zeus_pangle"
            com.bytedance.pangle.log.ZeusLogger.w(r3, r2, r1)
            r1 = r0
        L47:
            if (r1 == 0) goto L4a
            return r1
        L4a:
            java.lang.reflect.Method r8 = com.bytedance.pangle.b.a.a.a(r8, r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.b.b.a.a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Constructor a(java.lang.Class<?> r6, java.lang.Class<?>... r7) {
        /*
            java.lang.reflect.Method r0 = com.bytedance.pangle.b.b.a.c
            if (r0 == 0) goto L3b
            r1 = 0
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L12
            r3[r1] = r7     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.invoke(r6, r3)     // Catch: java.lang.Throwable -> L12
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0     // Catch: java.lang.Throwable -> L12
            goto L3c
        L12:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "DoubleReflector"
            r3.<init>(r4)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r6.getName()
            r4[r1] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r4[r2] = r1
            java.lang.String r1 = "getConstructor %s<init>%s failed !!!"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "Zeus_pangle"
            com.bytedance.pangle.log.ZeusLogger.w(r2, r1, r0)
        L3b:
            r0 = 0
        L3c:
            if (r0 == 0) goto L3f
            return r0
        L3f:
            java.lang.reflect.Constructor r6 = com.bytedance.pangle.b.a.a.a(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.b.b.a.a(java.lang.Class, java.lang.Class[]):java.lang.reflect.Constructor");
    }
}
