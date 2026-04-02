package com.umeng.analytics.pro;

import com.umeng.analytics.pro.ci;
/* compiled from: TProtocolUtil.java */
/* loaded from: classes3.dex */
public class cr {
    private static int a = Integer.MAX_VALUE;

    public static void a(int i) {
        a = i;
    }

    public static void a(co coVar, byte b) throws bv {
        a(coVar, b, a);
    }

    public static void a(co coVar, byte b, int i) throws bv {
        if (i <= 0) {
            throw new bv("Maximum skip depth exceeded");
        }
        int i2 = 0;
        switch (b) {
            case 2:
                coVar.t();
                return;
            case 3:
                coVar.u();
                return;
            case 4:
                coVar.y();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                coVar.v();
                return;
            case 8:
                coVar.w();
                return;
            case 10:
                coVar.x();
                return;
            case 11:
                coVar.A();
                return;
            case 12:
                coVar.j();
                while (true) {
                    cj l = coVar.l();
                    if (l.b != 0) {
                        a(coVar, l.b, i - 1);
                        coVar.m();
                    } else {
                        coVar.k();
                        return;
                    }
                }
            case 13:
                cl n = coVar.n();
                while (i2 < n.c) {
                    int i3 = i - 1;
                    a(coVar, n.a, i3);
                    a(coVar, n.b, i3);
                    i2++;
                }
                coVar.o();
                return;
            case 14:
                cs r = coVar.r();
                while (i2 < r.b) {
                    a(coVar, r.a, i - 1);
                    i2++;
                }
                coVar.s();
                return;
            case 15:
                ck p = coVar.p();
                while (i2 < p.b) {
                    a(coVar, p.a, i - 1);
                    i2++;
                }
                coVar.q();
                return;
        }
    }

    public static cq a(byte[] bArr, cq cqVar) {
        if (bArr[0] > 16) {
            return new ci.a();
        }
        if (bArr.length > 1 && (bArr[1] & 128) != 0) {
            return new ci.a();
        }
        return cqVar;
    }
}
