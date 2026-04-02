package i.a.h2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public final class u extends i.a.h2.w.d<s<?>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state = null;

    @Override // i.a.h2.w.d
    public boolean a(s<?> sVar) {
        if (this._state != null) {
            return false;
        }
        this._state = t.a;
        return true;
    }

    @Override // i.a.h2.w.d
    public h.m.d[] b(s<?> sVar) {
        this._state = null;
        return i.a.h2.w.c.a;
    }
}
