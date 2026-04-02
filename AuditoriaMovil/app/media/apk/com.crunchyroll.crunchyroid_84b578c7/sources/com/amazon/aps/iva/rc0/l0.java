package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.m1;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.oc0.a;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.q;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.pc0.h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: PropertyDescriptorImpl.java */
/* loaded from: classes4.dex */
public class l0 extends x0 implements com.amazon.aps.iva.oc0.n0 {
    public com.amazon.aps.iva.oc0.t A;
    public com.amazon.aps.iva.oc0.t B;
    public final com.amazon.aps.iva.oc0.b0 j;
    public com.amazon.aps.iva.oc0.r k;
    public Collection<? extends com.amazon.aps.iva.oc0.n0> l;
    public final com.amazon.aps.iva.oc0.n0 m;
    public final b.a n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public List<com.amazon.aps.iva.oc0.q0> u;
    public com.amazon.aps.iva.oc0.q0 v;
    public com.amazon.aps.iva.oc0.q0 w;
    public ArrayList x;
    public m0 y;
    public com.amazon.aps.iva.oc0.p0 z;

    /* compiled from: PropertyDescriptorImpl.java */
    /* loaded from: classes4.dex */
    public class a {
        public com.amazon.aps.iva.oc0.k a;
        public com.amazon.aps.iva.oc0.b0 b;
        public com.amazon.aps.iva.oc0.r c;
        public b.a e;
        public final com.amazon.aps.iva.oc0.q0 h;
        public final com.amazon.aps.iva.nd0.f i;
        public final com.amazon.aps.iva.ee0.e0 j;
        public com.amazon.aps.iva.oc0.n0 d = null;
        public m1 f = m1.a;
        public boolean g = true;

        public a() {
            l0.this = r2;
            this.a = r2.d();
            this.b = r2.o();
            this.c = r2.getVisibility();
            this.e = r2.getKind();
            this.h = r2.v;
            this.i = r2.getName();
            this.j = r2.getType();
        }

