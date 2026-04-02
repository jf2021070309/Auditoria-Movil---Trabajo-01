package com.google.android.material.textfield;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ EndIconDelegate c;

    public /* synthetic */ a(EndIconDelegate endIconDelegate, int i) {
        this.b = i;
        this.c = endIconDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        EndIconDelegate endIconDelegate = this.c;
        switch (i) {
            case 0:
                ((ClearTextEndIconDelegate) endIconDelegate).lambda$tearDown$2();
                return;
            default:
                DropdownMenuEndIconDelegate.f((DropdownMenuEndIconDelegate) endIconDelegate);
                return;
        }
    }
}
