package com.amazon.aps.iva.a70;

import android.content.Context;
import android.view.MenuItem;
import com.amazon.aps.iva.a70.b;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.ui.R;
import java.util.List;
/* compiled from: PopupActionMenu.kt */
/* loaded from: classes2.dex */
public final class h<T extends com.amazon.aps.iva.a70.b> implements g {
    public final Context b;
    public final List<T> c;
    public final Integer d;
    public final f e;

    /* compiled from: PopupActionMenu.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a70.b, q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<T, q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.xb0.l<? super T, q> lVar) {
            super(1);
            this.h = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.a70.b bVar) {
            com.amazon.aps.iva.a70.b bVar2 = bVar;
            j.f(bVar2, "it");
            this.h.invoke(bVar2);
            return q.a;
        }
    }

    /* compiled from: PopupActionMenu.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<Integer, q> {
        public final /* synthetic */ MenuItem h;
        public final /* synthetic */ Context i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MenuItem menuItem, Context context) {
            super(1);
            this.h = menuItem;
            this.i = context;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Integer num) {
            int intValue = num.intValue();
            MenuItem menuItem = this.h;
            j.e(menuItem, "menuItem");
            menuItem.setTitle(m0.b(com.amazon.aps.iva.d3.a.getColor(this.i, intValue), String.valueOf(menuItem.getTitle()), String.valueOf(menuItem.getTitle())));
            return q.a;
        }
    }

    /* compiled from: PopupActionMenu.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public final /* synthetic */ MenuItem h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MenuItem menuItem) {
            super(1);
            this.h = menuItem;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            this.h.setEnabled(bool.booleanValue());
            return q.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Context context, List<? extends T> list, int i, Integer num, int i2, int i3, com.amazon.aps.iva.xb0.l<? super T, q> lVar) {
        j.f(context, "context");
        this.b = context;
        this.c = list;
        this.d = num;
        this.e = new f(this, list, new a(lVar), i, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.q.t0 G(android.view.View r9) {
        /*
            r8 = this;
            java.lang.String r0 = "anchor"
            com.amazon.aps.iva.yb0.j.f(r9, r0)
            android.content.Context r0 = r8.b
            java.lang.Integer r1 = r8.d
            if (r1 == 0) goto L15
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            int r1 = r1.intValue()
            r2.<init>(r0, r1)
            r0 = r2
        L15:
            com.amazon.aps.iva.q.t0 r1 = new com.amazon.aps.iva.q.t0
            r1.<init>(r0, r9)
            java.util.List<T extends com.amazon.aps.iva.a70.b> r9 = r8.c
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
            r3 = r2
        L24:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L52
            java.lang.Object r4 = r9.next()
            int r5 = r3 + 1
            if (r3 < 0) goto L4d
            com.amazon.aps.iva.a70.b r4 = (com.amazon.aps.iva.a70.b) r4
            androidx.appcompat.view.menu.f r6 = r1.a
            int r4 = r4.a
            android.view.MenuItem r4 = r6.add(r2, r3, r3, r4)
            com.amazon.aps.iva.a70.h$b r6 = new com.amazon.aps.iva.a70.h$b
            r6.<init>(r4, r0)
            com.amazon.aps.iva.a70.h$c r7 = new com.amazon.aps.iva.a70.h$c
            r7.<init>(r4)
            com.amazon.aps.iva.a70.f r4 = r8.e
            r4.q6(r3, r6, r7)
            r3 = r5
            goto L24
        L4d:
            com.amazon.aps.iva.ee0.f1.S()
            r9 = 0
            throw r9
        L52:
            com.amazon.aps.iva.g1.q r9 = new com.amazon.aps.iva.g1.q
            r0 = 9
            r9.<init>(r8, r0)
            r1.c = r9
            androidx.appcompat.view.menu.i r9 = r1.b
            boolean r0 = r9.b()
            if (r0 == 0) goto L64
            goto L6c
        L64:
            android.view.View r0 = r9.f
            if (r0 != 0) goto L69
            goto L6d
        L69:
            r9.d(r2, r2, r2, r2)
        L6c:
            r2 = 1
        L6d:
            if (r2 == 0) goto L70
            return r1
        L70:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a70.h.G(android.view.View):com.amazon.aps.iva.q.t0");
    }

    @Override // com.amazon.aps.iva.a70.g
    public final void dismiss() {
    }

    public /* synthetic */ h(Context context, List list, Integer num, com.amazon.aps.iva.xb0.l lVar) {
        this(context, list, -1, num, R.color.action_menu_default_text_color, R.color.action_menu_selected_text_color, lVar);
    }
}
