package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.f0.i.a;
/* compiled from: LazyLayoutIntervalContent.kt */
/* loaded from: classes.dex */
public abstract class i<Interval extends a> {

    /* compiled from: LazyLayoutIntervalContent.kt */
    /* loaded from: classes.dex */
    public interface a {

        /* compiled from: LazyLayoutIntervalContent.kt */
        /* renamed from: com.amazon.aps.iva.f0.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0237a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
            public static final C0237a h = new C0237a();

            public C0237a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return null;
            }
        }

        default com.amazon.aps.iva.xb0.l<Integer, Object> getKey() {
            return null;
        }

        default com.amazon.aps.iva.xb0.l<Integer, Object> getType() {
            return C0237a.h;
        }
    }
}
