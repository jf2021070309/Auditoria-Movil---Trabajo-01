package com.amazon.aps.iva.wo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import java.util.List;
/* compiled from: WatchScreenAssetsAdapter.kt */
/* loaded from: classes2.dex */
public final class f extends v<g, RecyclerView.f0> {
    public final com.amazon.aps.iva.ff.a b;
    public final com.amazon.aps.iva.fg.a c;
    public final com.amazon.aps.iva.fg.g d;
    public final com.amazon.aps.iva.kz.a e;

    /* compiled from: WatchScreenAssetsAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<ViewGroup, com.amazon.aps.iva.gf.a> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.gf.a invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            com.amazon.aps.iva.yb0.j.f(viewGroup2, "it");
            return f.this.b.f(viewGroup2);
        }
    }

    /* compiled from: WatchScreenAssetsAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<ViewGroup, com.amazon.aps.iva.rg.a> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.rg.a invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            com.amazon.aps.iva.yb0.j.f(viewGroup2, "it");
            return f.this.c.j(viewGroup2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.amazon.aps.iva.ff.a aVar, com.amazon.aps.iva.fg.a aVar2, com.amazon.aps.iva.fg.g gVar, com.amazon.aps.iva.so.g gVar2) {
        super(h.a);
        com.amazon.aps.iva.yb0.j.f(aVar, "commentingFeature");
        com.amazon.aps.iva.yb0.j.f(aVar2, "downloadingFeature");
        com.amazon.aps.iva.yb0.j.f(gVar, "videoDownloadModule");
        com.amazon.aps.iva.yb0.j.f(gVar2, "assetCardInteractionListener");
        this.b = aVar;
        this.c = aVar2;
        this.d = gVar;
        this.e = gVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        g d = d(i);
        if (d instanceof j) {
            return 1012;
        }
        if (d instanceof i) {
            return 1013;
        }
        if (d instanceof com.amazon.aps.iva.wo.a) {
            return 1014;
        }
        throw new IllegalArgumentException("Unsupported type ".concat(d.getClass().getSimpleName()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        if (f0Var instanceof e) {
            e eVar = (e) f0Var;
            g d = d(i);
            com.amazon.aps.iva.yb0.j.d(d, "null cannot be cast to non-null type com.crunchyroll.watchscreen.screen.assets.list.WatchScreenAssetAdapterModel");
            com.amazon.aps.iva.wo.a aVar = (com.amazon.aps.iva.wo.a) d;
            com.amazon.aps.iva.kz.f<com.amazon.aps.iva.gf.a, com.amazon.aps.iva.rg.a> fVar = eVar.b;
            com.amazon.aps.iva.kz.a aVar2 = eVar.d;
            com.amazon.aps.iva.kz.i iVar = aVar.c;
            fVar.b1(aVar2, iVar);
            fVar.getLeftUiComponent().bind(iVar.i);
            fVar.getRightUiComponent().G(eVar.c, new d(aVar));
            fVar.getRightUiComponent().setState(aVar.d);
        } else if (f0Var instanceof com.amazon.aps.iva.wo.b) {
            g d2 = d(i);
            com.amazon.aps.iva.yb0.j.d(d2, "null cannot be cast to non-null type com.crunchyroll.watchscreen.screen.assets.list.WatchScreenAssetsHeaderAdapterModel");
            ((TextView) ((com.amazon.aps.iva.wo.b) f0Var).b.b.c).setText(((i) d2).c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        switch (i) {
            case 1012:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_watch_screen_asset_loading, viewGroup, false);
                com.amazon.aps.iva.yb0.j.e(inflate, "from(parent.context)\n   …t_loading, parent, false)");
                return new c(inflate);
            case 1013:
                Context context = viewGroup.getContext();
                com.amazon.aps.iva.yb0.j.e(context, "parent.context");
                return new com.amazon.aps.iva.wo.b(new com.amazon.aps.iva.mz.a(context, null, 0));
            case 1014:
                Context context2 = viewGroup.getContext();
                com.amazon.aps.iva.yb0.j.e(context2, "parent.context");
                return new e(new com.amazon.aps.iva.kz.f(context2, new a(), new b()), this.d, this.e);
            default:
                throw new IllegalArgumentException(i + " not supported!");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i, List<Object> list) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        com.amazon.aps.iva.yb0.j.f(list, "payloads");
        if (!list.isEmpty()) {
            Object obj = list.get(0);
            if (obj instanceof DownloadButtonState) {
                DownloadButtonState downloadButtonState = (DownloadButtonState) obj;
                com.amazon.aps.iva.yb0.j.f(downloadButtonState, "downloadButtonState");
                ((e) f0Var).b.getRightUiComponent().setState(downloadButtonState);
                return;
            }
            return;
        }
        super.onBindViewHolder(f0Var, i, list);
    }
}
