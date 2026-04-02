package com.ellation.crunchyroll.cast.castbutton;

import android.content.Context;
import android.view.Menu;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: CastButtonMediaRouter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/cast/castbutton/CastButtonMediaRouter;", "", "Lcom/amazon/aps/iva/kb0/q;", "setUpMediaRouteButton", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastButtonMediaRouter {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastButtonMediaRouter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/cast/castbutton/CastButtonMediaRouter$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/cast/castbutton/CastButtonMediaRouter;", "context", "Landroid/content/Context;", "menu", "Landroid/view/Menu;", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CastButtonMediaRouter create(Context context, Menu menu) {
            j.f(context, "context");
            j.f(menu, "menu");
            return new CastButtonMediaRouterImpl(context, menu);
        }
    }

    void setUpMediaRouteButton();
}
