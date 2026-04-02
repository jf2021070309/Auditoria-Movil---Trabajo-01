package i.a.i2;

import ch.qos.logback.core.CoreConstants;
import i.a.e0;
/* loaded from: classes2.dex */
public final class d implements e0 {
    public final h.m.f a;

    public d(h.m.f fVar) {
        this.a = fVar;
    }

    @Override // i.a.e0
    public h.m.f g() {
        return this.a;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("CoroutineScope(coroutineContext=");
        y.append(this.a);
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return y.toString();
    }
}
