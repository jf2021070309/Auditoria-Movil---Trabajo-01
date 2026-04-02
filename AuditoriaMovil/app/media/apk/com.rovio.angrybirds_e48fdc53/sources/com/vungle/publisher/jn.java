package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.vungle.publisher.cn;
import com.vungle.publisher.dk;
import com.vungle.publisher.dw;
import com.vungle.publisher.ei;
import com.vungle.publisher.iz;
import com.vungle.publisher.jo;
import com.vungle.publisher.jt;
import com.vungle.publisher.jy;
import com.vungle.publisher.ks;
import com.vungle.publisher.lb;
import com.vungle.publisher.log.Logger;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class jn extends dq implements dr<jn> {
    jo A;
    List<iz> B;
    ks C;
    dw D;
    @Inject
    a E;
    @Inject
    lb.a F;
    boolean w = false;
    boolean x = false;
    boolean y;
    List<dk> z;

    @Override // com.vungle.publisher.dr
    public /* synthetic */ String d() {
        return (String) super.c_();
    }

    @Override // com.vungle.publisher.cn
    /* renamed from: t */
    public a a() {
        return this.E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: u */
    public a b_() {
        return a();
    }

    @Override // com.vungle.publisher.dq
    /* renamed from: v */
    public lb s() {
        a().a(this, false);
        D();
        return this.F.a(this.A.D().toURI().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void D() {
        /*
            r5 = this;
            r4 = 1
            java.lang.String r0 = com.vungle.publisher.ru.a()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            com.vungle.publisher.jo r3 = r5.A
            java.lang.String r3 = r3.z()
            r1[r2] = r3
            java.lang.String r2 = "mraid.js"
            r1[r4] = r2
            java.lang.String r1 = com.vungle.publisher.qr.a(r1)
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch: java.io.IOException -> L5d java.lang.Throwable -> L75
            r3.<init>(r1)     // Catch: java.io.IOException -> L5d java.lang.Throwable -> L75
            r3.createNewFile()     // Catch: java.io.IOException -> L5d java.lang.Throwable -> L75
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L5d java.lang.Throwable -> L75
            r4 = 1
            r1.<init>(r3, r4)     // Catch: java.io.IOException -> L5d java.lang.Throwable -> L75
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            r2.<init>()     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            java.lang.String r3 = "\n"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            java.lang.String r2 = "UTF-8"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            byte[] r0 = r0.getBytes(r2)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            r1.write(r0)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            if (r1 == 0) goto L53
            r1.close()     // Catch: java.io.IOException -> L54
        L53:
            return
        L54:
            r0 = move-exception
            java.lang.String r1 = "VungleDatabase"
            java.lang.String r2 = "error closing output file"
            com.vungle.publisher.log.Logger.d(r1, r2, r0)
            goto L53
        L5d:
            r0 = move-exception
            r1 = r2
        L5f:
            java.lang.String r2 = "VungleDatabase"
            java.lang.String r3 = "Failed writing to the mraid js file"
            com.vungle.publisher.log.Logger.e(r2, r3, r0)     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L53
            r1.close()     // Catch: java.io.IOException -> L6c
            goto L53
        L6c:
            r0 = move-exception
            java.lang.String r1 = "VungleDatabase"
            java.lang.String r2 = "error closing output file"
            com.vungle.publisher.log.Logger.d(r1, r2, r0)
            goto L53
        L75:
            r0 = move-exception
            r1 = r2
        L77:
            if (r1 == 0) goto L7c
            r1.close()     // Catch: java.io.IOException -> L7d
        L7c:
            throw r0
        L7d:
            r1 = move-exception
            java.lang.String r2 = "VungleDatabase"
            java.lang.String r3 = "error closing output file"
            com.vungle.publisher.log.Logger.d(r2, r3, r1)
            goto L7c
        L86:
            r0 = move-exception
            goto L77
        L88:
            r0 = move-exception
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.publisher.jn.D():void");
    }

    public boolean w() {
        return this.y;
    }

    @Override // com.vungle.publisher.dq
    public List<String> a(jf jfVar) {
        return this.C.a(jfVar);
    }

    public void x() {
        if (this.C != null) {
            this.C.c();
        }
    }

    @Override // com.vungle.publisher.cn
    public boolean b() {
        return qr.a(h());
    }

    @Override // com.vungle.publisher.cn, com.vungle.publisher.dr
    public void a(cn.c cVar) {
        cn.c cVar2 = this.f;
        super.a(cVar);
        this.D.a(cVar2, cVar);
    }

    @Override // com.vungle.publisher.dp
    /* renamed from: y */
    public String d_() {
        String str = (String) super.d_();
        x();
        if (this.z != null) {
            for (dk dkVar : this.z) {
                dkVar.d_();
            }
        }
        if (this.A != null) {
            this.A.d_();
        }
        if (this.B != null) {
            for (iz izVar : this.B) {
                izVar.d_();
            }
        }
        return str;
    }

    @Override // com.vungle.publisher.dp, com.vungle.publisher.gj
    public int f_() {
        int f_ = super.f_();
        if (f_ == 1) {
            if (this.z != null) {
                for (dk dkVar : this.z) {
                    dkVar.f_();
                }
            }
            if (this.A != null) {
                this.A.f_();
            }
            if (this.B != null) {
                for (iz izVar : this.B) {
                    izVar.f_();
                }
            }
        }
        return f_;
    }

    @Override // com.vungle.publisher.cn, com.vungle.publisher.dp
    protected ContentValues a(boolean z) {
        ContentValues a2 = super.a(z);
        a2.put("requires_sideloading", Boolean.valueOf(this.y));
        if (z) {
            a2.put("template_id", this.k);
            a2.put(MessengerShareContentUtility.TEMPLATE_TYPE, this.s);
        }
        return a2;
    }

    @Override // com.vungle.publisher.cn, com.vungle.publisher.dp
    protected StringBuilder p() {
        StringBuilder p = super.p();
        a(p, "template_id", this.k);
        a(p, MessengerShareContentUtility.TEMPLATE_TYPE, this.s);
        return p;
    }

    @Override // com.vungle.publisher.dr
    /* renamed from: z */
    public jn m_() {
        return this;
    }

    @Override // com.vungle.publisher.dr
    public boolean l_() {
        b_().a(this, true);
        boolean z = this.A != null;
        String B = B();
        if (z) {
            Logger.v(Logger.PREPARE_TAG, B + " has " + ei.b.template + ": " + this.A.e());
        } else {
            Logger.w(Logger.PREPARE_TAG, "vungle mraid ad is invalid. template = " + this.A);
            a(cn.c.invalid);
        }
        return z;
    }

    @Override // com.vungle.publisher.dr
    public List<gd<jn>> k_() {
        ArrayList arrayList = new ArrayList();
        a b_ = b_();
        b_.b(this, true);
        if (this.z != null) {
            arrayList.addAll(this.z);
        } else {
            Logger.d(Logger.DATABASE_TAG, "vungle mraid ad assets are null");
        }
        b_.a(this, true);
        if (this.A != null) {
            arrayList.add(this.A);
        } else {
            Logger.w(Logger.DATABASE_TAG, "vungle mraid ad template is null");
        }
        return arrayList;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends cn.a<jn, wr> implements ea<jn, wr> {
        @Inject
        Provider<jn> e;
        @Inject
        zl f;
        @Inject
        dk.a g;
        @Inject
        Provider<String> h;
        @Inject
        jt.a i;
        @Inject
        jo.a j;
        @Inject
        jy.a k;
        @Inject
        ks.a l;
        @Inject
        iz.a m;
        @Inject
        dw.a n;

        @Override // com.vungle.publisher.ea
        public /* bridge */ /* synthetic */ dr<jn> a(String str, boolean z) {
            return (dr) super.a((a) str, z);
        }

        @Override // com.vungle.publisher.cn.a, com.vungle.publisher.ea
        public jn a(wr wrVar) {
            jn jnVar = (jn) super.a((a) wrVar);
            jnVar.m = wrVar.c();
            jnVar.a(this.h.get());
            jnVar.z = this.g.a(jnVar, wrVar);
            jnVar.A = this.j.a(jnVar, wrVar, ei.b.template);
            jnVar.C = this.l.a((ks.a) jnVar, (jn) wrVar);
            jnVar.D = this.n.a(jnVar);
            jnVar.k = wrVar.r();
            jnVar.s = wrVar.m();
            jnVar.y = wrVar.n();
            JSONObject o = wrVar.o();
            if (o != null) {
                jnVar.B = this.m.a((String) jnVar.u, o);
            }
            jnVar.a(cn.c.aware);
            return jnVar;
        }

        @Override // com.vungle.publisher.cn.a
        /* renamed from: a */
        public int b(jn jnVar, wr wrVar) {
            a((a) jnVar, (jn) wrVar);
            jnVar.m = wrVar.c();
            jnVar.C.a((ks) wrVar);
            return super.b((a) jnVar, (jn) wrVar);
        }

        @Override // com.vungle.publisher.cn.a, com.vungle.publisher.dp.a
        public int a(List<jn> list) {
            return d().a(list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cn.a, com.vungle.publisher.dp.a
        public jn a(jn jnVar, Cursor cursor, boolean z) {
            super.a((a) jnVar, cursor, z);
            jnVar.l = ce.a(cursor, "delete_local_content_attempts", 0);
            jnVar.m = ce.d(cursor, "expiration_timestamp_seconds");
            jnVar.a(ce.e(cursor, "parent_path"));
            jnVar.o = ce.a(cursor, "prepare_retry_count", 0);
            jnVar.p = this.f.a();
            jnVar.C = this.l.a(jnVar);
            jnVar.D = this.n.a(jnVar);
            jnVar.k = ce.e(cursor, "template_id");
            jnVar.s = ce.e(cursor, MessengerShareContentUtility.TEMPLATE_TYPE);
            jnVar.y = ce.a(cursor, "requires_sideloading").booleanValue();
            if (z) {
                b(jnVar, z);
                a(jnVar, z);
            }
            return jnVar;
        }

        jo a(jn jnVar, boolean z) {
            if (jnVar.x) {
                return jnVar.A;
            }
            jo joVar = (jo) this.j.a((String) jnVar.u, ei.b.template, z);
            jnVar.A = joVar;
            jnVar.x = true;
            return joVar;
        }

        List<dk> b(jn jnVar, boolean z) {
            if (jnVar.w) {
                return jnVar.z;
            }
            List<dk> a = this.g.a(ei.b.asset, (String) jnVar.u, z);
            jnVar.z = a;
            jnVar.w = true;
            return a;
        }

        @Override // com.vungle.publisher.cn.a
        protected m a() {
            return m.vungle_mraid;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: e */
        public jn g_() {
            return this.e.get();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public jn[] d(int i) {
            return new jn[i];
        }

        @Override // com.vungle.publisher.ea
        /* renamed from: f */
        public a n_() {
            return this;
        }

        @Override // com.vungle.publisher.ea
        /* renamed from: g */
        public jt d() {
            return this.i.a(this);
        }
    }
}
