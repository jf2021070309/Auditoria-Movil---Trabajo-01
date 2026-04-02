package com.amazon.aps.iva.ca;

import android.graphics.Color;
import com.amazon.aps.iva.ca.a;
/* compiled from: DropShadowKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class c implements a.InterfaceC0165a {
    public final a.InterfaceC0165a a;
    public final b b;
    public final d c;
    public final d d;
    public final d e;
    public final d f;
    public boolean g = true;

    /* compiled from: DropShadowKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public class a extends com.amazon.aps.iva.na.c<Float> {
        public final /* synthetic */ com.amazon.aps.iva.na.c c;

        public a(com.amazon.aps.iva.na.c cVar) {
            this.c = cVar;
        }

        @Override // com.amazon.aps.iva.na.c
        public final Float a(com.amazon.aps.iva.na.b<Float> bVar) {
            Float f = (Float) this.c.a(bVar);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public c(a.InterfaceC0165a interfaceC0165a, com.amazon.aps.iva.ia.b bVar, com.amazon.aps.iva.ka.j jVar) {
        this.a = interfaceC0165a;
        com.amazon.aps.iva.ca.a<Integer, Integer> d = jVar.a.d();
        this.b = (b) d;
        d.a(this);
        bVar.g(d);
        com.amazon.aps.iva.ca.a<Float, Float> d2 = jVar.b.d();
        this.c = (d) d2;
        d2.a(this);
        bVar.g(d2);
        com.amazon.aps.iva.ca.a<Float, Float> d3 = jVar.c.d();
        this.d = (d) d3;
        d3.a(this);
        bVar.g(d3);
        com.amazon.aps.iva.ca.a<Float, Float> d4 = jVar.d.d();
        this.e = (d) d4;
        d4.a(this);
        bVar.g(d4);
        com.amazon.aps.iva.ca.a<Float, Float> d5 = jVar.e.d();
        this.f = (d) d5;
        d5.a(this);
        bVar.g(d5);
    }

    @Override // com.amazon.aps.iva.ca.a.InterfaceC0165a
    public final void a() {
        this.g = true;
        this.a.a();
    }

    public final void b(com.amazon.aps.iva.aa.a aVar) {
        if (!this.g) {
            return;
        }
        this.g = false;
        double floatValue = this.d.f().floatValue() * 0.017453292519943295d;
        float floatValue2 = this.e.f().floatValue();
        float sin = ((float) Math.sin(floatValue)) * floatValue2;
        float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
        int intValue = this.b.f().intValue();
        aVar.setShadowLayer(this.f.f().floatValue(), sin, cos, Color.argb(Math.round(this.c.f().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }

    public final void c(com.amazon.aps.iva.na.c<Float> cVar) {
        d dVar = this.c;
        if (cVar == null) {
            dVar.k(null);
        } else {
            dVar.k(new a(cVar));
        }
    }
}
