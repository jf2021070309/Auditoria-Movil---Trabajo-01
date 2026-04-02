package androidx.mediarouter.app;

import android.view.View;
import androidx.mediarouter.app.b;
import com.amazon.aps.iva.f8.a0;
import com.amazon.aps.iva.f8.f0;
import java.util.Collections;
/* compiled from: MediaRouteDynamicControllerDialog.java */
/* loaded from: classes.dex */
public final class c implements View.OnClickListener {
    public final /* synthetic */ b.h.c b;

    public c(b.h.c cVar) {
        this.b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        b.h.c cVar = this.b;
        f0 f0Var = b.this.b;
        f0.h hVar = cVar.g;
        f0Var.getClass();
        if (hVar != null) {
            f0.b();
            f0.d c = f0.c();
            if (c.u instanceof a0.b) {
                f0.h.a b = c.t.b(hVar);
                if (b != null) {
                    a0.b.a aVar = b.a;
                    if (aVar != null && aVar.e) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        ((a0.b) c.u).o(Collections.singletonList(hVar.b));
                    }
                }
                cVar.c.setVisibility(4);
                cVar.d.setVisibility(0);
                return;
            }
            throw new IllegalStateException("There is no currently selected dynamic group route.");
        }
        throw new NullPointerException("route must not be null");
    }
}
