package androidx.navigation.compose;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.g8.f;
import com.amazon.aps.iva.g8.g0;
import com.amazon.aps.iva.g8.o0;
import com.amazon.aps.iva.g8.r0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.q2.q;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DialogNavigator.kt */
@r0.b("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/navigation/compose/d;", "Lcom/amazon/aps/iva/g8/r0;", "Landroidx/navigation/compose/d$a;", "<init>", "()V", "a", "navigation-compose_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class d extends r0<a> {

    /* compiled from: DialogNavigator.kt */
    /* loaded from: classes.dex */
    public static final class a extends g0 implements com.amazon.aps.iva.g8.c {
        public final q k;
        public final com.amazon.aps.iva.xb0.q<f, i, Integer, com.amazon.aps.iva.kb0.q> l;

        public a() {
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, com.amazon.aps.iva.v0.a aVar) {
            super(dVar);
            q qVar = new q(0);
            this.k = qVar;
            this.l = aVar;
        }
    }

    @Override // com.amazon.aps.iva.g8.r0
    public final a a() {
        return new a(this, com.amazon.aps.iva.h8.c.a);
    }

    @Override // com.amazon.aps.iva.g8.r0
    public final void d(List<f> list, o0 o0Var, r0.a aVar) {
        for (f fVar : list) {
            b().e(fVar);
        }
    }

    @Override // com.amazon.aps.iva.g8.r0
    public final void e(f fVar, boolean z) {
        b().d(fVar, z);
        int x0 = x.x0((Iterable) b().f.getValue(), fVar);
        int i = 0;
        for (Object obj : (Iterable) b().f.getValue()) {
            int i2 = i + 1;
            if (i >= 0) {
                f fVar2 = (f) obj;
                if (i > x0) {
                    b().b(fVar2);
                }
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
    }
}
