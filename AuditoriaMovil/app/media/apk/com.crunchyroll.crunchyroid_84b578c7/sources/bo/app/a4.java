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
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class a4 {
    public static final a d = new a(null);
    private final ReentrantLock a;
    private final List b;
    private final SharedPreferences c;

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
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Adding push campaign to storage with uid " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ z3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z3 z3Var) {
            super(0);
            this.b = z3Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Clearing PDE from storage with uid " + this.b.x();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ List b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list) {
            super(0);
            this.b = list;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Re-adding PDEs to storage: " + this.b;
        }
    }

    public a4(Context context, String str) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "apiKey");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.storage.braze_push_delivery_storage" + StringUtils.getCacheFileSuffix(context, null, str), 0);
        this.c = sharedPreferences;
        reentrantLock.lock();
        try {
            arrayList.clear();
            Map<String, ?> all = sharedPreferences.getAll();
            com.amazon.aps.iva.yb0.j.e(all, "pdePrefs.all");
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                List list = this.b;
                com.amazon.aps.iva.yb0.j.e(key, "campaignId");
                list.add(new z3(key, this.c.getLong(key, 0L)));
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            for (z3 z3Var : this.b) {
                if (arrayList.size() >= 32) {
                    break;
                }
                arrayList.add(z3Var);
            }
            this.b.removeAll(arrayList);
            return arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(List list) {
        com.amazon.aps.iva.yb0.j.f(list, "events");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(list), 3, (Object) null);
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.b.addAll(list);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "pushCampaignId");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(str), 3, (Object) null);
            long nowInSeconds = DateTimeUtils.nowInSeconds();
            this.c.edit().putLong(str, nowInSeconds).apply();
            this.b.add(new z3(str, nowInSeconds));
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(List list) {
        com.amazon.aps.iva.yb0.j.f(list, "events");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            SharedPreferences.Editor edit = this.c.edit();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                z3 z3Var = (z3) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(z3Var), 3, (Object) null);
                edit.remove(z3Var.x());
            }
            edit.apply();
            this.b.removeAll(list);
        } finally {
            reentrantLock.unlock();
        }
    }
}
