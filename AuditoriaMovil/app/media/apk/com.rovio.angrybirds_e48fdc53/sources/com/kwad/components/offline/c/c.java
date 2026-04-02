package com.kwad.components.offline.c;

import android.content.Context;
import android.os.SystemClock;
import com.kwad.components.core.request.f;
import com.kwad.components.core.request.g;
import com.kwad.components.offline.api.InitCallBack;
import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.components.offline.api.tk.ITkOfflineCompo;
import com.kwad.components.offline.api.tk.TkLoggerReporter;
import com.kwad.components.offline.api.tk.model.report.TKDownloadMsg;
import com.kwad.sdk.core.response.model.SdkConfigData;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class c extends com.kwad.components.core.n.b.a<ITkOfflineCompo> {
    private static long ZJ;
    private final List<com.kwad.components.core.n.a.c.a> ZI;
    private final AtomicBoolean ZK;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.offline.c.c$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 implements InitCallBack {
        final /* synthetic */ ITkOfflineCompo ZL;
        final /* synthetic */ boolean ZM;
        final /* synthetic */ long ZN;
        final /* synthetic */ long ZO;
        final /* synthetic */ Context jB;

        AnonymousClass1(ITkOfflineCompo iTkOfflineCompo, boolean z, long j, long j2, Context context) {
            this.ZL = iTkOfflineCompo;
            this.ZM = z;
            this.ZN = j;
            this.ZO = j2;
            this.jB = context;
        }

        @Override // com.kwad.components.offline.api.InitCallBack
        public final void onSuccess(boolean z) {
            final b bVar = new b(this.ZL);
            com.kwad.sdk.components.c.a(com.kwad.components.core.n.a.c.c.class, bVar);
            c.this.ZK.set(true);
            int i = z ? 2 : 1;
            int i2 = this.ZM ? 2 : 1;
            c.this.b(i, i2, SystemClock.elapsedRealtime() - this.ZN, this.ZO);
            TkLoggerReporter.get().reportTKSOLoad(ILoggerReporter.Category.APM_LOG, new TKDownloadMsg().setDownloadState(3).setOfflineLoadTime(this.ZO).setSoLoadTime(SystemClock.elapsedRealtime() - this.ZN).setOfflineSource(i2).setSoSource(i).toJson());
            c.this.ok();
            f.a(new g() { // from class: com.kwad.components.offline.c.c.1.1
                @Override // com.kwad.components.core.request.g, com.kwad.components.core.request.f.a
                public final void a(final SdkConfigData sdkConfigData) {
                    super.a(sdkConfigData);
                    if (sdkConfigData != null) {
                        com.kwad.sdk.utils.g.execute(new Runnable() { // from class: com.kwad.components.offline.c.c.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                bVar.onConfigRefresh(AnonymousClass1.this.jB, sdkConfigData.toJson());
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        private static final c ZV = new c((byte) 0);
    }

    private c() {
        this.ZI = new CopyOnWriteArrayList();
        this.ZK = new AtomicBoolean(false);
    }

    /* synthetic */ c(byte b) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.components.core.n.b.a
    public void a(Context context, boolean z, ITkOfflineCompo iTkOfflineCompo) {
        iTkOfflineCompo.init(context, new d(), new AnonymousClass1(iTkOfflineCompo, z, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - ZJ, context));
    }

    public static void al(Context context) {
        ZJ = SystemClock.elapsedRealtime();
        sO().init(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2, long j, long j2) {
        for (com.kwad.components.core.n.a.c.a aVar : this.ZI) {
            aVar.a(i, i2, j, j2);
        }
    }

    public static c sO() {
        return a.ZV;
    }

    public final void a(com.kwad.components.core.n.a.c.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.ZK.get()) {
            aVar.a(1, 1, 0L, 0L);
        }
        this.ZI.add(aVar);
    }

    public final void b(com.kwad.components.core.n.a.c.a aVar) {
        if (aVar == null) {
            return;
        }
        this.ZI.remove(aVar);
    }

    @Override // com.kwad.components.core.n.b.a
    public final String getTag() {
        return "TkInitModule";
    }

    @Override // com.kwad.components.core.n.b.a
    public final boolean isEnabled() {
        return ((Boolean) com.kwad.sdk.core.config.d.b(com.kwad.sdk.core.config.c.alx)).booleanValue();
    }

    @Override // com.kwad.components.core.n.b.a
    public final int ol() {
        return 1;
    }

    @Override // com.kwad.components.core.n.b.a
    public final String om() {
        return ITkOfflineCompo.PACKAGE_NAME;
    }

    @Override // com.kwad.components.core.n.b.a
    public final String on() {
        return "3.3.43";
    }

    @Override // com.kwad.components.core.n.b.a
    public final String oo() {
        return "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/offline_components/tk/ks_so-tachikomaNoSoRelease-3.3.43-ec7a8ffe24-296.zip";
    }

    @Override // com.kwad.components.core.n.b.a
    public final String op() {
        return "6665085c6c6a7f4d8a1b2ba1d56a1c98";
    }

    @Override // com.kwad.components.core.n.b.a
    public final String oq() {
        return "ks_tk_134ad9665";
    }

    @Override // com.kwad.components.core.n.b.a
    public final String or() {
        return ITkOfflineCompo.IMPL;
    }
}
