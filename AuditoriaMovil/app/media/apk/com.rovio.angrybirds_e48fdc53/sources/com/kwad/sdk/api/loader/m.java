package com.kwad.sdk.api.loader;

import android.text.TextUtils;
import android.util.Log;
import com.kwad.sdk.api.loader.a;
import com.kwad.sdk.api.loader.f;
import com.umeng.analytics.pro.bg;
import java.io.File;
/* loaded from: classes.dex */
final class m {

    /* loaded from: classes.dex */
    static abstract class a<T> implements c<T> {
        c<T> aiZ;

        a(c<T> cVar) {
            this.aiZ = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements f<a.C0242a> {
        b() {
        }

        @Override // com.kwad.sdk.api.loader.m.f
        public final void a(final v vVar, final c<a.C0242a> cVar) {
            try {
                new com.kwad.sdk.api.loader.f(vVar).a(new f.a() { // from class: com.kwad.sdk.api.loader.m.b.1
                    @Override // com.kwad.sdk.api.loader.f.a
                    public final void a(a.b bVar) {
                        new StringBuilder("ConfigProducer onSuccess data:").append(bVar);
                        if (bVar.ym()) {
                            cVar.g(bVar.aiq);
                        } else {
                            new RuntimeException("UpdateData is illegal");
                        }
                        try {
                            com.kwad.sdk.api.loader.d.az(vVar.getContext()).cancel();
                        } catch (Throwable th) {
                        }
                    }
                });
            } catch (Exception e) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c<T> {
        void g(T t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d implements f<a.C0242a> {
        f<a.C0242a> ajd;

        d(f<a.C0242a> fVar) {
            this.ajd = fVar;
        }

        @Override // com.kwad.sdk.api.loader.m.f
        public final void a(final v vVar, final c<a.C0242a> cVar) {
            this.ajd.a(vVar, new a<a.C0242a>(cVar) { // from class: com.kwad.sdk.api.loader.m.d.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.kwad.sdk.api.loader.m.c
                /* renamed from: c */
                public void g(a.C0242a c0242a) {
                    long currentTimeMillis = System.currentTimeMillis();
                    File file = null;
                    try {
                        j.a(c0242a);
                        file = com.kwad.sdk.api.loader.h.m(vVar.getContext(), c0242a.sdkVersion);
                        i.c(c0242a.ain, file);
                        j.a(c0242a, System.currentTimeMillis() - currentTimeMillis);
                        c0242a.aio = file;
                        cVar.g(c0242a);
                    } catch (Throwable th) {
                        j.a(c0242a, System.currentTimeMillis() - currentTimeMillis, Log.getStackTraceString(th));
                        com.kwad.sdk.api.loader.h.j(file);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e implements f<Boolean> {
        f<a.C0242a> ajd;

        e(f<a.C0242a> fVar) {
            this.ajd = fVar;
        }

        @Override // com.kwad.sdk.api.loader.m.f
        public final void a(final v vVar, final c<Boolean> cVar) {
            this.ajd.a(vVar, new c<a.C0242a>() { // from class: com.kwad.sdk.api.loader.m.e.1
                private void a(a.C0242a c0242a, int i, Throwable th) {
                    com.kwad.sdk.api.loader.h.j(c0242a.aio);
                    j.b(c0242a, i, Log.getStackTraceString(th));
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.kwad.sdk.api.loader.m.c
                /* renamed from: c */
                public void g(a.C0242a c0242a) {
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        j.b(c0242a);
                        if (!com.kwad.sdk.api.loader.b.a(vVar.getContext(), getClass().getClassLoader(), c0242a.aio.getPath(), c0242a.sdkVersion)) {
                            a(c0242a, 1, new RuntimeException("Apk pre install fail"));
                            return;
                        }
                        com.kwad.sdk.api.loader.g.k(vVar.getContext(), c0242a.sdkVersion);
                        com.kwad.sdk.api.loader.h.j(c0242a.aio);
                        j.b(c0242a, System.currentTimeMillis() - currentTimeMillis);
                        cVar.g(Boolean.TRUE);
                    } catch (Throwable th) {
                        a(c0242a, 2, th);
                    }
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public interface f<T> {
        void a(v vVar, c<T> cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g implements f<a.C0242a> {
        f<a.C0242a> ajd;

        g(f<a.C0242a> fVar) {
            this.ajd = fVar;
        }

        @Override // com.kwad.sdk.api.loader.m.f
        public final void a(v vVar, final c<a.C0242a> cVar) {
            this.ajd.a(vVar, new a<a.C0242a>(cVar) { // from class: com.kwad.sdk.api.loader.m.g.1
                private void a(a.C0242a c0242a, int i, Throwable th) {
                    com.kwad.sdk.api.loader.h.j(c0242a.aio);
                    j.a(c0242a, i, th.getMessage());
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.kwad.sdk.api.loader.m.c
                /* renamed from: c */
                public void g(a.C0242a c0242a) {
                    try {
                        File file = c0242a.aio;
                        if (!r.k(file)) {
                            a(c0242a, 1, new RuntimeException("Security checkFileValid fail"));
                        } else if (r.a(file, c0242a.UF)) {
                            cVar.g(c0242a);
                        } else {
                            a(c0242a, 2, new RuntimeException("Security checkMd5 fail"));
                        }
                    } catch (Throwable th) {
                        a(c0242a, 3, th);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h implements f<a.C0242a> {
        f<a.C0242a> ajd;

        h(f<a.C0242a> fVar) {
            this.ajd = fVar;
        }

        @Override // com.kwad.sdk.api.loader.m.f
        public final void a(final v vVar, final c<a.C0242a> cVar) {
            this.ajd.a(vVar, new c<a.C0242a>() { // from class: com.kwad.sdk.api.loader.m.h.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.kwad.sdk.api.loader.m.c
                /* renamed from: c */
                public void g(a.C0242a c0242a) {
                    String aA = com.kwad.sdk.api.loader.g.aA(vVar.getContext());
                    if (TextUtils.isEmpty(aA)) {
                        aA = com.kwad.sdk.api.c.yh().getSDKVersion();
                    }
                    String str = c0242a.sdkVersion;
                    StringBuilder sb = new StringBuilder("UpgradeProducer curVersion:");
                    sb.append(aA);
                    sb.append("-newVersion");
                    sb.append(str);
                    t.a(vVar.getContext(), bg.aU, c0242a.interval);
                    t.a(vVar.getContext(), "lastUpdateTime", System.currentTimeMillis());
                    if (c0242a.yl()) {
                        u.aG(vVar.getContext());
                        new RuntimeException("DynamicType == -1, curVersion: " + aA);
                    } else if (com.kwad.sdk.api.loader.g.D(c0242a.sdkVersion, aA) && c0242a.yk()) {
                        cVar.g(c0242a);
                    } else {
                        new RuntimeException("No new sdkVersion. remote sdkVersion:" + c0242a.sdkVersion + " currentDynamicVersion:" + aA + " dynamicType:" + c0242a.aim);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f<Boolean> yt() {
        return new e(new g(new d(new h(new b()))));
    }
}
