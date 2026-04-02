package com.zipoapps.premiumhelper.toto;

import android.content.Context;
import com.zipoapps.premiumhelper.toto.PostConfigWorker;
import e.c.a.l.e;
import e.j.d.c0.a0;
import e.j.d.i;
import h.o.b.l;
import h.o.c.j;
import h.o.c.k;
import n.a.a;
/* loaded from: classes2.dex */
public final class TotoFeature$getConfig$3$2 extends k implements l<a0.b, h.k> {
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$getConfig$3$2(TotoFeature totoFeature) {
        super(1);
        this.this$0 = totoFeature;
    }

    @Override // h.o.b.l
    public /* bridge */ /* synthetic */ h.k invoke(a0.b bVar) {
        invoke2(bVar);
        return h.k.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(a0.b bVar) {
        i iVar;
        Context context;
        j.e(bVar, e.a);
        a.f9946d.c(bVar.f8618b);
        iVar = this.this$0.preferences;
        if (((Boolean) iVar.b("post_config_sent", Boolean.FALSE)).booleanValue()) {
            return;
        }
        PostConfigWorker.Companion companion = PostConfigWorker.Companion;
        context = this.this$0.context;
        companion.scheduleNow(context);
    }
}
