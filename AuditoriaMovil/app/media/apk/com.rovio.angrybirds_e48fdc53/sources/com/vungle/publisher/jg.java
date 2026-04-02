package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.vungle.publisher.cn;
import com.vungle.publisher.ei;
import com.vungle.publisher.jm;
import com.vungle.publisher.wp;
/* loaded from: classes4.dex */
public abstract class jg<A extends cn> extends jm<A> {
    Float e;
    Integer f;
    Integer g;
    Boolean h;
    Boolean i;
    Integer j;
    Integer k;
    Integer l;
    Integer m;
    Integer n;

    public abstract Uri x();

    public Float D() {
        return this.e;
    }

    public Integer E() {
        return this.f;
    }

    public Boolean F() {
        return this.h;
    }

    public Boolean G() {
        return this.i;
    }

    public Integer H() {
        return this.j;
    }

    public Integer I() {
        return this.k;
    }

    public Integer J() {
        return this.l;
    }

    public boolean K() {
        return (this.g == null || this.n == null || this.n.intValue() <= this.g.intValue()) ? false : true;
    }

    public boolean L() {
        return (this.g == null || this.n == null || this.g.intValue() <= this.n.intValue()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.jm, com.vungle.publisher.dp
    public ContentValues a(boolean z) {
        ContentValues a2 = super.a(z);
        a2.put("cta_clickable_percent", this.e);
        a2.put("enable_cta_delay_seconds", this.f);
        a2.put("height", this.g);
        a2.put("is_cta_enabled", this.h);
        a2.put("is_cta_shown_on_touch", this.i);
        a2.put("show_cta_delay_seconds", this.j);
        a2.put("show_close_delay_incentivized_seconds", this.k);
        a2.put("show_close_delay_interstitial_seconds", this.l);
        a2.put("show_countdown_delay_seconds", this.m);
        a2.put("width", this.n);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.jm, com.vungle.publisher.dp
    public StringBuilder p() {
        StringBuilder p = super.p();
        a(p, "cta_clickable_percent", this.e);
        a(p, "enable_cta_delay_seconds", this.f);
        a(p, "height", this.g);
        a(p, "is_cta_enabled", this.h);
        a(p, "is_cta_shown_on_touch", this.i);
        a(p, "show_cta_delay_seconds", this.j);
        a(p, "show_close_delay_incentivized_seconds", this.k);
        a(p, "show_close_delay_interstitial_seconds", this.l);
        a(p, "show_countdown_delay_seconds", this.m);
        a(p, "width", this.n);
        return p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public static abstract class a<A extends jh<A, V, R>, V extends jg<A>, R extends wp> extends jm.a<A, V, R> {
        protected abstract ei.b a();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vungle.publisher.jm.a, com.vungle.publisher.dp.a
        protected /* bridge */ /* synthetic */ dp a(dp dpVar, Cursor cursor, boolean z) {
            return a((a<A, V, R>) ((jg) dpVar), cursor, z);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vungle.publisher.jm.a
        public /* bridge */ /* synthetic */ jm a(cn cnVar, wc wcVar) {
            return a((a<A, V, R>) ((jh) cnVar), (jh) ((wp) wcVar));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vungle.publisher.jm.a
        public /* bridge */ /* synthetic */ jm a(jm jmVar, Cursor cursor, boolean z) {
            return a((a<A, V, R>) ((jg) jmVar), cursor, z);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public V a(A a, R r) {
            V v = (V) super.a((a<A, V, R>) a, (A) r);
            if (v != null) {
                b((a<A, V, R>) v, r);
            }
            return v;
        }

        public int a(V v, wp wpVar) {
            return b((a<A, V, R>) v, wpVar).f_();
        }

        private V b(V v, wp wpVar) {
            v.g = wpVar.w();
            v.k = wpVar.t();
            v.l = wpVar.u();
            v.m = wpVar.v();
            v.n = wpVar.y();
            wp.a r = wpVar.r();
            if (r != null) {
                v.e = r.c();
                v.f = r.h();
                v.h = r.d();
                v.i = r.f();
                v.j = r.g();
            }
            return v;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public V a(String str, boolean z) {
            return (V) a(str, a(), z);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public V a(V v, Cursor cursor, boolean z) {
            super.a((a<A, V, R>) v, cursor, z);
            v.e = ce.b(cursor, "cta_clickable_percent");
            v.f = ce.c(cursor, "enable_cta_delay_seconds");
            v.g = ce.c(cursor, "height");
            v.h = ce.a(cursor, "is_cta_enabled");
            v.i = ce.a(cursor, "is_cta_shown_on_touch");
            v.j = ce.c(cursor, "show_cta_delay_seconds");
            v.k = ce.c(cursor, "show_close_delay_incentivized_seconds");
            v.l = ce.c(cursor, "show_close_delay_interstitial_seconds");
            v.m = ce.c(cursor, "show_countdown_delay_seconds");
            v.n = ce.c(cursor, "width");
            return v;
        }
    }
}
