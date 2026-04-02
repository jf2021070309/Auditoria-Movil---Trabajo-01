package e.j.d.y.d;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.joran.action.Action;
import e.d.d.y.j;
import e.j.d.w;
import e.j.d.z.d;
import h.k;
import h.m.i.a.e;
import h.m.i.a.h;
import h.o.b.l;
import h.o.b.p;
import h.o.c.n;
import h.o.c.r;
import h.r.f;
import i.a.e0;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes2.dex */
public final class a implements e.j.d.y.a {
    public static final /* synthetic */ f<Object>[] a;

    /* renamed from: b  reason: collision with root package name */
    public j f8888b;

    /* renamed from: c  reason: collision with root package name */
    public final d f8889c = new d("PremiumHelper");

    /* renamed from: d  reason: collision with root package name */
    public boolean f8890d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8891e;

    @e(c = "com.zipoapps.premiumhelper.configuration.remoteconfig.RemoteConfig", f = "RemoteConfig.kt", l = {119}, m = "allValuesToString")
    /* renamed from: e.j.d.y.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0196a extends h.m.i.a.c {
        public /* synthetic */ Object a;

        /* renamed from: c  reason: collision with root package name */
        public int f8893c;

        public C0196a(h.m.d<? super C0196a> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.f8893c |= Level.ALL_INT;
            return a.this.c(this);
        }
    }

    @e(c = "com.zipoapps.premiumhelper.configuration.remoteconfig.RemoteConfig$allValuesToString$2", f = "RemoteConfig.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends h implements p<e0, h.m.d<? super String>, Object> {
        public b(h.m.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // h.m.i.a.a
        public final h.m.d<k> create(Object obj, h.m.d<?> dVar) {
            return new b(dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, h.m.d<? super String> dVar) {
            return new b(dVar).invokeSuspend(k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            w.E0(obj);
            StringBuilder sb = new StringBuilder();
            j jVar = a.this.f8888b;
            if (jVar == null) {
                h.o.c.j.k("firebaseRemoteConfig");
                throw null;
            }
            for (Map.Entry entry : ((HashMap) jVar.a()).entrySet()) {
                sb.append(entry.getKey() + " = " + ((e.d.d.y.p) entry.getValue()).b() + " source: " + ((e.d.d.y.p) entry.getValue()).a());
                h.o.c.j.d(sb, "append(value)");
                sb.append('\n');
                h.o.c.j.d(sb, "append('\\n')");
            }
            return sb.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends h.o.c.k implements l<String, Object> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ T f8894b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f8895c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(T t, String str) {
            super(1);
            this.f8894b = t;
            this.f8895c = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
            if (e.d.d.y.r.m.f7790b.matcher(r5).matches() != false) goto L26;
         */
        @Override // h.o.b.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object invoke(java.lang.String r5) {
            /*
                Method dump skipped, instructions count: 293
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e.j.d.y.d.a.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static {
        n nVar = new n(a.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(r.a);
        a = new f[]{nVar};
    }

    public a() {
    }

    @Override // e.j.d.y.a
    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        j jVar = this.f8888b;
        if (jVar == null) {
            h.o.c.j.k("firebaseRemoteConfig");
            throw null;
        }
        for (Map.Entry entry : ((HashMap) jVar.a()).entrySet()) {
            Object key = entry.getKey();
            h.o.c.j.d(key, "entry.key");
            String b2 = ((e.d.d.y.p) entry.getValue()).b();
            h.o.c.j.d(b2, "entry.value.asString()");
            String lowerCase = b2.toLowerCase(Locale.ROOT);
            h.o.c.j.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            hashMap.put(key, lowerCase);
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // e.j.d.y.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T b(java.lang.String r6, T r7) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            h.o.c.j.e(r6, r0)
            e.j.d.y.d.a$c r0 = new e.j.d.y.d.a$c
            r0.<init>(r7, r6)
            boolean r1 = r5.f8891e
            r2 = 0
            if (r1 != 0) goto L20
            e.j.d.z.c r1 = r5.d()
            java.lang.String r3 = "!!!!!! RemoteConfig key "
            java.lang.String r4 = " queried before initialization !!!!!!"
            java.lang.String r3 = e.a.d.a.a.l(r3, r6, r4)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r1.l(r3, r4)
        L20:
            e.d.d.y.j r1 = r5.f8888b
            if (r1 != 0) goto L3a
            boolean r3 = r5.f8890d
            if (r3 != 0) goto L3a
            e.j.d.z.c r0 = r5.d()
            java.lang.String r1 = "RemoteConfig key "
            java.lang.String r3 = " queried before initialization"
            java.lang.String r6 = e.a.d.a.a.l(r1, r6, r3)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0.b(r6, r1)
            goto L4d
        L3a:
            if (r1 == 0) goto L53
            e.d.d.y.r.m r1 = r1.f7745g
            e.d.d.y.p r1 = r1.g(r6)
            e.d.d.y.r.p r1 = (e.d.d.y.r.p) r1
            int r1 = r1.f7802b
            if (r1 == 0) goto L4d
            java.lang.Object r6 = r0.invoke(r6)
            goto L4e
        L4d:
            r6 = r7
        L4e:
            if (r6 != 0) goto L51
            goto L52
        L51:
            r7 = r6
        L52:
            return r7
        L53:
            java.lang.String r6 = "firebaseRemoteConfig"
            h.o.c.j.k(r6)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.y.d.a.b(java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(h.m.d<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof e.j.d.y.d.a.C0196a
            if (r0 == 0) goto L13
            r0 = r5
            e.j.d.y.d.a$a r0 = (e.j.d.y.d.a.C0196a) r0
            int r1 = r0.f8893c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8893c = r1
            goto L18
        L13:
            e.j.d.y.d.a$a r0 = new e.j.d.y.d.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8893c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.j.d.w.E0(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            e.j.d.w.E0(r5)
            e.j.d.y.d.a$b r5 = new e.j.d.y.d.a$b
            r2 = 0
            r5.<init>(r2)
            r0.f8893c = r3
            java.lang.Object r5 = e.j.d.w.v(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r0 = "suspend fun allValuesToS…oString()\n        }\n    }"
            h.o.c.j.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.y.d.a.c(h.m.d):java.lang.Object");
    }

    @Override // e.j.d.y.a
    public boolean contains(String str) {
        h.o.c.j.e(str, Action.KEY_ATTRIBUTE);
        j jVar = this.f8888b;
        return (jVar == null || ((e.d.d.y.r.p) jVar.f7745g.g(str)).f7802b == 0) ? false : true;
    }

    public final e.j.d.z.c d() {
        return this.f8889c.a(this, a[0]);
    }

    @Override // e.j.d.y.a
    public String name() {
        return "Remote Config";
    }
}
