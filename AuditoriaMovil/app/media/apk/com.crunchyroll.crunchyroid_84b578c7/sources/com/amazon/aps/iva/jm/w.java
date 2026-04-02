package com.amazon.aps.iva.jm;

import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
import com.ellation.crunchyroll.api.etp.assets.model.AssetType;
import com.ellation.crunchyroll.api.etp.model.Image;
/* compiled from: UserAvatarProvider.kt */
/* loaded from: classes2.dex */
public abstract class w implements y {
    public final String b;

    public w(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "assetsEndpoint");
        this.b = str;
    }

    @Override // com.amazon.aps.iva.jm.y
    public final String m(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        AssetType assetType = AssetType.AVATAR;
        return this.b + "/" + assetType + "/170x170/" + str;
    }

    @Override // com.amazon.aps.iva.jm.y
    public final Image q() {
        String v = v();
        if (v != null) {
            return new Image(v, 170, 170);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.jm.y
    public final String v() {
        String str;
        ProfileApiModel j0 = com.ellation.crunchyroll.application.e.d().j0();
        if (j0 != null) {
            str = j0.getAvatar();
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return m(str);
    }
}
