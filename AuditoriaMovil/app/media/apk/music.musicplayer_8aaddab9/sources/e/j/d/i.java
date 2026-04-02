package e.j.d;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.zipoapps.premiumhelper.util.ActivePurchaseInfo;
import i.a.e0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes2.dex */
public final class i implements e.j.d.y.a {
    public final SharedPreferences a;

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.Preferences", f = "Preferences.kt", l = {240}, m = "allPreferencesToString")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.c {
        public /* synthetic */ Object a;

        /* renamed from: c  reason: collision with root package name */
        public int f8804c;

        public a(h.m.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.f8804c |= Level.ALL_INT;
            return i.this.c(this);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.Preferences$allPreferencesToString$2", f = "Preferences.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super String>, Object> {
        public b(h.m.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new b(dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, h.m.d<? super String> dVar) {
            return new b(dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            w.E0(obj);
            StringBuilder sb = new StringBuilder();
            Iterator<T> it = i.this.a.getAll().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append(entry.getKey() + " : " + entry.getValue());
                h.o.c.j.d(sb, "append(value)");
                sb.append('\n');
                h.o.c.j.d(sb, "append('\\n')");
            }
            return sb.toString();
        }
    }

    public i(Context context) {
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context.getSharedPreferences("premium_helper_data", 0);
    }

    @Override // e.j.d.y.a
    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        Iterator<T> it = this.a.getAll().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            h.o.c.j.d(key, "entry.key");
            String lowerCase = String.valueOf(entry.getValue()).toLowerCase(Locale.ROOT);
            h.o.c.j.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            hashMap.put(key, lowerCase);
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.j.d.y.a
    public <T> T b(String str, T t) {
        Object obj;
        h.o.c.j.e(str, Action.KEY_ATTRIBUTE);
        if (t instanceof String) {
            obj = this.a.getString(str, (String) t);
        } else if (t instanceof Boolean) {
            obj = Boolean.valueOf(this.a.getBoolean(str, ((Boolean) t).booleanValue()));
        } else if (t instanceof Long) {
            obj = Long.valueOf(this.a.getLong(str, ((Number) t).longValue()));
        } else if (!(t instanceof Double)) {
            throw new IllegalStateException("Unsupported type");
        } else {
            double doubleValue = ((Number) t).doubleValue();
            if (this.a.contains(str)) {
                doubleValue = this.a.getFloat(str, 0.0f);
            }
            obj = Double.valueOf(doubleValue);
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
            boolean r0 = r5 instanceof e.j.d.i.a
            if (r0 == 0) goto L13
            r0 = r5
            e.j.d.i$a r0 = (e.j.d.i.a) r0
            int r1 = r0.f8804c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8804c = r1
            goto L18
        L13:
            e.j.d.i$a r0 = new e.j.d.i$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8804c
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
            e.j.d.i$b r5 = new e.j.d.i$b
            r2 = 0
            r5.<init>(r2)
            r0.f8804c = r3
            java.lang.Object r5 = e.j.d.w.v(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r0 = "suspend fun allPreferenc…String()\n        }\n\n    }"
            h.o.c.j.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.i.c(h.m.d):java.lang.Object");
    }

    @Override // e.j.d.y.a
    public boolean contains(String str) {
        h.o.c.j.e(str, Action.KEY_ATTRIBUTE);
        return this.a.contains(str);
    }

    public final ActivePurchaseInfo d() {
        String string = this.a.getString("active_purchase_info", "");
        if (string == null || string.length() == 0) {
            return null;
        }
        return (ActivePurchaseInfo) new e.d.e.j().b(string, ActivePurchaseInfo.class);
    }

    public final int e() {
        return this.a.getInt("app_start_counter", 0);
    }

    public final long f() {
        return this.a.getLong("one_time_offer_start_time", 0L);
    }

    public final boolean g() {
        this.a.getBoolean("has_active_purchase", false);
        return true;
    }

    public final int h() {
        int i2 = this.a.getInt("app_start_counter", 0);
        SharedPreferences.Editor edit = this.a.edit();
        int i3 = i2 + 1;
        edit.putInt("app_start_counter", i3);
        edit.apply();
        return i3;
    }

    public final boolean i() {
        return this.a.getInt("app_start_counter", 0) == 0;
    }

    public final <T> void j(String str, T t) {
        h.o.c.j.e(str, Action.KEY_ATTRIBUTE);
        SharedPreferences.Editor edit = this.a.edit();
        if (t instanceof String) {
            edit.putString(str, (String) t);
        } else if (t instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) t).booleanValue());
        } else if (t instanceof Long) {
            edit.putLong(str, ((Number) t).longValue());
        } else if (t instanceof Double) {
            edit.putFloat(str, (float) ((Number) t).doubleValue());
        }
        edit.apply();
    }

    public final void k() {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putBoolean("is_onboarding_complete", true);
        edit.apply();
    }

    @Override // e.j.d.y.a
    public String name() {
        return "Premium Helper Preferences";
    }
}
