package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.j0.s2;
import com.google.android.gms.common.ConnectionResult;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.List;
/* compiled from: TextFieldKeyInput.kt */
/* loaded from: classes.dex */
public final class y1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.l0.z, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ n0 h;
    public final /* synthetic */ z1 i;
    public final /* synthetic */ com.amazon.aps.iva.yb0.z j;

    /* compiled from: TextFieldKeyInput.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[n0.values().length];
            try {
                iArr[n0.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n0.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n0.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n0.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n0.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n0.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[n0.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[n0.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[n0.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[n0.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[n0.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[n0.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[n0.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[n0.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[n0.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[n0.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[n0.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[n0.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[n0.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[n0.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[n0.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[n0.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[n0.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[n0.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[n0.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[n0.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[n0.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[n0.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[n0.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[n0.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[n0.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[n0.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[n0.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[n0.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[n0.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[n0.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[n0.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[n0.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[n0.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[n0.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[n0.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[n0.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[n0.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[n0.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[n0.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[n0.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[n0.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[n0.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(n0 n0Var, z1 z1Var, com.amazon.aps.iva.yb0.z zVar) {
        super(1);
        this.h = n0Var;
        this.i = z1Var;
        this.j = zVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.l0.z zVar) {
        s2.a aVar;
        com.amazon.aps.iva.l0.z zVar2 = zVar;
        com.amazon.aps.iva.yb0.j.f(zVar2, "$this$commandExecutionContext");
        int i = a.a[this.h.ordinal()];
        q2 q2Var = zVar2.i;
        com.amazon.aps.iva.c2.y yVar = zVar2.c;
        boolean z = true;
        com.amazon.aps.iva.i2.e0 e0Var = null;
        boolean z2 = false;
        z1 z1Var = this.i;
        com.amazon.aps.iva.c2.b bVar = zVar2.g;
        com.amazon.aps.iva.l0.j0 j0Var = zVar2.e;
        switch (i) {
            case 1:
                z1Var.b.d(false);
                break;
            case 2:
                z1Var.b.l();
                break;
            case 3:
                z1Var.b.f();
                break;
            case 4:
                q1 q1Var = q1.h;
                com.amazon.aps.iva.yb0.j.f(q1Var, "or");
                j0Var.a = null;
                if (bVar.b.length() <= 0) {
                    z = false;
                }
                if (z) {
                    if (com.amazon.aps.iva.c2.z.b(zVar2.f)) {
                        q1Var.invoke(zVar2);
                        break;
                    } else if (zVar2.e()) {
                        int e = com.amazon.aps.iva.c2.z.e(zVar2.f);
                        zVar2.w(e, e);
                        break;
                    } else {
                        int d = com.amazon.aps.iva.c2.z.d(zVar2.f);
                        zVar2.w(d, d);
                        break;
                    }
                }
                break;
            case 5:
                r1 r1Var = r1.h;
                com.amazon.aps.iva.yb0.j.f(r1Var, "or");
                j0Var.a = null;
                if (bVar.b.length() <= 0) {
                    z = false;
                }
                if (z) {
                    if (com.amazon.aps.iva.c2.z.b(zVar2.f)) {
                        r1Var.invoke(zVar2);
                        break;
                    } else if (zVar2.e()) {
                        int d2 = com.amazon.aps.iva.c2.z.d(zVar2.f);
                        zVar2.w(d2, d2);
                        break;
                    } else {
                        int e2 = com.amazon.aps.iva.c2.z.e(zVar2.f);
                        zVar2.w(e2, e2);
                        break;
                    }
                }
                break;
            case 6:
                zVar2.h();
                break;
            case 7:
                zVar2.p();
                break;
            case 8:
                zVar2.m();
                break;
            case 9:
                zVar2.j();
                break;
            case 10:
                if (bVar.b.length() <= 0) {
                    z = false;
                }
                if (z && yVar != null) {
                    int f = zVar2.f(yVar, -1);
                    zVar2.w(f, f);
                    break;
                }
                break;
            case 11:
                if (bVar.b.length() > 0) {
                    z2 = true;
                }
                if (z2 && yVar != null) {
                    int f2 = zVar2.f(yVar, 1);
                    zVar2.w(f2, f2);
                    break;
                }
                break;
            case 12:
                if (bVar.b.length() <= 0) {
                    z = false;
                }
                if (z && q2Var != null) {
                    int z3 = zVar2.z(q2Var, -1);
                    zVar2.w(z3, z3);
                    break;
                }
                break;
            case 13:
                if (bVar.b.length() > 0) {
                    z2 = true;
                }
                if (z2 && q2Var != null) {
                    int z4 = zVar2.z(q2Var, 1);
                    zVar2.w(z4, z4);
                    break;
                }
                break;
            case 14:
                zVar2.u();
                break;
            case 15:
                zVar2.r();
                break;
            case 16:
                zVar2.s();
                break;
            case 17:
                zVar2.t();
                break;
            case 18:
                j0Var.a = null;
                if (bVar.b.length() <= 0) {
                    z = false;
                }
                if (z) {
                    zVar2.w(0, 0);
                    break;
                }
                break;
            case 19:
                zVar2.q();
                break;
            case 20:
                List<com.amazon.aps.iva.i2.f> y = zVar2.y(s1.h);
                if (y != null) {
                    z1Var.a(y);
                    break;
                }
                break;
            case 21:
                List<com.amazon.aps.iva.i2.f> y2 = zVar2.y(t1.h);
                if (y2 != null) {
                    z1Var.a(y2);
                    break;
                }
                break;
            case 22:
                List<com.amazon.aps.iva.i2.f> y3 = zVar2.y(u1.h);
                if (y3 != null) {
                    z1Var.a(y3);
                    break;
                }
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
                List<com.amazon.aps.iva.i2.f> y4 = zVar2.y(v1.h);
                if (y4 != null) {
                    z1Var.a(y4);
                    break;
                }
                break;
            case 24:
                List<com.amazon.aps.iva.i2.f> y5 = zVar2.y(w1.h);
                if (y5 != null) {
                    z1Var.a(y5);
                    break;
                }
                break;
            case 25:
                List<com.amazon.aps.iva.i2.f> y6 = zVar2.y(x1.h);
                if (y6 != null) {
                    z1Var.a(y6);
                    break;
                }
                break;
            case 26:
                if (!z1Var.e) {
                    z1Var.a(com.amazon.aps.iva.ee0.f1.J(new com.amazon.aps.iva.i2.b("\n", 1)));
                    break;
                } else {
                    z1Var.a.s.invoke(new com.amazon.aps.iva.i2.k(z1Var.l));
                    break;
                }
            case 27:
                if (!z1Var.e) {
                    z1Var.a(com.amazon.aps.iva.ee0.f1.J(new com.amazon.aps.iva.i2.b("\t", 1)));
                    break;
                } else {
                    this.j.b = false;
                    break;
                }
            case 28:
                j0Var.a = null;
                if (bVar.b.length() <= 0) {
                    z = false;
                }
                if (z) {
                    zVar2.w(0, bVar.b.length());
                    break;
                }
                break;
            case 29:
                zVar2.g();
                zVar2.v();
                break;
            case 30:
                zVar2.o();
                zVar2.v();
                break;
            case 31:
                zVar2.h();
                zVar2.v();
                break;
            case 32:
                zVar2.p();
                zVar2.v();
                break;
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                zVar2.m();
                zVar2.v();
                break;
            case 34:
                zVar2.j();
                zVar2.v();
                break;
            case 35:
                zVar2.u();
                zVar2.v();
                break;
            case 36:
                zVar2.r();
                zVar2.v();
                break;
            case 37:
                zVar2.s();
                zVar2.v();
                break;
            case 38:
                zVar2.t();
                zVar2.v();
                break;
            case 39:
                if (bVar.b.length() <= 0) {
                    z = false;
                }
                if (z && yVar != null) {
                    int f3 = zVar2.f(yVar, -1);
                    zVar2.w(f3, f3);
                }
                zVar2.v();
                break;
            case 40:
                if (bVar.b.length() > 0) {
                    z2 = true;
                }
                if (z2 && yVar != null) {
                    int f4 = zVar2.f(yVar, 1);
                    zVar2.w(f4, f4);
                }
                zVar2.v();
                break;
            case 41:
                if (bVar.b.length() <= 0) {
                    z = false;
                }
                if (z && q2Var != null) {
                    int z5 = zVar2.z(q2Var, -1);
                    zVar2.w(z5, z5);
                }
                zVar2.v();
                break;
            case 42:
                if (bVar.b.length() > 0) {
                    z2 = true;
                }
                if (z2 && q2Var != null) {
                    int z6 = zVar2.z(q2Var, 1);
                    zVar2.w(z6, z6);
                }
                zVar2.v();
                break;
            case 43:
                j0Var.a = null;
                if (bVar.b.length() <= 0) {
                    z = false;
                }
                if (z) {
                    zVar2.w(0, 0);
                }
                zVar2.v();
                break;
            case 44:
                zVar2.q();
                zVar2.v();
                break;
            case 45:
                j0Var.a = null;
                if (bVar.b.length() <= 0) {
                    z = false;
                }
                if (z) {
                    int c = com.amazon.aps.iva.c2.z.c(zVar2.f);
                    zVar2.w(c, c);
                    break;
                }
                break;
            case 46:
                s2 s2Var = z1Var.h;
                if (s2Var != null) {
                    s2Var.a(com.amazon.aps.iva.i2.e0.a(zVar2.h, bVar, zVar2.f, 4));
                }
                s2 s2Var2 = z1Var.h;
                if (s2Var2 != null) {
                    s2.a aVar2 = s2Var2.b;
                    if (aVar2 != null && (aVar = aVar2.a) != null) {
                        s2Var2.b = aVar;
                        s2Var2.d -= aVar2.b.a.b.length();
                        s2Var2.c = new s2.a(s2Var2.c, aVar2.b);
                        e0Var = aVar.b;
                    }
                    if (e0Var != null) {
                        z1Var.k.invoke(e0Var);
                        break;
                    }
                }
                break;
            case 47:
                s2 s2Var3 = z1Var.h;
                if (s2Var3 != null) {
                    s2.a aVar3 = s2Var3.c;
                    if (aVar3 != null) {
                        s2Var3.c = aVar3.a;
                        s2Var3.b = new s2.a(s2Var3.b, aVar3.b);
                        s2Var3.d = aVar3.b.a.b.length() + s2Var3.d;
                        e0Var = aVar3.b;
                    }
                    if (e0Var != null) {
                        z1Var.k.invoke(e0Var);
                        break;
                    }
                }
                break;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
