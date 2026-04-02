package com.amazon.aps.iva.vw;

import com.amazon.aps.iva.ks.g;
import com.amazon.aps.iva.oe0.m;
import java.io.Serializable;
/* compiled from: ExperimentObjectConfig.kt */
/* loaded from: classes2.dex */
public interface a extends Serializable {
    public static final /* synthetic */ int q0 = 0;

    /* compiled from: ExperimentObjectConfig.kt */
    /* renamed from: com.amazon.aps.iva.vw.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0810a {
        public static g a(a aVar) {
            String L = aVar.L();
            String str = null;
            if (!(!m.b0(L))) {
                L = null;
            }
            String M = aVar.M();
            if (!(!m.b0(M))) {
                M = null;
            }
            String l0 = aVar.l0();
            if (!(!m.b0(l0))) {
                l0 = null;
            }
            String j0 = aVar.j0();
            if (!m.b0(j0)) {
                str = j0;
            }
            return new g(M, L, str, l0);
        }
    }

    String L();

    String M();

    String j0();

    String l0();

    g y();
}
