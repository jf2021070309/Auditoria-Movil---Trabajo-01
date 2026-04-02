package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.m1;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.ee0.s1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collections;
import java.util.List;
/* compiled from: AbstractClassDescriptor.java */
/* loaded from: classes4.dex */
public abstract class b extends b0 {
    public final com.amazon.aps.iva.nd0.f b;
    public final com.amazon.aps.iva.de0.i<com.amazon.aps.iva.ee0.m0> c;
    public final com.amazon.aps.iva.de0.i<com.amazon.aps.iva.xd0.i> d;
    public final com.amazon.aps.iva.de0.i<com.amazon.aps.iva.oc0.q0> e;

    /* compiled from: AbstractClassDescriptor.java */
    /* loaded from: classes4.dex */
    public class a implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ee0.m0> {
        public a() {
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ee0.m0 invoke() {
            b bVar = b.this;
            return s1.p(bVar, bVar.T(), new com.amazon.aps.iva.rc0.a(this));
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: com.amazon.aps.iva.rc0.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0677b implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.xd0.i> {
        public C0677b() {
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.xd0.i invoke() {
            return new com.amazon.aps.iva.xd0.g(b.this.T());
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    /* loaded from: classes4.dex */
    public class c implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oc0.q0> {
        public c() {
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.oc0.q0 invoke() {
            return new y(b.this);
        }
    }

    public b(com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.nd0.f fVar) {
        if (lVar != null) {
            if (fVar != null) {
                this.b = fVar;
                this.c = lVar.g(new a());
                this.d = lVar.g(new C0677b());
                this.e = lVar.g(new c());
                return;
            }
            A0(1);
            throw null;
        }
        A0(0);
        throw null;
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 9 && i != 12 && i != 14 && i != 16) {
                                if (i != 17) {
                                    if (i != 19) {
                                        if (i != 20) {
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                                        } else {
                                            objArr[1] = "getDefaultType";
                                        }
                                    } else {
                                        objArr[1] = "substitute";
                                    }
                                } else {
                                    objArr[1] = "getUnsubstitutedMemberScope";
                                }
                            } else {
                                objArr[1] = "getMemberScope";
                            }
                        } else {
                            objArr[1] = "getContextReceivers";
                        }
                    } else {
                        objArr[1] = "getThisAsReceiverParameter";
                    }
                } else {
                    objArr[1] = "getUnsubstitutedInnerClassesScope";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getName";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) {
            throw new IllegalStateException(format);
        }
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final <R, D> R D0(com.amazon.aps.iva.oc0.m<R, D> mVar, D d) {
        return mVar.d(this, d);
    }

    @Override // com.amazon.aps.iva.oc0.v0
    /* renamed from: E0 */
    public com.amazon.aps.iva.oc0.e b(q1 q1Var) {
        if (q1Var != null) {
            if (q1Var.h()) {
                return this;
            }
            return new a0(this, q1Var);
        }
        A0(18);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.q0 F0() {
        com.amazon.aps.iva.oc0.q0 invoke = this.e.invoke();
        if (invoke != null) {
            return invoke;
        }
        A0(5);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public com.amazon.aps.iva.xd0.i Q() {
        com.amazon.aps.iva.xd0.i invoke = this.d.invoke();
        if (invoke != null) {
            return invoke;
        }
        A0(4);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public com.amazon.aps.iva.xd0.i T() {
        com.amazon.aps.iva.xd0.i s0 = s0(com.amazon.aps.iva.ud0.b.i(com.amazon.aps.iva.qd0.i.d(this)));
        if (s0 != null) {
            return s0;
        }
        A0(17);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public List<com.amazon.aps.iva.oc0.q0> V() {
        List<com.amazon.aps.iva.oc0.q0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        A0(6);
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.b0, com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.e a() {
        return this;
    }

    @Override // com.amazon.aps.iva.rc0.b0
    public com.amazon.aps.iva.xd0.i d0(m1 m1Var, com.amazon.aps.iva.fe0.f fVar) {
        if (m1Var != null) {
            if (fVar != null) {
                if (m1Var.e()) {
                    com.amazon.aps.iva.xd0.i s0 = s0(fVar);
                    if (s0 != null) {
                        return s0;
                    }
                    A0(12);
                    throw null;
                }
                return new com.amazon.aps.iva.xd0.n(s0(fVar), q1.e(m1Var));
            }
            A0(11);
            throw null;
        }
        A0(10);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.nd0.f getName() {
        com.amazon.aps.iva.nd0.f fVar = this.b;
        if (fVar != null) {
            return fVar;
        }
        A0(2);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.h
    public final com.amazon.aps.iva.ee0.m0 m() {
        com.amazon.aps.iva.ee0.m0 invoke = this.c.invoke();
        if (invoke != null) {
            return invoke;
        }
        A0(20);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.xd0.i u(m1 m1Var) {
        if (m1Var != null) {
            com.amazon.aps.iva.xd0.i d0 = d0(m1Var, com.amazon.aps.iva.ud0.b.i(com.amazon.aps.iva.qd0.i.d(this)));
            if (d0 != null) {
                return d0;
            }
            A0(16);
            throw null;
        }
        A0(15);
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.b0, com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.h a() {
        return this;
    }

    @Override // com.amazon.aps.iva.rc0.b0, com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.k a() {
        return this;
    }
}
