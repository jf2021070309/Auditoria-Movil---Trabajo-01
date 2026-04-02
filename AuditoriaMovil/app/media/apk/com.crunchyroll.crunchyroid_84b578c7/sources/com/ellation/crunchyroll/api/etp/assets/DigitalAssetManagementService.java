package com.ellation.crunchyroll.api.etp.assets;

import com.amazon.aps.iva.lf0.f;
import com.amazon.aps.iva.lf0.s;
import com.amazon.aps.iva.ob0.d;
import com.ellation.crunchyroll.api.etp.assets.model.AssetType;
import com.ellation.crunchyroll.api.etp.assets.model.AvatarCollection;
import com.ellation.crunchyroll.api.etp.model.ApiCollection;
import kotlin.Metadata;
/* compiled from: DigitalAssetManagementService.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/assets/DigitalAssetManagementService;", "", "", "languageTag", "Lcom/ellation/crunchyroll/api/etp/assets/model/AssetType;", "assetType", "Lcom/ellation/crunchyroll/api/etp/model/ApiCollection;", "Lcom/ellation/crunchyroll/api/etp/assets/model/AvatarCollection;", "getAvatars", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/assets/model/AssetType;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface DigitalAssetManagementService {

    /* compiled from: DigitalAssetManagementService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getAvatars$default(DigitalAssetManagementService digitalAssetManagementService, String str, AssetType assetType, d dVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    assetType = AssetType.AVATAR;
                }
                return digitalAssetManagementService.getAvatars(str, assetType, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAvatars");
        }
    }

    @f("assets/v2/{language}/{type}")
    Object getAvatars(@s("language") String str, @s("type") AssetType assetType, d<? super ApiCollection<AvatarCollection>> dVar);
}
