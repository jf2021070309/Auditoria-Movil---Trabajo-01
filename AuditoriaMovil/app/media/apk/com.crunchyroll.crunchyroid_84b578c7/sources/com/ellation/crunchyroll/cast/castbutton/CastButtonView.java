package com.ellation.crunchyroll.cast.castbutton;

import android.app.Activity;
import android.view.MenuItem;
import com.amazon.aps.iva.wy.h;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.IntroductoryOverlayFactory;
import kotlin.Metadata;
/* compiled from: CastButtonView.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&R\u0014\u0010\u0006\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/cast/castbutton/CastButtonView;", "Lcom/amazon/aps/iva/wy/h;", "Lcom/amazon/aps/iva/kb0/q;", "showCastOverlay", "hideCastOverlay", "", "isCastButtonVisible", "()Z", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastButtonView extends h {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastButtonView.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/cast/castbutton/CastButtonView$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/cast/castbutton/CastButtonView;", "activity", "Landroid/app/Activity;", "castButton", "Landroid/view/MenuItem;", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CastButtonView create(Activity activity, MenuItem menuItem) {
            j.f(activity, "activity");
            j.f(menuItem, "castButton");
            return new CastButton(menuItem, new IntroductoryOverlayFactory(activity, menuItem));
        }
    }

    void hideCastOverlay();

    boolean isCastButtonVisible();

    void showCastOverlay();
}
