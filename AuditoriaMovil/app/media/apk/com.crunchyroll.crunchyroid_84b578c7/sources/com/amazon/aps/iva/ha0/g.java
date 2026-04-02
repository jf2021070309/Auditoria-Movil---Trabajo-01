package com.amazon.aps.iva.ha0;

import com.amazon.aps.iva.fa0.t;
/* loaded from: classes4.dex */
public final class g extends c {
    public boolean d;

    public g(com.amazon.aps.iva.da0.f fVar) {
        super(fVar);
        this.d = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.amazon.aps.iva.ha0.c
    public final void d(t tVar) {
        char c;
        String type = tVar.getType();
        type.getClass();
        switch (type.hashCode()) {
            case -1535613269:
                if (type.equals("adplaying")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1422144041:
                if (type.equals("adplay")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1300510776:
                if (type.equals("rebufferend")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1146889097:
                if (type.equals("adended")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1137100877:
                if (type.equals("adpause")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -906224361:
                if (type.equals("seeked")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -493563858:
                if (type.equals("playing")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3443508:
                if (type.equals("play")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 57736207:
                if (type.equals("rebufferstart")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 96651962:
                if (type.equals("ended")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 96784904:
                if (type.equals("error")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 106440182:
                if (type.equals("pause")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 454234134:
                if (type.equals("viewend")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1651552038:
                if (type.equals("adbreakstart")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1762557398:
                if (type.equals("timeupdate")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1971820138:
                if (type.equals("seeking")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2133546143:
                if (type.equals("adbreakend")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        com.amazon.aps.iva.ga0.k kVar = tVar.d;
        switch (c) {
            case 0:
            case 6:
                this.d = true;
                com.amazon.aps.iva.ga0.o oVar = tVar.e;
                com.amazon.aps.iva.fa0.p pVar = new com.amazon.aps.iva.fa0.p(kVar, 0);
                pVar.e = oVar;
                c(pVar);
                return;
            case 1:
            case 7:
            case '\r':
            case 15:
                com.amazon.aps.iva.ga0.o oVar2 = tVar.e;
                if (!this.d) {
                    this.d = true;
                    com.amazon.aps.iva.fa0.p pVar2 = new com.amazon.aps.iva.fa0.p(kVar, 0);
                    pVar2.e = oVar2;
                    c(pVar2);
                    return;
                }
                return;
            case 2:
            case '\b':
            case 14:
                if (this.d) {
                    com.amazon.aps.iva.ga0.o oVar3 = tVar.e;
                    com.amazon.aps.iva.fa0.p pVar3 = new com.amazon.aps.iva.fa0.p(kVar, 0);
                    pVar3.e = oVar3;
                    c(pVar3);
                    return;
                }
                return;
            case 3:
            case 4:
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case 16:
                com.amazon.aps.iva.ga0.o oVar4 = tVar.e;
                if (this.d) {
                    this.d = false;
                    com.amazon.aps.iva.fa0.o oVar5 = new com.amazon.aps.iva.fa0.o(kVar, 0);
                    oVar5.e = oVar4;
                    c(oVar5);
                    return;
                }
                return;
            case 5:
                if (kVar.h().booleanValue()) {
                    com.amazon.aps.iva.ga0.o oVar6 = tVar.e;
                    if (this.d) {
                        this.d = false;
                        com.amazon.aps.iva.fa0.o oVar7 = new com.amazon.aps.iva.fa0.o(kVar, 0);
                        oVar7.e = oVar6;
                        c(oVar7);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