        public static /* synthetic */ void a(int i) {
            String str;
            int i2;
            if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 7) {
                                if (i != 9) {
                                    if (i != 11) {
                                        if (i != 19) {
                                            if (i != 13) {
                                                if (i != 14) {
                                                    if (i != 16) {
                                                        if (i != 17) {
                                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                                                        } else {
                                                            objArr[1] = "setCopyOverrides";
                                                        }
                                                    } else {
                                                        objArr[1] = "setSubstitution";
                                                    }
                                                } else {
                                                    objArr[1] = "setDispatchReceiverParameter";
                                                }
                                            } else {
                                                objArr[1] = "setTypeParameters";
                                            }
                                        } else {
                                            objArr[1] = "setName";
                                        }
                                    } else {
                                        objArr[1] = "setKind";
                                    }
                                } else {
                                    objArr[1] = "setVisibility";
                                }
                            } else {
                                objArr[1] = "setModality";
                            }
                        } else {
                            objArr[1] = "setReturnType";
                        }
                    } else {
                        objArr[1] = "setPreserveSourceElement";
                    }
                } else {
                    objArr[1] = "setOriginal";
                }
            } else {
                objArr[1] = "setOwner";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) {
                throw new IllegalStateException(format);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final l0 b() {
            d dVar;
            o0 o0Var;
            m0 m0Var;
            m0 getter;
            n0 n0Var;
            com.amazon.aps.iva.oc0.p0 setter;
            u uVar;
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.de0.j<com.amazon.aps.iva.sd0.g<?>>> aVar;
            com.amazon.aps.iva.ee0.e0 e0Var;
            o0 o0Var2;
            o0 o0Var3;
            l0 l0Var = l0.this;
            l0Var.getClass();
            com.amazon.aps.iva.oc0.k kVar = this.a;
            com.amazon.aps.iva.oc0.b0 b0Var = this.b;
            com.amazon.aps.iva.oc0.r rVar = this.c;
            com.amazon.aps.iva.oc0.n0 n0Var2 = this.d;
            b.a aVar2 = this.e;
            com.amazon.aps.iva.nd0.f fVar = this.i;
            t0.a aVar3 = com.amazon.aps.iva.oc0.t0.a;
            l0 I0 = l0Var.I0(kVar, b0Var, rVar, n0Var2, aVar2, fVar);
            List<y0> typeParameters = l0Var.getTypeParameters();
            ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
            q1 P = com.amazon.aps.iva.aq.j.P(typeParameters, this.f, I0, arrayList);
            v1 v1Var = v1.OUT_VARIANCE;
            com.amazon.aps.iva.ee0.e0 e0Var2 = this.j;
            com.amazon.aps.iva.ee0.e0 k = P.k(e0Var2, v1Var);
            if (k != null) {
                v1 v1Var2 = v1.IN_VARIANCE;
                com.amazon.aps.iva.ee0.e0 k2 = P.k(e0Var2, v1Var2);
                if (k2 != null) {
                    I0.L0(k2);
                }
                com.amazon.aps.iva.oc0.q0 q0Var = this.h;
                if (q0Var != 0) {
                    d b = q0Var.b(P);
                    if (b != null) {
                        dVar = b;
                    }
                } else {
                    dVar = null;
                }
                com.amazon.aps.iva.oc0.q0 q0Var2 = l0Var.w;
                if (q0Var2 != null) {
                    com.amazon.aps.iva.ee0.e0 k3 = P.k(q0Var2.getType(), v1Var2);
                    if (k3 == null) {
                        o0Var3 = null;
                    } else {
                        o0Var3 = new o0(I0, new com.amazon.aps.iva.yd0.d(I0, k3, q0Var2.getValue()), q0Var2.getAnnotations());
                    }
                    o0Var = o0Var3;
                } else {
                    o0Var = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (com.amazon.aps.iva.oc0.q0 q0Var3 : l0Var.u) {
                    com.amazon.aps.iva.ee0.e0 k4 = P.k(q0Var3.getType(), v1.IN_VARIANCE);
                    if (k4 == null) {
                        o0Var2 = null;
                    } else {
                        o0Var2 = new o0(I0, new com.amazon.aps.iva.yd0.c(I0, k4, ((com.amazon.aps.iva.yd0.f) q0Var3.getValue()).a(), q0Var3.getValue()), q0Var3.getAnnotations());
                    }
                    if (o0Var2 != null) {
                        arrayList2.add(o0Var2);
                    }
                }
                I0.M0(k, arrayList, dVar, o0Var, arrayList2);
                m0 m0Var2 = l0Var.y;
                if (m0Var2 == null) {
                    m0Var = null;
                } else {
                    com.amazon.aps.iva.pc0.h annotations = m0Var2.getAnnotations();
                    com.amazon.aps.iva.oc0.b0 b0Var2 = this.b;
                    com.amazon.aps.iva.oc0.r visibility = l0Var.y.getVisibility();
                    if (this.e == b.a.FAKE_OVERRIDE && com.amazon.aps.iva.oc0.q.e(visibility.d())) {
                        visibility = com.amazon.aps.iva.oc0.q.h;
                    }
                    com.amazon.aps.iva.oc0.r rVar2 = visibility;
                    m0 m0Var3 = l0Var.y;
                    boolean z = m0Var3.f;
                    boolean z2 = m0Var3.g;
                    boolean z3 = m0Var3.j;
                    b.a aVar4 = this.e;
                    com.amazon.aps.iva.oc0.n0 n0Var3 = this.d;
                    if (n0Var3 == null) {
                        getter = null;
                    } else {
                        getter = n0Var3.getGetter();
                    }
                    m0Var = new m0(I0, annotations, b0Var2, rVar2, z, z2, z3, aVar4, getter, aVar3);
                }
                if (m0Var != null) {
                    m0 m0Var4 = l0Var.y;
                    com.amazon.aps.iva.ee0.e0 e0Var3 = m0Var4.n;
                    m0Var.m = l0.J0(P, m0Var4);
                    if (e0Var3 != null) {
                        e0Var = P.k(e0Var3, v1.OUT_VARIANCE);
                    } else {
                        e0Var = null;
                    }
                    m0Var.I0(e0Var);
                }
                com.amazon.aps.iva.oc0.p0 p0Var = l0Var.z;
                if (p0Var == null) {
                    n0Var = null;
                } else {
                    com.amazon.aps.iva.pc0.h annotations2 = p0Var.getAnnotations();
                    com.amazon.aps.iva.oc0.b0 b0Var3 = this.b;
                    com.amazon.aps.iva.oc0.r visibility2 = l0Var.z.getVisibility();
                    if (this.e == b.a.FAKE_OVERRIDE && com.amazon.aps.iva.oc0.q.e(visibility2.d())) {
                        visibility2 = com.amazon.aps.iva.oc0.q.h;
                    }
                    com.amazon.aps.iva.oc0.r rVar3 = visibility2;
                    boolean F = l0Var.z.F();
                    boolean isExternal = l0Var.z.isExternal();
                    boolean isInline = l0Var.z.isInline();
                    b.a aVar5 = this.e;
                    com.amazon.aps.iva.oc0.n0 n0Var4 = this.d;
                    if (n0Var4 == null) {
                        setter = null;
                    } else {
                        setter = n0Var4.getSetter();
                    }
                    n0Var = new n0(I0, annotations2, b0Var3, rVar3, F, isExternal, isInline, aVar5, setter, aVar3);
                }
                if (n0Var != null) {
                    List I02 = x.I0(n0Var, l0Var.z.f(), P, false, false, null);
                    if (I02 == null) {
                        I02 = Collections.singletonList(n0.H0(n0Var, com.amazon.aps.iva.ud0.b.e(this.a).o(), l0Var.z.f().get(0).getAnnotations()));
                    }
                    if (I02.size() == 1) {
                        n0Var.m = l0.J0(P, l0Var.z);
                        c1 c1Var = (c1) I02.get(0);
                        if (c1Var != null) {
                            n0Var.n = c1Var;
                        } else {
                            n0.d0(6);
                            throw null;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                u uVar2 = null;
                com.amazon.aps.iva.oc0.t tVar = l0Var.A;
                if (tVar == null) {
                    uVar = null;
                } else {
                    uVar = new u(I0, tVar.getAnnotations());
                }
                com.amazon.aps.iva.oc0.t tVar2 = l0Var.B;
                if (tVar2 != null) {
                    uVar2 = new u(I0, tVar2.getAnnotations());
                }
                I0.K0(m0Var, n0Var, uVar, uVar2);
                if (this.g) {
                    com.amazon.aps.iva.me0.d dVar2 = new com.amazon.aps.iva.me0.d();
                    for (com.amazon.aps.iva.oc0.n0 n0Var5 : l0Var.k()) {
                        dVar2.add(n0Var5.b(P));
                    }
                    I0.z0(dVar2);
                }
                if (l0Var.isConst() && (aVar = l0Var.i) != null) {
                    I0.E0(l0Var.h, aVar);
                    return I0;
                }
                return I0;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.n0 n0Var, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.oc0.b0 b0Var, com.amazon.aps.iva.oc0.r rVar, boolean z, com.amazon.aps.iva.nd0.f fVar, b.a aVar, com.amazon.aps.iva.oc0.t0 t0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(kVar, hVar, fVar, z, t0Var);
        if (kVar == null) {
            d0(0);
            throw null;
        } else if (hVar == null) {
            d0(1);
            throw null;
        } else if (b0Var == null) {
            d0(2);
            throw null;
        } else if (rVar == null) {
            d0(3);
            throw null;
        } else if (fVar == null) {
            d0(4);
            throw null;
        } else if (aVar == null) {
            d0(5);
            throw null;
        } else if (t0Var != null) {
            this.l = null;
            this.u = Collections.emptyList();
            this.j = b0Var;
            this.k = rVar;
            this.m = n0Var == null ? this : n0Var;
            this.n = aVar;
            this.o = z2;
            this.p = z3;
            this.q = z4;
            this.r = z5;
            this.s = z6;
            this.t = z7;
        } else {
            d0(6);
            throw null;
        }
    }

    public static l0 H0(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.b0 b0Var, q.h hVar, boolean z, com.amazon.aps.iva.nd0.f fVar, b.a aVar, com.amazon.aps.iva.oc0.t0 t0Var) {
        h.a.C0609a c0609a = h.a.a;
        if (kVar != null) {
            if (b0Var != null) {
                if (hVar != null) {
                    if (fVar != null) {
                        if (aVar != null) {
                            if (t0Var != null) {
                                return new l0(kVar, null, c0609a, b0Var, hVar, z, fVar, aVar, t0Var, false, false, false, false, false, false);
                            }
                            d0(13);
                            throw null;
                        }
                        d0(12);
                        throw null;
                    }
                    d0(11);
                    throw null;
                }
                d0(10);
                throw null;
            }
            d0(9);
            throw null;
        }
        d0(7);
        throw null;
    }

    public static com.amazon.aps.iva.oc0.v J0(q1 q1Var, com.amazon.aps.iva.oc0.m0 m0Var) {
        if (m0Var != null) {
            if (m0Var.m0() == null) {
                return null;
            }
            return m0Var.m0().b(q1Var);
        }
        d0(31);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void d0(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rc0.l0.d0(int):void");
    }

    @Override // com.amazon.aps.iva.oc0.e1
    public final boolean B() {
        return this.t;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final <R, D> R D0(com.amazon.aps.iva.oc0.m<R, D> mVar, D d) {
        return mVar.j(this, d);
    }

    @Override // com.amazon.aps.iva.oc0.b
    /* renamed from: G0 */
    public final l0 e0(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.b0 b0Var, com.amazon.aps.iva.oc0.p pVar, b.a aVar) {
        a aVar2 = new a();
        if (kVar != null) {
            aVar2.a = kVar;
            aVar2.d = null;
            aVar2.b = b0Var;
            if (pVar != null) {
                aVar2.c = pVar;
                if (aVar != null) {
                    aVar2.e = aVar;
                    aVar2.g = false;
                    l0 b = aVar2.b();
                    if (b != null) {
                        return b;
                    }
                    d0(42);
                    throw null;
                }
                a.a(10);
                throw null;
            }
            a.a(8);
            throw null;
        }
        a.a(0);
        throw null;
    }

    public l0 I0(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.b0 b0Var, com.amazon.aps.iva.oc0.r rVar, com.amazon.aps.iva.oc0.n0 n0Var, b.a aVar, com.amazon.aps.iva.nd0.f fVar) {
        t0.a aVar2 = com.amazon.aps.iva.oc0.t0.a;
        if (kVar != null) {
            if (b0Var != null) {
                if (rVar != null) {
                    if (aVar != null) {
                        if (fVar != null) {
                            return new l0(kVar, n0Var, getAnnotations(), b0Var, rVar, this.g, fVar, aVar, aVar2, this.o, isConst(), this.q, this.r, isExternal(), this.t);
                        }
                        d0(36);
                        throw null;
                    }
                    d0(35);
                    throw null;
                }
                d0(34);
                throw null;
            }
            d0(33);
            throw null;
        }
        d0(32);
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.w0, com.amazon.aps.iva.oc0.a
    public final com.amazon.aps.iva.oc0.q0 J() {
        return this.v;
    }

    public final void K0(m0 m0Var, n0 n0Var, com.amazon.aps.iva.oc0.t tVar, com.amazon.aps.iva.oc0.t tVar2) {
        this.y = m0Var;
        this.z = n0Var;
        this.A = tVar;
        this.B = tVar2;
    }

    @Override // com.amazon.aps.iva.rc0.w0, com.amazon.aps.iva.oc0.a
    public final com.amazon.aps.iva.oc0.q0 M() {
        return this.w;
    }

    public final void M0(com.amazon.aps.iva.ee0.e0 e0Var, List list, com.amazon.aps.iva.oc0.q0 q0Var, o0 o0Var, List list2) {
        if (e0Var != null) {
            if (list != null) {
                if (list2 != null) {
                    this.f = e0Var;
                    this.x = new ArrayList(list);
                    this.w = o0Var;
                    this.v = q0Var;
                    this.u = list2;
                    return;
                }
                d0(19);
                throw null;
            }
            d0(18);
            throw null;
        }
        d0(17);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.n0
    public final com.amazon.aps.iva.oc0.t N() {
        return this.B;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean U() {
        return this.r;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean g0() {
        return this.q;
    }

    @Override // com.amazon.aps.iva.oc0.n0
    public final m0 getGetter() {
        return this.y;
    }

    @Override // com.amazon.aps.iva.oc0.b
    public final b.a getKind() {
        b.a aVar = this.n;
        if (aVar != null) {
            return aVar;
        }
        d0(39);
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.w0, com.amazon.aps.iva.oc0.a
    public final com.amazon.aps.iva.ee0.e0 getReturnType() {
        com.amazon.aps.iva.ee0.e0 type = getType();
        if (type != null) {
            return type;
        }
        d0(23);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.n0
    public final com.amazon.aps.iva.oc0.p0 getSetter() {
        return this.z;
    }

    @Override // com.amazon.aps.iva.rc0.w0, com.amazon.aps.iva.oc0.a
    public final List<y0> getTypeParameters() {
        ArrayList arrayList = this.x;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for ".concat(p.s0(this)));
    }

    @Override // com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.r getVisibility() {
        com.amazon.aps.iva.oc0.r rVar = this.k;
        if (rVar != null) {
            return rVar;
        }
        d0(25);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.d1
    public boolean isConst() {
        return this.p;
    }

    public boolean isExternal() {
        return this.s;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final Collection<? extends com.amazon.aps.iva.oc0.n0> k() {
        Collection<? extends com.amazon.aps.iva.oc0.n0> collection = this.l;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        d0(41);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.b0 o() {
        com.amazon.aps.iva.oc0.b0 b0Var = this.j;
        if (b0Var != null) {
            return b0Var;
        }
        d0(24);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public <V> V q0(a.InterfaceC0568a<V> interfaceC0568a) {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.n0
    public final com.amazon.aps.iva.oc0.t r0() {
        return this.A;
    }

    @Override // com.amazon.aps.iva.oc0.n0
    public final ArrayList t() {
        ArrayList arrayList = new ArrayList(2);
        m0 m0Var = this.y;
        if (m0Var != null) {
            arrayList.add(m0Var);
        }
        com.amazon.aps.iva.oc0.p0 p0Var = this.z;
        if (p0Var != null) {
            arrayList.add(p0Var);
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final List<com.amazon.aps.iva.oc0.q0> t0() {
        List<com.amazon.aps.iva.oc0.q0> list = this.u;
        if (list != null) {
            return list;
        }
        d0(22);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.d1
    public final boolean u0() {
        return this.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.oc0.b
    public final void z0(Collection<? extends com.amazon.aps.iva.oc0.b> collection) {
        if (collection != 0) {
            this.l = collection;
        } else {
            d0(40);
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.oc0.v0
    public final com.amazon.aps.iva.oc0.a b(q1 q1Var) {
        if (q1Var != null) {
            if (q1Var.h()) {
                return this;
            }
            a aVar = new a();
            m1 g = q1Var.g();
            if (g != null) {
                aVar.f = g;
                aVar.d = a();
                return aVar.b();
            }
            a.a(15);
            throw null;
        }
        d0(27);
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.n0 a() {
        com.amazon.aps.iva.oc0.n0 n0Var = this.m;
        com.amazon.aps.iva.oc0.n0 a2 = n0Var == this ? this : n0Var.a();
        if (a2 != null) {
            return a2;
        }
        d0(38);
        throw null;
    }

    public void L0(com.amazon.aps.iva.ee0.e0 e0Var) {
    }
}
