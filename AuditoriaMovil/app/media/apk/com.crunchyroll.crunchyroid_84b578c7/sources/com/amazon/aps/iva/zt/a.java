package com.amazon.aps.iva.zt;

import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.du.y;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CommentDiffCallback.kt */
/* loaded from: classes2.dex */
public final class a extends n.e<x> {
    public static final a a = new a();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(x xVar, x xVar2) {
        x xVar3 = xVar;
        x xVar4 = xVar2;
        j.f(xVar3, "oldItem");
        j.f(xVar4, "newItem");
        return j.a(xVar3, xVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(x xVar, x xVar2) {
        x xVar3 = xVar;
        x xVar4 = xVar2;
        j.f(xVar3, "oldItem");
        j.f(xVar4, "newItem");
        return j.a(xVar3.b, xVar4.b);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final Object getChangePayload(x xVar, x xVar2) {
        x xVar3 = xVar;
        x xVar4 = xVar2;
        j.f(xVar3, "oldItem");
        j.f(xVar4, "newItem");
        if (xVar3.h != xVar4.h) {
            return y.LIKE_BUTTON_CHANGE;
        }
        if (xVar3.g != xVar4.g) {
            return y.LIKES_COUNT_CHANGE;
        }
        if (xVar3.k != xVar4.k) {
            return y.REPLIES_COUNT_CHANGE;
        }
        if (xVar3.m == xVar4.m && xVar3.n == xVar4.n) {
            if (xVar3.l != xVar4.l) {
                return y.SPOILER_STATE_CHANGE;
            }
            if (xVar3.r != xVar4.r) {
                return y.SPOILER_OVERLAY_VISIBILITY_CHANGE;
            }
            if (xVar3.s != xVar4.s) {
                return y.TEXT_STATE_CHANGE;
            }
            return null;
        }
        return y.CONTEXT_MENU_CHANGE;
    }
}
