package com.kwad.sdk.crash;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.library.solder.lib.ext.PluginError;
import com.kwad.library.solder.lib.ext.b;
import com.kwad.sdk.utils.AbiUtil;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class g {
    private static final AtomicBoolean ISLOADED = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public interface a {
        void Ew();
    }

    private static void a(Context context, com.kwad.library.solder.lib.c.b bVar, final a aVar) {
        com.kwad.library.solder.a.a.a(context, bVar, new b.c() { // from class: com.kwad.sdk.crash.g.1
            private void EK() {
                com.kwad.sdk.core.e.c.d("ExceptionSoLoadHelper", "onFail thread=" + Thread.currentThread().getName());
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
            /* renamed from: a */
            public void b(com.kwad.library.solder.lib.b.c cVar) {
                super.b(cVar);
                com.kwad.sdk.core.e.c.d("ExceptionSoLoadHelper", "onCanceled thread=" + Thread.currentThread().getName());
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
            public void c(com.kwad.library.solder.lib.b.c cVar) {
                super.c((AnonymousClass1) cVar);
                com.kwad.sdk.core.e.c.d("ExceptionSoLoadHelper", "onPostUpdate thread=" + Thread.currentThread().getName());
            }

            private void sL() {
                com.kwad.sdk.core.e.c.d("ExceptionSoLoadHelper", "onPostLoad");
                a aVar2 = a.this;
                if (aVar2 != null) {
                    aVar2.Ew();
                }
            }

            @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
            public final /* synthetic */ void a(com.kwad.library.solder.lib.a.e eVar, com.kwad.library.solder.lib.a.a aVar2) {
                sL();
            }

            @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
            public final /* synthetic */ void a(com.kwad.library.solder.lib.a.e eVar, PluginError pluginError) {
                EK();
            }
        });
    }

    public static void a(c cVar, a aVar) {
        String str;
        String str2;
        AtomicBoolean atomicBoolean = ISLOADED;
        if (atomicBoolean.get()) {
            aVar.Ew();
            return;
        }
        Context context = cVar.context;
        atomicBoolean.set(true);
        if (AbiUtil.isArm64(context)) {
            str = cVar.azP;
            if (TextUtils.isEmpty(str)) {
                str = "https://static.yximgs.com/udata/pkg/KS-Android-KSAdSDk/ks_so-exceptionArm64v8aRelease-3.3.23.apk";
            }
            str2 = "exception-v8a";
        } else {
            str = cVar.azQ;
            if (TextUtils.isEmpty(str)) {
                str = "https://static.yximgs.com/udata/pkg/KS-Android-KSAdSDk/ks_so-exceptionArmeabiv7aRelease-3.3.23.apk";
            }
            str2 = "exception-v7a";
        }
        com.kwad.library.solder.lib.c.b bVar = new com.kwad.library.solder.lib.c.b();
        bVar.agK = com.kwad.sdk.core.network.idc.a.Bm().dc(str);
        bVar.IO = true;
        bVar.agJ = str2;
        bVar.version = "3.1";
        bVar.agN = false;
        a(context, bVar, aVar);
    }
}
