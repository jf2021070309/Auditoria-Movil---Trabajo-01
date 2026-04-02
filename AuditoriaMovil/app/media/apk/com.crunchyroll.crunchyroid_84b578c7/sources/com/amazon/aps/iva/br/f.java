package com.amazon.aps.iva.br;

import android.content.Context;
import com.amazon.aps.iva.br.a;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.util.concurrent.ExecutorService;
/* compiled from: NdkUserInfoDataWriter.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.wp.b<com.amazon.aps.iva.eq.b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, com.amazon.aps.iva.xp.a aVar, ExecutorService executorService, com.amazon.aps.iva.vp.e eVar, com.amazon.aps.iva.iq.a aVar2) {
        super(new com.amazon.aps.iva.up.b(aVar, new com.amazon.aps.iva.wp.a(new File(new File(context.getCacheDir(), "ndk_crash_reports_intermediary_v2"), "user_information")), new com.amazon.aps.iva.wp.a(new File(a.C0152a.a(context), "user_information")), new com.amazon.aps.iva.up.a(eVar, executorService, aVar2)), new com.amazon.aps.iva.a60.b(), eVar, aVar2);
        j.f(aVar, "consentProvider");
        int i = a.r;
    }
}
