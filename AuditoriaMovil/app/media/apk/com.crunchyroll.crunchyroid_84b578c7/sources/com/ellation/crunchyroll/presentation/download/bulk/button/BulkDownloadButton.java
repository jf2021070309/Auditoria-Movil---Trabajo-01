package com.ellation.crunchyroll.presentation.download.bulk.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.sv.e;
import com.amazon.aps.iva.w00.b;
import com.amazon.aps.iva.w00.c;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.mvp.lifecycle.a;
import com.ellation.crunchyroll.presentation.download.button.DownloadButton;
import kotlin.Metadata;
/* compiled from: BulkDownloadButton.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\nH\u0016R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/ellation/crunchyroll/presentation/download/bulk/button/BulkDownloadButton;", "Landroid/widget/LinearLayout;", "Lcom/amazon/aps/iva/w00/c;", "Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState;", "state", "Lcom/amazon/aps/iva/kb0/q;", "setButtonState", "", "enabled", "setBulkEnabled", "", "text", "setStatusText", "color", "setStatusTextColor", "Landroid/widget/TextView;", "b", "Lcom/amazon/aps/iva/bc0/b;", "getStatusTextView", "()Landroid/widget/TextView;", "statusTextView", "Lcom/ellation/crunchyroll/presentation/download/button/DownloadButton;", "c", "getDownloadButton", "()Lcom/ellation/crunchyroll/presentation/download/button/DownloadButton;", "downloadButton", "Landroid/view/View;", "d", "getBulkSyncButton", "()Landroid/view/View;", "bulkSyncButton", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BulkDownloadButton extends LinearLayout implements c {
    public static final /* synthetic */ l<Object>[] f = {q.a(BulkDownloadButton.class, "statusTextView", "getStatusTextView()Landroid/widget/TextView;", 0), q.a(BulkDownloadButton.class, "downloadButton", "getDownloadButton()Lcom/ellation/crunchyroll/presentation/download/button/DownloadButton;", 0), q.a(BulkDownloadButton.class, "bulkSyncButton", "getBulkSyncButton()Landroid/view/View;", 0)};
    public final v b;
    public final v c;
    public final v d;
    public final b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkDownloadButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        this.b = g.c(R.id.status_text, this);
        this.c = g.c(R.id.download_button, this);
        this.d = g.c(R.id.bulk_sync_button, this);
        com.amazon.aps.iva.zv.b bVar = e.e;
        if (bVar != null) {
            com.amazon.aps.iva.u00.q p = bVar.p();
            j.f(p, "bulkSyncConfig");
            b bVar2 = new b(this, p);
            this.e = bVar2;
            View.inflate(context, R.layout.layout_bulk_sync_button_with_status, this);
            a.b(bVar2, this);
            return;
        }
        j.m("dependencies");
        throw null;
    }

    public static void G(com.amazon.aps.iva.fg.g gVar, com.amazon.aps.iva.u00.c cVar, BulkDownloadButton bulkDownloadButton) {
        j.f(gVar, "$videoDownloadModule");
        j.f(cVar, "$actionsPresenter");
        j.f(bulkDownloadButton, "this$0");
        com.amazon.aps.iva.hg.e invoke = gVar.a().invoke();
        if (invoke != null) {
            cVar.Q2(invoke, bulkDownloadButton.getDownloadButton());
        }
    }

    private final View getBulkSyncButton() {
        return (View) this.d.getValue(this, f[2]);
    }

    private final DownloadButton getDownloadButton() {
        return (DownloadButton) this.c.getValue(this, f[1]);
    }

    private final TextView getStatusTextView() {
        return (TextView) this.b.getValue(this, f[0]);
    }

    @Override // com.amazon.aps.iva.w00.c
    public final void Bg() {
        getBulkSyncButton().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.w00.c
    public final void J2() {
        setVisibility(0);
    }

    @Override // com.amazon.aps.iva.w00.c
    public final void V9() {
        getStatusTextView().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.w00.c
    public final void a5() {
        getStatusTextView().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.w00.c
    public final void md() {
        getBulkSyncButton().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.w00.c
    public void setBulkEnabled(boolean z) {
        setEnabled(z);
    }

    @Override // com.amazon.aps.iva.w00.c
    public void setButtonState(DownloadButtonState downloadButtonState) {
        j.f(downloadButtonState, "state");
        getDownloadButton().setState(downloadButtonState);
    }

    @Override // com.amazon.aps.iva.w00.c
    public void setStatusText(int i) {
        getStatusTextView().setText(getContext().getString(i));
    }

    @Override // com.amazon.aps.iva.w00.c
    public void setStatusTextColor(int i) {
        getStatusTextView().setTextColor(com.amazon.aps.iva.d3.a.getColor(getContext(), i));
    }

    @Override // com.amazon.aps.iva.w00.c
    public final void yg() {
        setVisibility(8);
    }
}
