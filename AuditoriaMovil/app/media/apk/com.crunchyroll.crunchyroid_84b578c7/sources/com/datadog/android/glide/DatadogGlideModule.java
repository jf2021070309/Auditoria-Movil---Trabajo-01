package com.datadog.android.glide;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.aps.iva.bd.a;
import com.amazon.aps.iva.ec.d;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.hc.m;
import com.amazon.aps.iva.jp.d;
import com.amazon.aps.iva.jp.e;
import com.amazon.aps.iva.jp.g;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.qc.a;
import com.amazon.aps.iva.yb0.j;
import com.bumptech.glide.b;
import com.bumptech.glide.integration.okhttp3.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
/* compiled from: DatadogGlideModule.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/datadog/android/glide/DatadogGlideModule;", "Lcom/amazon/aps/iva/bd/a;", "", "", "firstPartyHosts", "", "samplingRate", "<init>", "(Ljava/util/List;F)V", "dd-sdk-android-glide_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class DatadogGlideModule extends a {
    public final List<String> a;
    public final float b;

    public DatadogGlideModule() {
        this(null, 0.0f, 3, null);
    }

    @Override // com.amazon.aps.iva.bd.b
    public final void applyOptions(Context context, b bVar) {
        j.f(context, "context");
        int i = com.amazon.aps.iva.qc.a.d;
        a.ThreadFactoryC0640a threadFactoryC0640a = new a.ThreadFactoryC0640a();
        com.amazon.aps.iva.hq.a aVar = new com.amazon.aps.iva.hq.a("Disk Cache");
        if (!TextUtils.isEmpty("disk-cache")) {
            bVar.h = new com.amazon.aps.iva.qc.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(threadFactoryC0640a, "disk-cache", aVar, true)));
            a.ThreadFactoryC0640a threadFactoryC0640a2 = new a.ThreadFactoryC0640a();
            if (com.amazon.aps.iva.qc.a.d == 0) {
                com.amazon.aps.iva.qc.a.d = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i2 = com.amazon.aps.iva.qc.a.d;
            com.amazon.aps.iva.hq.a aVar2 = new com.amazon.aps.iva.hq.a("Source");
            if (!TextUtils.isEmpty(FirebaseAnalytics.Param.SOURCE)) {
                bVar.g = new com.amazon.aps.iva.qc.a(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(threadFactoryC0640a2, FirebaseAnalytics.Param.SOURCE, aVar2, false)));
                return;
            }
            throw new IllegalArgumentException(com.amazon.aps.iva.oa.a.a("Name must be non-null and non-empty, but given: ", FirebaseAnalytics.Param.SOURCE));
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.oa.a.a("Name must be non-null and non-empty, but given: ", "disk-cache"));
    }

    @Override // com.amazon.aps.iva.bd.d, com.amazon.aps.iva.bd.f
    public final void registerComponents(Context context, com.bumptech.glide.a aVar, d dVar) {
        j.f(aVar, "glide");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        m mVar = new m();
        n nVar = new n();
        List<String> list = this.a;
        j.f(list, "firstPartyHosts");
        OkHttpClient.Builder eventListenerFactory = builder.addInterceptor(new g(list, mVar, com.amazon.aps.iva.lp.a.f, nVar, new com.amazon.aps.iva.zp.a(this.b / 100), e.h)).eventListenerFactory(new d.a());
        j.e(eventListenerFactory, "Builder()\n            .a…gEventListener.Factory())");
        dVar.i(new a.C0944a(eventListenerFactory.build()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatadogGlideModule(List<String> list) {
        this(list, 0.0f, 2, null);
        j.f(list, "firstPartyHosts");
    }

    public /* synthetic */ DatadogGlideModule(List list, float f, int i, com.amazon.aps.iva.yb0.e eVar) {
        this((i & 1) != 0 ? z.b : list, (i & 2) != 0 ? 20.0f : f);
    }

    public DatadogGlideModule(List<String> list, float f) {
        j.f(list, "firstPartyHosts");
        this.a = list;
        this.b = f;
    }
}
