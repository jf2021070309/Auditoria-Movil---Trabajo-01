package com.ellation.crunchyroll.feed;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.lb0.x;
import java.util.List;
/* compiled from: HomeFeedView.kt */
/* loaded from: classes2.dex */
public final class m extends RecyclerView.u {
    public final /* synthetic */ HomeFeedScreenView b;

    public m(HomeFeedScreenView homeFeedScreenView) {
        this.b = homeFeedScreenView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        com.amazon.aps.iva.xx.l lVar;
        List<T> list;
        com.amazon.aps.iva.yb0.j.f(recyclerView, "recyclerView");
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        com.amazon.aps.iva.yb0.j.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition > findLastVisibleItemPosition) {
            return;
        }
        while (true) {
            HomeFeedScreenView homeFeedScreenView = this.b;
            com.amazon.aps.iva.wx.a aVar = homeFeedScreenView.l;
            if (aVar != null && (list = aVar.a.f) != 0) {
                lVar = (com.amazon.aps.iva.xx.l) x.w0(findFirstVisibleItemPosition, list);
            } else {
                lVar = null;
            }
            if (lVar instanceof com.amazon.aps.iva.xx.h) {
                a aVar2 = homeFeedScreenView.i;
                if (aVar2 != null) {
                    com.amazon.aps.iva.xx.h hVar = (com.amazon.aps.iva.xx.h) lVar;
                    HomeFeedPresenterImpl homeFeedPresenterImpl = (HomeFeedPresenterImpl) aVar2.n;
                    homeFeedPresenterImpl.getClass();
                    com.amazon.aps.iva.yb0.j.f(hVar, "homeFeedItem");
                    homeFeedPresenterImpl.c.q(hVar, findFirstVisibleItemPosition);
                } else {
                    com.amazon.aps.iva.yb0.j.m("feedModule");
                    throw null;
                }
            }
            if (findFirstVisibleItemPosition != findLastVisibleItemPosition) {
                findFirstVisibleItemPosition++;
            } else {
                return;
            }
        }
    }
}
