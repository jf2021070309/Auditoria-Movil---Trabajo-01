package com.amazon.aps.iva.l5;

import androidx.lifecycle.e;
import androidx.lifecycle.u;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.i5.g0;
import com.amazon.aps.iva.i5.h0;
import com.amazon.aps.iva.k5.a;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ViewModel.kt */
/* loaded from: classes.dex */
public final class b {
    public static final f0 a(Class cls, h0 h0Var, com.amazon.aps.iva.k5.b bVar, com.amazon.aps.iva.k5.a aVar, i iVar) {
        u uVar;
        u.b bVar2;
        com.amazon.aps.iva.k5.a aVar2;
        iVar.s(-1439476281);
        if (bVar != null) {
            uVar = new u(h0Var.getViewModelStore(), bVar, aVar);
        } else if (h0Var instanceof e) {
            uVar = new u(h0Var.getViewModelStore(), ((e) h0Var).getDefaultViewModelProviderFactory(), aVar);
        } else {
            g0 viewModelStore = h0Var.getViewModelStore();
            boolean z = h0Var instanceof e;
            if (z) {
                bVar2 = ((e) h0Var).getDefaultViewModelProviderFactory();
            } else {
                if (u.c.a == null) {
                    u.c.a = new u.c();
                }
                bVar2 = u.c.a;
                j.c(bVar2);
            }
            if (z) {
                aVar2 = ((e) h0Var).getDefaultViewModelCreationExtras();
            } else {
                aVar2 = a.C0433a.b;
            }
            uVar = new u(viewModelStore, bVar2, aVar2);
        }
        f0 a = uVar.a(cls);
        iVar.G();
        return a;
    }
}
