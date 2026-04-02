package com.amazon.aps.iva.k60;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.a0.p0;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.s1.f;
import com.amazon.aps.iva.v1.t2;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaError;
/* compiled from: ErrorOverlay.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: ErrorOverlay.kt */
    /* renamed from: com.amazon.aps.iva.k60.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0434a extends l implements p<i, Integer, q> {
        public final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0434a(int i) {
            super(2);
            this.h = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                p0.a(com.amazon.aps.iva.z1.b.a(this.h, iVar2), null, androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.l(f.a.c, 160), 146), null, f.a.d, 0.0f, null, iVar2, 25016, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED);
            }
            return q.a;
        }
    }

    /* compiled from: ErrorOverlay.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "error_overlay");
            return q.a;
        }
    }

    /* compiled from: ErrorOverlay.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.xb0.a<q> aVar) {
            super(1);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.fs.b bVar) {
            j.f(bVar, "it");
            this.h.invoke();
            return q.a;
        }
    }

    /* compiled from: ErrorOverlay.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "unrecoverable_error_overlay_error_code");
            return q.a;
        }
    }

    /* compiled from: ErrorOverlay.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "retry_button");
            return q.a;
        }
    }

    /* compiled from: ErrorOverlay.kt */
    /* loaded from: classes2.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q>[] h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.amazon.aps.iva.xb0.a<q>[] aVarArr) {
            super(1);
            this.h = aVarArr;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.fs.b bVar) {
            j.f(bVar, "it");
            for (com.amazon.aps.iva.xb0.a<q> aVar : this.h) {
                aVar.invoke();
            }
            return q.a;
        }
    }

    /* compiled from: ErrorOverlay.kt */
    /* loaded from: classes2.dex */
    public static final class g extends l implements p<i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ int i;
        public final /* synthetic */ Integer j;
        public final /* synthetic */ int k;
        public final /* synthetic */ long l;
        public final /* synthetic */ long m;
        public final /* synthetic */ Integer n;
        public final /* synthetic */ p<i, Integer, q> o;
        public final /* synthetic */ String p;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> q;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q>[] r;
        public final /* synthetic */ int s;
        public final /* synthetic */ int t;
        public final /* synthetic */ int u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(com.amazon.aps.iva.a1.f fVar, int i, Integer num, int i2, long j, long j2, Integer num2, p<? super i, ? super Integer, q> pVar, String str, com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.xb0.a<q>[] aVarArr, int i3, int i4, int i5) {
            super(2);
            this.h = fVar;
            this.i = i;
            this.j = num;
            this.k = i2;
            this.l = j;
            this.m = j2;
            this.n = num2;
            this.o = pVar;
            this.p = str;
            this.q = aVar;
            this.r = aVarArr;
            this.s = i3;
            this.t = i4;
            this.u = i5;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            a.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, iVar, com.amazon.aps.iva.ff0.b.I(this.s | 1), com.amazon.aps.iva.ff0.b.I(this.t), this.u);
            return q.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x02d7, code lost:
        if (com.amazon.aps.iva.yb0.j.a(r0.e0(), java.lang.Integer.valueOf(r14)) == false) goto L153;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.a1.f r46, int r47, java.lang.Integer r48, int r49, long r50, long r52, java.lang.Integer r54, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r55, java.lang.String r56, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r57, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q>[] r58, com.amazon.aps.iva.o0.i r59, int r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k60.a.a(com.amazon.aps.iva.a1.f, int, java.lang.Integer, int, long, long, java.lang.Integer, com.amazon.aps.iva.xb0.p, java.lang.String, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.xb0.a[], com.amazon.aps.iva.o0.i, int, int, int):void");
    }

    public static final void b(ViewGroup viewGroup) {
        j.f(viewGroup, "<this>");
        viewGroup.removeView(viewGroup.findViewWithTag("OverlayRetryError"));
    }

    public static final void c(Fragment fragment, com.amazon.aps.iva.xb0.a<q> aVar) {
        j.f(fragment, "<this>");
        View view = fragment.getView();
        j.d(view, "null cannot be cast to non-null type android.view.ViewGroup");
        d((ViewGroup) view, aVar, null, 0, 0, 0L, 0L, 254);
    }

    public static void d(ViewGroup viewGroup, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.a aVar2, int i, int i2, long j, long j2, int i3) {
        com.amazon.aps.iva.xb0.a aVar3;
        int i4;
        Integer num;
        int i5;
        long j3;
        long j4;
        Integer num2;
        if ((i3 & 2) != 0) {
            aVar3 = null;
        } else {
            aVar3 = aVar2;
        }
        if ((i3 & 4) != 0) {
            i4 = R.string.error_retry_dang;
        } else {
            i4 = i;
        }
        if ((i3 & 8) != 0) {
            num = Integer.valueOf((int) R.string.error_could_not_connect);
        } else {
            num = null;
        }
        if ((i3 & 16) != 0) {
            i5 = R.string.error_try_again;
        } else {
            i5 = i2;
        }
        if ((i3 & 32) != 0) {
            j3 = com.amazon.aps.iva.ao.a.u;
        } else {
            j3 = j;
        }
        if ((i3 & 64) != 0) {
            j4 = com.amazon.aps.iva.ao.a.u;
        } else {
            j4 = j2;
        }
        if ((i3 & 128) != 0) {
            num2 = Integer.valueOf((int) R.drawable.retry_error_image);
        } else {
            num2 = null;
        }
        j.f(viewGroup, "$this$showRetryError");
        viewGroup.removeView((ComposeView) viewGroup.findViewWithTag("OverlayRetryError"));
        com.amazon.aps.iva.v0.a c2 = com.amazon.aps.iva.v0.b.c(282453909, new com.amazon.aps.iva.k60.d(i4, i5, j3, j4, viewGroup, num, num2, aVar, aVar3), true);
        Context context = viewGroup.getContext();
        j.e(context, "context");
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setViewCompositionStrategy(t2.a.a);
        composeView.setContent(c2);
        composeView.setTag("OverlayRetryError");
        viewGroup.addView(composeView);
    }
}
