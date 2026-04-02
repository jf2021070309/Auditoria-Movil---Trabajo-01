package com.crunchyroll.watchscreen.screen.assets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.c8.k;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.h60.b;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.so.c;
import com.amazon.aps.iva.so.h;
import com.amazon.aps.iva.to.a;
import com.amazon.aps.iva.wo.f;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.watchscreen.screen.assets.allassetsbutton.AllAssetsButton;
import java.util.List;
import kotlin.Metadata;
/* compiled from: WatchScreenAssetsLayout.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/crunchyroll/watchscreen/screen/assets/WatchScreenAssetsLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/so/h;", "watch-screen_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class WatchScreenAssetsLayout extends g implements h {
    public static final /* synthetic */ int d = 0;
    public final b b;
    public c c;

    /* compiled from: WatchScreenAssetsLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            c cVar = WatchScreenAssetsLayout.this.c;
            if (cVar != null) {
                cVar.a.b.x4();
                return q.a;
            }
            j.m("module");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WatchScreenAssetsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.so.h
    public final void B6(t tVar) {
        j.f(tVar, "resourceType");
        b bVar = this.b;
        AllAssetsButton allAssetsButton = bVar.b;
        allAssetsButton.getClass();
        com.amazon.aps.iva.to.a aVar = allAssetsButton.b;
        aVar.getClass();
        int i = a.C0745a.a[tVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                aVar.getView().F5();
            } else {
                throw new IllegalArgumentException("Unsupported type " + tVar);
            }
        } else {
            aVar.getView().t9();
        }
        bVar.b.setOnClickListener(new k(this, 6));
    }

    @Override // com.amazon.aps.iva.so.h
    public final void Ec() {
        AllAssetsButton allAssetsButton = this.b.b;
        j.e(allAssetsButton, "binding.allAssetsButton");
        allAssetsButton.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.so.h
    public final void Od() {
        AllAssetsButton allAssetsButton = this.b.b;
        j.e(allAssetsButton, "binding.allAssetsButton");
        allAssetsButton.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.so.h
    public final void R(List<? extends com.amazon.aps.iva.wo.g> list) {
        j.f(list, "assets");
        c cVar = this.c;
        if (cVar != null) {
            ((f) cVar.b.getValue()).e(list);
        } else {
            j.m("module");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.so.h
    public final void c() {
        b bVar = this.b;
        FrameLayout frameLayout = bVar.d;
        j.e(frameLayout, "binding.errorLayout");
        frameLayout.setVisibility(0);
        FrameLayout frameLayout2 = bVar.d;
        j.e(frameLayout2, "binding.errorLayout");
        com.amazon.aps.iva.k60.a.d(frameLayout2, new a(), null, 0, 0, 0L, 0L, 254);
    }

    @Override // com.amazon.aps.iva.so.h
    public final void m() {
        FrameLayout frameLayout = this.b.d;
        j.e(frameLayout, "binding.errorLayout");
        frameLayout.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchScreenAssetsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_watch_screen_assets, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.all_assets_button;
        AllAssetsButton allAssetsButton = (AllAssetsButton) z.u(R.id.all_assets_button, inflate);
        if (allAssetsButton != null) {
            i2 = R.id.assets_recycler;
            RecyclerView recyclerView = (RecyclerView) z.u(R.id.assets_recycler, inflate);
            if (recyclerView != null) {
                i2 = R.id.error_layout;
                FrameLayout frameLayout = (FrameLayout) z.u(R.id.error_layout, inflate);
                if (frameLayout != null) {
                    this.b = new b((RelativeLayout) inflate, allAssetsButton, recyclerView, frameLayout);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
