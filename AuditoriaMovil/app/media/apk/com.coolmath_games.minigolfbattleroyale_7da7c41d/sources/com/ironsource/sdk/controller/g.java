package com.ironsource.sdk.controller;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.Logger;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class g implements e, m {
    private static final Handler g = new Handler(Looper.getMainLooper());
    public m a;
    private CountDownTimer d;
    private final String b = g.class.getSimpleName();
    private d.b c = d.b.None;
    private final b e = new b("NativeCommandExecutor");
    private final b f = new b("ControllerCommandsExecutor");

    /* renamed from: com.ironsource.sdk.controller.g$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 implements Runnable {
        private /* synthetic */ Context b;
        private /* synthetic */ c c;
        private /* synthetic */ com.ironsource.sdk.service.e d;
        private /* synthetic */ j e;

        AnonymousClass1(Context context, c cVar, com.ironsource.sdk.service.e eVar, j jVar) {
            this.b = context;
            this.c = cVar;
            this.d = eVar;
            this.e = jVar;
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [com.ironsource.sdk.controller.g$1$1] */
        @Override // java.lang.Runnable
        public final void run() {
            try {
                g.this.a = g.a(g.this, this.b, this.c, this.d, this.e);
                g.this.d = new CountDownTimer(200000L, 1000L) { // from class: com.ironsource.sdk.controller.g.1.1
                    {
                        super(200000L, 1000L);
                    }

                    @Override // android.os.CountDownTimer
                    public final void onFinish() {
                        Logger.i(g.this.b, "Global Controller Timer Finish");
                        g.this.i();
                        g.g.post(new Runnable() { // from class: com.ironsource.sdk.controller.g.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                g.a(g.this, "controller html - download timeout");
                            }
                        });
                    }

                    @Override // android.os.CountDownTimer
                    public final void onTick(long j) {
                        String str = g.this.b;
                        Logger.i(str, "Global Controller Timer Tick " + j);
                    }
                }.start();
                w wVar = (w) g.this.a;
                f fVar = wVar.m;
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.s, new com.ironsource.sdk.a.a().a("generalmessage", Integer.valueOf(fVar.b)).a);
                fVar.a = System.currentTimeMillis();
                if (wVar.m.b()) {
                    wVar.a(1);
                }
                g.this.e.a();
                g.this.e.b();
            } catch (Exception e) {
                g.a(g.this, Log.getStackTraceString(e));
            }
        }
    }

    public g(Context context, c cVar, com.ironsource.sdk.service.e eVar, j jVar) {
        g.post(new AnonymousClass1(context, cVar, eVar, jVar));
    }

    static /* synthetic */ w a(g gVar, Context context, c cVar, com.ironsource.sdk.service.e eVar, j jVar) {
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.b);
        final w wVar = new w(context, jVar, cVar, gVar);
        com.ironsource.sdk.h.b bVar = new com.ironsource.sdk.h.b(context, com.ironsource.sdk.k.b.a(wVar.l), new com.ironsource.sdk.h.a(), new com.ironsource.sdk.h.d(com.ironsource.sdk.k.b.a(wVar.l).b));
        wVar.r = new u(context, eVar);
        wVar.p = new q(context);
        wVar.q = new r(context);
        wVar.s = new k(context);
        wVar.t = new a(cVar);
        a aVar = wVar.t;
        if (wVar.v == null) {
            wVar.v = new x() { // from class: com.ironsource.sdk.controller.w.8
                @Override // com.ironsource.sdk.controller.x
                public final void a(String str, JSONObject jSONObject) {
                    wVar.b(w.a(wVar, str, jSONObject.toString()));
                }
            };
        }
        aVar.a = wVar.v;
        wVar.u = new l(com.ironsource.sdk.k.b.a(wVar.l).b, bVar);
        return wVar;
    }

    static /* synthetic */ void a(g gVar, String str) {
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.c, new com.ironsource.sdk.a.a().a("callfailreason", str).a);
        p pVar = new p(gVar);
        gVar.a = pVar;
        pVar.a = str;
        gVar.e.a();
        gVar.e.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        m mVar = this.a;
        if (mVar == null || !(mVar instanceof w)) {
            return;
        }
        mVar.destroy();
        this.a = null;
    }

    private boolean j() {
        return d.b.Ready.equals(this.c);
    }

    @Override // com.ironsource.sdk.controller.e
    public final void a() {
        this.c = d.b.Loaded;
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Context context) {
        if (j()) {
            this.a.a(context);
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(final com.ironsource.sdk.g.c cVar, final Map<String, String> map, final com.ironsource.sdk.j.a.b bVar) {
        this.f.a(new Runnable() { // from class: com.ironsource.sdk.controller.g.8
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a.a(cVar, map, bVar);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(final com.ironsource.sdk.g.c cVar, final Map<String, String> map, final com.ironsource.sdk.j.a.c cVar2) {
        this.f.a(new Runnable() { // from class: com.ironsource.sdk.controller.g.3
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.sdk.a.a a = new com.ironsource.sdk.a.a().a("demandsourcename", cVar.a).a("producttype", com.ironsource.sdk.a.e.a(cVar, d.e.Interstitial)).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(cVar)));
                com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.a;
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.i, a.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(cVar.b))).a);
                g.this.a.a(cVar, map, cVar2);
            }
        });
    }

    public final void a(Runnable runnable) {
        this.e.a(runnable);
    }

    @Override // com.ironsource.sdk.controller.e
    public final void a(final String str) {
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.l, new com.ironsource.sdk.a.a().a("callfailreason", str).a);
        com.ironsource.sdk.j.d initListener = IronSourceNetwork.getInitListener();
        if (initListener != null) {
            initListener.onFail(new com.ironsource.sdk.g.e(1001, str));
            IronSourceNetwork.setInitListener(null);
        }
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        i();
        g.post(new Runnable() { // from class: com.ironsource.sdk.controller.g.11
            @Override // java.lang.Runnable
            public final void run() {
                g.a(g.this, str);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(final String str, final com.ironsource.sdk.j.a.c cVar) {
        this.f.a(new Runnable() { // from class: com.ironsource.sdk.controller.g.2
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a.a(str, cVar);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(final String str, final String str2, final com.ironsource.sdk.g.c cVar, final com.ironsource.sdk.j.a.b bVar) {
        this.f.a(new Runnable() { // from class: com.ironsource.sdk.controller.g.6
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a.a(str, str2, cVar, bVar);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(final String str, final String str2, final com.ironsource.sdk.g.c cVar, final com.ironsource.sdk.j.a.c cVar2) {
        this.f.a(new Runnable() { // from class: com.ironsource.sdk.controller.g.18
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a.a(str, str2, cVar, cVar2);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(final String str, final String str2, final com.ironsource.sdk.g.c cVar, final com.ironsource.sdk.j.a.d dVar) {
        this.f.a(new Runnable() { // from class: com.ironsource.sdk.controller.g.16
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a.a(str, str2, cVar, dVar);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(final String str, final String str2, final com.ironsource.sdk.j.e eVar) {
        this.f.a(new Runnable() { // from class: com.ironsource.sdk.controller.g.15
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a.a(str, str2, eVar);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(final String str, final String str2, final Map<String, String> map, final com.ironsource.sdk.j.e eVar) {
        this.f.a(new Runnable() { // from class: com.ironsource.sdk.controller.g.13
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a.a(str, str2, map, eVar);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(final Map<String, String> map, final com.ironsource.sdk.j.e eVar) {
        this.f.a(new Runnable() { // from class: com.ironsource.sdk.controller.g.14
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a.a(map, eVar);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(final JSONObject jSONObject) {
        this.f.a(new Runnable() { // from class: com.ironsource.sdk.controller.g.9
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a.a(jSONObject);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(final JSONObject jSONObject, final com.ironsource.sdk.j.a.c cVar) {
        this.f.a(new Runnable() { // from class: com.ironsource.sdk.controller.g.4
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a.a(jSONObject, cVar);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(final JSONObject jSONObject, final com.ironsource.sdk.j.a.d dVar) {
        this.f.a(new Runnable() { // from class: com.ironsource.sdk.controller.g.17
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a.a(jSONObject, dVar);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.e
    public final void b() {
        if (d.c.Web.equals(c())) {
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.d);
            com.ironsource.sdk.j.d initListener = IronSourceNetwork.getInitListener();
            if (initListener != null) {
                initListener.onSuccess();
                IronSourceNetwork.setInitListener(null);
            }
        }
        this.c = d.b.Ready;
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f.a();
        this.f.b();
        this.a.g();
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(Context context) {
        if (j()) {
            this.a.b(context);
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(final com.ironsource.sdk.g.c cVar, final Map<String, String> map, final com.ironsource.sdk.j.a.c cVar2) {
        this.f.a(new Runnable() { // from class: com.ironsource.sdk.controller.g.5
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a.b(cVar, map, cVar2);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.e
    public final void b(final String str) {
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.v, new com.ironsource.sdk.a.a().a("generalmessage", str).a);
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        g.post(new Runnable() { // from class: com.ironsource.sdk.controller.g.12
            @Override // java.lang.Runnable
            public final void run() {
                g.this.i();
                g.a(g.this, str);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final d.c c() {
        return this.a.c();
    }

    @Override // com.ironsource.sdk.controller.m
    public final boolean c(String str) {
        if (j()) {
            return this.a.c(str);
        }
        return false;
    }

    @Override // com.ironsource.sdk.controller.m
    public final void d() {
        this.f.a(new Runnable() { // from class: com.ironsource.sdk.controller.g.7
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a.d();
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public void destroy() {
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.d = null;
        g.post(new Runnable() { // from class: com.ironsource.sdk.controller.g.10
            @Override // java.lang.Runnable
            public final void run() {
                if (g.this.a != null) {
                    g.this.a.destroy();
                    g.this.a = null;
                }
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void e() {
        if (j()) {
            this.a.e();
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void f() {
        if (j()) {
            this.a.f();
        }
    }

    @Override // com.ironsource.sdk.controller.m
    @Deprecated
    public final void g() {
    }
}
