package com.amazon.aps.iva.pc0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.oc0.t0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
/* compiled from: AnnotationDescriptorImpl.java */
/* loaded from: classes4.dex */
public final class d implements c {
    public final e0 a;
    public final Map<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> b;
    public final t0 c;

    public d(m0 m0Var, Map map, t0 t0Var) {
        if (m0Var != null) {
            if (map != null) {
                if (t0Var != null) {
                    this.a = m0Var;
                    this.b = map;
                    this.c = t0Var;
                    return;
                }
                b(2);
                throw null;
            }
            b(1);
            throw null;
        }
        b(0);
        throw null;
    }

    public static /* synthetic */ void b(int i) {
        String str;
        int i2;
        if (i != 3 && i != 4 && i != 5) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 3 && i != 4 && i != 5) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4 && i != 5) {
                    objArr[0] = "annotationType";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                }
            } else {
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
            }
        } else {
            objArr[0] = "valueArguments";
        }
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                } else {
                    objArr[1] = "getSource";
                }
            } else {
                objArr[1] = "getAllValueArguments";
            }
        } else {
            objArr[1] = "getType";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 3 || i == 4 || i == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final Map<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> a() {
        Map<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> map = this.b;
        if (map != null) {
            return map;
        }
        b(4);
        throw null;
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final com.amazon.aps.iva.nd0.c c() {
        com.amazon.aps.iva.oc0.e d = com.amazon.aps.iva.ud0.b.d(this);
        if (d == null) {
            return null;
        }
        if (com.amazon.aps.iva.ge0.k.f(d)) {
            d = null;
        }
        if (d == null) {
            return null;
        }
        return com.amazon.aps.iva.ud0.b.c(d);
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final t0 g() {
        t0 t0Var = this.c;
        if (t0Var != null) {
            return t0Var;
        }
        b(5);
        throw null;
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final e0 getType() {
        e0 e0Var = this.a;
        if (e0Var != null) {
            return e0Var;
        }
        b(3);
        throw null;
    }

    public final String toString() {
        return com.amazon.aps.iva.pd0.c.a.p(this, null);
    }
}
