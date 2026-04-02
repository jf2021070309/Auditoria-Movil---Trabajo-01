package com.ellation.crunchyroll.ui.userratingbar;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRatingBarPresenterDelegate.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002JD\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenterDelegateImpl;", "Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenterDelegate;", "", "xCoordinate", "viewWidth", "offset", "", "isActionWithinHorizontalBounds", "yCoordinate", "viewHeight", "isActionWithinVerticalBounds", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/kb0/q;", "actionInBounds", "actionOutOfBounds", "checkViewBoundsAndPerformAction", "isRtl", "Z", "<init>", "(Z)V", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UserRatingBarPresenterDelegateImpl implements UserRatingBarPresenterDelegate {
    private final boolean isRtl;

    public UserRatingBarPresenterDelegateImpl(boolean z) {
        this.isRtl = z;
    }

    private final boolean isActionWithinHorizontalBounds(float f, float f2, float f3) {
        if (this.isRtl) {
            if (f < f2 + f3) {
                return true;
            }
        } else if (f > (-f3)) {
            return true;
        }
        return false;
    }

    private final boolean isActionWithinVerticalBounds(float f, float f2, float f3) {
        if (f > (-f3) && f < f2 + f3) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarPresenterDelegate
    public void checkViewBoundsAndPerformAction(float f, float f2, float f3, float f4, a<q> aVar, a<q> aVar2) {
        j.f(aVar, "actionInBounds");
        j.f(aVar2, "actionOutOfBounds");
        if (isActionWithinHorizontalBounds(f, f2, f4) && isActionWithinVerticalBounds(f3, f4, f4)) {
            aVar.invoke();
        } else {
            aVar2.invoke();
        }
    }
}
