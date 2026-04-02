package com.ellation.crunchyroll.ui.toolbarmenu;

import android.graphics.Rect;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: ToolbarMenuButtonDataProvider.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/ui/toolbarmenu/MenuButtonData;", "", "drawableRes", "", "rect", "Landroid/graphics/Rect;", "(ILandroid/graphics/Rect;)V", "getDrawableRes", "()I", "getRect", "()Landroid/graphics/Rect;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MenuButtonData {
    public static final int $stable = 8;
    private final int drawableRes;
    private final Rect rect;

    public MenuButtonData(int i, Rect rect) {
        j.f(rect, "rect");
        this.drawableRes = i;
        this.rect = rect;
    }

    public static /* synthetic */ MenuButtonData copy$default(MenuButtonData menuButtonData, int i, Rect rect, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = menuButtonData.drawableRes;
        }
        if ((i2 & 2) != 0) {
            rect = menuButtonData.rect;
        }
        return menuButtonData.copy(i, rect);
    }

    public final int component1() {
        return this.drawableRes;
    }

    public final Rect component2() {
        return this.rect;
    }

    public final MenuButtonData copy(int i, Rect rect) {
        j.f(rect, "rect");
        return new MenuButtonData(i, rect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuButtonData)) {
            return false;
        }
        MenuButtonData menuButtonData = (MenuButtonData) obj;
        if (this.drawableRes == menuButtonData.drawableRes && j.a(this.rect, menuButtonData.rect)) {
            return true;
        }
        return false;
    }

    public final int getDrawableRes() {
        return this.drawableRes;
    }

    public final Rect getRect() {
        return this.rect;
    }

    public int hashCode() {
        return this.rect.hashCode() + (Integer.hashCode(this.drawableRes) * 31);
    }

    public String toString() {
        int i = this.drawableRes;
        Rect rect = this.rect;
        return "MenuButtonData(drawableRes=" + i + ", rect=" + rect + ")";
    }
}
