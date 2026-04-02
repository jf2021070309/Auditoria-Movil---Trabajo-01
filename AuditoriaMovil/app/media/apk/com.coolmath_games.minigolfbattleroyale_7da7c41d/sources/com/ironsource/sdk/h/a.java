package com.ironsource.sdk.h;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class a extends Handler {
    public final ConcurrentHashMap<String, com.ironsource.sdk.k.c> a = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:2:0x0000, B:5:0x0013, B:13:0x0023, B:15:0x0037, B:14:0x0027), top: B:20:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:2:0x0000, B:5:0x0013, B:13:0x0023, B:15:0x0037, B:14:0x0027), top: B:20:0x0000 }] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.obj     // Catch: java.lang.Throwable -> L3d
            com.ironsource.sdk.h.c r0 = (com.ironsource.sdk.h.c) r0     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r0.getPath()     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.sdk.k.c> r2 = r5.a     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L3d
            com.ironsource.sdk.k.c r2 = (com.ironsource.sdk.k.c) r2     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L13
            return
        L13:
            int r3 = r6.what     // Catch: java.lang.Throwable -> L3d
            r4 = 1016(0x3f8, float:1.424E-42)
            if (r3 == r4) goto L20
            r4 = 1015(0x3f7, float:1.422E-42)
            if (r3 != r4) goto L1e
            goto L20
        L1e:
            r3 = 0
            goto L21
        L20:
            r3 = 1
        L21:
            if (r3 == 0) goto L27
            r2.a(r0)     // Catch: java.lang.Throwable -> L3d
            goto L37
        L27:
            com.ironsource.sdk.g.e r3 = new com.ironsource.sdk.g.e     // Catch: java.lang.Throwable -> L3d
            int r4 = r6.what     // Catch: java.lang.Throwable -> L3d
            int r6 = r6.what     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = com.ironsource.environment.a.AnonymousClass1.a(r6)     // Catch: java.lang.Throwable -> L3d
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L3d
            r2.a(r0, r3)     // Catch: java.lang.Throwable -> L3d
        L37:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.sdk.k.c> r6 = r5.a     // Catch: java.lang.Throwable -> L3d
            r6.remove(r1)     // Catch: java.lang.Throwable -> L3d
            return
        L3d:
            r6 = move-exception
            r6.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.h.a.handleMessage(android.os.Message):void");
    }
}
