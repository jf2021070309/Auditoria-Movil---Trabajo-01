package com.ellation.crunchyroll.ui.userratingbar;

import com.amazon.aps.iva.wy.h;
import kotlin.Metadata;
/* compiled from: UserRatingBar.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u000f"}, d2 = {"Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarView;", "Lcom/amazon/aps/iva/wy/h;", "", "starId", "Lcom/ellation/crunchyroll/ui/userratingbar/AnimatedRatingStarType;", "starType", "Lcom/amazon/aps/iva/kb0/q;", "showRating", "animateStar", "performHapticFeedback", "setRatedStarContentDescription", "setNotRatedStarContentDescription", "", "disallowIntercept", "requestDisallowInterceptTouchEvent", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface UserRatingBarView extends h {
    void animateStar(int i);

    void performHapticFeedback();

    void requestDisallowInterceptTouchEvent(boolean z);

    void setNotRatedStarContentDescription(int i);

    void setRatedStarContentDescription(int i);

    void showRating(int i, AnimatedRatingStarType animatedRatingStarType);
}
