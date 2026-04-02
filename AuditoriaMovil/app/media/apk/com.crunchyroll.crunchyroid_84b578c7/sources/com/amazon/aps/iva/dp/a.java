package com.amazon.aps.iva.dp;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.xw.w0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.watchscreen.screen.summary.WatchScreenSummaryLayout;
/* compiled from: WatchRatingLayoutVisibilityListener.kt */
/* loaded from: classes2.dex */
public final class a implements h {
    public final View a;
    public final ConstraintLayout b;

    /* compiled from: WatchRatingLayoutVisibilityListener.kt */
    /* renamed from: com.amazon.aps.iva.dp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0202a extends l implements com.amazon.aps.iva.xb0.l<androidx.constraintlayout.widget.c, q> {
        public C0202a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(androidx.constraintlayout.widget.c cVar) {
            androidx.constraintlayout.widget.c cVar2 = cVar;
            j.f(cVar2, "$this$modifyConstraints");
            a aVar = a.this;
            cVar2.h(R.id.asset_title, 7, R.id.download_button_container, 6, aVar.a.getResources().getDimensionPixelOffset(R.dimen.watch_screen_summary_asset_title_margin_end));
            ConstraintLayout constraintLayout = aVar.b;
            j.e(constraintLayout, "summaryToolsContainer");
            cVar2.h(R.id.download_button_container, 3, R.id.tools_container, 3, t0.a(R.dimen.watch_screen_summary_download_button_margin_top, constraintLayout));
            return q.a;
        }
    }

    /* compiled from: WatchRatingLayoutVisibilityListener.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<androidx.constraintlayout.widget.c, q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(androidx.constraintlayout.widget.c cVar) {
            androidx.constraintlayout.widget.c cVar2 = cVar;
            j.f(cVar2, "$this$modifyConstraints");
            cVar2.h(R.id.asset_title, 7, R.id.tools_container, 7, 0);
            cVar2.h(R.id.download_button_container, 3, R.id.watch_screen_content_rating, 3, 0);
            cVar2.h(R.id.download_button_container, 4, R.id.watch_screen_content_rating, 4, 0);
            return q.a;
        }
    }

    public a(WatchScreenSummaryLayout watchScreenSummaryLayout) {
        j.f(watchScreenSummaryLayout, "view");
        this.a = watchScreenSummaryLayout;
        this.b = (ConstraintLayout) watchScreenSummaryLayout.findViewById(R.id.tools_container);
    }

    @Override // defpackage.h
    public final void a() {
        ConstraintLayout constraintLayout = this.b;
        j.e(constraintLayout, "summaryToolsContainer");
        w0.b(constraintLayout, b.h);
    }

    @Override // defpackage.h
    public final void b() {
        ConstraintLayout constraintLayout = this.b;
        j.e(constraintLayout, "summaryToolsContainer");
        w0.b(constraintLayout, new C0202a());
    }
}
