package com.amazon.aps.iva.ca0;

import com.amazon.aps.iva.da0.r;
import com.amazon.aps.iva.da0.s;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ga0.g;
import com.amazon.aps.iva.ga0.h;
import com.amazon.aps.iva.ga0.i;
import com.amazon.aps.iva.ga0.n;
import com.amazon.aps.iva.ga0.o;
import com.amazon.aps.iva.ha0.j;
import com.amazon.aps.iva.ha0.k;
import com.amazon.aps.iva.ha0.l;
import com.amazon.aps.iva.ha0.m;
import com.amazon.aps.iva.ha0.p;
import com.amazon.aps.iva.ha0.q;
import com.amazon.aps.iva.n4.f0;
/* loaded from: classes4.dex */
public final class c extends com.amazon.aps.iva.da0.c {
    public o d;
    public n e;
    public g f;
    public h g;
    public i h;
    public com.amazon.aps.iva.ga0.a i;
    public final com.amazon.aps.iva.ga0.d j = new com.amazon.aps.iva.ga0.d();
    public int k;

    @Override // com.amazon.aps.iva.da0.c, com.amazon.aps.iva.da0.f
    public final void a(com.amazon.aps.iva.da0.e eVar) {
        boolean t = eVar.t();
        boolean z = false;
        com.amazon.aps.iva.ga0.d dVar = this.j;
        if (t) {
            r rVar = (r) eVar;
            o oVar = this.d;
            o oVar2 = new o();
            oVar2.e(rVar.e);
            oVar.e(oVar2);
            o oVar3 = this.d;
            int i = this.k + 1;
            this.k = i;
            Integer valueOf = Integer.valueOf(i);
            oVar3.getClass();
            if (valueOf != null) {
                oVar3.b("xsqno", valueOf.toString());
            }
            o oVar4 = this.d;
            o oVar5 = new o();
            oVar5.e(oVar4);
            rVar.B(oVar5);
            rVar.e = oVar5;
            n nVar = this.e;
            n nVar2 = new n();
            nVar2.e(nVar);
            rVar.B(nVar2);
            rVar.f = nVar2;
            g gVar = this.f;
            g gVar2 = new g();
            gVar2.e(gVar);
            rVar.B(gVar2);
            rVar.g = gVar2;
            h hVar = this.g;
            h hVar2 = new h();
            hVar2.e(hVar);
            rVar.B(hVar2);
            rVar.m = hVar2;
            i iVar = this.h;
            i iVar2 = new i();
            iVar2.e(iVar);
            rVar.B(iVar2);
            rVar.n = iVar2;
            com.amazon.aps.iva.ga0.d dVar2 = new com.amazon.aps.iva.ga0.d();
            dVar2.e(dVar);
            rVar.B(dVar2);
            rVar.p = dVar2;
            com.amazon.aps.iva.ga0.a aVar = this.i;
            com.amazon.aps.iva.ga0.a aVar2 = new com.amazon.aps.iva.ga0.a();
            aVar2.e(aVar);
            rVar.B(aVar2);
            rVar.o = aVar2;
            String[] strArr = {"adbreakend", "adended"};
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    break;
                }
                if (rVar.c.equals(strArr[i2])) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                com.amazon.aps.iva.ga0.a aVar3 = this.i;
                aVar3.getClass();
                aVar3.a = new com.amazon.aps.iva.if0.c();
            }
        } else if (eVar.w()) {
            com.amazon.aps.iva.fa0.n nVar3 = (com.amazon.aps.iva.fa0.n) eVar;
            if (nVar3.getType().equals("viewinit")) {
                o oVar6 = new o();
                this.d = oVar6;
                String w = f1.w();
                if (w != null) {
                    oVar6.b("xid", w);
                }
                this.e = new n();
                this.f = new g();
                this.g = new h();
                this.h = new i();
                this.i = new com.amazon.aps.iva.ga0.a();
                this.k = 0;
                b(new com.amazon.aps.iva.ha0.h(this));
                b(new p(this));
                b(new l(this));
                b(new m(this));
                b(new com.amazon.aps.iva.ha0.g(this));
                b(new com.amazon.aps.iva.ha0.i(this));
                b(new q(this));
                b(new com.amazon.aps.iva.ha0.n(this));
                b(new j(this));
                b(new com.amazon.aps.iva.ha0.o(this));
                b(new k(this));
                b(new com.amazon.aps.iva.ha0.a(this));
                b(new com.amazon.aps.iva.ha0.e(this));
                b(new com.amazon.aps.iva.ha0.f(this));
            }
            if (nVar3.a() != null) {
                this.d.e(nVar3.a());
            }
            if (nVar3.getAdData() != null) {
                this.i.e(nVar3.getAdData());
            }
            nVar3.i(this.d);
            nVar3.f(this.i);
            nVar3.g(this.e);
        }
        if (eVar.v()) {
            this.d.e(((s) eVar).c);
        } else if (eVar.x()) {
            com.amazon.aps.iva.da0.q qVar = (com.amazon.aps.iva.da0.q) eVar;
            o oVar7 = qVar.c;
            if (oVar7 != null) {
                this.d.e(oVar7);
            }
            n nVar4 = qVar.d;
            if (nVar4 != null) {
                this.e.e(nVar4);
            }
            g gVar3 = qVar.e;
            if (gVar3 != null) {
                this.f.e(gVar3);
            }
            h hVar3 = qVar.g;
            if (hVar3 != null) {
                this.g.e(hVar3);
            }
            i iVar3 = qVar.h;
            f0 f0Var = new f0(this, 8);
            if (iVar3 != null) {
                f0Var.a(iVar3);
            }
            com.amazon.aps.iva.ga0.d dVar3 = qVar.i;
            if (dVar3 != null) {
                dVar.e(dVar3);
            }
        } else if (eVar.s()) {
            com.amazon.aps.iva.ea0.a aVar4 = (com.amazon.aps.iva.ea0.a) eVar;
            n nVar5 = this.e;
            if (nVar5 != null && this.f != null) {
                nVar5.e(aVar4.d);
                this.f.e(aVar4.e);
                this.g.e(aVar4.f);
                this.h.e(aVar4.h);
                dVar.e(aVar4.i);
            }
        } else {
            super.a(eVar);
        }
    }
}
