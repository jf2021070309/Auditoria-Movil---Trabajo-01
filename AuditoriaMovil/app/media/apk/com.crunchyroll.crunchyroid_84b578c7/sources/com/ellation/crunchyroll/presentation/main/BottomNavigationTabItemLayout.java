package com.ellation.crunchyroll.presentation.main;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.ts.d;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.ImageUtil;
import kotlin.Metadata;
/* compiled from: BottomNavigationTabItemLayout.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/ellation/crunchyroll/presentation/main/BottomNavigationTabItemLayout;", "Landroid/widget/LinearLayout;", "Lcom/ellation/crunchyroll/presentation/main/c;", "uiModel", "Lcom/amazon/aps/iva/kb0/q;", "setAccountUiModel", "Landroid/widget/TextView;", "b", "Lcom/amazon/aps/iva/bc0/b;", "getItemName", "()Landroid/widget/TextView;", "itemName", "Landroid/widget/ImageView;", "c", "getItemIcon", "()Landroid/widget/ImageView;", "itemIcon", "d", "getItemNotificationBadge", "itemNotificationBadge", "", "getTabText", "()Ljava/lang/String;", "tabText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BottomNavigationTabItemLayout extends LinearLayout {
    public static final /* synthetic */ l<Object>[] e = {q.a(BottomNavigationTabItemLayout.class, "itemName", "getItemName()Landroid/widget/TextView;", 0), q.a(BottomNavigationTabItemLayout.class, "itemIcon", "getItemIcon()Landroid/widget/ImageView;", 0), q.a(BottomNavigationTabItemLayout.class, "itemNotificationBadge", "getItemNotificationBadge()Landroid/widget/ImageView;", 0)};
    public final v b;
    public final v c;
    public final v d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationTabItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        this.b = g.c(R.id.bottom_navigation_tab_item_name, this);
        this.c = g.c(R.id.bottom_navigation_tab_item_icon, this);
        this.d = g.c(R.id.bottom_bar_notification_badge, this);
        View.inflate(context, R.layout.bottom_navigation_tab_item, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a, 0, 0);
        x.g0(getItemName(), obtainStyledAttributes, 1, -1);
        getItemIcon().setImageResource(obtainStyledAttributes.getResourceId(0, 0));
        obtainStyledAttributes.recycle();
        if (getContentDescription() == null) {
            setContentDescription(getItemName().getText());
        }
    }

    private final ImageView getItemIcon() {
        return (ImageView) this.c.getValue(this, e[1]);
    }

    private final TextView getItemName() {
        return (TextView) this.b.getValue(this, e[0]);
    }

    private final ImageView getItemNotificationBadge() {
        return (ImageView) this.d.getValue(this, e[2]);
    }

    public final void a() {
        getItemNotificationBadge().setVisibility(8);
    }

    public final void b() {
        getItemNotificationBadge().setVisibility(0);
    }

    public final void c(int i) {
        r0.c(getItemName(), i);
    }

    public final String getTabText() {
        return getItemName().getText().toString();
    }

    public final void setAccountUiModel(c cVar) {
        j.f(cVar, "uiModel");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context context = getContext();
        j.e(context, "context");
        imageUtil.loadRoundImage(context, cVar.b, getItemIcon(), cVar.c, cVar.d);
        getItemName().setText(cVar.a);
    }
}
