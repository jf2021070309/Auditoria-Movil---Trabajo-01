package com.amazon.aps.iva.uc0;

import com.amazon.aps.iva.ee0.f1;
import java.lang.annotation.Annotation;
import java.util.Collection;
/* compiled from: ReflectJavaValueParameter.kt */
/* loaded from: classes4.dex */
public final class g0 extends v implements com.amazon.aps.iva.ed0.z {
    public final e0 a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public g0(e0 e0Var, Annotation[] annotationArr, String str, boolean z) {
        com.amazon.aps.iva.yb0.j.f(annotationArr, "reflectAnnotations");
        this.a = e0Var;
        this.b = annotationArr;
        this.c = str;
        this.d = z;
    }

    @Override // com.amazon.aps.iva.ed0.z
    public final boolean a() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final Collection getAnnotations() {
        return f1.x(this.b);
    }

    @Override // com.amazon.aps.iva.ed0.z
    public final com.amazon.aps.iva.nd0.f getName() {
        String str = this.c;
        if (str != null) {
            return com.amazon.aps.iva.nd0.f.f(str);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.ed0.z
    public final com.amazon.aps.iva.ed0.w getType() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final com.amazon.aps.iva.ed0.a h(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        return f1.v(this.b, cVar);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        com.amazon.aps.iva.b8.i.d(g0.class, sb, ": ");
        if (this.d) {
            str = "vararg ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(getName());
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final void D() {
    }
}
