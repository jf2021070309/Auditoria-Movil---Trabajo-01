package com.amazon.aps.iva.t9;
/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes.dex */
public final class o implements n {
    public final com.amazon.aps.iva.p8.g a;
    public final a b;
    public final b c;
    public final c d;

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends com.amazon.aps.iva.p8.b<m> {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // com.amazon.aps.iva.p8.b
        public final void d(com.amazon.aps.iva.v8.e eVar, m mVar) {
            m mVar2 = mVar;
            String str = mVar2.a;
            if (str == null) {
                eVar.h(1);
            } else {
                eVar.i(1, str);
            }
            byte[] b = androidx.work.b.b(mVar2.b);
            if (b == null) {
                eVar.h(2);
            } else {
                eVar.a(2, b);
            }
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends com.amazon.aps.iva.p8.k {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class c extends com.amazon.aps.iva.p8.k {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(com.amazon.aps.iva.p8.g gVar) {
        this.a = gVar;
        this.b = new a(gVar);
        this.c = new b(gVar);
        this.d = new c(gVar);
    }
}
