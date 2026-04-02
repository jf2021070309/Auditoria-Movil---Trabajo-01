package com.amazon.aps.iva.m00;

import java.util.List;
/* compiled from: SeasonsDialogPresenter.kt */
/* loaded from: classes2.dex */
public final class i<T> extends com.amazon.aps.iva.wy.b<j<T>> implements h<T> {
    public final List<T> b;
    public final int c;
    public final a<T> d;

    public i(com.ellation.crunchyroll.presentation.content.seasons.a aVar, List list, int i, com.ellation.crunchyroll.presentation.content.seasons.b bVar) {
        super(aVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = list;
        this.c = i;
        this.d = bVar;
    }

    @Override // com.amazon.aps.iva.m00.h
    public final void Q() {
        getView().dismiss();
    }

    @Override // com.amazon.aps.iva.m00.h
    public final void e0(T t) {
        if (this.b.indexOf(t) != this.c) {
            this.d.a(t);
        }
        getView().dismiss();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        List<T> list = this.b;
        if (!list.isEmpty()) {
            getView().Ma(this.c, list);
        }
    }
}
