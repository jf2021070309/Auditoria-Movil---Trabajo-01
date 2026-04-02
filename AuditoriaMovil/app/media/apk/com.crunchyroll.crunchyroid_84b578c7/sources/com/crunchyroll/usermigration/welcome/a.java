package com.crunchyroll.usermigration.welcome;

import com.amazon.aps.iva.co.e;
import com.amazon.aps.iva.co.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: UserMigrationWelcomeActivity.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ UserMigrationWelcomeActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UserMigrationWelcomeActivity userMigrationWelcomeActivity) {
        super(0);
        this.h = userMigrationWelcomeActivity;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        e eVar = f.a.a;
        if (eVar != null) {
            eVar.c().invoke(this.h);
            return q.a;
        }
        j.m("dependencies");
        throw null;
    }
}
