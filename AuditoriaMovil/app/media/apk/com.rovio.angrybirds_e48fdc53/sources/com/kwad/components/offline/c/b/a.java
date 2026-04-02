package com.kwad.components.offline.c.b;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.components.offline.api.core.soloader.SoLoadListener;
import com.kwad.components.offline.api.tk.ITkOfflineCompo;
import com.kwad.components.offline.api.tk.TkLoggerReporter;
import com.kwad.components.offline.api.tk.model.report.TKDownloadMsg;
import com.kwad.library.solder.lib.a.e;
import com.kwad.library.solder.lib.c.b;
import com.kwad.library.solder.lib.ext.PluginError;
import com.kwad.library.solder.lib.ext.b;
import com.kwad.library.solder.lib.i;
import com.kwad.sdk.core.config.d;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.AbiUtil;
import com.kwad.sdk.utils.aa;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class a {
    private static long aam;
    private static final AtomicBoolean Zs = new AtomicBoolean(false);
    private static final String aag = aa.format("lib%s.so", "tk_runtime_v0_0_38");
    private static final String aah = aa.format("lib%s.so", "tk_runtime_lite_v0_0_38");
    private static final String aai = aa.format("lib%s.so", "kwai-v8");
    private static final String aaj = aa.format("lib%s.so", "kwai-v8-lite");
    private static final String aak = aa.format("lib%s.so", "kwad-fb");
    private static final String aal = aa.format("lib%s.so", "kwad-yoga");
    private static final String Zt = aa.format("lib%s.so", "c++_shared");
    private static Boolean aan = null;

    public static void a(Context context, final SoLoadListener soLoadListener) {
        String zd;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        AtomicBoolean atomicBoolean = Zs;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        HashMap<String, String> hashMap = new HashMap<>();
        boolean useTkLite = useTkLite();
        if (AbiUtil.isArm64(context)) {
            zd = d.ze();
            if (TextUtils.isEmpty(zd)) {
                zd = useTkLite ? "https://static.yximgs.com/udata/pkg/KS-Android-KSAdSDk/tachikoma/3.3.34/ks_so-tachikomaLiteSoArm64v8aRelease-3.3.34.apk" : "https://static.yximgs.com/udata/pkg/KS-Android-KSAdSDk/tachikoma/3.3.34/ks_so-tachikomaSoArm64v8aRelease-3.3.34.apk";
            }
            str = useTkLite ? "sotk-v8a-lite" : "sotk-v8a";
            str2 = useTkLite ? "39df505f83794e951720e9c753824d0c" : "2c0fb7069df4a3e6fd55e417229bcb6b";
            if (useTkLite) {
                hashMap.put(aah, "a5009e795307441cc05dbd3e8aeaead3");
                str7 = aaj;
                str8 = "77545ba1892c1a1d4a039db37b3249eb";
            } else {
                hashMap.put(aag, "e1478b9b4f377d667c7e510e88ae1bcb");
                str7 = aai;
                str8 = "7316cd8d074b04e6cb21486288d314ce";
            }
            hashMap.put(str7, str8);
            hashMap.put(aak, "31f065607e6da6b741330d1df0b35460");
            hashMap.put(aal, "76308532f64b68fd5a930c42cceec22b");
            str5 = Zt;
            str6 = "6ca7958ee0b0192a7c52c16faffaa8ba";
        } else {
            zd = d.zd();
            if (TextUtils.isEmpty(zd)) {
                zd = useTkLite ? "https://static.yximgs.com/udata/pkg/KS-Android-KSAdSDk/tachikoma/3.3.34/ks_so-tachikomaLiteSoArmeabiv7aRelease-3.3.34.apk" : "https://static.yximgs.com/udata/pkg/KS-Android-KSAdSDk/tachikoma/3.3.34/ks_so-tachikomaSoArmeabiv7aRelease-3.3.34.apk";
            }
            str = useTkLite ? "sotk-v7a-lite" : "sotk-v7a";
            str2 = useTkLite ? "a46a370ee3a1a61a0d6041b3c69c0ab7" : "f8d270613187202ab45cfec0dca9deee";
            if (useTkLite) {
                hashMap.put(aah, "8ffd76abe9e5fe33f4035b56b9d6e8e3");
                str3 = aaj;
                str4 = "2dbd72527a0739740746adaae48ed2e0";
            } else {
                hashMap.put(aag, "55e6b8f6cd2091d8f8412dafcf9f381a");
                str3 = aai;
                str4 = "519ba633e88efafb8fbd536d800da734";
            }
            hashMap.put(str3, str4);
            hashMap.put(aak, "eff11bebb8a3c872fa30b0484b460d12");
            hashMap.put(aal, "2c6f402c6a565d2e6912b0013fa59380");
            str5 = Zt;
            str6 = "7cb16c2840085bbdf4be628e6604bac1";
        }
        hashMap.put(str5, str6);
        b bVar = new b();
        bVar.agK = com.kwad.sdk.core.network.idc.a.Bm().dc(zd);
        bVar.IO = true;
        bVar.agJ = str;
        bVar.version = useTkLite ? "3.3.34-lite" : "3.3.34";
        bVar.agN = false;
        bVar.agM = str2;
        bVar.agP = hashMap;
        final com.kwad.library.solder.lib.a.a bC = i.wi().bC(ITkOfflineCompo.PACKAGE_NAME);
        c.d("TkSoLoadHelper", "tkOfflineCompoPlugin: " + bC);
        if (bC instanceof com.kwad.library.b.a) {
            bVar.agS = ((com.kwad.library.b.a) bC).vY();
        }
        com.kwad.library.solder.a.a.a(context, bVar, new b.c() { // from class: com.kwad.components.offline.c.b.a.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
            /* renamed from: a */
            public void b(com.kwad.library.solder.lib.b.c cVar) {
                super.b((AnonymousClass1) cVar);
            }

            private void a(PluginError pluginError) {
                soLoadListener.onFailed(pluginError.getCode(), pluginError);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
            /* renamed from: b */
            public void a(com.kwad.library.solder.lib.b.c cVar) {
                super.a((AnonymousClass1) cVar);
                soLoadListener.onPreUpdate();
                long unused = a.aam = SystemClock.elapsedRealtime();
                TkLoggerReporter.get().reportTKSODownload(ILoggerReporter.Category.APM_LOG, new TKDownloadMsg().setDownloadState(0).setRetryCount(cVar.wv()).toJson());
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
            public void c(com.kwad.library.solder.lib.b.c cVar) {
                String str9;
                super.c((AnonymousClass1) cVar);
                if (cVar.getState() == 4) {
                    TkLoggerReporter.get().reportTKSODownload(ILoggerReporter.Category.APM_LOG, new TKDownloadMsg().setRetryCount(cVar.wv()).setDownloadTime(SystemClock.elapsedRealtime() - a.aam).setDownloadState(1).toJson());
                    return;
                }
                if (cVar.wr() != null) {
                    Throwable wr = cVar.wr();
                    if (wr instanceof PluginError) {
                        str9 = String.valueOf(((PluginError) wr).getCode());
                        TkLoggerReporter.get().reportTKSODownload(ILoggerReporter.Category.ERROR_LOG, new TKDownloadMsg().setRetryCount(cVar.wv()).setErrorReason(str9).setDownloadState(2).toJson());
                    }
                }
                str9 = "other";
                TkLoggerReporter.get().reportTKSODownload(ILoggerReporter.Category.ERROR_LOG, new TKDownloadMsg().setRetryCount(cVar.wv()).setErrorReason(str9).setDownloadState(2).toJson());
            }

            private void sL() {
                soLoadListener.onLoaded();
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

    public static boolean useTkLite() {
        if (aan == null) {
            aan = Boolean.valueOf(!d.a(com.kwad.sdk.core.config.c.akO));
        }
        return aan.booleanValue();
    }
}
