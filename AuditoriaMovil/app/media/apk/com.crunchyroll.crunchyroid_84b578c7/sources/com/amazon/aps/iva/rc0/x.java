package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.m1;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.oc0.a;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.v;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.rc0.v0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: FunctionDescriptorImpl.java */
/* loaded from: classes4.dex */
public abstract class x extends q implements com.amazon.aps.iva.oc0.v {
    public volatile com.amazon.aps.iva.xb0.a<Collection<com.amazon.aps.iva.oc0.v>> A;
    public final com.amazon.aps.iva.oc0.v B;
    public final b.a C;
    public com.amazon.aps.iva.oc0.v D;
    public Map<a.InterfaceC0568a<?>, Object> E;
    public List<y0> f;
    public List<c1> g;
    public com.amazon.aps.iva.ee0.e0 h;
    public List<com.amazon.aps.iva.oc0.q0> i;
    public com.amazon.aps.iva.oc0.q0 j;
    public com.amazon.aps.iva.oc0.q0 k;
    public com.amazon.aps.iva.oc0.b0 l;
    public com.amazon.aps.iva.oc0.r m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public Collection<? extends com.amazon.aps.iva.oc0.v> z;

    /* compiled from: FunctionDescriptorImpl.java */
    /* loaded from: classes4.dex */
    public class a implements v.a<com.amazon.aps.iva.oc0.v> {
        public m1 a;
        public com.amazon.aps.iva.oc0.k b;
        public com.amazon.aps.iva.oc0.b0 c;
        public com.amazon.aps.iva.oc0.r d;
        public com.amazon.aps.iva.oc0.v e;
        public b.a f;
        public List<c1> g;
        public final List<com.amazon.aps.iva.oc0.q0> h;
        public com.amazon.aps.iva.oc0.q0 i;
        public com.amazon.aps.iva.oc0.q0 j;
        public com.amazon.aps.iva.ee0.e0 k;
        public com.amazon.aps.iva.nd0.f l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public List<y0> r;
        public com.amazon.aps.iva.pc0.h s;
        public boolean t;
        public final LinkedHashMap u;
        public Boolean v;
        public boolean w;
        public final /* synthetic */ x x;

        public a(x xVar, m1 m1Var, com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.b0 b0Var, com.amazon.aps.iva.oc0.r rVar, b.a aVar, List list, List list2, com.amazon.aps.iva.oc0.q0 q0Var, com.amazon.aps.iva.ee0.e0 e0Var) {
            if (m1Var != null) {
                if (kVar != null) {
                    if (b0Var != null) {
                        if (rVar != null) {
                            if (aVar != null) {
                                if (list != null) {
                                    if (list2 != null) {
                                        if (e0Var != null) {
                                            this.x = xVar;
                                            this.e = null;
                                            this.j = xVar.k;
                                            this.m = true;
                                            this.n = false;
                                            this.o = false;
                                            this.p = false;
                                            this.q = xVar.u;
                                            this.r = null;
                                            this.s = null;
                                            this.t = xVar.v;
                                            this.u = new LinkedHashMap();
                                            this.v = null;
                                            this.w = false;
                                            this.a = m1Var;
                                            this.b = kVar;
                                            this.c = b0Var;
                                            this.d = rVar;
                                            this.f = aVar;
                                            this.g = list;
                                            this.h = list2;
                                            this.i = q0Var;
                                            this.k = e0Var;
                                            this.l = null;
                                            return;
                                        }
                                        s(7);
                                        throw null;
                                    }
                                    s(6);
                                    throw null;
                                }
                                s(5);
                                throw null;
                            }
                            s(4);
                            throw null;
                        }
                        s(3);
                        throw null;
                    }
                    s(2);
                    throw null;
                }
                s(1);
                throw null;
            }
            s(0);
            throw null;
        }

