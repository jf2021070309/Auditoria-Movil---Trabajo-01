package com.ss.android.downloadlib.rb;

import java.lang.ref.SoftReference;
/* loaded from: classes3.dex */
public class o<P, R> implements Runnable {
    private o<R, ?> bn;
    private P dr;
    private SoftReference<dr<P, R>> g;
    private R ge;
    private int o;
    private o<?, P> q;

    /* loaded from: classes3.dex */
    public interface dr<PARAM, RESULT> {
        RESULT dr(PARAM param);
    }

    private o(int i, dr<P, R> drVar, P p) {
        this.o = i;
        this.g = new SoftReference<>(drVar);
        this.dr = p;
    }

    public static <P, R> o<P, R> dr(dr<P, R> drVar, P p) {
        return new o<>(2, drVar, p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <NR> o<R, NR> dr(int i, dr<R, NR> drVar) {
        o oVar = (o<R, ?>) new o(i, drVar, null);
        this.bn = oVar;
        oVar.q = this;
        return oVar;
    }

    public <NR> o<R, NR> dr(dr<R, NR> drVar) {
        return dr(0, drVar);
    }

    public void dr() {
        o<?, P> oVar = this.q;
        if (oVar != null) {
            oVar.dr();
        } else {
            run();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        o<?, P> oVar;
        if (this.o == 0 && !yk.dr()) {
            com.ss.android.downloadlib.rb.dr().ge().post(this);
        } else if (this.o == 1 && yk.dr()) {
            com.ss.android.downloadlib.g.dr().dr(this);
        } else if (this.o == 2 && yk.dr()) {
            com.ss.android.downloadlib.g.dr().ge(this);
        } else {
            if (this.dr == null && (oVar = this.q) != null) {
                this.dr = oVar.ge();
            }
            dr<P, R> drVar = this.g.get();
            if (drVar == null) {
                return;
            }
            this.ge = drVar.dr(this.dr);
            o<R, ?> oVar2 = this.bn;
            if (oVar2 != null) {
                oVar2.run();
            }
        }
    }

    private R ge() {
        return this.ge;
    }
}
