package com.ellation.crunchyroll.ui.userratingbar;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: UserRatingStarNumber.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingStarNumber;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "ONE", "TWO", "THREE", "FOUR", "FIVE", "Companion", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum UserRatingStarNumber {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);
    
    public static final Companion Companion = new Companion(null);
    private final int number;

    /* compiled from: UserRatingStarNumber.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingStarNumber$Companion;", "", "()V", "fromNumber", "Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingStarNumber;", "number", "", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final UserRatingStarNumber fromNumber(int i) {
            UserRatingStarNumber userRatingStarNumber;
            boolean z;
            UserRatingStarNumber[] values = UserRatingStarNumber.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    userRatingStarNumber = values[i2];
                    if (userRatingStarNumber.getNumber() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                } else {
                    userRatingStarNumber = null;
                    break;
                }
            }
            j.c(userRatingStarNumber);
            return userRatingStarNumber;
        }
    }

    UserRatingStarNumber(int i) {
        this.number = i;
    }

    public final int getNumber() {
        return this.number;
    }
}
