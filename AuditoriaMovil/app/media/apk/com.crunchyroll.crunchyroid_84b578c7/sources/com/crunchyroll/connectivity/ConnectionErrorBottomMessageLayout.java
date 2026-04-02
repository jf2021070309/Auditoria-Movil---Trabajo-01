package com.crunchyroll.connectivity;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import androidx.lifecycle.g;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.x50.r;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.connectivity.d;
import com.crunchyroll.crunchyroid.R;
import com.ellation.widgets.bottommessage.error.ErrorBottomMessageView;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ConnectionErrorBottomMessageLayout.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/crunchyroll/connectivity/ConnectionErrorBottomMessageLayout;", "Lcom/ellation/widgets/bottommessage/error/ErrorBottomMessageView;", "Lcom/amazon/aps/iva/mf/d;", "Lcom/amazon/aps/iva/mf/b;", "g", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/mf/b;", "presenter", "connectivity_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ConnectionErrorBottomMessageLayout extends ErrorBottomMessageView implements com.amazon.aps.iva.mf.d {
    public final m g;

    /* compiled from: ConnectionErrorBottomMessageLayout.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.mf.b> {
        public final /* synthetic */ Context i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.i = context;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.mf.b invoke() {
            ConnectionErrorBottomMessageLayout connectionErrorBottomMessageLayout = ConnectionErrorBottomMessageLayout.this;
            g lifecycle = connectionErrorBottomMessageLayout.getLifecycle();
            Context context = this.i;
            d a = d.a.a(context, lifecycle);
            j.f(context, "context");
            if (q.a.a == null) {
                q.a.a = new r(context);
            }
            r rVar = q.a.a;
            j.c(rVar);
            return new com.amazon.aps.iva.mf.c(connectionErrorBottomMessageLayout, a, rVar, new Handler(context.getMainLooper()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionErrorBottomMessageLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final com.amazon.aps.iva.mf.b getPresenter() {
        return (com.amazon.aps.iva.mf.b) this.g.getValue();
    }

    @Override // com.amazon.aps.iva.mf.d
    public final void A2() {
        String string = getContext().getString(R.string.no_network);
        j.e(string, "context.getString(R.string.no_network)");
        String string2 = getContext().getString(R.string.desc_no_network_message_visible);
        j.e(string2, "context.getString(R.stri…_network_message_visible)");
        X7(string, string2);
    }

    @Override // com.amazon.aps.iva.mf.d
    public final void f9() {
        String string = getContext().getString(R.string.no_network);
        j.e(string, "context.getString(R.string.no_network)");
        String string2 = getContext().getString(R.string.desc_no_network_message_visible);
        j.e(string2, "context.getString(R.stri…_network_message_visible)");
        H6(string, string2);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(getPresenter());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionErrorBottomMessageLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.g = f.b(new a(context));
    }
}
