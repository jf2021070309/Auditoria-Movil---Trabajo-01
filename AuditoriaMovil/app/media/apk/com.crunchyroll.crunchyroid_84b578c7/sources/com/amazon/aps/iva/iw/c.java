package com.amazon.aps.iva.iw;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.h;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.n4.v;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: MatureContentDialogRouterImpl.kt */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.lg.a {
    public final h a;

    public c(h hVar) {
        j.f(hVar, "activity");
        this.a = hVar;
    }

    @Override // com.amazon.aps.iva.lg.a
    public final void a(PlayableAsset playableAsset) {
        j.f(playableAsset, "asset");
        com.amazon.aps.iva.z00.a.i.getClass();
        com.amazon.aps.iva.z00.a aVar = new com.amazon.aps.iva.z00.a();
        aVar.h.b(aVar, com.amazon.aps.iva.z00.a.j[4], playableAsset);
        aVar.show(this.a.getSupportFragmentManager(), "mature_content_dialog");
    }

    @Override // com.amazon.aps.iva.lg.a
    public final void b(final l<? super PlayableAsset, q> lVar) {
        h hVar = this.a;
        hVar.getSupportFragmentManager().b0("mature_content_dialog", hVar, new v() { // from class: com.amazon.aps.iva.iw.b
            @Override // com.amazon.aps.iva.n4.v
            public final void i6(Bundle bundle, String str) {
                Object obj;
                l lVar2 = l.this;
                j.f(lVar2, "$onEnableMatureContentClick");
                j.f(str, "<anonymous parameter 0>");
                if (bundle.containsKey("ON_ENABLE_MATURE_CONTENT_CLICKED")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        obj = bundle.getSerializable("ON_ENABLE_MATURE_CONTENT_CLICKED", PlayableAsset.class);
                    } else {
                        obj = (PlayableAsset) bundle.getSerializable("ON_ENABLE_MATURE_CONTENT_CLICKED");
                    }
                    j.c(obj);
                    lVar2.invoke(obj);
                }
            }
        });
    }
}
