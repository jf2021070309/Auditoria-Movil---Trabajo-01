package com.amazon.aps.iva.a6;

import com.amazon.aps.iva.a6.d;
import com.ellation.crunchyroll.feed.HomeFeedScreenView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(int i, int i2, Object obj) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                d dVar = ((d.a) obj).b;
                dVar.getClass();
                boolean z = true;
                if (i2 != -3 && i2 != -2) {
                    if (i2 != -1) {
                        if (i2 != 1) {
                            com.amazon.aps.iva.t5.p.g();
                            return;
                        }
                        dVar.d(1);
                        dVar.b(1);
                        return;
                    }
                    dVar.b(-1);
                    dVar.a();
                    return;
                }
                if (i2 != -2) {
                    com.amazon.aps.iva.q5.f fVar = dVar.d;
                    if (fVar == null || fVar.b != 1) {
                        z = false;
                    }
                    if (!z) {
                        dVar.d(3);
                        return;
                    }
                }
                dVar.b(0);
                dVar.d(2);
                return;
            default:
                HomeFeedScreenView.nf((HomeFeedScreenView) obj, i2);
                return;
        }
    }
}
