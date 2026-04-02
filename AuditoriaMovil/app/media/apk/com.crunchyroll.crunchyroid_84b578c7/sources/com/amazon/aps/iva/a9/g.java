package com.amazon.aps.iva.a9;

import java.util.ArrayList;
/* compiled from: FragmentTransitionSupport.java */
/* loaded from: classes.dex */
public final class g extends o {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c = null;
    public final /* synthetic */ ArrayList d = null;
    public final /* synthetic */ Object e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ f g;

    public g(f fVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.g = fVar;
        this.a = obj;
        this.b = arrayList;
        this.e = obj2;
        this.f = arrayList2;
    }

    @Override // com.amazon.aps.iva.a9.n.g
    public final void onTransitionEnd(n nVar) {
        nVar.removeListener(this);
    }

    @Override // com.amazon.aps.iva.a9.o, com.amazon.aps.iva.a9.n.g
    public final void onTransitionStart(n nVar) {
        f fVar = this.g;
        Object obj = this.a;
        if (obj != null) {
            fVar.t(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            fVar.t(obj2, this.d, null);
        }
        Object obj3 = this.e;
        if (obj3 != null) {
            fVar.t(obj3, this.f, null);
        }
    }
}
