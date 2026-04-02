package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.bytedance.msdk.api.TTRequestExtraParams;
import com.vungle.publisher.cn;
import com.vungle.publisher.dp;
import com.vungle.publisher.ei;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.m;
import java.util.List;
import javax.inject.Inject;
/* loaded from: classes4.dex */
public abstract class jm<A extends cn> extends dp<Integer> implements ei<A> {
    protected String o;
    protected m p;
    protected ei.a q;
    protected ei.b r;
    protected A s;

    protected abstract cn.a<A, ?> y();

    @Override // com.vungle.publisher.dp
    protected String c() {
        return "viewable";
    }

    @Override // com.vungle.publisher.dp
    /* renamed from: M */
    public Integer c_() {
        return (Integer) this.u;
    }

    @Override // com.vungle.publisher.ei
    public String f() {
        return this.o;
    }

    public A N() {
        if (this.s == null) {
            this.s = (A) y().a((cn.a<A, ?>) this.o, false);
        }
        return this.s;
    }

    @Override // com.vungle.publisher.ei
    public String d() {
        return N().h();
    }

    @Override // com.vungle.publisher.ei
    public ei.a j() {
        return this.q;
    }

    @Override // com.vungle.publisher.ei
    public void a(ei.a aVar) {
        Logger.v(Logger.PREPARE_TAG, "setting " + this.r + " status from " + this.q + " to " + aVar + " for ad_id: " + this.o);
        this.q = aVar;
    }

    @Override // com.vungle.publisher.ei
    public void b(ei.a aVar) {
        Logger.v(Logger.PREPARE_TAG, "updating " + this.r + " status from " + this.q + " to " + aVar + " for ad_id: " + this.o);
        this.q = aVar;
        f_();
    }

    @Override // com.vungle.publisher.ei
    public ei.b o() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    public ContentValues a(boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put(h_(), (Integer) this.u);
            contentValues.put("ad_id", this.o);
            contentValues.put("type", this.r.toString());
            contentValues.put(TTRequestExtraParams.PARAM_AD_TYPE, this.p.toString());
        }
        contentValues.put("status", this.q.toString());
        return contentValues;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    public StringBuilder p() {
        StringBuilder p = super.p();
        a(p, "ad_id", this.o);
        a(p, "status", this.q);
        a(p, "type", this.r);
        return p;
    }

    @Override // com.vungle.publisher.dp
    protected String C() {
        return String.valueOf(o());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public static abstract class a<A extends cn, W extends jm<A>, R extends wc> extends dp.a<W, Integer> {
        @Inject
        m.a e;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vungle.publisher.dp.a
        protected /* bridge */ /* synthetic */ dp a(dp dpVar, Cursor cursor, boolean z) {
            return a((a<A, W, R>) ((jm) dpVar), cursor, z);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public W a(A a, R r) {
            if (r == null) {
                return null;
            }
            W w = (W) g_();
            w.s = a;
            w.o = r.g();
            w.p = r.d();
            w.q = ei.a.aware;
            return w;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public List<W> a(ei.b bVar, String str, boolean z) {
            return (List<W>) a("ad_id = ? AND type = ?", new String[]{str, bVar.toString()});
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        public W a(String str, ei.b bVar, boolean z) {
            jm jmVar = (jm) g_();
            jmVar.o = str;
            jmVar.r = bVar;
            return (W) a((a<A, W, R>) jmVar, z);
        }

        protected W a(W w, boolean z) {
            Cursor cursor;
            String str;
            W w2 = null;
            Integer num = (Integer) w.u;
            ei.b bVar = w.r;
            try {
                String str2 = w.o;
                if (num == null) {
                    if (str2 == null) {
                        Logger.w(Logger.DATABASE_TAG, "unable to fetch " + bVar + ": no id or ad_id");
                        str = null;
                        cursor = null;
                    } else {
                        String str3 = "ad_id " + str2;
                        Logger.d(Logger.DATABASE_TAG, "fetching " + bVar + " by " + str3);
                        cursor = this.d.getReadableDatabase().query("viewable", null, "ad_id = ? AND type = ?", new String[]{str2, String.valueOf(bVar)}, null, null, null);
                        str = str3;
                    }
                } else {
                    String str4 = "id: " + num;
                    Logger.d(Logger.DATABASE_TAG, "fetching " + bVar + " by " + str4);
                    cursor = this.d.getReadableDatabase().query("viewable", null, "id = ?", new String[]{String.valueOf(num)}, null, null, null);
                    str = str4;
                }
                if (cursor != null) {
                    try {
                        int count = cursor.getCount();
                        switch (count) {
                            case 0:
                                Logger.v(Logger.DATABASE_TAG, "no " + bVar + " found for " + str);
                                break;
                            case 1:
                                Logger.d(Logger.DATABASE_TAG, "have " + bVar + " for " + str);
                                cursor.moveToFirst();
                                w2 = a((a<A, W, R>) w, cursor, z);
                                break;
                            default:
                                throw new SQLException(count + " " + bVar + " records for " + str);
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                Logger.v(Logger.DATABASE_TAG, "fetched " + w2);
                return w2;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Type inference failed for: r0v1, types: [I, java.lang.Integer] */
        public W a(W w, Cursor cursor, boolean z) {
            w.u = ce.c(cursor, "id");
            w.o = ce.e(cursor, "ad_id");
            w.q = (ei.a) ce.a(cursor, "status", ei.a.class);
            w.r = (ei.b) ce.a(cursor, "type", ei.b.class);
            w.p = this.e.a(ce.e(cursor, TTRequestExtraParams.PARAM_AD_TYPE));
            return w;
        }

        @Override // com.vungle.publisher.dp.a
        protected String c() {
            return "viewable";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public Integer[] b(int i) {
            return new Integer[i];
        }
    }
}
