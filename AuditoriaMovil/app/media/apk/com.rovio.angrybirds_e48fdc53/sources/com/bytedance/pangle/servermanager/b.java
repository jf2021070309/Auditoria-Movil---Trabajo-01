package com.bytedance.pangle.servermanager;

import com.bytedance.pangle.c;
import com.bytedance.pangle.d;
import com.bytedance.pangle.log.ZeusLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class b {
    private static final Object a = new Object();
    private static final Object b = new Object();
    private static final Object c = new Object();
    private static final Map<String, Boolean> d = new ConcurrentHashMap();
    private static final Map<String, d> e = new ConcurrentHashMap();
    private static c f;

    public static d a(String str) {
        Boolean bool = d.get(str);
        if (bool == null || !bool.booleanValue()) {
            e.remove(str);
        }
        Map<String, d> map = e;
        if (map.get(str) == null) {
            synchronized (b) {
                d dVar = (d) a("service", str);
                if (dVar == null) {
                    ZeusLogger.errReport(ZeusLogger.TAG_SERVER, "getServiceManager failed!!!");
                    return null;
                }
                map.put(str, dVar);
            }
        }
        return map.get(str);
    }

    public static c a() {
        Boolean bool = d.get("main");
        if (bool == null || !bool.booleanValue()) {
            f = null;
        }
        if (f == null) {
            synchronized (c) {
                c cVar = (c) a("package", "main");
                if (cVar == null) {
                    ZeusLogger.errReport(ZeusLogger.TAG_SERVER, "getPackageManager failed!!!");
                    return null;
                }
                f = cVar;
            }
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[Catch: RemoteException -> 0x009c, TryCatch #0 {RemoteException -> 0x009c, blocks: (B:16:0x0058, B:31:0x0092, B:33:0x0097, B:21:0x0079, B:24:0x0083), top: B:42:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097 A[Catch: RemoteException -> 0x009c, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x009c, blocks: (B:16:0x0058, B:31:0x0092, B:33:0x0097, B:21:0x0079, B:24:0x0083), top: B:42:0x0058 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.os.IInterface a(java.lang.String r6, final java.lang.String r7) {
        /*
            boolean r0 = com.bytedance.pangle.Zeus.hasInit()
            if (r0 == 0) goto Lb5
            java.util.HashMap r0 = com.bytedance.pangle.Zeus.getServerManagerHashMap()
            java.lang.Object r0 = r0.get(r7)
            android.content.pm.ProviderInfo r0 = (android.content.pm.ProviderInfo) r0
            if (r0 == 0) goto La5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "content://"
            r1.<init>(r2)
            java.lang.String r0 = r0.authority
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r2 = "query_binder"
            r3 = 0
            android.os.Bundle r0 = r1.call(r0, r2, r6, r3)
            if (r0 == 0) goto L4e
            java.lang.Class<com.bytedance.pangle.servermanager.AbsServerManager> r1 = com.bytedance.pangle.servermanager.AbsServerManager.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            java.lang.String r1 = "binder"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.bytedance.pangle.servermanager.a r0 = (com.bytedance.pangle.servermanager.a) r0
            if (r0 == 0) goto L4e
        L4b:
            android.os.IBinder r0 = r0.a
            goto L4f
        L4e:
            r0 = r3
        L4f:
            if (r0 == 0) goto La4
            boolean r1 = r0.isBinderAlive()
            if (r1 == 0) goto La4
            com.bytedance.pangle.servermanager.b$1 r1 = new com.bytedance.pangle.servermanager.b$1     // Catch: android.os.RemoteException -> L9c
            r1.<init>()     // Catch: android.os.RemoteException -> L9c
            r2 = 0
            r0.linkToDeath(r1, r2)     // Catch: android.os.RemoteException -> L9c
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = com.bytedance.pangle.servermanager.b.d     // Catch: android.os.RemoteException -> L9c
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: android.os.RemoteException -> L9c
            r1.put(r7, r4)     // Catch: android.os.RemoteException -> L9c
            r7 = -1
            int r1 = r6.hashCode()     // Catch: android.os.RemoteException -> L9c
            r4 = -807062458(0xffffffffcfe53446, float:-7.6908165E9)
            r5 = 1
            if (r1 == r4) goto L83
            r2 = 1984153269(0x7643c6b5, float:9.927033E32)
            if (r1 == r2) goto L79
        L78:
            goto L8c
        L79:
            java.lang.String r1 = "service"
            boolean r6 = r6.equals(r1)     // Catch: android.os.RemoteException -> L9c
            if (r6 == 0) goto L78
            r2 = r5
            goto L8d
        L83:
            java.lang.String r1 = "package"
            boolean r6 = r6.equals(r1)     // Catch: android.os.RemoteException -> L9c
            if (r6 == 0) goto L78
            goto L8d
        L8c:
            r2 = r7
        L8d:
            if (r2 == 0) goto L97
            if (r2 == r5) goto L92
            goto La4
        L92:
            com.bytedance.pangle.d r6 = com.bytedance.pangle.d.a.a(r0)     // Catch: android.os.RemoteException -> L9c
            return r6
        L97:
            com.bytedance.pangle.c r6 = com.bytedance.pangle.c.a.a(r0)     // Catch: android.os.RemoteException -> L9c
            return r6
        L9c:
            r6 = move-exception
            java.lang.String r7 = "Zeus/server_pangle"
            java.lang.String r0 = "generateServerManager failed."
            com.bytedance.pangle.log.ZeusLogger.errReport(r7, r0, r6)
        La4:
            return r3
        La5:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "宿主中没有找对对应进程的serverManager "
            java.lang.String r7 = r0.concat(r7)
            r6.<init>(r7)
            throw r6
        Lb5:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "generateServerManager 请先初始化Zeus, processName:"
            java.lang.String r7 = r0.concat(r7)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.servermanager.b.a(java.lang.String, java.lang.String):android.os.IInterface");
    }
}
