package e.d.d.y;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;
@KeepForSdk
/* loaded from: classes2.dex */
public class q {
    public static final Clock a = DefaultClock.getInstance();

    /* renamed from: b  reason: collision with root package name */
    public static final Random f7749b = new Random();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, j> f7750c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f7751d;

    /* renamed from: e  reason: collision with root package name */
    public final ExecutorService f7752e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.d.g f7753f;

    /* renamed from: g  reason: collision with root package name */
    public final e.d.d.u.h f7754g;

    /* renamed from: h  reason: collision with root package name */
    public final e.d.d.j.c f7755h;

    /* renamed from: i  reason: collision with root package name */
    public final e.d.d.t.b<e.d.d.k.a.a> f7756i;

    /* renamed from: j  reason: collision with root package name */
    public final String f7757j;

    /* renamed from: k  reason: collision with root package name */
    public Map<String, String> f7758k;

    public q(Context context, e.d.d.g gVar, e.d.d.u.h hVar, e.d.d.j.c cVar, e.d.d.t.b<e.d.d.k.a.a> bVar) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f7750c = new HashMap();
        this.f7758k = new HashMap();
        this.f7751d = context;
        this.f7752e = newCachedThreadPool;
        this.f7753f = gVar;
        this.f7754g = hVar;
        this.f7755h = cVar;
        this.f7756i = bVar;
        gVar.a();
        this.f7757j = gVar.f7042f.f7049b;
        Tasks.call(newCachedThreadPool, new Callable() { // from class: e.d.d.y.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.this.c();
            }
        });
    }

    public static boolean e(e.d.d.g gVar) {
        gVar.a();
        return gVar.f7041e.equals("[DEFAULT]");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized e.d.d.y.j a(e.d.d.g r16, java.lang.String r17, e.d.d.u.h r18, e.d.d.j.c r19, java.util.concurrent.Executor r20, e.d.d.y.r.j r21, e.d.d.y.r.j r22, e.d.d.y.r.j r23, e.d.d.y.r.l r24, e.d.d.y.r.m r25, e.d.d.y.r.n r26) {
        /*
            r15 = this;
            r1 = r15
            r0 = r17
            monitor-enter(r15)
            java.util.Map<java.lang.String, e.d.d.y.j> r2 = r1.f7750c     // Catch: java.lang.Throwable -> L61
            boolean r2 = r2.containsKey(r0)     // Catch: java.lang.Throwable -> L61
            if (r2 != 0) goto L57
            e.d.d.y.j r2 = new e.d.d.y.j     // Catch: java.lang.Throwable -> L61
            android.content.Context r4 = r1.f7751d     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "firebase"
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L29
            r16.a()     // Catch: java.lang.Throwable -> L61
            r5 = r16
            java.lang.String r3 = r5.f7041e     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = "[DEFAULT]"
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L2b
            r3 = 1
            goto L2c
        L29:
            r5 = r16
        L2b:
            r3 = 0
        L2c:
            if (r3 == 0) goto L31
            r7 = r19
            goto L33
        L31:
            r3 = 0
            r7 = r3
        L33:
            r3 = r2
            r5 = r16
            r6 = r18
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r14 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L61
            r22.b()     // Catch: java.lang.Throwable -> L61
            r23.b()     // Catch: java.lang.Throwable -> L61
            r21.b()     // Catch: java.lang.Throwable -> L61
            java.util.Map<java.lang.String, e.d.d.y.j> r3 = r1.f7750c     // Catch: java.lang.Throwable -> L61
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> L61
        L57:
            java.util.Map<java.lang.String, e.d.d.y.j> r2 = r1.f7750c     // Catch: java.lang.Throwable -> L61
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L61
            e.d.d.y.j r0 = (e.d.d.y.j) r0     // Catch: java.lang.Throwable -> L61
            monitor-exit(r15)
            return r0
        L61:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.d.y.q.a(e.d.d.g, java.lang.String, e.d.d.u.h, e.d.d.j.c, java.util.concurrent.Executor, e.d.d.y.r.j, e.d.d.y.r.j, e.d.d.y.r.j, e.d.d.y.r.l, e.d.d.y.r.m, e.d.d.y.r.n):e.d.d.y.j");
    }

    public final e.d.d.y.r.j b(String str, String str2) {
        e.d.d.y.r.o oVar;
        e.d.d.y.r.j jVar;
        String format = String.format("%s_%s_%s_%s.json", "frc", this.f7757j, str, str2);
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        Context context = this.f7751d;
        Map<String, e.d.d.y.r.o> map = e.d.d.y.r.o.a;
        synchronized (e.d.d.y.r.o.class) {
            Map<String, e.d.d.y.r.o> map2 = e.d.d.y.r.o.a;
            if (!map2.containsKey(format)) {
                map2.put(format, new e.d.d.y.r.o(context, format));
            }
            oVar = map2.get(format);
        }
        Map<String, e.d.d.y.r.j> map3 = e.d.d.y.r.j.a;
        synchronized (e.d.d.y.r.j.class) {
            String str3 = oVar.f7801c;
            Map<String, e.d.d.y.r.j> map4 = e.d.d.y.r.j.a;
            if (!map4.containsKey(str3)) {
                map4.put(str3, new e.d.d.y.r.j(newCachedThreadPool, oVar));
            }
            jVar = map4.get(str3);
        }
        return jVar;
    }

    public j c() {
        j a2;
        synchronized (this) {
            e.d.d.y.r.j b2 = b("firebase", "fetch");
            e.d.d.y.r.j b3 = b("firebase", "activate");
            e.d.d.y.r.j b4 = b("firebase", "defaults");
            e.d.d.y.r.n nVar = new e.d.d.y.r.n(this.f7751d.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", this.f7757j, "firebase", "settings"), 0));
            e.d.d.y.r.m mVar = new e.d.d.y.r.m(this.f7752e, b3, b4);
            e.d.d.g gVar = this.f7753f;
            e.d.d.t.b<e.d.d.k.a.a> bVar = this.f7756i;
            gVar.a();
            final e.d.d.y.r.q qVar = gVar.f7041e.equals("[DEFAULT]") ? new e.d.d.y.r.q(bVar) : null;
            if (qVar != null) {
                BiConsumer<String, e.d.d.y.r.k> biConsumer = new BiConsumer() { // from class: e.d.d.y.i
                    @Override // com.google.android.gms.common.util.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        JSONObject optJSONObject;
                        e.d.d.y.r.q qVar2 = e.d.d.y.r.q.this;
                        String str = (String) obj;
                        e.d.d.y.r.k kVar = (e.d.d.y.r.k) obj2;
                        e.d.d.k.a.a aVar = qVar2.a.get();
                        if (aVar == null) {
                            return;
                        }
                        JSONObject jSONObject = kVar.f7777f;
                        if (jSONObject.length() < 1) {
                            return;
                        }
                        JSONObject jSONObject2 = kVar.f7774c;
                        if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
                            String optString = optJSONObject.optString("choiceId");
                            if (optString.isEmpty()) {
                                return;
                            }
                            synchronized (qVar2.f7803b) {
                                if (!optString.equals(qVar2.f7803b.get(str))) {
                                    qVar2.f7803b.put(str, optString);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("arm_key", str);
                                    bundle.putString("arm_value", jSONObject2.optString(str));
                                    bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                    bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                    bundle.putString("group", optJSONObject.optString("group"));
                                    aVar.c("fp", "personalization_assignment", bundle);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("_fpid", optString);
                                    aVar.c("fp", "_fpc", bundle2);
                                }
                            }
                        }
                    }
                };
                synchronized (mVar.f7791c) {
                    mVar.f7791c.add(biConsumer);
                }
            }
            a2 = a(this.f7753f, "firebase", this.f7754g, this.f7755h, this.f7752e, b2, b3, b4, d("firebase", b2, nVar), mVar, nVar);
        }
        return a2;
    }

    public synchronized e.d.d.y.r.l d(String str, e.d.d.y.r.j jVar, e.d.d.y.r.n nVar) {
        e.d.d.u.h hVar;
        e.d.d.t.b bVar;
        ExecutorService executorService;
        Clock clock;
        Random random;
        String str2;
        e.d.d.g gVar;
        hVar = this.f7754g;
        bVar = e(this.f7753f) ? this.f7756i : new e.d.d.t.b() { // from class: e.d.d.y.g
            @Override // e.d.d.t.b
            public final Object get() {
                Clock clock2 = q.a;
                return null;
            }
        };
        executorService = this.f7752e;
        clock = a;
        random = f7749b;
        e.d.d.g gVar2 = this.f7753f;
        gVar2.a();
        str2 = gVar2.f7042f.a;
        gVar = this.f7753f;
        gVar.a();
        return new e.d.d.y.r.l(hVar, bVar, executorService, clock, random, jVar, new ConfigFetchHttpClient(this.f7751d, gVar.f7042f.f7049b, str2, str, nVar.f7796c.getLong("fetch_timeout_in_seconds", 60L), nVar.f7796c.getLong("fetch_timeout_in_seconds", 60L)), nVar, this.f7758k);
    }
}
