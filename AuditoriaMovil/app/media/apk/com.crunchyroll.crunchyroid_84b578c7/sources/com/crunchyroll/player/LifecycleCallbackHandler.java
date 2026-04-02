package com.crunchyroll.player;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import com.amazon.aps.iva.cj.h;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.xw.b0;
import kotlin.Metadata;
/* compiled from: LifecycleCallbackHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/crunchyroll/player/LifecycleCallbackHandler;", "Landroidx/lifecycle/j;", "player_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LifecycleCallbackHandler implements j {
    public final h b;
    public boolean c;
    public o d;

    /* compiled from: LifecycleCallbackHandler.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.a.values().length];
            try {
                iArr[g.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public LifecycleCallbackHandler(h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "player");
        this.b = hVar;
    }

    @Override // androidx.lifecycle.j
    public final void U2(o oVar, g.a aVar) {
        if (aVar == g.a.ON_DESTROY) {
            oVar.getLifecycle().removeObserver(this);
            if (com.amazon.aps.iva.yb0.j.a(oVar, this.d)) {
                this.d = null;
            }
        }
        h hVar = this.b;
        if (!((Boolean) b0.a(hVar.P())).booleanValue()) {
            return;
        }
        if (oVar instanceof Activity) {
            int i = a.a[aVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    onPause(oVar);
                }
            } else if (com.amazon.aps.iva.yb0.j.a(oVar, this.d)) {
                if (this.c) {
                    hVar.a().b();
                }
                this.d = null;
            }
        } else if (oVar instanceof Fragment) {
            int i2 = a.a[aVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 && ((Fragment) oVar).isRemoving() && com.amazon.aps.iva.yb0.j.a(oVar, this.d)) {
                    if (this.c) {
                        hVar.a().b();
                    }
                    this.d = null;
                    return;
                }
                return;
            }
            onPause(oVar);
        }
    }

    public final void onPause(o oVar) {
        if (this.d != null) {
            return;
        }
        h hVar = this.b;
        this.c = ((com.amazon.aps.iva.nk.j) hVar.getState().getValue()).a;
        hVar.a().pause();
        this.d = oVar;
    }
}
