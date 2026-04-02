package com.amazon.aps.iva.n4;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.savedstate.a;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements a.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.savedstate.a.b
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((FragmentManager) obj).W();
            default:
                return androidx.lifecycle.p.a((androidx.lifecycle.p) obj);
        }
    }
}
