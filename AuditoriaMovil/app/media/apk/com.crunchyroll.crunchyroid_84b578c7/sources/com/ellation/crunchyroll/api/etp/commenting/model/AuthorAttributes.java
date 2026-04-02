package com.ellation.crunchyroll.api.etp.commenting.model;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: AuthorAttributes.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/commenting/model/AuthorAttributes;", "", "username", "", "avatar", "Lcom/ellation/crunchyroll/api/etp/commenting/model/AvatarImages;", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/commenting/model/AvatarImages;)V", "getAvatar", "()Lcom/ellation/crunchyroll/api/etp/commenting/model/AvatarImages;", "getUsername", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthorAttributes {
    public static final int $stable = 8;
    @SerializedName("avatar")
    private final AvatarImages avatar;
    @SerializedName("username")
    private final String username;

    public AuthorAttributes() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ AuthorAttributes copy$default(AuthorAttributes authorAttributes, String str, AvatarImages avatarImages, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authorAttributes.username;
        }
        if ((i & 2) != 0) {
            avatarImages = authorAttributes.avatar;
        }
        return authorAttributes.copy(str, avatarImages);
    }

    public final String component1() {
        return this.username;
    }

    public final AvatarImages component2() {
        return this.avatar;
    }

    public final AuthorAttributes copy(String str, AvatarImages avatarImages) {
        return new AuthorAttributes(str, avatarImages);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorAttributes)) {
            return false;
        }
        AuthorAttributes authorAttributes = (AuthorAttributes) obj;
        if (j.a(this.username, authorAttributes.username) && j.a(this.avatar, authorAttributes.avatar)) {
            return true;
        }
        return false;
    }

    public final AvatarImages getAvatar() {
        return this.avatar;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode;
        String str = this.username;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        AvatarImages avatarImages = this.avatar;
        if (avatarImages != null) {
            i = avatarImages.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.username;
        AvatarImages avatarImages = this.avatar;
        return "AuthorAttributes(username=" + str + ", avatar=" + avatarImages + ")";
    }

    public AuthorAttributes(String str, AvatarImages avatarImages) {
        this.username = str;
        this.avatar = avatarImages;
    }

    public /* synthetic */ AuthorAttributes(String str, AvatarImages avatarImages, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : avatarImages);
    }
}
