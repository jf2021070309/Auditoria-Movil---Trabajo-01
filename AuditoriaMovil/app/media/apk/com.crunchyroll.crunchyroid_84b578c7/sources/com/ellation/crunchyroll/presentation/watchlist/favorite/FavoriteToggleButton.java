package com.ellation.crunchyroll.presentation.watchlist.favorite;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.b50.n;
import com.amazon.aps.iva.b50.w;
import com.amazon.aps.iva.b50.x;
import com.amazon.aps.iva.d50.c;
import com.amazon.aps.iva.d50.d;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ne.a;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.u70.i;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: FavoriteToggleButton.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/favorite/FavoriteToggleButton;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/d50/d;", "", "selected", "Lcom/amazon/aps/iva/kb0/q;", "setContentDescription", "setSelected", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FavoriteToggleButton extends g implements d {
    public static final /* synthetic */ int c = 0;
    public final c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        j.f(context, "context");
        View.inflate(context, R.layout.layout_favorite_toggle_button, this);
        setOnClickListener(new a(this, 21));
        x xVar = w.b;
        if (xVar == null) {
            xVar = new x();
            w.b = xVar;
        }
        com.amazon.aps.iva.h50.a aVar = (com.amazon.aps.iva.h50.a) xVar.f.getValue();
        x xVar2 = w.b;
        if (xVar2 == null) {
            xVar2 = new x();
            w.b = xVar2;
        }
        n nVar = (n) xVar2.e.getValue();
        j.f(aVar, "etpWatchlistInteractor");
        j.f(nVar, "watchlistInteractor");
        this.b = new c(this, aVar, nVar);
    }

    private final void setContentDescription(boolean z) {
        int i;
        Context context = getContext();
        if (z) {
            i = R.string.watchlist_unmark_favorite_content_description;
        } else {
            i = R.string.watchlist_mark_favorite_content_description;
        }
        setContentDescription(context.getString(i));
    }

    @Override // android.view.View, com.amazon.aps.iva.d50.d
    public void setSelected(boolean z) {
        super.setSelected(z);
        setContentDescription(z);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(this.b);
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(i iVar) {
        j.f(iVar, "message");
        int i = h.a;
        Activity a = q.a(getContext());
        j.c(a);
        View findViewById = a.findViewById(R.id.errors_layout);
        j.e(findViewById, "context.asActivity()!!.f…wById(R.id.errors_layout)");
        h.a.a((ViewGroup) findViewById, iVar);
    }
}
