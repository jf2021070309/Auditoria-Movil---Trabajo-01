package com.braze.models.inappmessage;

import bo.app.r1;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0015B\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0013J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageZippedAssetHtmlBase;", "Lcom/braze/models/inappmessage/InAppMessageHtmlBase;", "Lcom/braze/models/inappmessage/IInAppMessageZippedAssetHtml;", "", "", "getRemoteAssetPathsForPrefetch", "Lcom/amazon/aps/iva/if0/c;", "forJsonPut", "assetsZipRemoteUrl", "Ljava/lang/String;", "getAssetsZipRemoteUrl", "()Ljava/lang/String;", "setAssetsZipRemoteUrl", "(Ljava/lang/String;)V", "<init>", "()V", "jsonObject", "Lbo/app/r1;", "brazeManager", "(Lcom/amazon/aps/iva/if0/c;Lbo/app/r1;)V", "Companion", "a", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class InAppMessageZippedAssetHtmlBase extends InAppMessageHtmlBase implements IInAppMessageZippedAssetHtml {
    public static final a Companion = new a(null);
    private String assetsZipRemoteUrl;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public InAppMessageZippedAssetHtmlBase() {
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public c forJsonPut() {
        c jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        c forJsonPut = super.forJsonPut();
        try {
            forJsonPut.putOpt("zipped_assets_url", getAssetsZipRemoteUrl());
        } catch (b unused) {
        }
        return forJsonPut;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageZippedAssetHtml
    public String getAssetsZipRemoteUrl() {
        return this.assetsZipRemoteUrl;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        ArrayList arrayList = new ArrayList();
        String assetsZipRemoteUrl = getAssetsZipRemoteUrl();
        if (assetsZipRemoteUrl != null && (!m.b0(assetsZipRemoteUrl))) {
            arrayList.add(assetsZipRemoteUrl);
        }
        return arrayList;
    }

    public void setAssetsZipRemoteUrl(String str) {
        this.assetsZipRemoteUrl = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageZippedAssetHtmlBase(c cVar, r1 r1Var) {
        super(cVar, r1Var);
        j.f(cVar, "jsonObject");
        j.f(r1Var, "brazeManager");
        String optString = cVar.optString("zipped_assets_url");
        j.e(optString, "it");
        if (!m.b0(optString)) {
            setAssetsZipRemoteUrl(optString);
        }
    }
}
