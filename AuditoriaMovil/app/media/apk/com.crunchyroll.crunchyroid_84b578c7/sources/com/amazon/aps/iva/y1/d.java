package com.amazon.aps.iva.y1;

import android.view.WindowInsetsController;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements WindowInsetsController.OnControllableInsetsChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;

    public /* synthetic */ d(AtomicBoolean atomicBoolean, int i) {
        this.a = i;
        this.b = atomicBoolean;
    }

    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
        boolean z = true;
        switch (this.a) {
            case 0:
                AtomicBoolean atomicBoolean = this.b;
                if ((i & 8) == 0) {
                    z = false;
                }
                atomicBoolean.set(z);
                return;
            default:
                AtomicBoolean atomicBoolean2 = this.b;
                if ((i & 8) == 0) {
                    z = false;
                }
                atomicBoolean2.set(z);
                return;
        }
    }
}
