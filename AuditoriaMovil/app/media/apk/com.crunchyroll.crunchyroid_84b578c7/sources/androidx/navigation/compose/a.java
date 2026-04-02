package androidx.navigation.compose;

import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.navigation.compose.d;
import com.amazon.aps.iva.g8.f;
import com.amazon.aps.iva.h8.h;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.u0;
import com.amazon.aps.iva.o0.v0;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.v1.u1;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import java.util.Collection;
import java.util.List;
/* compiled from: DialogHost.kt */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: DialogHost.kt */
    /* renamed from: androidx.navigation.compose.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0044a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ androidx.navigation.compose.d h;
        public final /* synthetic */ f i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0044a(androidx.navigation.compose.d dVar, f fVar) {
            super(0);
            this.h = dVar;
            this.i = fVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.e(this.i, false);
            return q.a;
        }
    }

    /* compiled from: DialogHost.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements p<i, Integer, q> {
        public final /* synthetic */ f h;
        public final /* synthetic */ com.amazon.aps.iva.x0.e i;
        public final /* synthetic */ androidx.navigation.compose.d j;
        public final /* synthetic */ d.a k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, com.amazon.aps.iva.x0.f fVar2, androidx.navigation.compose.d dVar, d.a aVar) {
            super(2);
            this.h = fVar;
            this.i = fVar2;
            this.j = dVar;
            this.k = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                androidx.navigation.compose.d dVar = this.j;
                f fVar = this.h;
                x0.a(fVar, new androidx.navigation.compose.b(dVar, fVar), iVar2);
                h.a(fVar, this.i, com.amazon.aps.iva.v0.b.b(iVar2, -497631156, new androidx.navigation.compose.c(this.k, fVar)), iVar2, 456);
            }
            return q.a;
        }
    }

    /* compiled from: DialogHost.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements p<i, Integer, q> {
        public final /* synthetic */ androidx.navigation.compose.d h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.navigation.compose.d dVar, int i) {
            super(2);
            this.h = dVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            a.a(this.h, iVar, I);
            return q.a;
        }
    }

    /* compiled from: DialogHost.kt */
    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<v0, u0> {
        public final /* synthetic */ f h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ List<f> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar, List list, boolean z) {
            super(1);
            this.h = fVar;
            this.i = z;
            this.j = list;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final u0 invoke(v0 v0Var) {
            final List<f> list = this.j;
            final boolean z = this.i;
            final f fVar = this.h;
            j jVar = new j() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1$observer$1
                @Override // androidx.lifecycle.j
                public final void U2(o oVar, g.a aVar) {
                    boolean z2 = z;
                    f fVar2 = fVar;
                    List<f> list2 = list;
                    if (z2 && !list2.contains(fVar2)) {
                        list2.add(fVar2);
                    }
                    if (aVar == g.a.ON_START && !list2.contains(fVar2)) {
                        list2.add(fVar2);
                    }
                    if (aVar == g.a.ON_STOP) {
                        list2.remove(fVar2);
                    }
                }
            };
            fVar.i.addObserver(jVar);
            return new com.amazon.aps.iva.h8.g(fVar, jVar);
        }
    }

    /* compiled from: DialogHost.kt */
    /* loaded from: classes.dex */
    public static final class e extends l implements p<i, Integer, q> {
        public final /* synthetic */ List<f> h;
        public final /* synthetic */ Collection<f> i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<f> list, Collection<f> collection, int i) {
            super(2);
            this.h = list;
            this.i = collection;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            a.b(this.h, this.i, iVar, I);
            return q.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r5 == com.amazon.aps.iva.o0.i.a.a) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.navigation.compose.d r9, com.amazon.aps.iva.o0.i r10, int r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.a.a(androidx.navigation.compose.d, com.amazon.aps.iva.o0.i, int):void");
    }

    public static final void b(List<f> list, Collection<f> collection, i iVar, int i) {
        com.amazon.aps.iva.o0.j g = iVar.g(1537894851);
        e0.b bVar = e0.a;
        boolean booleanValue = ((Boolean) g.i(u1.a)).booleanValue();
        for (f fVar : collection) {
            x0.a(fVar.i, new d(fVar, list, booleanValue), g);
        }
        e0.b bVar2 = e0.a;
        j2 X = g.X();
        if (X != null) {
            X.d = new e(list, collection, i);
        }
    }
}
