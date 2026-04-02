package com.vungle.publisher;

import android.database.Cursor;
import com.vungle.publisher.cn;
import com.vungle.publisher.dw;
import com.vungle.publisher.ei;
import com.vungle.publisher.ek;
import com.vungle.publisher.em;
import com.vungle.publisher.er;
import com.vungle.publisher.fq;
import com.vungle.publisher.jh;
import com.vungle.publisher.log.Logger;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class el extends jh<el, ek, wg> implements dr<el> {
    em w;
    public dw x;
    boolean y;
    @Inject
    a z;

    @Override // com.vungle.publisher.dr
    public /* synthetic */ String d() {
        return (String) super.c_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: s */
    public a b_() {
        return x();
    }

    @Override // com.vungle.publisher.dr
    /* renamed from: t */
    public el m_() {
        return this;
    }

    @Override // com.vungle.publisher.jh
    /* renamed from: u */
    public a x() {
        return this.z;
    }

    public em v() {
        return this.z.a(this, false);
    }

    @Override // com.vungle.publisher.cn, com.vungle.publisher.dr
    public void a(cn.c cVar) {
        cn.c cVar2 = this.f;
        super.a(cVar);
        this.x.a(cVar2, cVar);
    }

    @Override // com.vungle.publisher.dr
    public List<gd<el>> k_() {
        ArrayList arrayList = new ArrayList();
        ek D = D();
        if (D != null) {
            arrayList.add(D);
        }
        em v = v();
        if (v != null) {
            arrayList.add(v);
        }
        return arrayList;
    }

    @Override // com.vungle.publisher.dr
    public boolean l_() {
        boolean z = false;
        ek D = D();
        em v = v();
        boolean z2 = D != null;
        boolean z3 = v != null;
        if (z2 || z3) {
            z = true;
        }
        String B = B();
        if (z) {
            if (z2) {
                Logger.v(Logger.PREPARE_TAG, B + " has " + ei.b.localVideo + ": " + D.e());
            }
            if (z3) {
                Logger.v(Logger.PREPARE_TAG, B + " has " + ei.b.postRoll + ": " + v.e());
            }
        } else {
            a(cn.c.invalid);
        }
        return z;
    }

    @Override // com.vungle.publisher.cn
    public boolean b() {
        return qr.a(h());
    }

    @Override // com.vungle.publisher.jh, com.vungle.publisher.dp
    /* renamed from: w */
    public String d_() {
        String d_ = super.d_();
        if (this.w != null) {
            this.w.d_();
        }
        return d_;
    }

    @Override // com.vungle.publisher.jh, com.vungle.publisher.dp, com.vungle.publisher.gj
    public int f_() {
        int f_ = super.f_();
        if (f_ == 1 && this.w != null) {
            this.w.f_();
        }
        return f_;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends jh.a<el, ek, wg> implements ea<el, wg> {
        @Inject
        Provider<String> e;
        @Inject
        em.a f;
        @Inject
        Provider<el> g;
        @Inject
        ek.a h;
        @Inject
        er.a i;
        @Inject
        dw.a j;
        @Inject
        fq.a k;

        @Override // com.vungle.publisher.ea
        public /* bridge */ /* synthetic */ dr<el> a(String str, boolean z) {
            return (dr) super.a((a) str, z);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.jh.a
        /* renamed from: e */
        public ek.a k() {
            return this.h;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.jh.a
        /* renamed from: f */
        public fq.a j() {
            return this.k;
        }

        @Override // com.vungle.publisher.jh.a
        public el a(wg wgVar) {
            el elVar = (el) super.a((a) wgVar);
            elVar.a(this.e.get());
            elVar.w = this.f.a(elVar, wgVar, ei.b.postRoll);
            elVar.x = this.j.a(elVar);
            elVar.a(cn.c.aware);
            return elVar;
        }

        @Override // com.vungle.publisher.cn.a
        protected m a() {
            return m.vungle_local;
        }

        @Override // com.vungle.publisher.cn.a, com.vungle.publisher.dp.a
        public int a(List<el> list) {
            return d().a(list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.jh.a
        public el a(el elVar, Cursor cursor, boolean z) {
            super.a((a) elVar, cursor, z);
            elVar.a(ce.e(cursor, "parent_path"));
            elVar.x = this.j.a(elVar);
            if (z) {
                a(elVar, z);
            }
            return elVar;
        }

        em a(el elVar, boolean z) {
            if (elVar.y) {
                return elVar.w;
            }
            em emVar = (em) this.f.a((String) elVar.u, ei.b.postRoll, z);
            elVar.w = emVar;
            elVar.y = true;
            return emVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public el[] d(int i) {
            return new el[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: g */
        public el g_() {
            return this.g.get();
        }

        @Override // com.vungle.publisher.ea
        /* renamed from: h */
        public a n_() {
            return this;
        }

        @Override // com.vungle.publisher.ea
        /* renamed from: i */
        public er d() {
            return this.i.a(this);
        }
    }
}
