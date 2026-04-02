package com.amazon.aps.iva.ez;

import androidx.lifecycle.p;
import com.amazon.aps.iva.i5.f0;
/* compiled from: ViewModelFactory.kt */
/* loaded from: classes2.dex */
public final class k<T> extends androidx.lifecycle.a {
    public final Class<T> d;
    public final com.amazon.aps.iva.xb0.l<p, T> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Class cls, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.s8.c cVar) {
        super(cVar, null);
        com.amazon.aps.iva.yb0.j.f(cls, "viewModelClass");
        com.amazon.aps.iva.yb0.j.f(lVar, "provider");
        com.amazon.aps.iva.yb0.j.f(cVar, "owner");
        this.d = cls;
        this.e = lVar;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Lcom/amazon/aps/iva/i5/f0;>(Ljava/lang/String;Ljava/lang/Class<TT;>;Landroidx/lifecycle/p;)TT; */
    @Override // androidx.lifecycle.a
    public final f0 d(String str, Class cls, p pVar) {
        com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
        com.amazon.aps.iva.yb0.j.f(pVar, "handle");
        if (cls.isAssignableFrom(this.d)) {
            T invoke = this.e.invoke(pVar);
            com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type T of com.ellation.crunchyroll.mvp.viewmodel.SavedStateHandleViewModelFactory.create");
            return (f0) invoke;
        }
        throw new IllegalArgumentException(defpackage.e.d("Unknown ViewModel ", cls).toString());
    }
}
