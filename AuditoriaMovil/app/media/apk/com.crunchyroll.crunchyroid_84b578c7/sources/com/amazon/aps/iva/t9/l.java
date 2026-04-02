package com.amazon.aps.iva.t9;
/* compiled from: WorkNameDao_Impl.java */
/* loaded from: classes.dex */
public final class l implements k {
    public final com.amazon.aps.iva.p8.g a;
    public final a b;

    /* compiled from: WorkNameDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends com.amazon.aps.iva.p8.b<j> {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // com.amazon.aps.iva.p8.b
        public final void d(com.amazon.aps.iva.v8.e eVar, j jVar) {
            j jVar2 = jVar;
            String str = jVar2.a;
            if (str == null) {
                eVar.h(1);
            } else {
                eVar.i(1, str);
            }
            String str2 = jVar2.b;
            if (str2 == null) {
                eVar.h(2);
            } else {
                eVar.i(2, str2);
            }
        }
    }

    public l(com.amazon.aps.iva.p8.g gVar) {
        this.a = gVar;
        this.b = new a(gVar);
    }
}
