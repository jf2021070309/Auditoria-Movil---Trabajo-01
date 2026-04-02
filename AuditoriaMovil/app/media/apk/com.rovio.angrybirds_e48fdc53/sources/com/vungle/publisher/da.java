package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.publisher.cy;
import com.vungle.publisher.dp;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class da<P extends cy<?, P, ?>> extends dp<Integer> {
    P a;
    jf b;
    long c;
    String d;
    private String e;

    public jf a() {
        return this.b;
    }

    public long e() {
        return this.c;
    }

    public Integer h() {
        if (this.a == null) {
            return null;
        }
        return (Integer) this.a.c_();
    }

    public String i() {
        return this.d;
    }

    @Override // com.vungle.publisher.dp
    protected String c() {
        return "ad_report_event";
    }

    @Override // com.vungle.publisher.dp
    protected ContentValues a(boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            this.c = currentTimeMillis;
            contentValues.put("insert_timestamp_millis", Long.valueOf(currentTimeMillis));
            contentValues.put("play_id", h());
            contentValues.put("event", this.b.toString());
            contentValues.put("value", this.d);
        }
        return contentValues;
    }

    @Override // com.vungle.publisher.dp
    public String toString() {
        String str = this.e;
        if (str == null) {
            String dpVar = super.toString();
            this.e = dpVar;
            return dpVar;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    public StringBuilder p() {
        StringBuilder p = super.p();
        a(p, "play_id", h());
        a(p, "event", this.b);
        a(p, "insert_timestamp_millis", Long.valueOf(this.c));
        a(p, "value", this.d);
        return p;
    }

    /* loaded from: classes4.dex */
    protected static abstract class a<P extends cy<?, P, E>, E extends da<P>> extends dp.a<E, Integer> {
        protected abstract jf a(Cursor cursor);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vungle.publisher.dp.a
        protected /* bridge */ /* synthetic */ dp a(dp dpVar, Cursor cursor, boolean z) {
            return a((a<P, E>) ((da) dpVar), cursor, z);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        public E a(P p, jf jfVar, Object obj) {
            if (p == 0) {
                throw new IllegalArgumentException("null ad_play");
            }
            if (jfVar == null) {
                throw new IllegalArgumentException("null event");
            }
            E e = (E) g_();
            e.a = p;
            e.b = jfVar;
            e.d = obj == null ? null : obj.toString();
            return e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        public List<E> a(P p) {
            if (p == 0) {
                throw new IllegalArgumentException("null ad_play");
            }
            Integer num = (Integer) p.c_();
            if (num == null) {
                throw new IllegalArgumentException("null play_id");
            }
            List<E> list = (List<E>) a("play_id = ?", new String[]{num.toString()}, "insert_timestamp_millis ASC");
            for (E e : list) {
                e.a = p;
            }
            return list;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [I, java.lang.Integer] */
        protected E a(E e, Cursor cursor, boolean z) {
            e.b = a(cursor);
            e.u = ce.c(cursor, "id");
            e.c = ce.d(cursor, "insert_timestamp_millis").longValue();
            e.d = ce.e(cursor, "value");
            return e;
        }

        @Override // com.vungle.publisher.dp.a
        protected String c() {
            return "ad_report_event";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public Integer[] b(int i) {
            return new Integer[i];
        }
    }
}
