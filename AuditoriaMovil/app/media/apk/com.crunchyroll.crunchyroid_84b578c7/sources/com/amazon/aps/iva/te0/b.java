package com.amazon.aps.iva.te0;

import kotlinx.coroutines.CoroutineExceptionHandler;
/* compiled from: AndroidExceptionPreHandler.kt */
/* loaded from: classes4.dex */
public final class b extends com.amazon.aps.iva.ob0.a implements CoroutineExceptionHandler {
    private volatile Object _preHandler;

    public b() {
        super(CoroutineExceptionHandler.a.b);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (java.lang.reflect.Modifier.isStatic(r6.getModifiers()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r1 != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleException(com.amazon.aps.iva.ob0.g r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            r1 = 1
            r2 = 0
            if (r6 >= r0) goto La
            r6 = r1
            goto Lb
        La:
            r6 = r2
        Lb:
            if (r6 == 0) goto L55
            java.lang.Object r6 = r5._preHandler
            r0 = 0
            if (r6 == r5) goto L15
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            goto L3b
        L15:
            java.lang.Class<java.lang.Thread> r6 = java.lang.Thread.class
            java.lang.String r3 = "getUncaughtExceptionPreHandler"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L38
            int r3 = r6.getModifiers()     // Catch: java.lang.Throwable -> L38
            boolean r3 = java.lang.reflect.Modifier.isPublic(r3)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L34
            int r3 = r6.getModifiers()     // Catch: java.lang.Throwable -> L38
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L34
            goto L35
        L34:
            r1 = r2
        L35:
            if (r1 == 0) goto L38
            goto L39
        L38:
            r6 = r0
        L39:
            r5._preHandler = r6
        L3b:
            if (r6 == 0) goto L44
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r6 = r6.invoke(r0, r1)
            goto L45
        L44:
            r6 = r0
        L45:
            boolean r1 = r6 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r1 == 0) goto L4c
            r0 = r6
            java.lang.Thread$UncaughtExceptionHandler r0 = (java.lang.Thread.UncaughtExceptionHandler) r0
        L4c:
            if (r0 == 0) goto L55
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r0.uncaughtException(r6, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.te0.b.handleException(com.amazon.aps.iva.ob0.g, java.lang.Throwable):void");
    }
}
