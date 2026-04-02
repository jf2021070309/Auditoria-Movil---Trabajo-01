package com.fyber.inneractive.sdk.player.c.j;

import android.content.Context;
import com.fyber.inneractive.sdk.player.c.j.g;
/* loaded from: classes.dex */
public final class m implements g.a {
    private final Context a;
    private final u<? super g> b;
    private final g.a c;

    public m(Context context, u<? super g> uVar, g.a aVar) {
        this.a = context.getApplicationContext();
        this.b = uVar;
        this.c = aVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g.a
    public final /* synthetic */ g a() {
        return new l(this.a, this.b, this.c.a());
    }
}
