package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class j5 implements q1 {
    public static final a c = new a(null);
    private boolean a;
    private final SharedPreferences b;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ p1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p1 p1Var) {
            super(0);
            this.b = p1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Storage provider is closed. Not adding event: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ p1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p1 p1Var) {
            super(0);
            this.b = p1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Adding event to storage with uid " + this.b.t();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Storage provider is closed. Not getting all events.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.yb0.d0 b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.yb0.d0 d0Var, String str) {
            super(0);
            this.b = d0Var;
            this.c = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Could not create BrazeEvent from [serialized event string=");
            sb.append((String) this.b.b);
            sb.append(", unique identifier=");
            return defpackage.b.c(sb, this.c, "] ... Deleting!");
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Set b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Set set) {
            super(0);
            this.b = set;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Storage provider is closed. Not deleting events: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Deleting event from storage with uid " + this.b;
        }
    }

    public j5(Context context, String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.b = context.getSharedPreferences("com.appboy.storage.appboy_event_storage" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    @Override // bo.app.q1
    public Collection a() {
        if (this.a) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, d.b, 2, (Object) null);
            return com.amazon.aps.iva.lb0.z.b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map<String, ?> all = this.b.getAll();
        com.amazon.aps.iva.yb0.j.e(all, "prefs.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
            d0Var.b = "";
            try {
                com.amazon.aps.iva.yb0.j.d(value, "null cannot be cast to non-null type kotlin.String");
                d0Var.b = (String) value;
                com.amazon.aps.iva.yb0.j.e(key, "eventId");
                p1 b2 = j.h.b((String) value, key);
                if (b2 != null) {
                    linkedHashSet.add(b2);
                }
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new e(d0Var, key));
                a(key);
            }
        }
        return linkedHashSet;
    }

    @Override // bo.app.q1
    public void a(p1 p1Var) {
        com.amazon.aps.iva.yb0.j.f(p1Var, "event");
        if (this.a) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(p1Var), 2, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(p1Var), 3, (Object) null);
        this.b.edit().putString(p1Var.t(), p1Var.f()).apply();
    }

    @Override // bo.app.q1
    public void a(Set set) {
        com.amazon.aps.iva.yb0.j.f(set, "events");
        if (this.a) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new g(set), 2, (Object) null);
            return;
        }
        SharedPreferences.Editor edit = this.b.edit();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String t = ((p1) it.next()).t();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(t), 3, (Object) null);
            edit.remove(t);
        }
        edit.apply();
    }

    public final void a(String str) {
        SharedPreferences.Editor edit = this.b.edit();
        edit.remove(str);
        edit.apply();
    }
}
