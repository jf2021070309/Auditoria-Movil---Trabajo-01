package com.kwad.sdk.core.video.a;

import android.media.TimedText;
import com.kwad.sdk.core.video.a.c;
/* loaded from: classes.dex */
public abstract class a implements c {
    private c.e Si;
    private c.h Sj;
    private c.b Sk;
    private c.InterfaceC0260c Sl;
    private c.d Sm;
    private c.a Sn;
    private c.f avK;
    private c.g avL;

    /* JADX INFO: Access modifiers changed from: protected */
    public static void f(float f) {
        com.kwad.sdk.core.video.a.a.a.dI(f == 0.0f ? "autoMute" : "autoVoice");
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(c.a aVar) {
        this.Sn = aVar;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(c.b bVar) {
        this.Sk = bVar;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(c.InterfaceC0260c interfaceC0260c) {
        this.Sl = interfaceC0260c;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(c.f fVar) {
        this.avK = fVar;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(c.g gVar) {
        this.avL = gVar;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(c.h hVar) {
        this.Sj = hVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(TimedText timedText) {
        c.g gVar = this.avL;
        if (gVar != null) {
            gVar.a(timedText);
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void b(c.e eVar) {
        this.Si = eVar;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void c(c.d dVar) {
        this.Sm = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyOnBufferingUpdate(int i) {
        c.a aVar = this.Sn;
        if (aVar != null) {
            aVar.aw(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyOnCompletion() {
        c.b bVar = this.Sk;
        if (bVar != null) {
            bVar.ow();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean notifyOnError(int i, int i2) {
        c.InterfaceC0260c interfaceC0260c = this.Sl;
        return interfaceC0260c != null && interfaceC0260c.j(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean notifyOnInfo(int i, int i2) {
        c.d dVar = this.Sm;
        return dVar != null && dVar.k(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyOnPrepared() {
        c.e eVar = this.Si;
        if (eVar != null) {
            eVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyOnSeekComplete() {
        c.f fVar = this.avK;
        if (fVar != null) {
            fVar.ox();
        }
    }

    public final void resetListeners() {
        this.Si = null;
        this.Sn = null;
        this.Sk = null;
        this.avK = null;
        this.Sj = null;
        this.Sl = null;
        this.Sm = null;
        this.avL = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(int i, int i2) {
        c.h hVar = this.Sj;
        if (hVar != null) {
            hVar.i(i, i2);
        }
    }
}
