package com.amazon.aps.iva.gv;

import android.os.Bundle;
import com.amazon.aps.iva.gv.i;
import com.amazon.aps.iva.wy.j;
/* compiled from: CrunchylistsDialogPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<Object> implements d {
    public final f b;
    public final boolean c;
    public final i d;

    public e(b bVar, g gVar, boolean z, i iVar) {
        super(bVar, new j[0]);
        this.b = gVar;
        this.c = z;
        this.d = iVar;
    }

    @Override // com.amazon.aps.iva.gv.d
    public final void a() {
        boolean z = this.c;
        f fVar = this.b;
        if (z) {
            fVar.b();
        } else {
            fVar.closeScreen();
        }
    }

    @Override // com.amazon.aps.iva.gv.d
    public final void onCreate(Bundle bundle) {
        if (bundle == null) {
            boolean z = this.d instanceof i.a;
            f fVar = this.b;
            if (z) {
                fVar.a();
            } else {
                fVar.c();
            }
        }
    }
}
