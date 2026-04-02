package com.amazon.aps.iva.br;

import android.content.Context;
import com.amazon.aps.iva.br.a;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.util.concurrent.ExecutorService;
/* compiled from: NdkNetworkInfoDataWriter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wp.b<com.amazon.aps.iva.eq.a> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, com.amazon.aps.iva.xp.a aVar, ExecutorService executorService, com.amazon.aps.iva.vp.e eVar, com.amazon.aps.iva.iq.a aVar2) {
        super(new com.amazon.aps.iva.up.b(aVar, new com.amazon.aps.iva.wp.a(new File(new File(context.getCacheDir(), "ndk_crash_reports_intermediary_v2"), "network_information")), new com.amazon.aps.iva.wp.a(new File(a.C0152a.a(context), "network_information")), new com.amazon.aps.iva.up.a(eVar, executorService, aVar2)), new com.amazon.aps.iva.bo.e(), eVar, aVar2);
        j.f(aVar, "consentProvider");
        int i = a.r;
    }
}
