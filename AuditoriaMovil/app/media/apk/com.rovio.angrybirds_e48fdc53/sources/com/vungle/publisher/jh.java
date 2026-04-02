package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.vungle.publisher.cn;
import com.vungle.publisher.je;
import com.vungle.publisher.jg;
import com.vungle.publisher.jh;
import com.vungle.publisher.wp;
import java.util.List;
import javax.inject.Inject;
/* loaded from: classes4.dex */
public abstract class jh<A extends jh<A, V, R>, V extends jg<A>, R extends wp> extends cn {
    protected String A;
    protected String B;
    protected V C;
    protected je<?, A, R, ji, ?, ?> D;
    protected boolean E;
    @Inject
    qg F;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.cn
    /* renamed from: x */
    public abstract a<A, V, R> a();

    public String y() {
        return this.A;
    }

    public String z() {
        return this.B;
    }

    public List<String> a(jf jfVar) {
        return this.D.a(jfVar);
    }

    public V D() {
        return a().a((a<A, V, R>) this, false);
    }

    public void E() {
        if (this.D != null) {
            this.D.c();
        }
    }

    @Override // com.vungle.publisher.dp
    /* renamed from: w */
    public String d_() {
        String str = (String) super.d_();
        E();
        if (this.C != null) {
            this.C.d_();
        }
        return str;
    }

    @Override // com.vungle.publisher.dp, com.vungle.publisher.gj
    public int f_() {
        int f_ = super.f_();
        if (f_ == 1 && this.C != null) {
            this.C.f_();
        }
        return f_;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.cn, com.vungle.publisher.dp
    public ContentValues a(boolean z) {
        ContentValues a2 = super.a(z);
        a2.put("call_to_action_final_url", this.A);
        a2.put("call_to_action_url", this.B);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.cn, com.vungle.publisher.dp
    public StringBuilder p() {
        StringBuilder p = super.p();
        a(p, "call_to_action_final_url", this.A);
        a(p, "call_to_action_url", this.B);
        this.D.a(p);
        return p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public static abstract class a<A extends jh<A, V, R>, V extends jg<A>, R extends wp> extends cn.a<A, R> {
        protected abstract je.a<?, A, R, ji, ?, ?> j();

        protected abstract jg.a<A, V, R> k();

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vungle.publisher.cn.a
        public /* bridge */ /* synthetic */ cn a(cn cnVar, Cursor cursor, boolean z) {
            return a((a<A, V, R>) ((jh) cnVar), cursor, z);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vungle.publisher.cn.a
        public /* synthetic */ cn a(cn cnVar, wc wcVar) {
            return b((a<A, V, R>) ((jh) cnVar), (jh) ((wp) wcVar));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vungle.publisher.cn.a, com.vungle.publisher.ea
        public /* bridge */ /* synthetic */ cn a(wc wcVar) {
            return a((a<A, V, R>) ((wp) wcVar));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vungle.publisher.cn.a, com.vungle.publisher.dp.a
        protected /* bridge */ /* synthetic */ dp a(dp dpVar, Cursor cursor, boolean z) {
            return a((a<A, V, R>) ((jh) dpVar), cursor, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vungle.publisher.cn.a
        public /* synthetic */ int b(cn cnVar, wc wcVar) {
            return a((a<A, V, R>) ((jh) cnVar), (jh) ((wp) wcVar));
        }

        public A a(R r) {
            A a = (A) super.a((a<A, V, R>) r);
            a.D = (je<?, A, R, ji, ?, ?>) j().a((je.a<?, A, R, ji, ?, ?>) a, (A) r);
            a.C = k().a((jg.a<A, V, R>) a, (A) r);
            return a;
        }

        public int a(A a, R r) {
            b((a<A, V, R>) a, (A) r);
            k().a((jg.a<A, V, R>) ((V) a.D()), r);
            a.D.a((je<?, A, R, ji, ?, ?>) r);
            return super.b((a<A, V, R>) a, (A) r);
        }

        protected A b(A a, R r) {
            super.a((a<A, V, R>) a, (A) r);
            String q = r.q();
            String s = r.s();
            if (TextUtils.isEmpty(q)) {
                a.A = s;
            } else {
                a.A = q;
                a.B = s;
            }
            return a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public A a(A a, Cursor cursor, boolean z) {
            super.a((a<A, V, R>) a, cursor, z);
            a.A = ce.e(cursor, "call_to_action_final_url");
            a.B = ce.e(cursor, "call_to_action_url");
            a.D = (je<?, A, R, ji, ?, ?>) j().a(a);
            if (z) {
                a((a<A, V, R>) a, z);
            }
            return a;
        }

        protected V a(A a, boolean z) {
            if (a.E) {
                return a.C;
            }
            V a2 = k().a((String) a.u, z);
            a.C = a2;
            a.E = true;
            return a2;
        }
    }
}
