package com.fyber.inneractive.sdk.player.c.d;

import java.io.EOFException;
import java.io.IOException;
/* loaded from: classes.dex */
public final class e implements n {
    @Override // com.fyber.inneractive.sdk.player.c.d.n
    public final void a(long j, int i, int i2, int i3, byte[] bArr) {
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.n
    public final void a(com.fyber.inneractive.sdk.player.c.h hVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.n
    public final int a(g gVar, int i, boolean z) throws IOException, InterruptedException {
        int a = gVar.a(i);
        if (a == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return a;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.n
    public final void a(com.fyber.inneractive.sdk.player.c.k.k kVar, int i) {
        kVar.d(i);
    }
}
