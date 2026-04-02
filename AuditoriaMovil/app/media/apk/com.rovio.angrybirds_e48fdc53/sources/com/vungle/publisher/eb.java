package com.vungle.publisher;

import android.database.Cursor;
import android.database.SQLException;
import com.vungle.publisher.cn;
import com.vungle.publisher.cn.a;
import com.vungle.publisher.ct;
import com.vungle.publisher.er;
import com.vungle.publisher.hk;
import com.vungle.publisher.hp;
import com.vungle.publisher.jt;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.m;
import com.vungle.publisher.wc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public abstract class eb<A extends cn, R extends wc, F extends cn.a<A, R>> {
    @Inject
    ci a;
    @Inject
    c b;
    @Inject
    zl c;
    @Inject
    hk.a d;
    @Inject
    ct.a e;
    cn.a<A, R> f;

    public int a(List<A> list) {
        if (list == null || list.size() <= 0) {
            return 0;
        }
        Logger.d(Logger.PREPARE_TAG, "deleting " + list.size() + " local ad(s)");
        this.f.a(list, cn.c.deleting);
        Logger.d(Logger.PREPARE_TAG, "deleted local files " + c(list).size() + " local ad(s)");
        return this.f.b();
    }

    private List<A> c(List<A> list) {
        ArrayList arrayList = new ArrayList();
        for (A a2 : list) {
            int i = a2.l;
            a2.l = i + 1;
            if (!a2.a().a((String) a2.c_(), a2.m(), cn.c.ready, cn.c.preparing)) {
                if (a2.b() || i >= 3) {
                    arrayList.add(a2);
                } else {
                    Logger.w(Logger.PREPARE_TAG, "unable to delete files for " + a2.B() + " attempt " + i);
                    a2.f_();
                }
            } else {
                Logger.v(Logger.PREPARE_TAG, "Not deleting files of " + a2.B() + " for Matching ad_token_hash: " + a2.m());
            }
        }
        return arrayList;
    }

    protected int a() {
        m a2 = this.f.a();
        Logger.d(Logger.PREPARE_TAG, "deleting expired " + a2 + " " + com.umeng.analytics.pro.bg.aw + " records without pending reports");
        return a(this.f.a("type = ? AND expiration_timestamp_seconds <= ?", new String[]{a2.toString(), String.valueOf(this.c.a() / 1000)}, (String) null));
    }

    protected int b() {
        List<A> a2 = this.f.a("type = ?", new String[]{this.f.a().toString()}, (String) null);
        Logger.d(Logger.PREPARE_TAG, "deleting " + a2.size() + " " + this.f.a() + " " + com.umeng.analytics.pro.bg.aw + " records");
        return a(a2);
    }

    public int b(List<s> list) {
        Logger.v(Logger.PREPARE_TAG, "cleanUpInactivePlacements");
        ArrayList arrayList = new ArrayList(list.size());
        for (s sVar : list) {
            arrayList.add(sVar.a);
        }
        List<hk> b2 = this.d.b(arrayList);
        Logger.v(Logger.PREPARE_TAG, "inActivePlacements: size " + b2.size());
        ArrayList<ct> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (hk hkVar : b2) {
            arrayList2.addAll(this.e.b(hkVar.c_()));
        }
        Logger.v(Logger.PREPARE_TAG, "adPlacementsForInactivePlacement: size " + arrayList2.size());
        for (ct ctVar : arrayList2) {
            arrayList3.add(ctVar.a);
        }
        int a2 = a(this.f.c(arrayList3));
        int a3 = this.d.a(b2);
        Logger.v(Logger.PREPARE_TAG, "num of ads cleaned: " + a2);
        Logger.v(Logger.PREPARE_TAG, " for num of placements cleaned: " + a3);
        return a3;
    }

    /* loaded from: classes4.dex */
    public static abstract class a<A extends cn, R extends wc, F extends cn.a<A, R>, C extends eb<A, R, F>> {
        abstract C a();

        /* JADX WARN: Multi-variable type inference failed */
        public C a(F f) {
            C a = a();
            a.f = f;
            return a;
        }
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class b {
        @Inject
        ci a;
        @Inject
        m.a b;
        @Inject
        ct.a c;
        @Inject
        cn.b d;
        @Inject
        jt.a e;
        @Inject
        er.a f;
        @Inject
        c g;

        /* JADX INFO: Access modifiers changed from: private */
        public eb<?, ?, ?>[] d() {
            return new eb[]{this.d.a(m.vungle_mraid).d(), this.d.a(m.vungle_local).d()};
        }

        public int a() {
            return new a() { // from class: com.vungle.publisher.eb.b.1
                @Override // com.vungle.publisher.eb.b.a
                int a(eb<?, ?, ?> ebVar) {
                    return ebVar.a();
                }
            }.a();
        }

        public int b() {
            return new a() { // from class: com.vungle.publisher.eb.b.2
                @Override // com.vungle.publisher.eb.b.a
                int a(eb<?, ?, ?> ebVar) {
                    return ebVar.b();
                }
            }.a();
        }

        public int a(final List<s> list) {
            Logger.v(Logger.PREPARE_TAG, "Mediator cleanUpInactivePlacements");
            return new a() { // from class: com.vungle.publisher.eb.b.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.vungle.publisher.eb.b.a
                int a(eb<?, ?, ?> ebVar) {
                    Logger.v(Logger.PREPARE_TAG, "DeleteCommand : cleanUpInactivePlacements");
                    return ebVar.b(list);
                }
            }.a();
        }

        public dr<?> a(String str) {
            return a(str, cn.c.ready, cn.c.preparing);
        }

        public dr<?> b(String str) {
            return a(str, cn.c.ready);
        }

        public dr<?> c(String str) {
            return a(str, cn.c.viewed);
        }

        public Long c() {
            Cursor cursor;
            String[] strArr;
            Long l = null;
            try {
                cursor = this.a.a(new hp.a().a(com.umeng.analytics.pro.bg.aw).b("status NOT IN (" + ce.a(strArr.length) + ")").b(" ORDER BY expiration_timestamp_seconds ASC").b(" LIMIT ?").a(new String[]{cn.c.viewed.toString(), cn.c.deleting.toString()}).c("1").a());
                try {
                    if (cursor.moveToFirst()) {
                        Long d = ce.d(cursor, "expiration_timestamp_seconds");
                        if (d == null) {
                            Logger.w(Logger.PREPARE_TAG, "next ad expiration time seconds is null");
                        } else {
                            l = Long.valueOf(d.longValue() * 1000);
                            Logger.d(Logger.PREPARE_TAG, "next ad expiration time millis " + l);
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return l;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        }

        <A extends cn, R extends wc> dr<?> a(String str, cn.c... cVarArr) {
            Cursor cursor;
            dr<?> drVar;
            hp a2;
            String[] a3 = yz.a(cVarArr);
            try {
                String[] a4 = yz.a(this.b.a());
                Iterator<ct> it = this.c.b(str).iterator();
                cursor = null;
                while (true) {
                    try {
                        try {
                            if (!it.hasNext()) {
                                drVar = null;
                                break;
                            }
                            cursor = this.a.a(this.g.a(it.next().a, a3, a4));
                            int count = cursor.getCount();
                            if (count == 0) {
                                Logger.d(Logger.PREPARE_TAG, "no record found for " + a2.a());
                            } else if (count != 1) {
                                throw new SQLException("fetched " + count);
                            } else {
                                if (cursor.moveToFirst()) {
                                    cn.a<A, R> n_ = this.d.a(this.b.a(cursor, "type")).n_();
                                    drVar = (dr) n_.a((cn.a<A, R>) ((A) n_.g_()), cursor, true);
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            Logger.e(Logger.PREPARE_TAG, "could not get next ad by status", e);
                            if (cursor != null) {
                                cursor.close();
                                return null;
                            }
                            return null;
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
                    return drVar;
                }
                return drVar;
            } catch (Exception e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        }

        /* loaded from: classes4.dex */
        private abstract class a {
            abstract int a(eb<?, ?, ?> ebVar);

            private a() {
            }

            int a() {
                int i = 0;
                for (eb<?, ?, ?> ebVar : b.this.d()) {
                    i += a(ebVar);
                }
                return i;
            }
        }
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class c {
        @Inject
        ci a;
        @Inject
        m.a b;
        @Inject
        ct.a c;
        @Inject
        zl d;

        hp a(String str, String[] strArr, String[] strArr2) {
            hp a = new hp.a().a(com.umeng.analytics.pro.bg.aw).b("id = ? ").b(" AND status IN (" + ce.a(strArr.length) + ")").b(" AND type IN (" + ce.a(strArr2.length) + ")").b(" AND expiration_timestamp_seconds > ?").b(" ORDER BY received_timestamp_millis ASC").b(" LIMIT ?").c(str).a(strArr).a(strArr2).a(new String[]{Long.toString(this.d.a() / 1000), "1"}).a();
            Logger.v(Logger.PREPARE_TAG, "built query: " + a.a());
            return a;
        }
    }
}
