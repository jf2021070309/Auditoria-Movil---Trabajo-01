package com.amazon.aps.iva.to;

import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.x50.t;
/* compiled from: AllAssetsButtonPresenterImpl.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.b<b> {

    /* compiled from: AllAssetsButtonPresenterImpl.kt */
    /* renamed from: com.amazon.aps.iva.to.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0745a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.SERIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.MOVIE_LISTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(bVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
    }
}
