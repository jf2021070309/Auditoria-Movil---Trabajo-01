package com.ellation.crunchyroll.cast;

import android.app.Activity;
import android.view.MenuItem;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.framework.IntroductoryOverlay;
import kotlin.Metadata;
/* compiled from: IntroductoryOverlayFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ellation/crunchyroll/cast/IntroductoryOverlayFactory;", "", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/kb0/q;", "onDismiss", "Lcom/google/android/gms/cast/framework/IntroductoryOverlay;", "create", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Landroid/view/MenuItem;", "castButton", "Landroid/view/MenuItem;", "<init>", "(Landroid/app/Activity;Landroid/view/MenuItem;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class IntroductoryOverlayFactory {
    private final Activity activity;
    private final MenuItem castButton;

    public IntroductoryOverlayFactory(Activity activity, MenuItem menuItem) {
        j.f(activity, "activity");
        j.f(menuItem, "castButton");
        this.activity = activity;
        this.castButton = menuItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$0(com.amazon.aps.iva.xb0.a aVar) {
        j.f(aVar, "$tmp0");
        aVar.invoke();
    }

    public final IntroductoryOverlay create(com.amazon.aps.iva.xb0.a<q> aVar) {
        j.f(aVar, "onDismiss");
        IntroductoryOverlay build = new IntroductoryOverlay.Builder(this.activity, this.castButton).setTitleText(R.string.tooltip_cast_button).setSingleTime().setOverlayColor(com.crunchyroll.crunchyroid.R.color.cr_teal).setOnOverlayDismissedListener(new com.amazon.aps.iva.g1.q(aVar, 8)).build();
        j.e(build, "Builder(activity, castBu…iss)\n            .build()");
        return build;
    }
}
