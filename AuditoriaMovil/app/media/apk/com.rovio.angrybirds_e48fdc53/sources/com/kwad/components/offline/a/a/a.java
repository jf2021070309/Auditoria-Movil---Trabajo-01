package com.kwad.components.offline.a.a;

import android.content.Context;
import com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo;
import com.kwad.components.offline.api.core.soloader.SoLoadListener;
import com.kwad.library.solder.lib.a.e;
import com.kwad.library.solder.lib.c.b;
import com.kwad.library.solder.lib.ext.PluginError;
import com.kwad.library.solder.lib.ext.b;
import com.kwad.library.solder.lib.i;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.AbiUtil;
import com.kwad.sdk.utils.aa;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class a {
    private static final AtomicBoolean Zs = new AtomicBoolean(false);
    private static final String Zt = aa.format("lib%s.so", "c++_shared");
    private static final String Zu = aa.format("lib%s.so", "kwaiplayer");
    private static final String Zv = aa.format("lib%s.so", "kste");
    private static final String Zw = aa.format("lib%s.so", "hodor");
    private static final String Zx = aa.format("lib%s.so", "aegon");
    private static final AtomicBoolean Zy = new AtomicBoolean(false);

    public static void a(Context context, final SoLoadListener soLoadListener) {
        String str;
        String str2;
        String str3;
        AtomicBoolean atomicBoolean = Zs;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        HashMap<String, String> hashMap = new HashMap<>();
        if (AbiUtil.isArm64(context)) {
            hashMap.put(Zt, "dcd68cd059cb06a9596ba6839c2e8858");
            hashMap.put(Zu, "f5d9ed20ecd348d291dc742508036c00");
            hashMap.put(Zv, "ebb56fa9c5701350497e281c2446660f");
            hashMap.put(Zw, "d2c9607f3ddbbefe6914f1e94e8c53ff");
            hashMap.put(Zx, "e43929c76e20f091def8fe0579d16adc");
            str = "https://static.yximgs.com/udata/pkg/KS-Android-KSAdSDk/adLive/3.3.26.1/ks_so-adLiveArm64v8aRelease-3.3.26.1.apk";
            str2 = "adLive-v8a";
            str3 = "310fad205107df839a5026968c232766";
        } else {
            hashMap.put(Zt, "e3fdbf82716c2cb9b666a3880ab94003");
            hashMap.put(Zu, "ec3e4937f3c114dd36ed0cbd10585d22");
            hashMap.put(Zv, "71a9baa45905a6f0e527e5a2e06e8808");
            hashMap.put(Zw, "644a9dacce49b4c3226f5129267c0dad");
            hashMap.put(Zx, "69828b232bd1c06552a81870a5d5e465");
            str = "https://static.yximgs.com/udata/pkg/KS-Android-KSAdSDk/adLive/3.3.26.1/ks_so-adLiveArmeabiv7aRelease-3.3.26.1.apk";
            str2 = "adLive-v7a";
            str3 = "e0f9628529f23e1928c8d3f61634c8f2";
        }
        b bVar = new b();
        com.kwad.library.solder.lib.a.a bC = i.wi().bC(IAdLiveOfflineCompo.PACKAGE_NAME);
        c.d("AdLiveSoLoadHelper", "adLiveOfflineCompoPlugin: " + bC);
        if (bC instanceof com.kwad.library.b.a) {
            bVar.agS = ((com.kwad.library.b.a) bC).vY();
        }
        bVar.agK = com.kwad.sdk.core.network.idc.a.Bm().dc(str);
        bVar.IO = true;
        bVar.agJ = str2;
        bVar.version = "3.6";
        bVar.agP = hashMap;
        bVar.agM = str3;
        bVar.agN = true;
        com.kwad.library.solder.a.a.a(context, bVar, new b.c() { // from class: com.kwad.components.offline.a.a.a.1
            private void a(PluginError pluginError) {
                SoLoadListener.this.onFailed(pluginError.getCode(), pluginError);
            }

            private void sL() {
                SoLoadListener.this.onLoaded();
            }

            @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
            public final /* synthetic */ void a(e eVar, com.kwad.library.solder.lib.a.a aVar) {
                sL();
            }

            @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
            public final /* bridge */ /* synthetic */ void a(e eVar, PluginError pluginError) {
                a(pluginError);
            }
        });
    }
}
