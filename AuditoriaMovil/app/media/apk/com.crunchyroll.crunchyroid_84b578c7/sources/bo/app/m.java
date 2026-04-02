package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class m {
    public static final a i = new a(null);
    public final SharedPreferences a;
    public final SharedPreferences b;
    public final Map c;
    private final AtomicBoolean d;
    public long e;
    public long f;
    public int g;
    public int h;

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
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.b = i;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return com.amazon.aps.iva.d0.b2.b(new StringBuilder("Min time since last geofence request reset via server configuration: "), this.b, '.');
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.b = i;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return com.amazon.aps.iva.d0.b2.b(new StringBuilder("Min time since last geofence report reset via server configuration: "), this.b, '.');
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            m.this = r1;
            this.c = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Retrieving geofence id ");
            m mVar = m.this;
            String str = this.c;
            com.amazon.aps.iva.yb0.j.e(str, "reEligibilityId");
            sb.append(mVar.a(str));
            sb.append(" eligibility information from local storage.");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;
        final /* synthetic */ m c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j, m mVar) {
            super(0);
            this.b = j;
            this.c = mVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Geofence request suppressed since only ");
            sb.append(this.b);
            sb.append(" seconds have passed since the last time geofences were requested (minimum interval: ");
            return defpackage.e.f(sb, this.c.g, ").");
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(long j) {
            super(0);
            this.b = j;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Ignoring rate limit for this geofence request. Elapsed time since last request:" + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;
        final /* synthetic */ m c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j, m mVar) {
            super(0);
            this.b = j;
            this.c = mVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append(" seconds have passed since the last time geofences were requested (minimum interval: ");
            return defpackage.e.f(sb, this.c.g, ").");
        }
    }

    /* renamed from: bo.app.m$m */
    /* loaded from: classes.dex */
    public static final class C0078m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final C0078m b = new C0078m();

        public C0078m() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Geofences have not been requested for the current session yet. Request is eligible.";
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final n b = new n();

        public n() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Geofences have already been requested for the current session. Geofence request not eligible.";
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Exception trying to parse re-eligibility id: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.b.c(new StringBuilder("Deleting outdated id "), this.b, " from re-eligibility list.");
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.b.c(new StringBuilder("Retaining id "), this.b, " in re-eligibility list.");
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(long j) {
            super(0);
            this.b = j;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Updating the last successful location request time to: " + this.b;
        }
    }

    public m(Context context, String str, a5 a5Var, z1 z1Var) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "apiKey");
        com.amazon.aps.iva.yb0.j.f(a5Var, "serverConfigStorageProvider");
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalIEventMessenger");
        z1Var.b(d5.class, new com.amazon.aps.iva.y9.c(this, 2));
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.managers.geofences.eligibility.global.".concat(str), 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.a = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.appboy.managers.geofences.eligibility.individual.".concat(str), 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences2, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.b = sharedPreferences2;
        this.c = a(sharedPreferences2);
        this.d = new AtomicBoolean(false);
        this.e = sharedPreferences.getLong("last_request_global", 0L);
        this.f = sharedPreferences.getLong("last_report_global", 0L);
        this.g = a5Var.l();
        this.h = a5Var.k();
    }

    public static final void a(m mVar, d5 d5Var) {
        com.amazon.aps.iva.yb0.j.f(mVar, "this$0");
        com.amazon.aps.iva.yb0.j.f(d5Var, "it");
        mVar.d.set(false);
    }

    public final void a(List list) {
        com.amazon.aps.iva.yb0.j.f(list, "brazeGeofenceList");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((BrazeGeofence) it.next()).getId());
        }
        HashSet hashSet = new HashSet(this.c.keySet());
        SharedPreferences.Editor edit = this.b.edit();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            com.amazon.aps.iva.yb0.j.e(str, "reEligibilityId");
            if (!linkedHashSet.contains(a(str))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new p(str), 3, (Object) null);
                this.c.remove(str);
                edit.remove(str);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new q(str), 3, (Object) null);
            }
        }
        edit.apply();
    }

    public final boolean a(boolean z, long j2) {
        long j3 = j2 - this.e;
        if (!z && this.g > j3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(j3, this), 3, (Object) null);
            return false;
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new k(j3), 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new l(j3, this), 3, (Object) null);
        }
        if (this.d.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, C0078m.b, 3, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, n.b, 3, (Object) null);
        return false;
    }

    public final void a(long j2) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new r(j2), 3, (Object) null);
        this.e = j2;
        this.a.edit().putLong("last_request_global", this.e).apply();
    }

    public final String a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "reEligibilityId");
        try {
            return (String) new com.amazon.aps.iva.oe0.f("_").c(2, str).get(1);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new o(str));
            return null;
        }
    }

    public final void a(y4 y4Var) {
        com.amazon.aps.iva.yb0.j.f(y4Var, "serverConfig");
        int p2 = y4Var.p();
        if (p2 >= 0) {
            this.g = p2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new b(p2), 2, (Object) null);
        }
        int o2 = y4Var.o();
        if (o2 >= 0) {
            this.h = o2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new c(o2), 2, (Object) null);
        }
    }

    public final Map a(SharedPreferences sharedPreferences) {
        com.amazon.aps.iva.yb0.j.f(sharedPreferences, "sharedPreferences");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null || all.isEmpty()) {
            return concurrentHashMap;
        }
        Set<String> keySet = all.keySet();
        if (keySet.isEmpty()) {
            return concurrentHashMap;
        }
        for (String str : keySet) {
            long j2 = sharedPreferences.getLong(str, 0L);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(str), 3, (Object) null);
            Long valueOf = Long.valueOf(j2);
            com.amazon.aps.iva.yb0.j.e(str, "reEligibilityId");
            concurrentHashMap.put(str, valueOf);
        }
        return concurrentHashMap;
    }
}
