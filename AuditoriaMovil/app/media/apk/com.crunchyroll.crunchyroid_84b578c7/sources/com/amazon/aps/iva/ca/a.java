package com.amazon.aps.iva.ca;

import android.view.animation.Interpolator;
import com.amazon.aps.iva.e.z;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BaseKeyframeAnimation.java */
/* loaded from: classes.dex */
public abstract class a<K, A> {
    public final c<K> c;
    public com.amazon.aps.iva.na.c<A> e;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public A f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: com.amazon.aps.iva.ca.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0165a {
        void a();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class b<T> implements c<T> {
        @Override // com.amazon.aps.iva.ca.a.c
        public final boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final com.amazon.aps.iva.na.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final boolean c(float f) {
            return false;
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final float d() {
            return 0.0f;
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final float e() {
            return 1.0f;
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final boolean isEmpty() {
            return true;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public interface c<T> {
        boolean a(float f);

        com.amazon.aps.iva.na.a<T> b();

        boolean c(float f);

        float d();

        float e();

        boolean isEmpty();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class d<T> implements c<T> {
        public final List<? extends com.amazon.aps.iva.na.a<T>> a;
        public com.amazon.aps.iva.na.a<T> c = null;
        public float d = -1.0f;
        public com.amazon.aps.iva.na.a<T> b = f(0.0f);

        public d(List<? extends com.amazon.aps.iva.na.a<T>> list) {
            this.a = list;
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final boolean a(float f) {
            com.amazon.aps.iva.na.a<T> aVar = this.c;
            com.amazon.aps.iva.na.a<T> aVar2 = this.b;
            if (aVar == aVar2 && this.d == f) {
                return true;
            }
            this.c = aVar2;
            this.d = f;
            return false;
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final com.amazon.aps.iva.na.a<T> b() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final boolean c(float f) {
            boolean z;
            com.amazon.aps.iva.na.a<T> aVar = this.b;
            if (f >= aVar.b() && f < aVar.a()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return !this.b.c();
            }
            this.b = f(f);
            return true;
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final float d() {
            return this.a.get(0).b();
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final float e() {
            List<? extends com.amazon.aps.iva.na.a<T>> list = this.a;
            return list.get(list.size() - 1).a();
        }

        public final com.amazon.aps.iva.na.a<T> f(float f) {
            List<? extends com.amazon.aps.iva.na.a<T>> list = this.a;
            com.amazon.aps.iva.na.a<T> aVar = list.get(list.size() - 1);
            if (f >= aVar.b()) {
                return aVar;
            }
            int size = list.size() - 2;
            while (true) {
                boolean z = false;
                if (size >= 1) {
                    com.amazon.aps.iva.na.a<T> aVar2 = list.get(size);
                    if (this.b != aVar2) {
                        if (f >= aVar2.b() && f < aVar2.a()) {
                            z = true;
                        }
                        if (z) {
                            return aVar2;
                        }
                    }
                    size--;
                } else {
                    return list.get(0);
                }
            }
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final boolean isEmpty() {
            return false;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class e<T> implements c<T> {
        public final com.amazon.aps.iva.na.a<T> a;
        public float b = -1.0f;

        public e(List<? extends com.amazon.aps.iva.na.a<T>> list) {
            this.a = list.get(0);
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final boolean a(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final com.amazon.aps.iva.na.a<T> b() {
            return this.a;
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final boolean c(float f) {
            return !this.a.c();
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final float d() {
            return this.a.b();
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final float e() {
            return this.a.a();
        }

        @Override // com.amazon.aps.iva.ca.a.c
        public final boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends com.amazon.aps.iva.na.a<K>> list) {
        c dVar;
        c cVar;
        if (list.isEmpty()) {
            cVar = new b();
        } else {
            if (list.size() == 1) {
                dVar = new e(list);
            } else {
                dVar = new d(list);
            }
            cVar = dVar;
        }
        this.c = cVar;
    }

    public final void a(InterfaceC0165a interfaceC0165a) {
        this.a.add(interfaceC0165a);
    }

    public final com.amazon.aps.iva.na.a<K> b() {
        com.amazon.aps.iva.na.a<K> b2 = this.c.b();
        z.s();
        return b2;
    }

    public float c() {
        if (this.h == -1.0f) {
            this.h = this.c.e();
        }
        return this.h;
    }

    public final float d() {
        com.amazon.aps.iva.na.a<K> b2 = b();
        if (b2 != null && !b2.c()) {
            return b2.d.getInterpolation(e());
        }
        return 0.0f;
    }

    public final float e() {
        if (this.b) {
            return 0.0f;
        }
        com.amazon.aps.iva.na.a<K> b2 = b();
        if (b2.c()) {
            return 0.0f;
        }
        return (this.d - b2.b()) / (b2.a() - b2.b());
    }

    public A f() {
        A g;
        Interpolator interpolator;
        float e2 = e();
        if (this.e == null && this.c.a(e2)) {
            return this.f;
        }
        com.amazon.aps.iva.na.a<K> b2 = b();
        Interpolator interpolator2 = b2.e;
        if (interpolator2 != null && (interpolator = b2.f) != null) {
            g = h(b2, e2, interpolator2.getInterpolation(e2), interpolator.getInterpolation(e2));
        } else {
            g = g(b2, d());
        }
        this.f = g;
        return g;
    }

    public abstract A g(com.amazon.aps.iva.na.a<K> aVar, float f);

    public A h(com.amazon.aps.iva.na.a<K> aVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                ((InterfaceC0165a) arrayList.get(i)).a();
                i++;
            } else {
                return;
            }
        }
    }

    public void j(float f) {
        c<K> cVar = this.c;
        if (cVar.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = cVar.d();
        }
        float f2 = this.g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.g = cVar.d();
            }
            f = this.g;
        } else if (f > c()) {
            f = c();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (cVar.c(f)) {
            i();
        }
    }

    public final void k(com.amazon.aps.iva.na.c<A> cVar) {
        com.amazon.aps.iva.na.c<A> cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.getClass();
        }
        this.e = cVar;
    }
}
