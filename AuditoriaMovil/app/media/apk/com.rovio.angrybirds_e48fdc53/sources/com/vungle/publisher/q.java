package com.vungle.publisher;
/* loaded from: classes4.dex */
public abstract class q<R> {
    protected abstract R a();

    protected abstract R b();

    protected abstract R c();

    protected abstract R d();

    public R a(m mVar) {
        switch (mVar) {
            case vungle_local:
                return a();
            case vungle_streaming:
                return b();
            case vungle_mraid:
                return c();
            case third_party_mraid:
                return d();
            default:
                throw new IllegalArgumentException("unknown ad type " + mVar);
        }
    }

    public R a(cn cnVar) {
        return a(cnVar.a_());
    }
}
