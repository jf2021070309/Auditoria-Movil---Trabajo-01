package com.amazon.aps.iva.i5;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.s.b;
import java.util.Iterator;
import java.util.Map;
/* compiled from: MediatorLiveData.java */
/* loaded from: classes.dex */
public class u<T> extends v<T> {
    public final com.amazon.aps.iva.s.b<LiveData<?>, a<?>> l = new com.amazon.aps.iva.s.b<>();

    /* compiled from: MediatorLiveData.java */
    /* loaded from: classes.dex */
    public static class a<V> implements w<V> {
        public final LiveData<V> a;
        public final w<? super V> b;
        public int c = -1;

        public a(LiveData<V> liveData, w<? super V> wVar) {
            this.a = liveData;
            this.b = wVar;
        }

        public final void a() {
            this.a.f(this);
        }

        @Override // com.amazon.aps.iva.i5.w
        public final void onChanged(V v) {
            int i = this.c;
            int i2 = this.a.g;
            if (i != i2) {
                this.c = i2;
                this.b.onChanged(v);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void g() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.l.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                ((a) ((Map.Entry) eVar.next()).getValue()).a();
            } else {
                return;
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void h() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.l.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                a aVar = (a) ((Map.Entry) eVar.next()).getValue();
                aVar.a.j(aVar);
            } else {
                return;
            }
        }
    }

    public final <S> void l(LiveData<S> liveData, w<? super S> wVar) {
        boolean z;
        if (liveData != null) {
            a<?> aVar = new a<>(liveData, wVar);
            a<?> d = this.l.d(liveData, aVar);
            if (d != null && d.b != wVar) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (d != null) {
                return;
            }
            if (this.c > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aVar.a();
                return;
            }
            return;
        }
        throw new NullPointerException("source cannot be null");
    }
}
