package com.crunchyroll.usermigration.progress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.amazon.aps.iva.co.e;
import com.amazon.aps.iva.co.f;
import com.amazon.aps.iva.cx.s;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.go.b;
import com.amazon.aps.iva.go.c;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: WatchDataProgressView.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/crunchyroll/usermigration/progress/WatchDataProgress;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/go/c;", "Lcom/amazon/aps/iva/ls/a;", "b", "Lcom/amazon/aps/iva/ls/a;", "getScreen", "()Lcom/amazon/aps/iva/ls/a;", "setScreen", "(Lcom/amazon/aps/iva/ls/a;)V", "screen", "Lcom/amazon/aps/iva/go/a;", "c", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/go/a;", "presenter", "user-migration_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class WatchDataProgress extends g implements c {
    public com.amazon.aps.iva.ls.a b;
    public final m c;

    /* compiled from: WatchDataProgressView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.go.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.go.a invoke() {
            com.amazon.aps.iva.fo.g gVar = f.a.c;
            if (gVar != null) {
                e eVar = f.a.a;
                if (eVar != null) {
                    s g = eVar.g();
                    com.amazon.aps.iva.fo.c cVar = f.a.d;
                    if (cVar != null) {
                        WatchDataProgress watchDataProgress = WatchDataProgress.this;
                        com.amazon.aps.iva.ls.a screen = watchDataProgress.getScreen();
                        j.f(g, "userAccountMigrationConfig");
                        return new b(watchDataProgress, gVar, g, cVar, screen);
                    }
                    j.m("watchDataNotificationAnalytics");
                    throw null;
                }
                j.m("dependencies");
                throw null;
            }
            j.m("watchDataNotificationMonitor");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WatchDataProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final com.amazon.aps.iva.go.a getPresenter() {
        return (com.amazon.aps.iva.go.a) this.c.getValue();
    }

    @Override // com.amazon.aps.iva.go.c
    public final void f() {
        setVisibility(8);
    }

    public final com.amazon.aps.iva.ls.a getScreen() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.go.c
    public final void k() {
        setVisibility(0);
    }

    public final void setScreen(com.amazon.aps.iva.ls.a aVar) {
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(getPresenter());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchDataProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.c = com.amazon.aps.iva.kb0.f.b(new a());
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_watch_data_progress, (ViewGroup) this, false);
        addView(inflate);
        if (inflate != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            return;
        }
        throw new NullPointerException("rootView");
    }
}
