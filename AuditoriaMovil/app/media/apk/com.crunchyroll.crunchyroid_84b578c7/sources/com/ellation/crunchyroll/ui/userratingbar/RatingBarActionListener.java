package com.ellation.crunchyroll.ui.userratingbar;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import kotlin.Metadata;
/* compiled from: RatingBarActionListener.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H&¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/ui/userratingbar/RatingBarActionListener;", "", "Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingStarNumber;", "rating", "Lcom/amazon/aps/iva/kb0/q;", "onUserRatingClick", "onRatingCancelled", "Lkotlin/Function0;", "onTouchAttempt", "onRatingTouchIntercept", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface RatingBarActionListener {
    void onRatingCancelled();

    void onRatingTouchIntercept(a<q> aVar);

    void onUserRatingClick(UserRatingStarNumber userRatingStarNumber);
}
