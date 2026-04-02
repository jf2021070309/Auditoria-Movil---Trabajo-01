package com.amazon.aps.iva.yt;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.jm.y;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.oe0.r;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CommentsInputPresenter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.wy.b<i> implements c {
    public final com.amazon.aps.iva.pm.d b;
    public final y c;
    public com.amazon.aps.iva.yt.a d;

    /* compiled from: CommentsInputPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ l a;

        public a(d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, com.amazon.aps.iva.pm.d dVar, com.amazon.aps.iva.pm.b bVar) {
        super(iVar, new com.amazon.aps.iva.wy.j[0]);
        j.f(iVar, "view");
        this.b = dVar;
        this.c = bVar;
    }

    @Override // com.amazon.aps.iva.yt.c
    public final void v1(boolean z, com.amazon.aps.iva.d70.d dVar) {
        String str;
        String str2;
        String str3;
        j.f(dVar, "textChangeData");
        if (z && !getView().p7()) {
            getView().l7();
        } else {
            getView().Oh();
        }
        com.amazon.aps.iva.yt.a aVar = this.d;
        Integer num = null;
        if (aVar != null) {
            com.amazon.aps.iva.su.a a2 = aVar.a();
            if (a2 != null && (str3 = a2.c) != null) {
                str = q.O0(str3).toString();
            } else {
                str = null;
            }
            boolean z2 = false;
            if (str != null) {
                int length = str.length() - 1;
                if (length < 0) {
                    length = 0;
                }
                str2 = r.Q0(length, str);
            } else {
                str2 = null;
            }
            boolean a3 = j.a(dVar.d, str2);
            if (str != null) {
                num = Integer.valueOf(str.length() - 1);
            }
            boolean a4 = j.a(dVar.c, num);
            if (dVar.a > dVar.b) {
                z2 = true;
            }
            if (a3 && a4 && z2) {
                getView().xe();
                return;
            }
            return;
        }
        j.m("commentsInputUiModel");
        throw null;
    }
}
