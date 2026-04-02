package com.fyber.inneractive.sdk.player.c;

import java.io.IOException;
import kotlin.jvm.internal.LongCompanionObject;
/* loaded from: classes.dex */
public abstract class a implements n, o {
    protected p a;
    protected int b;
    protected int c;
    protected com.fyber.inneractive.sdk.player.c.g.e d;
    protected long e;
    protected boolean f = true;
    protected boolean g;
    private final int h;

    @Override // com.fyber.inneractive.sdk.player.c.e.b
    public void a(int i, Object obj) throws d {
    }

    public void a(long j, boolean z) throws d {
    }

    public void a(boolean z) throws d {
    }

    public void a(h[] hVarArr) throws d {
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public final o b() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public com.fyber.inneractive.sdk.player.c.k.g c() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.c.o
    public int m() throws d {
        return 0;
    }

    public void n() throws d {
    }

    public void o() throws d {
    }

    public void p() {
    }

    public a(int i) {
        this.h = i;
    }

    @Override // com.fyber.inneractive.sdk.player.c.n, com.fyber.inneractive.sdk.player.c.o
    public final int a() {
        return this.h;
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public final void a(int i) {
        this.b = i;
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public final int d() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public final void a(p pVar, h[] hVarArr, com.fyber.inneractive.sdk.player.c.g.e eVar, long j, boolean z, long j2) throws d {
        com.fyber.inneractive.sdk.player.c.k.a.b(this.c == 0);
        this.a = pVar;
        this.c = 1;
        a(z);
        a(hVarArr, eVar, j2);
        a(j, z);
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public final void e() throws d {
        com.fyber.inneractive.sdk.player.c.k.a.b(this.c == 1);
        this.c = 2;
        n();
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public final void a(h[] hVarArr, com.fyber.inneractive.sdk.player.c.g.e eVar, long j) throws d {
        com.fyber.inneractive.sdk.player.c.k.a.b(!this.g);
        this.d = eVar;
        this.f = false;
        this.e = j;
        a(hVarArr);
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public final com.fyber.inneractive.sdk.player.c.g.e f() {
        return this.d;
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public final boolean g() {
        return this.f;
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public final void h() {
        this.g = true;
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public final boolean i() {
        return this.g;
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public final void j() throws IOException {
        this.d.b();
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public final void a(long j) throws d {
        this.g = false;
        this.f = false;
        a(j, false);
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public final void k() throws d {
        com.fyber.inneractive.sdk.player.c.k.a.b(this.c == 2);
        this.c = 1;
        o();
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public final void l() {
        com.fyber.inneractive.sdk.player.c.k.a.b(this.c == 1);
        this.c = 0;
        this.d = null;
        this.g = false;
        p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int a(i iVar, com.fyber.inneractive.sdk.player.c.b.d dVar, boolean z) {
        int a = this.d.a(iVar, dVar, z);
        if (a == -4) {
            if (dVar.c()) {
                this.f = true;
                return this.g ? -4 : -3;
            }
            dVar.d += this.e;
        } else if (a == -5) {
            h hVar = iVar.a;
            if (hVar.w != LongCompanionObject.MAX_VALUE) {
                iVar.a = hVar.a(hVar.w + this.e);
            }
        }
        return a;
    }
}
