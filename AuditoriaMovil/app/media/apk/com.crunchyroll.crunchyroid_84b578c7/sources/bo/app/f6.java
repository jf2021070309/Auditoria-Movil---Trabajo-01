package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class f6 implements p2 {
    public static final a c = new a(null);
    private final SharedPreferences a;
    private final Map b;

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
        final /* synthetic */ q2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q2 q2Var) {
            super(0);
            this.b = q2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Triggered action id " + this.b.getId() + " always eligible via configuration. Returning true for eligibility status";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ q2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q2 q2Var) {
            super(0);
            this.b = q2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Triggered action id " + this.b.getId() + " always eligible via never having been triggered. Returning true for eligibility status";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ q2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q2 q2Var) {
            super(0);
            this.b = q2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Triggered action id " + this.b.getId() + " no longer eligible due to having been triggered in the past and is only eligible once.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;
        final /* synthetic */ d2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, d2 d2Var) {
            super(0);
            this.b = j;
            this.c = d2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Trigger action is re-eligible for display since " + (DateTimeUtils.nowInSeconds() - this.b) + " seconds have passed since the last time it was triggered (minimum interval: " + this.c.g() + ").";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;
        final /* synthetic */ d2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, d2 d2Var) {
            super(0);
            this.b = j;
            this.c = d2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Trigger action is not re-eligible for display since only " + (DateTimeUtils.nowInSeconds() - this.b) + " seconds have passed since the last time it was triggered (minimum interval: " + this.c.g() + ").";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ q2 b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(q2 q2Var, long j) {
            super(0);
            this.b = q2Var;
            this.c = j;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Updating re-eligibility for action Id " + this.b.getId() + " to time " + this.c + '.';
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
            return defpackage.b.c(new StringBuilder("Deleting outdated triggered action id "), this.b, " from stored re-eligibility list. In-memory re-eligibility list is unchanged.");
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.b.c(new StringBuilder("Retaining triggered action "), this.b, " in re-eligibility list.");
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.b.c(new StringBuilder("Retrieving triggered action id "), this.b, " eligibility information from local storage.");
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final k b = new k();

        public k() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Encountered unexpected exception while parsing stored re-eligibility information.";
        }
    }

    public f6(Context context, String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str2, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.triggers.re_eligibility" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.a = sharedPreferences;
        this.b = a();
    }

    @Override // bo.app.p2
    public void a(q2 q2Var, long j2) {
        com.amazon.aps.iva.yb0.j.f(q2Var, "triggeredAction");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new g(q2Var, j2), 3, (Object) null);
        this.b.put(q2Var.getId(), Long.valueOf(j2));
        this.a.edit().putLong(q2Var.getId(), j2).apply();
    }

    @Override // bo.app.p2
    public boolean b(q2 q2Var) {
        long j2;
        int i2;
        com.amazon.aps.iva.yb0.j.f(q2Var, "triggeredAction");
        d2 i3 = q2Var.n().i();
        if (i3.e()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(q2Var), 3, (Object) null);
            return true;
        } else if (!this.b.containsKey(q2Var.getId())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(q2Var), 3, (Object) null);
            return true;
        } else if (i3.h()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(q2Var), 3, (Object) null);
            return false;
        } else {
            Long l = (Long) this.b.get(q2Var.getId());
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = 0;
            }
            long nowInSeconds = DateTimeUtils.nowInSeconds() + q2Var.n().o();
            Integer g2 = i3.g();
            if (g2 != null) {
                i2 = g2.intValue();
            } else {
                i2 = 0;
            }
            if (nowInSeconds >= i2 + j2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(j2, i3), 3, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(j2, i3), 3, (Object) null);
            return false;
        }
    }

    private final Map a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            for (String str : this.a.getAll().keySet()) {
                long j2 = this.a.getLong(str, 0L);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(str), 3, (Object) null);
                Long valueOf = Long.valueOf(j2);
                com.amazon.aps.iva.yb0.j.e(str, "actionId");
                concurrentHashMap.put(str, valueOf);
            }
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, k.b);
        }
        return concurrentHashMap;
    }

    @Override // bo.app.o2
    public void a(List list) {
        com.amazon.aps.iva.yb0.j.f(list, "triggeredActions");
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((q2) it.next()).getId());
        }
        SharedPreferences.Editor edit = this.a.edit();
        for (String str : com.amazon.aps.iva.lb0.x.c1(this.b.keySet())) {
            if (!arrayList.contains(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(str), 3, (Object) null);
                edit.remove(str);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new i(str), 3, (Object) null);
            }
        }
        edit.apply();
    }
}
