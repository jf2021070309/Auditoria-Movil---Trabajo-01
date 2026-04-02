package com.kwad.sdk.core.h;
/* loaded from: classes.dex */
public abstract class b implements c {
    private boolean ayl = false;
    private boolean Lc = false;
    private boolean Ld = false;

    @Override // com.kwad.sdk.core.h.c
    public final void aK() {
        this.ayl = true;
        if (this.Ld) {
            return;
        }
        af();
        this.Ld = true;
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aL() {
        if (this.ayl && !this.Lc) {
            ag();
            this.Lc = true;
        }
    }

    protected abstract void af();

    protected abstract void ag();
}
