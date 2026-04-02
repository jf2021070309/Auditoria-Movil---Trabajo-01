package m;

import java.lang.annotation.Annotation;
/* loaded from: classes2.dex */
public final class f0 implements e0 {
    public static final e0 a = new f0();

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return e0.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof e0;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        StringBuilder y = e.a.d.a.a.y("@");
        y.append(e0.class.getName());
        y.append("()");
        return y.toString();
    }
}
