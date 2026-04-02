package e.j.a;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import e.j.d.w;
import h.o.b.p;
import i.a.e0;
import i.a.g1;
import i.a.o0;
import java.util.LinkedHashMap;
import java.util.Map;
@h.m.i.a.e(c = "com.zipoapps.ads.AdManager$initialize$2", f = "AdManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends h.m.i.a.h implements p<e0, h.m.d<? super g1>, Object> {
    public /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f8458b;

    @h.m.i.a.e(c = "com.zipoapps.ads.AdManager$initialize$2$1", f = "AdManager.kt", l = {SyslogConstants.LOG_CRON}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.h implements p<e0, h.m.d<? super h.k>, Object> {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f8459b;

        @h.m.i.a.e(c = "com.zipoapps.ads.AdManager$initialize$2$1$status$1", f = "AdManager.kt", l = {508}, m = "invokeSuspend")
        /* renamed from: e.j.a.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0182a extends h.m.i.a.h implements p<e0, h.m.d<? super InitializationStatus>, Object> {
            public Object a;

            /* renamed from: b  reason: collision with root package name */
            public int f8460b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ b f8461c;

            /* renamed from: e.j.a.c$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0183a implements OnInitializationCompleteListener {
                public final /* synthetic */ i.a.j<InitializationStatus> a;

                /* JADX WARN: Multi-variable type inference failed */
                public C0183a(i.a.j<? super InitializationStatus> jVar) {
                    this.a = jVar;
                }

                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public final void onInitializationComplete(InitializationStatus initializationStatus) {
                    if (this.a.a()) {
                        this.a.resumeWith(initializationStatus);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0182a(b bVar, h.m.d<? super C0182a> dVar) {
                super(2, dVar);
                this.f8461c = bVar;
            }

            @Override // h.m.i.a.a
            public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
                return new C0182a(this.f8461c, dVar);
            }

            @Override // h.o.b.p
            public Object i(e0 e0Var, h.m.d<? super InitializationStatus> dVar) {
                return new C0182a(this.f8461c, dVar).invokeSuspend(h.k.a);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                int i2 = this.f8460b;
                if (i2 == 0) {
                    w.E0(obj);
                    b bVar = this.f8461c;
                    this.a = bVar;
                    this.f8460b = 1;
                    i.a.k kVar = new i.a.k(w.P(this), 1);
                    kVar.p();
                    MobileAds.initialize(bVar.f8432b, new C0183a(kVar));
                    obj = kVar.o();
                    if (obj == aVar) {
                        h.o.c.j.e(this, "frame");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    b bVar2 = (b) this.a;
                    w.E0(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, h.m.d<? super a> dVar) {
            super(2, dVar);
            this.f8459b = bVar;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new a(this.f8459b, dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
            return new a(this.f8459b, dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            InitializationStatus initializationStatus;
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            try {
                if (i2 == 0) {
                    w.E0(obj);
                    C0182a c0182a = new C0182a(this.f8459b, null);
                    this.a = 1;
                    obj = i.a.g.a(AbstractComponentTracker.LINGERING_TIMEOUT, c0182a, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w.E0(obj);
                }
                initializationStatus = (InitializationStatus) obj;
            } catch (Exception unused) {
                b bVar = this.f8459b;
                h.r.f<Object>[] fVarArr = b.a;
                bVar.b().k(6, null, "AdManager: initialize timeout!", new Object[0]);
                initializationStatus = new InitializationStatus() { // from class: e.j.a.a
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        return new LinkedHashMap();
                    }
                };
            }
            b bVar2 = this.f8459b;
            h.r.f<Object>[] fVarArr2 = b.a;
            e.j.d.z.c b2 = bVar2.b();
            h.o.c.j.e(initializationStatus, "<this>");
            StringBuilder sb = new StringBuilder();
            Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
            h.o.c.j.d(adapterStatusMap, "adapterStatusMap");
            for (Map.Entry<String, AdapterStatus> entry : adapterStatusMap.entrySet()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) entry.getKey());
                sb2.append(CoreConstants.COLON_CHAR);
                sb2.append(entry.getValue().getInitializationState());
                sb.append(sb2.toString());
                h.o.c.j.d(sb, "append(value)");
                sb.append('\n');
                h.o.c.j.d(sb, "append('\\n')");
            }
            String sb3 = sb.toString();
            h.o.c.j.d(sb3, "with(StringBuilder()) {\n…\n        toString()\n    }");
            b2.a(h.o.c.j.i("AdManager initialized:\n", sb3), new Object[0]);
            return h.k.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, h.m.d<? super c> dVar) {
        super(2, dVar);
        this.f8458b = bVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        c cVar = new c(this.f8458b, dVar);
        cVar.a = obj;
        return cVar;
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super g1> dVar) {
        c cVar = new c(this.f8458b, dVar);
        cVar.a = e0Var;
        return cVar.invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        w.E0(obj);
        return w.Y((e0) this.a, o0.f9155b, null, new a(this.f8458b, null), 2, null);
    }
}
