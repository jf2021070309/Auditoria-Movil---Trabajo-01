package com.amazon.aps.iva.e00;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.c8.f;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.fg.g;
import com.amazon.aps.iva.hg.c;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.u00.i;
import com.amazon.aps.iva.u00.o;
import com.amazon.aps.iva.u00.p;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.presentation.download.bulk.button.BulkDownloadButton;
/* compiled from: AssetsToolsLayout.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class b extends ConstraintLayout {
    public static final /* synthetic */ l<Object>[] e = {q.a(b.class, "sortButton", "getSortButton()Landroid/widget/ImageView;", 0), q.a(b.class, "bulkDownloadButton", "getBulkDownloadButton()Lcom/ellation/crunchyroll/presentation/download/bulk/button/BulkDownloadButton;", 0)};
    public final c b;
    public final v c;
    public final v d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, final g gVar, com.amazon.aps.iva.d00.a aVar) {
        super(context);
        j.f(gVar, "videoDownloadModule");
        j.f(aVar, "assetsToolsListener");
        this.b = aVar;
        this.c = com.amazon.aps.iva.xw.g.c(R.id.sort_and_filters_header_sort_button, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.bulk_download_button, this);
        View.inflate(context, R.layout.layout_assets_tools, this);
        final BulkDownloadButton bulkDownloadButton = getBulkDownloadButton();
        bulkDownloadButton.getClass();
        final i c = ((com.amazon.aps.iva.p00.j) gVar).c();
        bulkDownloadButton.setOnClickListener(new View.OnClickListener() { // from class: com.amazon.aps.iva.w00.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BulkDownloadButton.G(g.this, c, bulkDownloadButton);
            }
        });
        getSortButton().setOnClickListener(new f(this, 14));
    }

    public static void G(b bVar) {
        j.f(bVar, "this$0");
        bVar.b.X0(bVar.getSortButton());
    }

    private final BulkDownloadButton getBulkDownloadButton() {
        return (BulkDownloadButton) this.d.getValue(this, e[1]);
    }

    private final ImageView getSortButton() {
        return (ImageView) this.c.getValue(this, e[0]);
    }

    public final void b1(com.amazon.aps.iva.f00.b bVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        p pVar;
        com.amazon.aps.iva.w00.b bVar2 = getBulkDownloadButton().e;
        com.amazon.aps.iva.hg.c cVar = bVar.b;
        if (cVar != null) {
            bVar2.getClass();
            if (cVar instanceof c.h) {
                z = true;
            } else {
                z = cVar instanceof c.d;
            }
            if (z) {
                z2 = true;
            } else {
                z2 = cVar instanceof c.C0339c;
            }
            if (z2) {
                pVar = new p(o.d.c, DownloadButtonState.NotStarted.c, true);
            } else if (cVar instanceof c.j) {
                pVar = new p(o.f.c, new DownloadButtonState.Inactive(""), false);
            } else if (cVar instanceof c.i) {
                pVar = new p(o.e.c, new DownloadButtonState.Inactive(""), false);
            } else if (cVar instanceof c.e) {
                pVar = new p(o.b.c, new DownloadButtonState.Waiting("", Integer.valueOf(((c.e) cVar).a)), true);
            } else if (cVar instanceof c.b) {
                pVar = new p(o.a.c, new DownloadButtonState.Finished(""), true);
            } else {
                if (cVar instanceof c.f) {
                    z3 = true;
                } else {
                    z3 = cVar instanceof c.g;
                }
                if (z3) {
                    z4 = true;
                } else {
                    z4 = cVar instanceof c.a;
                }
                if (z4) {
                    pVar = new p(o.c.c, new DownloadButtonState.Manage(), true);
                } else {
                    throw new h();
                }
            }
            bVar2.getView().setButtonState(pVar.b);
            bVar2.getView().setBulkEnabled(pVar.c);
            o oVar = pVar.a;
            bVar2.getView().setStatusTextColor(oVar.a);
            Integer num = oVar.b;
            if (num != null) {
                bVar2.getView().setStatusText(num.intValue());
                bVar2.getView().a5();
            } else {
                bVar2.getView().V9();
            }
        }
        if (cVar == null) {
            bVar2.getView().yg();
        } else {
            bVar2.getView().J2();
        }
    }
}