        public static /* synthetic */ void s(int i) {
            String str;
            int i2;
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i2 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(format);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(format);
            }
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<com.amazon.aps.iva.oc0.v> a(m1 m1Var) {
            if (m1Var != null) {
                this.a = m1Var;
                return this;
            }
            s(37);
            throw null;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<com.amazon.aps.iva.oc0.v> b(List list) {
            this.g = list;
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final com.amazon.aps.iva.oc0.v build() {
            return this.x.H0(this);
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a c(Boolean bool) {
            this.u.put(com.amazon.aps.iva.zc0.e.I, bool);
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<com.amazon.aps.iva.oc0.v> d(com.amazon.aps.iva.oc0.b0 b0Var) {
            if (b0Var != null) {
                this.c = b0Var;
                return this;
            }
            s(10);
            throw null;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<com.amazon.aps.iva.oc0.v> e(com.amazon.aps.iva.nd0.f fVar) {
            if (fVar != null) {
                this.l = fVar;
                return this;
            }
            s(17);
            throw null;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<com.amazon.aps.iva.oc0.v> f(com.amazon.aps.iva.oc0.q0 q0Var) {
            this.j = q0Var;
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a g(com.amazon.aps.iva.oc0.d dVar) {
            this.e = dVar;
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<com.amazon.aps.iva.oc0.v> h() {
            this.t = true;
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a i() {
            this.m = false;
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<com.amazon.aps.iva.oc0.v> j(com.amazon.aps.iva.ee0.e0 e0Var) {
            if (e0Var != null) {
                this.k = e0Var;
                return this;
            }
            s(23);
            throw null;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a k() {
            this.r = com.amazon.aps.iva.lb0.z.b;
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<com.amazon.aps.iva.oc0.v> l() {
            this.q = true;
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<com.amazon.aps.iva.oc0.v> m(com.amazon.aps.iva.pc0.h hVar) {
            if (hVar != null) {
                this.s = hVar;
                return this;
            }
            s(35);
            throw null;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<com.amazon.aps.iva.oc0.v> n(b.a aVar) {
            if (aVar != null) {
                this.f = aVar;
                return this;
            }
            s(14);
            throw null;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<com.amazon.aps.iva.oc0.v> o(com.amazon.aps.iva.oc0.k kVar) {
            if (kVar != null) {
                this.b = kVar;
                return this;
            }
            s(8);
            throw null;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<com.amazon.aps.iva.oc0.v> p() {
            this.o = true;
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<com.amazon.aps.iva.oc0.v> q(com.amazon.aps.iva.oc0.r rVar) {
            if (rVar != null) {
                this.d = rVar;
                return this;
            }
            s(12);
            throw null;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<com.amazon.aps.iva.oc0.v> r() {
            this.n = true;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b.a aVar, com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.v vVar, com.amazon.aps.iva.oc0.t0 t0Var, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar) {
        super(kVar, hVar, fVar, t0Var);
        if (kVar != null) {
            if (hVar != null) {
                if (fVar != null) {
                    if (aVar != null) {
                        if (t0Var != null) {
                            this.m = com.amazon.aps.iva.oc0.q.i;
                            this.n = false;
                            this.o = false;
                            this.p = false;
                            this.q = false;
                            this.r = false;
                            this.s = false;
                            this.t = false;
                            this.u = false;
                            this.v = false;
                            this.w = false;
                            this.x = true;
                            this.y = false;
                            this.z = null;
                            this.A = null;
                            this.D = null;
                            this.E = null;
                            this.B = vVar == null ? this : vVar;
                            this.C = aVar;
                            return;
                        }
                        d0(4);
                        throw null;
                    }
                    d0(3);
                    throw null;
                }
                d0(2);
                throw null;
            }
            d0(1);
            throw null;
        }
        d0(0);
        throw null;
    }

    public static ArrayList I0(com.amazon.aps.iva.oc0.v vVar, List list, q1 q1Var, boolean z, boolean z2, boolean[] zArr) {
        com.amazon.aps.iva.ee0.e0 k;
        w wVar;
        c1 c1Var;
        com.amazon.aps.iva.oc0.t0 t0Var;
        com.amazon.aps.iva.oc0.a aVar;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c1 c1Var2 = (c1) it.next();
                com.amazon.aps.iva.ee0.e0 type = c1Var2.getType();
                v1 v1Var = v1.IN_VARIANCE;
                com.amazon.aps.iva.ee0.e0 k2 = q1Var.k(type, v1Var);
                com.amazon.aps.iva.ee0.e0 p0 = c1Var2.p0();
                if (p0 == null) {
                    k = null;
                } else {
                    k = q1Var.k(p0, v1Var);
                }
                if (k2 == null) {
                    return null;
                }
                if ((k2 != c1Var2.getType() || p0 != k) && zArr != null) {
                    zArr[0] = true;
                }
                if (c1Var2 instanceof v0.a) {
                    wVar = new w((List) ((v0.a) c1Var2).m.getValue());
                } else {
                    wVar = null;
                }
                if (z) {
                    c1Var = null;
                } else {
                    c1Var = c1Var2;
                }
                int index = c1Var2.getIndex();
                com.amazon.aps.iva.pc0.h annotations = c1Var2.getAnnotations();
                com.amazon.aps.iva.nd0.f name = c1Var2.getName();
                boolean w0 = c1Var2.w0();
                boolean l0 = c1Var2.l0();
                boolean k0 = c1Var2.k0();
                if (z2) {
                    t0Var = c1Var2.g();
                } else {
                    t0Var = com.amazon.aps.iva.oc0.t0.a;
                }
                com.amazon.aps.iva.yb0.j.f(vVar, "containingDeclaration");
                com.amazon.aps.iva.yb0.j.f(annotations, "annotations");
                com.amazon.aps.iva.yb0.j.f(name, AppMeasurementSdk.ConditionalUserProperty.NAME);
                com.amazon.aps.iva.yb0.j.f(t0Var, FirebaseAnalytics.Param.SOURCE);
                if (wVar == null) {
                    aVar = new v0(vVar, c1Var, index, annotations, name, k2, w0, l0, k0, k, t0Var);
                } else {
                    aVar = new v0.a(vVar, c1Var, index, annotations, name, k2, w0, l0, k0, k, t0Var, wVar);
                }
                arrayList.add(aVar);
            }
            return arrayList;
        }
        d0(30);
        throw null;
    }

    public static /* synthetic */ void d0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 26:
            case 27:
                throw new IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // com.amazon.aps.iva.oc0.v
    public final boolean B0() {
        return this.v;
    }

    public boolean C() {
        return this.r;
    }

    public v.a<? extends com.amazon.aps.iva.oc0.v> C0() {
        return K0(q1.b);
    }

    public <R, D> R D0(com.amazon.aps.iva.oc0.m<R, D> mVar, D d) {
        return mVar.i(this, d);
    }

    @Override // com.amazon.aps.iva.oc0.b
    /* renamed from: E0 */
    public com.amazon.aps.iva.oc0.v e0(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.b0 b0Var, com.amazon.aps.iva.oc0.p pVar, b.a aVar) {
        com.amazon.aps.iva.oc0.v build = C0().o(kVar).d(b0Var).q(pVar).n(aVar).i().build();
        if (build != null) {
            return build;
        }
        d0(26);
        throw null;
    }

    public abstract x G0(b.a aVar, com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.v vVar, com.amazon.aps.iva.oc0.t0 t0Var, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar);

    /* JADX WARN: Multi-variable type inference failed */
    public x H0(a aVar) {
        com.amazon.aps.iva.pc0.h annotations;
        com.amazon.aps.iva.oc0.t0 t0Var;
        o0 o0Var;
        d dVar;
        com.amazon.aps.iva.ee0.e0 k;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        com.amazon.aps.iva.oc0.v a2;
        if (aVar != null) {
            boolean[] zArr = new boolean[1];
            if (aVar.s != null) {
                annotations = com.amazon.aps.iva.aq.k.i(getAnnotations(), aVar.s);
            } else {
                annotations = getAnnotations();
            }
            com.amazon.aps.iva.pc0.h hVar = annotations;
            com.amazon.aps.iva.oc0.k kVar = aVar.b;
            com.amazon.aps.iva.oc0.v vVar = aVar.e;
            b.a aVar2 = aVar.f;
            com.amazon.aps.iva.nd0.f fVar = aVar.l;
            if (aVar.o) {
                if (vVar != null) {
                    a2 = vVar;
                } else {
                    a2 = a();
                }
                t0Var = a2.g();
            } else {
                t0Var = com.amazon.aps.iva.oc0.t0.a;
            }
            com.amazon.aps.iva.oc0.t0 t0Var2 = t0Var;
            if (t0Var2 != null) {
                x G0 = G0(aVar2, kVar, vVar, t0Var2, hVar, fVar);
                List<y0> list = aVar.r;
                if (list == null) {
                    list = getTypeParameters();
                }
                zArr[0] = zArr[0] | (!list.isEmpty());
                ArrayList arrayList = new ArrayList(list.size());
                q1 Q = com.amazon.aps.iva.aq.j.Q(list, aVar.a, G0, arrayList, zArr);
                if (Q == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                if (!aVar.h.isEmpty()) {
                    int i = 0;
                    for (com.amazon.aps.iva.oc0.q0 q0Var : aVar.h) {
                        com.amazon.aps.iva.ee0.e0 k2 = Q.k(q0Var.getType(), v1.IN_VARIANCE);
                        if (k2 == null) {
                            return null;
                        }
                        int i2 = i + 1;
                        arrayList2.add(com.amazon.aps.iva.qd0.h.b(G0, k2, ((com.amazon.aps.iva.yd0.f) q0Var.getValue()).a(), q0Var.getAnnotations(), i));
                        boolean z6 = zArr[0];
                        if (k2 != q0Var.getType()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        zArr[0] = z6 | z5;
                        i = i2;
                    }
                }
                com.amazon.aps.iva.oc0.q0 q0Var2 = aVar.i;
                if (q0Var2 != null) {
                    com.amazon.aps.iva.ee0.e0 k3 = Q.k(q0Var2.getType(), v1.IN_VARIANCE);
                    if (k3 == null) {
                        return null;
                    }
                    o0 o0Var2 = new o0(G0, new com.amazon.aps.iva.yd0.d(G0, k3, aVar.i.getValue()), aVar.i.getAnnotations());
                    boolean z7 = zArr[0];
                    if (k3 != aVar.i.getType()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zArr[0] = z4 | z7;
                    o0Var = o0Var2;
                } else {
                    o0Var = null;
                }
                com.amazon.aps.iva.oc0.q0 q0Var3 = aVar.j;
                if (q0Var3 != 0) {
                    d b = q0Var3.b(Q);
                    if (b == null) {
                        return null;
                    }
                    boolean z8 = zArr[0];
                    if (b != aVar.j) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zArr[0] = z8 | z3;
                    dVar = b;
                } else {
                    dVar = null;
                }
                ArrayList I0 = I0(G0, aVar.g, Q, aVar.p, aVar.o, zArr);
                if (I0 == null || (k = Q.k(aVar.k, v1.OUT_VARIANCE)) == null) {
                    return null;
                }
                boolean z9 = zArr[0];
                if (k != aVar.k) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z10 = z9 | z;
                zArr[0] = z10;
                if (!z10 && aVar.w) {
                    return this;
                }
                G0.J0(o0Var, dVar, arrayList2, arrayList, I0, k, aVar.c, aVar.d);
                G0.n = this.n;
                G0.o = this.o;
                G0.p = this.p;
                G0.q = this.q;
                G0.r = this.r;
                G0.w = this.w;
                G0.s = this.s;
                G0.t = this.t;
                G0.M0(this.x);
                G0.u = aVar.q;
                G0.v = aVar.t;
                Boolean bool = aVar.v;
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    z2 = this.y;
                }
                G0.N0(z2);
                if (!aVar.u.isEmpty() || this.E != null) {
                    LinkedHashMap linkedHashMap = aVar.u;
                    Map<a.InterfaceC0568a<?>, Object> map = this.E;
                    if (map != null) {
                        for (Map.Entry<a.InterfaceC0568a<?>, Object> entry : map.entrySet()) {
                            if (!linkedHashMap.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    if (linkedHashMap.size() == 1) {
                        G0.E = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                    } else {
                        G0.E = linkedHashMap;
                    }
                }
                if (aVar.n || this.D != null) {
                    com.amazon.aps.iva.oc0.v vVar2 = this.D;
                    if (vVar2 == null) {
                        vVar2 = this;
                    }
                    G0.D = vVar2.b(Q);
                }
                if (aVar.m && !a().k().isEmpty()) {
                    if (aVar.a.e()) {
                        com.amazon.aps.iva.xb0.a<Collection<com.amazon.aps.iva.oc0.v>> aVar3 = this.A;
                        if (aVar3 != null) {
                            G0.A = aVar3;
                        } else {
                            G0.z0(k());
                        }
                    } else {
                        G0.A = new v(this, Q);
                    }
                }
                return G0;
            }
            d0(27);
            throw null;
        }
        d0(25);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final com.amazon.aps.iva.oc0.q0 J() {
        return this.k;
    }

    public void J0(o0 o0Var, com.amazon.aps.iva.oc0.q0 q0Var, List list, List list2, List list3, com.amazon.aps.iva.ee0.e0 e0Var, com.amazon.aps.iva.oc0.b0 b0Var, com.amazon.aps.iva.oc0.r rVar) {
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (rVar != null) {
                        this.f = com.amazon.aps.iva.lb0.x.X0(list2);
                        this.g = com.amazon.aps.iva.lb0.x.X0(list3);
                        this.h = e0Var;
                        this.l = b0Var;
                        this.m = rVar;
                        this.j = o0Var;
                        this.k = q0Var;
                        this.i = list;
                        for (int i = 0; i < list2.size(); i++) {
                            y0 y0Var = (y0) list2.get(i);
                            if (y0Var.getIndex() != i) {
                                throw new IllegalStateException(y0Var + " index is " + y0Var.getIndex() + " but position is " + i);
                            }
                        }
                        for (int i2 = 0; i2 < list3.size(); i2++) {
                            c1 c1Var = (c1) list3.get(i2);
                            if (c1Var.getIndex() != i2 + 0) {
                                throw new IllegalStateException(c1Var + "index is " + c1Var.getIndex() + " but position is " + i2);
                            }
                        }
                        return;
                    }
                    d0(8);
                    throw null;
                }
                d0(7);
                throw null;
            }
            d0(6);
            throw null;
        }
        d0(5);
        throw null;
    }

    public final a K0(q1 q1Var) {
        if (q1Var != null) {
            return new a(this, q1Var.g(), d(), o(), getVisibility(), getKind(), f(), t0(), this.j, getReturnType());
        }
        d0(24);
        throw null;
    }

    public final <V> void L0(a.InterfaceC0568a<V> interfaceC0568a, Object obj) {
        if (this.E == null) {
            this.E = new LinkedHashMap();
        }
        this.E.put(interfaceC0568a, obj);
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final com.amazon.aps.iva.oc0.q0 M() {
        return this.j;
    }

    public void M0(boolean z) {
        this.x = z;
    }

    public void N0(boolean z) {
        this.y = z;
    }

    public final void O0(com.amazon.aps.iva.ee0.m0 m0Var) {
        if (m0Var != null) {
            this.h = m0Var;
        } else {
            d0(11);
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean U() {
        return this.t;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public boolean c0() {
        return this.y;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final List<c1> f() {
        List<c1> list = this.g;
        if (list != null) {
            return list;
        }
        d0(19);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean g0() {
        return this.s;
    }

    @Override // com.amazon.aps.iva.oc0.b
    public final b.a getKind() {
        b.a aVar = this.C;
        if (aVar != null) {
            return aVar;
        }
        d0(21);
        throw null;
    }

    public com.amazon.aps.iva.ee0.e0 getReturnType() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final List<y0> getTypeParameters() {
        List<y0> list = this.f;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.r getVisibility() {
        com.amazon.aps.iva.oc0.r rVar = this.m;
        if (rVar != null) {
            return rVar;
        }
        d0(16);
        throw null;
    }

    public boolean isExternal() {
        return this.p;
    }

    @Override // com.amazon.aps.iva.oc0.v
    public final boolean isInfix() {
        if (this.o) {
            return true;
        }
        Iterator<? extends com.amazon.aps.iva.oc0.b> it = a().k().iterator();
        while (it.hasNext()) {
            if (((com.amazon.aps.iva.oc0.v) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.q;
    }

    @Override // com.amazon.aps.iva.oc0.v
    public final boolean isOperator() {
        if (this.n) {
            return true;
        }
        Iterator<? extends com.amazon.aps.iva.oc0.b> it = a().k().iterator();
        while (it.hasNext()) {
            if (((com.amazon.aps.iva.oc0.v) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.w;
    }

    public Collection<? extends com.amazon.aps.iva.oc0.v> k() {
        com.amazon.aps.iva.xb0.a<Collection<com.amazon.aps.iva.oc0.v>> aVar = this.A;
        if (aVar != null) {
            this.z = aVar.invoke();
            this.A = null;
        }
        Collection<? extends com.amazon.aps.iva.oc0.v> collection = this.z;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        d0(14);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.v
    public final com.amazon.aps.iva.oc0.v m0() {
        return this.D;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.b0 o() {
        com.amazon.aps.iva.oc0.b0 b0Var = this.l;
        if (b0Var != null) {
            return b0Var;
        }
        d0(15);
        throw null;
    }

    public <V> V q0(a.InterfaceC0568a<V> interfaceC0568a) {
        Map<a.InterfaceC0568a<?>, Object> map = this.E;
        if (map == null) {
            return null;
        }
        return (V) map.get(interfaceC0568a);
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final List<com.amazon.aps.iva.oc0.q0> t0() {
        List<com.amazon.aps.iva.oc0.q0> list = this.i;
        if (list != null) {
            return list;
        }
        d0(13);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.v
    public final boolean y0() {
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void z0(Collection<? extends com.amazon.aps.iva.oc0.b> collection) {
        if (collection != 0) {
            this.z = collection;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((com.amazon.aps.iva.oc0.v) it.next()).B0()) {
                    this.v = true;
                    return;
                }
            }
            return;
        }
        d0(17);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.v, com.amazon.aps.iva.oc0.v0
    public com.amazon.aps.iva.oc0.v b(q1 q1Var) {
        if (q1Var != null) {
            if (q1Var.h()) {
                return this;
            }
            a K0 = K0(q1Var);
            K0.e = a();
            K0.o = true;
            K0.w = true;
            return K0.build();
        }
        d0(22);
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    public com.amazon.aps.iva.oc0.v a() {
        com.amazon.aps.iva.oc0.v vVar = this.B;
        com.amazon.aps.iva.oc0.v a2 = vVar == this ? this : vVar.a();
        if (a2 != null) {
            return a2;
        }
        d0(20);
        throw null;
    }
}
