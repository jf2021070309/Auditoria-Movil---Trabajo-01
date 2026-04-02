package com.amazon.aps.iva.er;

import com.amazon.aps.iva.kb0.q;
import java.util.LinkedHashMap;
/* compiled from: AggregatingVitalMonitor.kt */
/* loaded from: classes2.dex */
public final class a implements g {
    public double a = Double.NaN;
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // com.amazon.aps.iva.er.g
    public final void a(f fVar) {
        double d = this.a;
        synchronized (this.b) {
            this.b.put(fVar, e.e);
            q qVar = q.a;
        }
        if (!Double.isNaN(d)) {
            c(fVar, d);
        }
    }

    @Override // com.amazon.aps.iva.er.h
    public final void b(double d) {
        this.a = d;
        synchronized (this.b) {
            for (f fVar : this.b.keySet()) {
                c(fVar, d);
            }
            q qVar = q.a;
        }
    }

    public final void c(f fVar, double d) {
        e eVar = (e) this.b.get(fVar);
        if (eVar == null) {
            eVar = e.e;
        }
        int i = eVar.a;
        int i2 = i + 1;
        e eVar2 = new e(i2, Math.min(d, eVar.b), Math.max(d, eVar.c), ((i * eVar.d) + d) / i2);
        fVar.a(eVar2);
        synchronized (this.b) {
            this.b.put(fVar, eVar2);
            q qVar = q.a;
        }
    }
}
