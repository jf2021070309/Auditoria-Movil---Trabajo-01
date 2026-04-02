package e.j.d.y.e;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import e.j.d.w;
import h.k;
import h.m.d;
import h.m.i.a.c;
import h.m.i.a.e;
import h.m.i.a.h;
import h.o.b.p;
import h.o.c.j;
import h.t.g;
import i.a.e0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes2.dex */
public final class a implements e.j.d.y.a {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f8902b;

    @e(c = "com.zipoapps.premiumhelper.configuration.toto.TotoConfigRepository", f = "TotoConfigRepository.kt", l = {62}, m = "allPreferencesToString")
    /* renamed from: e.j.d.y.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0197a extends c {
        public /* synthetic */ Object a;

        /* renamed from: c  reason: collision with root package name */
        public int f8904c;

        public C0197a(d<? super C0197a> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.f8904c |= Level.ALL_INT;
            return a.this.c(this);
        }
    }

    @e(c = "com.zipoapps.premiumhelper.configuration.toto.TotoConfigRepository$allPreferencesToString$2", f = "TotoConfigRepository.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends h implements p<e0, d<? super String>, Object> {
        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // h.m.i.a.a
        public final d<k> create(Object obj, d<?> dVar) {
            return new b(dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, d<? super String> dVar) {
            return new b(dVar).invokeSuspend(k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            w.E0(obj);
            StringBuilder sb = new StringBuilder();
            Iterator<T> it = a.this.f8902b.getAll().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append(entry.getKey() + " : " + entry.getValue());
                j.d(sb, "append(value)");
                sb.append('\n');
                j.d(sb, "append('\\n')");
            }
            return sb.toString();
        }
    }

    public a(Context context) {
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
        this.f8902b = context.getSharedPreferences("toto_configuration", 0);
    }

    @Override // e.j.d.y.a
    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        Map<String, ?> all = this.f8902b.getAll();
        j.d(all, "sharedPreferences.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            j.d(key, "it.key");
            if (!g.b(key, "_hash", false, 2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!((String) entry2.getKey()).equals("x-country")) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object key2 = entry3.getKey();
            j.d(key2, "entry.key");
            String lowerCase = String.valueOf(entry3.getValue()).toLowerCase(Locale.ROOT);
            j.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            hashMap.put(key2, lowerCase);
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.j.d.y.a
    public <T> T b(String str, T t) {
        j.e(str, Action.KEY_ATTRIBUTE);
        Object obj = null;
        obj = null;
        obj = null;
        if (t instanceof String) {
            obj = this.f8902b.getString(str, (String) t);
        } else if (t instanceof Boolean) {
            String string = this.f8902b.getString(str, null);
            if (string != null) {
                obj = g.t(string);
            }
        } else if (t instanceof Long) {
            String string2 = this.f8902b.getString(str, null);
            if (string2 != null) {
                obj = g.u(string2);
            }
        } else if (!(t instanceof Double)) {
            throw new IllegalStateException("Unsupported type");
        } else {
            String string3 = this.f8902b.getString(str, null);
            if (string3 != null) {
                obj = w.G0(string3);
            }
        }
        return obj == null ? t : obj;
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
            boolean r0 = r5 instanceof e.j.d.y.e.a.C0197a
            if (r0 == 0) goto L13
            r0 = r5
            e.j.d.y.e.a$a r0 = (e.j.d.y.e.a.C0197a) r0
            int r1 = r0.f8904c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8904c = r1
            goto L18
        L13:
            e.j.d.y.e.a$a r0 = new e.j.d.y.e.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8904c
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
            e.j.d.y.e.a$b r5 = new e.j.d.y.e.a$b
            r2 = 0
            r5.<init>(r2)
            r0.f8904c = r3
            java.lang.Object r5 = e.j.d.w.v(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r0 = "suspend fun allPreferenc…oString()\n        }\n    }"
            h.o.c.j.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.y.e.a.c(h.m.d):java.lang.Object");
    }

    @Override // e.j.d.y.a
    public boolean contains(String str) {
        j.e(str, Action.KEY_ATTRIBUTE);
        return this.f8902b.contains(str);
    }

    public final String d(String str) {
        return j.i(str, "_hash");
    }

    @Override // e.j.d.y.a
    public String name() {
        return "Toto Service";
    }
}
