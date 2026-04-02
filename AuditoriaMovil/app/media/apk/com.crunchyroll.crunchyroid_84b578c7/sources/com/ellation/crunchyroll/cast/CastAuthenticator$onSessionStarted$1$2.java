package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
import kotlin.Metadata;
/* compiled from: CastAuthenticator.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class CastAuthenticator$onSessionStarted$1$2 extends i implements l<Throwable, q> {
    public CastAuthenticator$onSessionStarted$1$2(Object obj) {
        super(1, obj, a.C0515a.class, "d", "d(Ljava/lang/Throwable;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(Throwable th) {
        invoke2(th);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        ((a.C0515a) this.receiver).b(th);
    }
}
