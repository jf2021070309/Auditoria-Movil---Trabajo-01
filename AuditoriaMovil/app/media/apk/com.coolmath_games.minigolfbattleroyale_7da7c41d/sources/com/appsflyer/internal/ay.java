package com.appsflyer.internal;

import android.app.Application;
import com.appsflyer.AFLogger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class ay implements Runnable {
    private static String valueOf = "https://%sgcdsdk.%s/install_data/v4.0/";
    private static final List<String> values = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final String AFInAppEventParameterName;
    final ScheduledExecutorService AFInAppEventType;
    private final Application AFKeystoreWrapper;
    private final ae AFLogger$LogLevel;
    private final int AFVersionDeclaration;
    private final AtomicInteger getLevel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ay(ae aeVar, Application application, String str) {
        if (k.valueOf == null) {
            k.valueOf = new k();
        }
        this.AFInAppEventType = k.valueOf.AFInAppEventParameterName();
        this.getLevel = new AtomicInteger(0);
        this.AFLogger$LogLevel = aeVar;
        this.AFKeystoreWrapper = application;
        this.AFInAppEventParameterName = str;
        this.AFVersionDeclaration = 0;
    }

    private ay(ay ayVar) {
        if (k.valueOf == null) {
            k.valueOf = new k();
        }
        this.AFInAppEventType = k.valueOf.AFInAppEventParameterName();
        this.getLevel = new AtomicInteger(0);
        this.AFLogger$LogLevel = ayVar.AFLogger$LogLevel;
        this.AFKeystoreWrapper = ayVar.AFKeystoreWrapper;
        this.AFInAppEventParameterName = ayVar.AFInAppEventParameterName;
        this.AFVersionDeclaration = ayVar.AFVersionDeclaration + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void AFInAppEventType(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
        sb.append(map.toString());
        AFLogger.values(sb.toString());
        ae.valueOf.onConversionDataSuccess(map);
    }

    public static void AFInAppEventParameterName(String str) {
        if (ae.valueOf != null) {
            AFLogger.values("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            ae.valueOf.onConversionDataFail(str);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:17|18|(2:20|(11:22|23|24|25|(6:29|(1:41)(1:33)|34|(1:36)|37|38)|42|(13:44|(1:46)|(1:50)|51|52|(2:54|(1:56)(1:57))|58|(1:60)|61|62|(1:64)(1:78)|65|(5:69|70|(1:72)|74|75))|34|(0)|37|38)(1:96))|97|23|24|25|(8:29|(1:31)|39|41|34|(0)|37|38)|42|(0)|34|(0)|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0290, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0291, code lost:
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0296, code lost:
        if (r16.AFVersionDeclaration < 2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0298, code lost:
        r2 = new com.appsflyer.internal.ay(r16);
        com.appsflyer.internal.ae.AFInAppEventType(r2.AFInAppEventType, r2, 10, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02a7, code lost:
        AFInAppEventParameterName(r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02ae, code lost:
        com.appsflyer.AFLogger.AFInAppEventType(r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02cb, code lost:
        r16.getLevel.decrementAndGet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02d0, code lost:
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02d2, code lost:
        r3.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02d5, code lost:
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0198 A[Catch: all -> 0x0290, TryCatch #0 {all -> 0x0290, blocks: (B:26:0x00f5, B:37:0x0149, B:34:0x0135, B:36:0x0139, B:38:0x0158, B:40:0x0198, B:42:0x01a6, B:44:0x01c0, B:46:0x01c6, B:47:0x01d3, B:50:0x01dd, B:52:0x01e3, B:53:0x01f7, B:54:0x0208, B:56:0x020e, B:57:0x0221, B:60:0x0233, B:62:0x023e, B:64:0x0242, B:66:0x024a, B:68:0x025e, B:72:0x026b, B:71:0x0266, B:61:0x0239), top: B:96:0x00f5, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ay.run():void");
    }
}
