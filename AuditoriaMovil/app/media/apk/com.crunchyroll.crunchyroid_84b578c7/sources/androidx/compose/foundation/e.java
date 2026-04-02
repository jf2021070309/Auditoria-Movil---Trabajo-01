package androidx.compose.foundation;

import androidx.compose.foundation.a;
import com.amazon.aps.iva.a0.w;
import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.b0.h0;
import com.amazon.aps.iva.c0.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.google.android.gms.cast.MediaError;
import okhttp3.internal.http.StatusLine;
/* compiled from: Clickable.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", l = {299, MediaError.DetailedErrorCode.SEGMENT_NETWORK, StatusLine.HTTP_PERM_REDIRECT, 309, 318}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public boolean h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ h0 k;
    public final /* synthetic */ long l;
    public final /* synthetic */ com.amazon.aps.iva.c0.l m;
    public final /* synthetic */ a.C0010a n;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<Boolean> o;

    /* compiled from: Clickable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", l = {293, 296}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public o h;
        public int i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<Boolean> j;
        public final /* synthetic */ long k;
        public final /* synthetic */ com.amazon.aps.iva.c0.l l;
        public final /* synthetic */ a.C0010a m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.xb0.a<Boolean> aVar, long j, com.amazon.aps.iva.c0.l lVar, a.C0010a c0010a, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = aVar;
            this.k = j;
            this.l = lVar;
            this.m = c0010a;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, this.k, this.l, this.m, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            o oVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        oVar = this.h;
                        x.i0(obj);
                        this.m.b = oVar;
                        return q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
            } else {
                x.i0(obj);
                if (this.j.invoke().booleanValue()) {
                    long j = w.a;
                    this.i = 1;
                    if (t.l(j, this) == aVar) {
                        return aVar;
                    }
                }
            }
            o oVar2 = new o(this.k);
            this.h = oVar2;
            this.i = 2;
            if (this.l.b(oVar2, this) == aVar) {
                return aVar;
            }
            oVar = oVar2;
            this.m.b = oVar;
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h0 h0Var, long j, com.amazon.aps.iva.c0.l lVar, a.C0010a c0010a, com.amazon.aps.iva.xb0.a<Boolean> aVar, com.amazon.aps.iva.ob0.d<? super e> dVar) {
        super(2, dVar);
        this.k = h0Var;
        this.l = j;
        this.m = lVar;
        this.n = c0010a;
        this.o = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        e eVar = new e(this.k, this.l, this.m, this.n, this.o, dVar);
        eVar.j = obj;
        return eVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((e) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9 A[RETURN] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
