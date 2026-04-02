package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.publisher.cy;
import com.vungle.publisher.cz;
import com.vungle.publisher.da;
import com.vungle.publisher.dp;
import com.vungle.publisher.log.Logger;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class cy<T extends cz<T, P, E, ?>, P extends cy<T, P, E>, E extends da<P>> extends dp<Integer> {
    T a;
    Integer b;
    Long c;
    List<E> d;

    protected abstract da.a<P, E> a();

    public void a(Long l) {
        this.c = l;
    }

    public void a(Integer num) {
        if (this.b == null || (num != null && num.intValue() > this.b.intValue())) {
            Logger.d(Logger.AD_TAG, "setting watched millis " + num);
            this.b = num;
            return;
        }
        Logger.w(Logger.AD_TAG, "ignoring decreased watched millis " + num);
    }

    public void a(jf jfVar, Object obj) {
        List<E> h = h();
        if (h.size() >= 1000) {
            Logger.w(Logger.REPORT_TAG, "ignoring report event " + jfVar + " because the event buffer is full!");
            return;
        }
        Logger.d(Logger.REPORT_TAG, "adding report event " + jfVar + (obj == null ? "" : ", value " + obj + " for " + B()));
        E a2 = a().a((da.a<P, E>) this, jfVar, obj);
        a2.d_();
        h.add(a2);
    }

    public E[] e() {
        List<E> h = h();
        return (E[]) ((da[]) h.toArray(a().d(h.size())));
    }

    List<E> h() {
        List<E> list = this.d;
        if (list == null) {
            List<E> a2 = a().a((da.a<P, E>) this);
            this.d = a2;
            return a2;
        }
        return list;
    }

    @Override // com.vungle.publisher.dp
    protected String c() {
        return "ad_play";
    }

    public Integer i() {
        if (this.a == null) {
            return null;
        }
        return (Integer) this.a.c_();
    }

    @Override // com.vungle.publisher.dp
    protected ContentValues a(boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("report_id", i());
        } else {
            contentValues.put("start_millis", this.c);
            contentValues.put("watched_millis", this.b);
        }
        return contentValues;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    public StringBuilder p() {
        StringBuilder p = super.p();
        a(p, "report_id", i());
        a(p, "start_millis", this.c);
        a(p, "watched_millis", this.b);
        return p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public static abstract class a<T extends cz<T, P, E, ?>, P extends cy<T, P, E>, E extends da<P>> extends dp.a<P, Integer> {
        protected abstract da.a<P, E> a();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vungle.publisher.dp.a
        protected /* bridge */ /* synthetic */ dp a(dp dpVar, Cursor cursor, boolean z) {
            return a((a<T, P, E>) ((cy) dpVar), cursor, z);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public P a(T t) {
            P p = (P) g_();
            p.a = t;
            return p;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public List<P> a(T t, boolean z) {
            if (t == null) {
                throw new IllegalArgumentException("null ad_report");
            }
            Integer num = (Integer) t.c_();
            if (num == null) {
                throw new IllegalArgumentException("null report_id");
            }
            List<P> list = (List<P>) a("report_id = ?", new String[]{num.toString()}, "start_millis ASC", (String) null);
            for (P p : list) {
                p.a = t;
            }
            return list;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [I, java.lang.Integer] */
        protected P a(P p, Cursor cursor, boolean z) {
            p.u = ce.c(cursor, "id");
            p.b = ce.c(cursor, "watched_millis");
            p.c = ce.d(cursor, "start_millis");
            if (z) {
                p.d = a().a((da.a<P, E>) p);
            }
            return p;
        }

        @Override // com.vungle.publisher.dp.a
        protected String c() {
            return "ad_play";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public Integer[] b(int i) {
            return new Integer[i];
        }
    }
}
