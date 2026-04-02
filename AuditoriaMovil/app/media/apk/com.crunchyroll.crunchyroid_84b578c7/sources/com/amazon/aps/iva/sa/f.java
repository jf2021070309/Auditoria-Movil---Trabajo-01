package com.amazon.aps.iva.sa;
/* compiled from: SyncServiceConnectionManager.java */
/* loaded from: classes.dex */
public final class f extends d {
    /* JADX WARN: Can't wrap try/catch for region: R(5:1|(2:5|(4:7|8|2b|21)(1:25))|26|27|2b) */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.amazon.aps.iva.sa.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.content.Context r4, android.content.ServiceConnection r5, android.content.Intent r6, java.lang.String r7) {
        /*
            r3 = this;
            android.content.ComponentName r0 = r6.getComponent()
            r1 = 1
            if (r0 != 0) goto L25
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            if (r0 == 0) goto L25
            android.content.pm.ResolveInfo r7 = com.amazon.aps.iva.sa.e.a(r4, r6, r7)
            if (r7 != 0) goto L17
            r6.toString()
            goto L2a
        L17:
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.pm.ServiceInfo r7 = r7.serviceInfo
            java.lang.String r2 = r7.packageName
            java.lang.String r7 = r7.name
            r0.<init>(r2, r7)
            r6.setComponent(r0)
        L25:
            boolean r4 = r4.bindService(r6, r5, r1)     // Catch: java.lang.Throwable -> L2a
            goto L2b
        L2a:
            r4 = 0
        L2b:
            monitor-enter(r3)
            r3.e = r4     // Catch: java.lang.Throwable -> L4c
            if (r4 != 0) goto L33
            r3.b()     // Catch: java.lang.Throwable -> L4c
        L33:
            java.util.ArrayList<com.amazon.aps.iva.sa.d$b> r5 = r3.a     // Catch: java.lang.Throwable -> L4c
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L4c
            int r5 = r5 - r1
        L3a:
            if (r5 < 0) goto L4a
            java.util.ArrayList<com.amazon.aps.iva.sa.d$b> r6 = r3.a     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L4c
            com.amazon.aps.iva.sa.d$b r6 = (com.amazon.aps.iva.sa.d.b) r6     // Catch: java.lang.Throwable -> L4c
            r6.b(r4)     // Catch: java.lang.Throwable -> L4c
            int r5 = r5 + (-1)
            goto L3a
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sa.f.e(android.content.Context, android.content.ServiceConnection, android.content.Intent, java.lang.String):void");
    }
}
