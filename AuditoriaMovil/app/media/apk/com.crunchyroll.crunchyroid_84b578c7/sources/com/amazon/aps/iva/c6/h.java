package com.amazon.aps.iva.c6;

import com.amazon.aps.iva.c6.j;
import com.amazon.aps.iva.t5.g0;
import com.google.firebase.installations.FirebaseInstallations;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(int i, Object obj, boolean z) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        boolean z = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                j.a aVar = (j.a) obj;
                aVar.getClass();
                int i2 = g0.a;
                aVar.b.h(z);
                return;
            default:
                FirebaseInstallations.c((FirebaseInstallations) obj, z);
                return;
        }
    }
}
