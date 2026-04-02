package com.fyber.inneractive.sdk.player.c.j.a;

import com.fyber.inneractive.sdk.player.c.j.a.a;
import java.util.Comparator;
import java.util.TreeSet;
/* loaded from: classes.dex */
public final class j implements f, Comparator<g> {
    private final long a = 10485760;
    private final TreeSet<g> b = new TreeSet<>(this);
    private long c;

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(g gVar, g gVar2) {
        g gVar3 = gVar;
        g gVar4 = gVar2;
        if (gVar3.f - gVar4.f == 0) {
            return gVar3.compareTo(gVar4);
        }
        return gVar3.f < gVar4.f ? -1 : 1;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.a.f
    public final void a(a aVar, long j) {
        b(aVar, j);
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.a.a.b
    public final void a(a aVar, g gVar) {
        this.b.add(gVar);
        this.c += gVar.c;
        b(aVar, 0L);
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.a.a.b
    public final void a(g gVar) {
        this.b.remove(gVar);
        this.c -= gVar.c;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.a.a.b
    public final void a(a aVar, g gVar, g gVar2) {
        a(gVar);
        a(aVar, gVar2);
    }

    private void b(a aVar, long j) {
        while (this.c + j > this.a) {
            try {
                aVar.b(this.b.first());
            } catch (a.C0064a unused) {
            }
        }
    }
}
