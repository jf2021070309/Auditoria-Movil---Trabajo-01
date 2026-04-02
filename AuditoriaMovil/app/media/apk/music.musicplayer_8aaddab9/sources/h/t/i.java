package h.t;

import h.o.b.l;
import h.o.c.j;
import h.o.c.k;
/* loaded from: classes2.dex */
public final class i extends k implements l<h.q.c, String> {
    public final /* synthetic */ CharSequence a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CharSequence charSequence) {
        super(1);
        this.a = charSequence;
    }

    @Override // h.o.b.l
    public String invoke(h.q.c cVar) {
        h.q.c cVar2 = cVar;
        j.e(cVar2, "it");
        return g.r(this.a, cVar2);
    }
}
