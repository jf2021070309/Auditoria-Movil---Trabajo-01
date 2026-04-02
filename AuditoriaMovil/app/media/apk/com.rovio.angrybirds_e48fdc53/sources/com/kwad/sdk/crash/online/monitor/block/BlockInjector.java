package com.kwad.sdk.crash.online.monitor.block;

import android.text.TextUtils;
import android.util.Log;
import com.kwad.sdk.ranger.RangerInjector;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.f;
/* loaded from: classes.dex */
public class BlockInjector {
    private static volatile boolean aAR;
    private static volatile boolean aAS;

    private static String a(com.kwad.sdk.crash.online.monitor.a.b bVar) {
        String str = new String(com.kwad.sdk.core.a.c.AK().decode((bVar == null || TextUtils.isEmpty(bVar.aBl)) ? "b25SZXBvcnRJc3N1ZQ==" : bVar.aBl));
        com.kwad.sdk.core.e.c.d("perfMonitor.Injector", "report methodName:" + str);
        return str;
    }

    private static String b(com.kwad.sdk.crash.online.monitor.a.b bVar) {
        String str = new String(com.kwad.sdk.core.a.c.AK().decode((bVar == null || TextUtils.isEmpty(bVar.aBk)) ? "Y29tLnRlbmNlbnQubWF0cml4LnBsdWdpbi5QbHVnaW5MaXN0ZW5lcg==" : bVar.aBk));
        com.kwad.sdk.core.e.c.d("perfMonitor.Injector", "ListenerName:" + str);
        return str;
    }

    public static void b(com.kwad.sdk.crash.online.monitor.a.a aVar) {
        if (aAR) {
            return;
        }
        try {
            com.kwad.sdk.crash.online.monitor.a.b c = c(aVar);
            RangerInjector.a(b(c), a(c), new RangerInjector.b() { // from class: com.kwad.sdk.crash.online.monitor.block.BlockInjector.1
                @Override // com.kwad.sdk.ranger.RangerInjector.b
                public final void a(String str, long j, long j2, String str2, String str3) {
                    e.a(str, j, j2, str2, str3, false);
                }

                @Override // com.kwad.sdk.ranger.RangerInjector.b
                public final void onError(String str) {
                    BlockInjector.onError(str);
                }
            });
            aAR = true;
        } catch (Exception e) {
            onError(Log.getStackTraceString(e));
        }
    }

    private static com.kwad.sdk.crash.online.monitor.a.b c(com.kwad.sdk.crash.online.monitor.a.a aVar) {
        f fVar = (f) ServiceProvider.get(f.class);
        String appId = fVar != null ? fVar.getAppId() : "";
        if (TextUtils.isEmpty(appId)) {
            return null;
        }
        return aVar.eK(appId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onError(String str) {
        e.eJ(str);
        com.kwad.sdk.core.e.c.w("perfMonitor.Injector", str);
    }

    public static void tryProxyOtherOutput(com.kwad.sdk.crash.online.monitor.a.a aVar) {
        if (aAS) {
            return;
        }
        try {
            com.kwad.sdk.crash.online.monitor.a.b c = c(aVar);
            if (c == null) {
                return;
            }
            com.kwad.sdk.core.e.c.d("perfMonitor.Injector", "featureConfig:" + c.toJson().toString());
            RangerInjector.tryProxyOtherOutput(c.aBm, c.aBn, c.aBo, c.aBp, new RangerInjector.a() { // from class: com.kwad.sdk.crash.online.monitor.block.BlockInjector.2
                @Override // com.kwad.sdk.ranger.RangerInjector.a
                public final void eD(String str) {
                    e.g(str, false);
                }
            });
            aAS = true;
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.w("perfMonitor.Injector", Log.getStackTraceString(th));
        }
    }
}
