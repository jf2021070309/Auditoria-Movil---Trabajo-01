package com.amazon.aps.iva.ca0;

import com.amazon.aps.iva.da0.r;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ga0.j;
import com.amazon.aps.iva.ga0.q;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
public final class a {
    public static final ConcurrentHashMap<String, b> a = new ConcurrentHashMap<>();
    public static final j b = new j();
    public static final q c = new q();
    public static final f d = new f();
    public static boolean e = false;

    /* renamed from: com.amazon.aps.iva.ca0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0166a extends com.amazon.aps.iva.da0.b {
        public final String c;

        public C0166a(String str) {
            this.c = str;
        }

        @Override // com.amazon.aps.iva.da0.g
        public final void b(com.amazon.aps.iva.da0.e eVar) {
            if (eVar.t()) {
                r rVar = (r) eVar;
                j jVar = a.b;
                j jVar2 = new j();
                jVar2.e(jVar);
                rVar.B(jVar);
                rVar.j = jVar2;
                q qVar = a.c;
                q qVar2 = new q();
                qVar2.e(qVar);
                rVar.B(qVar2);
                rVar.k = qVar2;
                ConcurrentHashMap<String, b> concurrentHashMap = a.a;
                String str = this.c;
                b bVar = concurrentHashMap.get(str);
                if (bVar != null) {
                    bVar.h.b(eVar);
                    return;
                }
                com.amazon.aps.iva.ia0.b.a("MuxCore", "Failed to handle event: " + eVar.getType() + ",player not found for playerId: " + str);
            }
        }
    }

    public static void a(String str, com.amazon.aps.iva.da0.a aVar) {
        b bVar = a.get(str);
        if (bVar != null) {
            f fVar = d;
            long a2 = fVar.d.a();
            if (a2 > fVar.c) {
                long a3 = fVar.d.a();
                fVar.a = f1.w();
                fVar.b = a3;
                fVar.c = a3 + 1500000;
            } else {
                fVar.c = a2 + 1500000;
            }
            Long valueOf = Long.valueOf(fVar.b);
            j jVar = b;
            jVar.getClass();
            if (valueOf != null) {
                jVar.b("sst", valueOf.toString());
            }
            Long valueOf2 = Long.valueOf(fVar.c);
            if (valueOf2 != null) {
                jVar.b("sex", valueOf2.toString());
            }
            String str2 = fVar.a;
            if (str2 != null) {
                jVar.b("sid", str2);
            }
            bVar.a(aVar);
        }
    }
}
