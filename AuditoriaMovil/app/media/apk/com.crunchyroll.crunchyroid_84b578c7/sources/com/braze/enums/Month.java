package com.braze.enums;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.l;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/braze/enums/Month;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "Companion", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum Month {
    JANUARY(0),
    FEBRUARY(1),
    MARCH(2),
    APRIL(3),
    MAY(4),
    JUNE(5),
    JULY(6),
    AUGUST(7),
    SEPTEMBER(8),
    OCTOBER(9),
    NOVEMBER(10),
    DECEMBER(11);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/braze/enums/Month$Companion;", "", "()V", "getMonth", "Lcom/braze/enums/Month;", "value", "", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {

        /* loaded from: classes.dex */
        public static final class a extends l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(0);
                this.b = i;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return e.f(new StringBuilder("No month with value "), this.b, ", value must be in (0,11)");
            }
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final Month getMonth(int i) {
            Month month;
            boolean z;
            Month[] values = Month.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    month = values[i2];
                    if (month.getValue() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                } else {
                    month = null;
                    break;
                }
            }
            if (month == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a(i), 2, (Object) null);
                return null;
            }
            return month;
        }

        private Companion() {
        }
    }

    Month(int i) {
        this.value = i;
    }

    public static final Month getMonth(int i) {
        return Companion.getMonth(i);
    }

    public final int getValue() {
        return this.value;
    }
}
