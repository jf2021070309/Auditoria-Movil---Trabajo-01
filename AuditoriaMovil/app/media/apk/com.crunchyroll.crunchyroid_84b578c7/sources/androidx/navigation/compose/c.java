package androidx.navigation.compose;

import androidx.navigation.compose.d;
import com.amazon.aps.iva.g8.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: DialogHost.kt */
/* loaded from: classes.dex */
public final class c extends l implements p<i, Integer, q> {
    public final /* synthetic */ d.a h;
    public final /* synthetic */ f i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d.a aVar, f fVar) {
        super(2);
        this.h = aVar;
        this.i = fVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            this.h.l.invoke(this.i, iVar2, 8);
        }
        return q.a;
    }
}
