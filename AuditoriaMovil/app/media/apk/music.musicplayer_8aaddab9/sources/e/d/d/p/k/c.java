package e.d.d.p.k;

import ch.qos.logback.core.CoreConstants;
import e.d.d.p.k.f;
import java.lang.annotation.Annotation;
/* loaded from: classes.dex */
public final class c implements f {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a f7551b;

    public c(int i2, f.a aVar) {
        this.a = i2;
        this.f7551b = aVar;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return f.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.a == ((c) fVar).a && this.f7551b.equals(((c) fVar).f7551b);
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return (this.a ^ 14552422) + (this.f7551b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + CoreConstants.LEFT_PARENTHESIS_CHAR + "tag=" + this.a + "intEncoding=" + this.f7551b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
