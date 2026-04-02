package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.publisher.cn;
import com.vungle.publisher.df;
import com.vungle.publisher.ei;
import com.vungle.publisher.ej;
import com.vungle.publisher.ge;
import com.vungle.publisher.jm;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.qu;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.inject.Inject;
/* loaded from: classes4.dex */
public abstract class ej<A extends cn, V extends ej<A, V>> extends jm<A> implements ge.b<A> {
    df[] a;
    boolean b;
    boolean c;
    boolean d;
    @Inject
    df.a e;
    @Inject
    ge f;

    @Override // com.vungle.publisher.ge.b
    public String a() {
        return o() + "." + v();
    }

    @Override // com.vungle.publisher.gd
    public String e() {
        return this.f.c();
    }

    public void a(String str) {
        this.f.a(str);
    }

    @Override // com.vungle.publisher.gd
    public void a(Integer num) {
        this.f.a(num);
    }

    public File h() {
        return this.f.d();
    }

    public String v() {
        return "zip";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ej<A, V> I() {
        return this;
    }

    public df[] w() {
        if (!this.b) {
            a(this.e.a((ej<?, ?>) I()), false);
        }
        return this.a;
    }

    void a(df[] dfVarArr, boolean z) {
        this.a = dfVarArr;
        this.c = z;
        this.b = true;
    }

    File x() {
        return new File(z());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String z() {
        return qr.a(d(), this.r);
    }

    public File D() {
        return new File(E());
    }

    public String E() {
        return qr.a(z(), "index.html");
    }

    @Override // com.vungle.publisher.gd
    public String i() {
        return this.f.f();
    }

    @Override // com.vungle.publisher.gd
    public boolean m() {
        return this.f.j();
    }

    @Override // com.vungle.publisher.ge.b
    public boolean t() {
        if (!this.f.m() || !F()) {
            return false;
        }
        return u();
    }

    boolean F() {
        File h = h();
        try {
            final ArrayList arrayList = new ArrayList();
            qu.a(h, x(), new qu.a() { // from class: com.vungle.publisher.ej.1
                @Override // com.vungle.publisher.qu.a
                public void a(File file, String str, long j) {
                    Logger.v(Logger.PREPARE_TAG, "extracted " + file + ": " + j + " bytes");
                    arrayList.add(ej.this.e.a(ej.this.I(), file, str, (int) j));
                }
            });
            a((df[]) arrayList.toArray(new df[arrayList.size()]), true);
            return true;
        } catch (IOException e) {
            Logger.e(Logger.PREPARE_TAG, "error extracting " + h, e);
            return false;
        }
    }

    @Override // com.vungle.publisher.gd
    public boolean n() {
        return this.f.l();
    }

    @Override // com.vungle.publisher.ge.b
    public boolean u() {
        df[] w = w();
        int length = w.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            if (!w[i].r()) {
                return false;
            }
            i++;
            z = true;
        }
        return z;
    }

    @Override // com.vungle.publisher.dp
    public int q() {
        H();
        return this.f.h();
    }

    @Override // com.vungle.publisher.gd
    public boolean r() {
        return G() & H();
    }

    boolean G() {
        return this.f.n();
    }

    boolean H() {
        String z = z();
        Logger.d(Logger.DATABASE_TAG, "deleting " + this.r + " directory " + z);
        boolean a2 = qr.a(z());
        if (a2) {
            Logger.v(Logger.DATABASE_TAG, "deleting " + this.r + " directory " + z);
            this.a = null;
            this.d = true;
        } else {
            Logger.w(Logger.DATABASE_TAG, "failed to delete " + this.r + " directory " + z);
        }
        return a2;
    }

    @Override // com.vungle.publisher.gd
    public int s() {
        return super.q();
    }

    @Override // com.vungle.publisher.dp, com.vungle.publisher.gj
    public int f_() {
        int f_ = super.f_();
        if (f_ == 1) {
            if (this.d) {
                this.e.a((Integer) this.u);
                H();
                Logger.v(Logger.DATABASE_TAG, "resetting areArchiveEntriesDeleted = false");
                this.d = false;
            } else if (this.c) {
                this.e.a((dp[]) this.a);
                Logger.v(Logger.DATABASE_TAG, "resetting areArchiveEntriesNew = false");
                this.c = false;
            }
        }
        return f_;
    }

    @Override // com.vungle.publisher.jm, com.vungle.publisher.dp
    protected ContentValues a(boolean z) {
        ContentValues a2 = super.a(z);
        this.f.a(a2);
        return a2;
    }

    @Override // com.vungle.publisher.jm, com.vungle.publisher.dp
    protected StringBuilder p() {
        StringBuilder p = super.p();
        this.f.a(p);
        return p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class a<A extends cn, V extends ej<A, V>, R extends wc> extends jm.a<A, V, R> {
        @Inject
        ge.a a;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vungle.publisher.jm.a, com.vungle.publisher.dp.a
        protected /* bridge */ /* synthetic */ dp a(dp dpVar, Cursor cursor, boolean z) {
            return a((a<A, V, R>) ((ej) dpVar), cursor, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vungle.publisher.jm.a
        protected /* bridge */ /* synthetic */ jm a(jm jmVar, Cursor cursor, boolean z) {
            return a((a<A, V, R>) ((ej) jmVar), cursor, z);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public V a(A a, R r, ei.b bVar) {
            V v = (V) super.a((a<A, V, R>) a, (A) r);
            if (v != null) {
                v.r = bVar;
            }
            return v;
        }

        protected V a(V v, Cursor cursor, boolean z) {
            super.a((a<A, V, R>) v, cursor, z);
            v.f.a(cursor);
            if (z) {
                v.w();
            }
            return v;
        }
    }
}
