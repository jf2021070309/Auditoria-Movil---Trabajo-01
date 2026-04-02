package com.amazon.aps.iva.u70;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: MessageSnackbarUiModel.kt */
/* loaded from: classes2.dex */
public class i implements Serializable {
    public static final int $stable = 8;
    private final int content;
    private final int icon;
    private final String message;
    private final String[] messageArgs;
    private final int messageResId;

    public i(int i, int i2, String str, int i3, String[] strArr) {
        com.amazon.aps.iva.yb0.j.f(strArr, "messageArgs");
        this.content = i;
        this.icon = i2;
        this.message = str;
        this.messageResId = i3;
        this.messageArgs = strArr;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!com.amazon.aps.iva.yb0.j.a(cls2, cls)) {
            return false;
        }
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type com.ellation.widgets.snackbar.MessageSnackbarUiModel");
        i iVar = (i) obj;
        if (this.content == iVar.content && this.icon == iVar.icon && com.amazon.aps.iva.yb0.j.a(this.message, iVar.message) && this.messageResId == iVar.messageResId && Arrays.equals(this.messageArgs, iVar.messageArgs)) {
            return true;
        }
        return false;
    }

    public final int getContent() {
        return this.content;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String[] getMessageArgs() {
        return this.messageArgs;
    }

    public final int getMessageResId() {
        return this.messageResId;
    }

    public int hashCode() {
        int i;
        int i2 = ((this.content * 31) + this.icon) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((((i2 + i) * 31) + this.messageResId) * 31) + Arrays.hashCode(this.messageArgs);
    }

    public /* synthetic */ i(int i, int i2, String str, int i3, String[] strArr, int i4, com.amazon.aps.iva.yb0.e eVar) {
        this(i, i2, (i4 & 4) != 0 ? null : str, (i4 & 8) != 0 ? 0 : i3, strArr);
    }
}
