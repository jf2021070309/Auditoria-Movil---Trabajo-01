package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.publisher.ei;
import com.vungle.publisher.ge;
import com.vungle.publisher.iz;
import com.vungle.publisher.jm;
import com.vungle.publisher.jn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class dk extends jm<jn> implements ge.b<jn> {
    ge a;
    String b;
    String c;
    iz d;
    @Inject
    jn.a e;
    @Inject
    a f;

    @Override // com.vungle.publisher.ge.b
    public String a() {
        return this.c + "." + h();
    }

    @Override // com.vungle.publisher.gd
    public String e() {
        return this.a.c();
    }

    public void a(String str) {
        this.a.a(str);
    }

    @Override // com.vungle.publisher.gd
    public void a(Integer num) {
        this.a.a(num);
    }

    public String h() {
        return this.b;
    }

    @Override // com.vungle.publisher.gd
    public String i() {
        return this.a.f();
    }

    @Override // com.vungle.publisher.gd
    public boolean m() {
        return this.a.j();
    }

    @Override // com.vungle.publisher.gd
    public boolean n() {
        return this.a.l();
    }

    @Override // com.vungle.publisher.gd
    public boolean r() {
        return this.a.e();
    }

    @Override // com.vungle.publisher.gd
    public int s() {
        return super.q();
    }

    @Override // com.vungle.publisher.ge.b
    public boolean t() {
        return true;
    }

    @Override // com.vungle.publisher.ge.b
    public boolean u() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.jm
    /* renamed from: v */
    public jn.a y() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: w */
    public a b_() {
        return this.f;
    }

    @Override // com.vungle.publisher.dp
    /* renamed from: x */
    public Integer d_() {
        Integer num = (Integer) super.d_();
        if (this.d != null) {
            this.d.d_();
        }
        return num;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.jm, com.vungle.publisher.dp
    public ContentValues a(boolean z) {
        ContentValues a2 = super.a(z);
        this.a.a(a2);
        a2.put("name", this.c);
        a2.put("extension", this.b);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends jm.a<jn, dk, wr> {
        @Inject
        Provider<dk> a;
        @Inject
        ge.a b;
        @Inject
        iz.a c;

        dk a(jn jnVar, wr wrVar, wy wyVar) {
            dk dkVar;
            if (wrVar == null) {
                dkVar = null;
            } else if (wyVar != null) {
                dkVar = a((dk) super.a((a) jnVar, (jn) wrVar), wyVar);
            } else {
                throw new IllegalArgumentException("cannot create asset with null url");
            }
            dkVar.d = this.c.a(jnVar.c_(), dkVar.c, dkVar.i());
            return dkVar;
        }

        public List<dk> a(jn jnVar, wr wrVar) {
            Collection<wy> a = wrVar.p().a();
            ArrayList arrayList = new ArrayList();
            for (wy wyVar : a) {
                arrayList.add(a(jnVar, wrVar, wyVar));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.jm.a
        public dk a(dk dkVar, Cursor cursor, boolean z) {
            super.a((a) dkVar, cursor, z);
            dkVar.b = ce.e(cursor, "extension");
            dkVar.c = ce.e(cursor, "name");
            dkVar.a.a(cursor);
            return dkVar;
        }

        dk a(dk dkVar, wy wyVar) {
            dkVar.r = ei.b.asset;
            String b = wyVar.b();
            String a = wyVar.a();
            String c = wyVar.c();
            if (b == null) {
                throw new IllegalArgumentException("asset object must have a non-null url");
            }
            if (a == null) {
                throw new IllegalArgumentException("asset object must have a non-null extension");
            }
            if (c == null) {
                throw new IllegalArgumentException("asset object must have a non-null name");
            }
            dkVar.c = c;
            dkVar.b = a;
            dkVar.a(b);
            return dkVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public dk g_() {
            dk dkVar = this.a.get();
            dkVar.a = this.b.a(dkVar);
            return dkVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public dk[] d(int i) {
            return new dk[i];
        }
    }
}
