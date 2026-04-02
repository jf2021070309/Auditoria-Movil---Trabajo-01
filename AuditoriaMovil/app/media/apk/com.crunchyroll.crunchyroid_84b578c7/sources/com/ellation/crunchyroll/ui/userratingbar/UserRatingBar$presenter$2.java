package com.ellation.crunchyroll.ui.userratingbar;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.x50.m;
import com.amazon.aps.iva.x50.n;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.ui.userratingbar.UserRatingBarPresenter;
import java.util.List;
import kotlin.Metadata;
/* compiled from: UserRatingBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserRatingBar$presenter$2 extends l implements a<UserRatingBarPresenter> {
    final /* synthetic */ Context $context;
    final /* synthetic */ UserRatingBar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRatingBar$presenter$2(UserRatingBar userRatingBar, Context context) {
        super(0);
        this.this$0 = userRatingBar;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final UserRatingBarPresenter invoke() {
        List stars;
        UserRatingBarPresenter.Companion companion = UserRatingBarPresenter.Companion;
        UserRatingBar userRatingBar = this.this$0;
        UserRatingBarPresenterDelegate create = UserRatingBarPresenterDelegate.Companion.create(q.f(this.$context));
        int i = m.a;
        Handler handler = true & true ? new Handler(Looper.getMainLooper()) : null;
        j.f(handler, "handler");
        n nVar = new n(handler);
        stars = this.this$0.getStars();
        return companion.create(userRatingBar, create, nVar, stars.size(), q.f(this.$context));
    }
}
