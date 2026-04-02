package com.ellation.crunchyroll.presentation.showpage.downloading.syncedtoolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.n40.d;
import com.amazon.aps.iva.n40.e;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: SyncedToolbarLayout.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0012\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u0003H\u0016R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/presentation/showpage/downloading/syncedtoolbar/SyncedToolbarLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/n40/e;", "", "syncedToolbarTitle", "Lcom/amazon/aps/iva/kb0/q;", "setSyncedToolbarTitle", "", "syncedVideosCountText", "setSyncedVideosCount", "syncedVideosSizeText", "setSyncedVideosSize", "toolbarBottomPadding", "setBottomPadding", "Landroid/widget/TextView;", "b", "Lcom/amazon/aps/iva/bc0/b;", "getSyncedToolbarLabel", "()Landroid/widget/TextView;", "syncedToolbarLabel", "c", "getNumberOfSyncedVideos", "numberOfSyncedVideos", "d", "getSyncedContentSize", "syncedContentSize", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SyncedToolbarLayout extends g implements e {
    public static final /* synthetic */ l<Object>[] f = {q.a(SyncedToolbarLayout.class, "syncedToolbarLabel", "getSyncedToolbarLabel()Landroid/widget/TextView;", 0), q.a(SyncedToolbarLayout.class, "numberOfSyncedVideos", "getNumberOfSyncedVideos()Landroid/widget/TextView;", 0), q.a(SyncedToolbarLayout.class, "syncedContentSize", "getSyncedContentSize()Landroid/widget/TextView;", 0)};
    public final v b;
    public final v c;
    public final v d;
    public d e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SyncedToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final TextView getNumberOfSyncedVideos() {
        return (TextView) this.c.getValue(this, f[1]);
    }

    private final TextView getSyncedContentSize() {
        return (TextView) this.d.getValue(this, f[2]);
    }

    private final TextView getSyncedToolbarLabel() {
        return (TextView) this.b.getValue(this, f[0]);
    }

    @Override // com.amazon.aps.iva.n40.e
    public void setBottomPadding(int i) {
        t0.j(this, null, null, null, Integer.valueOf(getResources().getDimensionPixelSize(i)), 7);
    }

    @Override // com.amazon.aps.iva.n40.e
    public void setSyncedToolbarTitle(int i) {
        getSyncedToolbarLabel().setText(i);
    }

    @Override // com.amazon.aps.iva.n40.e
    public void setSyncedVideosCount(String str) {
        j.f(str, "syncedVideosCountText");
        getNumberOfSyncedVideos().setText(str);
    }

    @Override // com.amazon.aps.iva.n40.e
    public void setSyncedVideosSize(String str) {
        j.f(str, "syncedVideosSizeText");
        getSyncedContentSize().setText(str);
    }

    @Override // com.amazon.aps.iva.n40.e
    public final void xb() {
        setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncedToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = com.amazon.aps.iva.xw.g.c(R.id.synced_label, this);
        this.c = com.amazon.aps.iva.xw.g.c(R.id.synced_videos_number, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.synced_videos_size, this);
        View.inflate(context, R.layout.layout_synced_toolbar, this);
    }
}
