package com.ellation.crunchyroll.api.model;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: Href.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ellation/crunchyroll/api/model/Href;", "Ljava/io/Serializable;", "_href", "", "(Ljava/lang/String;)V", "href", "getHref", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Href implements Serializable {
    public static final int $stable = 0;
    @SerializedName("href")
    private final String _href;

    public Href() {
        this(null, 1, null);
    }

    private final String component1() {
        return this._href;
    }

    public static /* synthetic */ Href copy$default(Href href, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = href._href;
        }
        return href.copy(str);
    }

    public final Href copy(String str) {
        return new Href(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Href) && j.a(this._href, ((Href) obj)._href)) {
            return true;
        }
        return false;
    }

    public final String getHref() {
        CharSequence charSequence;
        boolean z;
        String str = this._href;
        if (str == null) {
            return "";
        }
        char[] cArr = {'/'};
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequence = "";
                break;
            }
            char charAt = str.charAt(i);
            int i2 = 0;
            while (true) {
                if (i2 < 1) {
                    if (charAt == cArr[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                charSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        String obj = charSequence.toString();
        if (obj == null) {
            return "";
        }
        return obj;
    }

    public int hashCode() {
        String str = this._href;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return getHref();
    }

    public Href(String str) {
        this._href = str;
    }

    public /* synthetic */ Href(String str, int i, e eVar) {
        this((i & 1) != 0 ? null : str);
    }
}
