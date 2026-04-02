package com.amazon.aps.iva.f00;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.google.android.gms.cast.MediaError;
import java.util.List;
/* compiled from: PlayableAssetsAdapter.kt */
/* loaded from: classes2.dex */
public final class u extends androidx.recyclerview.widget.v<a, RecyclerView.f0> {
    public final com.amazon.aps.iva.d00.a b;
    public final com.amazon.aps.iva.fg.g c;
    public final com.amazon.aps.iva.ls.a d;
    public com.amazon.aps.iva.xb0.l<? super Season, com.amazon.aps.iva.kb0.q> e;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.amazon.aps.iva.d00.a aVar, com.amazon.aps.iva.fg.g gVar, com.amazon.aps.iva.ls.a aVar2) {
        super(d.a);
        com.amazon.aps.iva.yb0.j.f(aVar, "interactionsListener");
        com.amazon.aps.iva.yb0.j.f(aVar2, "segmentAnalyticsScreen");
        this.b = aVar;
        this.c = gVar;
        this.d = aVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        a d = d(i);
        if (d instanceof e) {
            return 100;
        }
        if (d instanceof g) {
            return 101;
        }
        if (d instanceof v) {
            return MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED;
        }
        if (d instanceof y) {
            return 105;
        }
        if (d instanceof b0) {
            return 106;
        }
        if (d instanceof b) {
            return 107;
        }
        return MediaError.DetailedErrorCode.MEDIA_DECODE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i, List<Object> list) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        com.amazon.aps.iva.yb0.j.f(list, "payloads");
        if (!list.isEmpty()) {
            Object obj = list.get(0);
            if ((obj instanceof DownloadButtonState) && (f0Var instanceof t)) {
                ((t) f0Var).b.U2((DownloadButtonState) obj);
                return;
            }
            return;
        }
        super.onBindViewHolder(f0Var, i, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        com.amazon.aps.iva.fg.g gVar = this.c;
        switch (i) {
            case 100:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_show_page_empty_card, viewGroup, false);
                com.amazon.aps.iva.yb0.j.e(inflate, "from(parent.context).inf…lse\n                    )");
                return new f(inflate);
            case 101:
                Context context = viewGroup.getContext();
                com.amazon.aps.iva.yb0.j.e(context, "parent.context");
                return new j(new com.amazon.aps.iva.mz.a(context, null, 0));
            case MediaError.DetailedErrorCode.MEDIA_DECODE /* 102 */:
                Context context2 = viewGroup.getContext();
                com.amazon.aps.iva.yb0.j.e(context2, "parent.context");
                return new t(new p(context2, gVar, this.d));
            case MediaError.DetailedErrorCode.MEDIA_NETWORK /* 103 */:
            default:
                throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("Invalid view type ", i));
            case MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED /* 104 */:
                Context context3 = viewGroup.getContext();
                com.amazon.aps.iva.yb0.j.e(context3, "parent.context");
                return new x(new w(context3, null, 0));
            case 105:
                Context context4 = viewGroup.getContext();
                com.amazon.aps.iva.yb0.j.e(context4, "parent.context");
                return new z(new com.amazon.aps.iva.n00.b(context4, null, 0));
            case 106:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_show_page_sync_more_button, viewGroup, false);
                com.amazon.aps.iva.yb0.j.e(inflate2, "from(parent.context).inf…  false\n                )");
                return new c0(inflate2);
            case 107:
                Context context5 = viewGroup.getContext();
                com.amazon.aps.iva.yb0.j.e(context5, "parent.context");
                return new c(new com.amazon.aps.iva.e00.b(context5, gVar, this.b));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        if (f0Var instanceof t) {
            a d = d(i);
            com.amazon.aps.iva.yb0.j.d(d, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.content.assets.list.item.PlayableAssetUiModel");
            com.amazon.aps.iva.d00.a aVar = this.b;
            ((t) f0Var).b.b1(aVar, (q) d);
        } else if (f0Var instanceof j) {
            a d2 = d(i);
            com.amazon.aps.iva.yb0.j.d(d2, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.content.assets.list.item.HeaderAsset");
            g gVar = (g) d2;
            ((TextView) ((j) f0Var).b.b.c).setText(0);
        } else if (f0Var instanceof x) {
            a d3 = d(i);
            com.amazon.aps.iva.yb0.j.d(d3, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.content.assets.list.item.SeasonHeader");
            w wVar = ((x) f0Var).b;
            wVar.getClass();
            String str = ((v) d3).c;
            com.amazon.aps.iva.yb0.j.f(str, "title");
            wVar.getTitle().setText(str);
        } else if (f0Var instanceof c0) {
            ((c0) f0Var).b.setOnClickListener(new com.amazon.aps.iva.c8.j(this, 12));
        } else if (f0Var instanceof z) {
            z zVar = (z) f0Var;
            a d4 = d(i);
            com.amazon.aps.iva.yb0.j.d(d4, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.content.assets.list.item.SeasonNavigator");
            y yVar = (y) d4;
            com.amazon.aps.iva.xb0.l<? super Season, com.amazon.aps.iva.kb0.q> lVar = this.e;
            if (lVar != null) {
                com.amazon.aps.iva.n00.b bVar = zVar.b;
                bVar.getClass();
                com.amazon.aps.iva.n00.a aVar2 = yVar.b;
                com.amazon.aps.iva.yb0.j.f(aVar2, "seasonNavigatorData");
                bVar.e = lVar;
                com.amazon.aps.iva.n00.c cVar = bVar.b;
                cVar.getClass();
                cVar.getView().h7();
                List<Season> list = aVar2.b;
                Season season = (Season) com.amazon.aps.iva.lb0.x.w0(aVar2.a() - 1, list);
                if (season != null) {
                    cVar.getView().r6(season);
                }
                Season season2 = (Season) com.amazon.aps.iva.lb0.x.w0(aVar2.a() + 1, list);
                if (season2 != null) {
                    cVar.getView().K5(season2);
                    return;
                }
                return;
            }
            com.amazon.aps.iva.yb0.j.m("onNavigateSeasonClick");
            throw null;
        } else if (f0Var instanceof c) {
            a d5 = d(i);
            com.amazon.aps.iva.yb0.j.d(d5, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.content.assets.list.item.AssetsToolsHeader");
            ((c) f0Var).b.b1((b) d5);
        }
    }
}
