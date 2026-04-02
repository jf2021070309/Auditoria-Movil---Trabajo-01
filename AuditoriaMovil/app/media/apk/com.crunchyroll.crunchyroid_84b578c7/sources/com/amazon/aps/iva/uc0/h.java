package com.amazon.aps.iva.uc0;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes4.dex */
public final class h extends f implements com.amazon.aps.iva.ed0.e {
    public final Object[] b;

    public h(com.amazon.aps.iva.nd0.f fVar, Object[] objArr) {
        super(fVar);
        this.b = objArr;
    }

    @Override // com.amazon.aps.iva.ed0.e
    public final ArrayList c() {
        com.amazon.aps.iva.ed0.b yVar;
        Object[] objArr = this.b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            com.amazon.aps.iva.yb0.j.c(obj);
            Class<?> cls = obj.getClass();
            List<com.amazon.aps.iva.fc0.d<? extends Object>> list = d.a;
            if (Enum.class.isAssignableFrom(cls)) {
                yVar = new w(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                yVar = new g(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                yVar = new h(null, (Object[]) obj);
            } else if (obj instanceof Class) {
                yVar = new s(null, (Class) obj);
            } else {
                yVar = new y(obj, null);
            }
            arrayList.add(yVar);
        }
        return arrayList;
    }
}
