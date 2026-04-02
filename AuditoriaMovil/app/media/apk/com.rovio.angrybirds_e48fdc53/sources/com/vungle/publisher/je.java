package com.vungle.publisher;

import com.vungle.publisher.cn;
import com.vungle.publisher.eh;
import com.vungle.publisher.eh.a;
import com.vungle.publisher.je;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.wc;
import com.vungle.publisher.wu;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public abstract class je<D extends je<D, A, R, E, F, T>, A extends cn, R extends wc, E extends eh, F extends eh.a<E, T, R>, T extends wu> {
    protected Map<jf, List<E>> b;
    protected cn c;

    protected abstract a<D, A, R, E, F, T> b();

    public void c() {
        if (this.b != null) {
            for (List<E> list : this.b.values()) {
                for (E e : list) {
                    e.d_();
                }
            }
        }
    }

    public List<String> a(jf jfVar) {
        List<E> list;
        Map<jf, List<E>> map = this.b;
        if (map == null || (list = map.get(jfVar)) == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (E e : list) {
            arrayList.add(e.a());
        }
        return arrayList;
    }

    public void a(StringBuilder sb) {
        dp.a(sb, "eventTrackings", this.b == null ? null : Integer.valueOf(this.b.size()));
    }

    public Map<jf, List<E>> a(R r) {
        F c = b().c();
        if (c != null) {
            this.b = c.a(r);
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class a<D extends je<D, A, R, E, F, T>, A extends cn, R extends wc, E extends eh, F extends eh.a<E, T, R>, T extends wu> {
        protected abstract F c();

        protected abstract D d();

        public D a(A a, R r) {
            return a(d(), a, r);
        }

        public D a(A a) {
            return a((a<D, A, R, E, F, T>) d(), (D) a);
        }

        protected D a(D d, A a) {
            d.c = a;
            Map<jf, List<E>> b = c().b((String) a.u);
            if (b != null) {
                d.b = b;
                Logger.d(Logger.REPORT_TAG, "got " + b.size() + " event trackings by adId: " + ((String) a.u));
            } else {
                Logger.d(Logger.REPORT_TAG, "no event trackings for adId: " + ((String) a.u));
            }
            return d;
        }

        public D a(D d, A a, R r) {
            d.c = a;
            d.b = c().a((String) a.u, r.e());
            return d;
        }
    }
}
