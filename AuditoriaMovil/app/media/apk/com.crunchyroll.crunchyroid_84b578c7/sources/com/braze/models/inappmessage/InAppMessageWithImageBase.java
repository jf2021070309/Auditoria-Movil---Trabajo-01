package com.braze.models.inappmessage;

import android.graphics.Bitmap;
import bo.app.r1;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001+B\t\b\u0014¢\u0006\u0004\b%\u0010\u001bB\u0019\b\u0016\u0012\u0006\u0010&\u001a\u00020\n\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b%\u0010)J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!¨\u0006,"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageWithImageBase;", "Lcom/braze/models/inappmessage/InAppMessageBase;", "Lcom/braze/models/inappmessage/IInAppMessageWithImage;", "", "", "remotePathToLocalAssetMap", "Lcom/amazon/aps/iva/kb0/q;", "setLocalPrefetchedAssetPaths", "", "getRemoteAssetPathsForPrefetch", "Lcom/amazon/aps/iva/if0/c;", "forJsonPut", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "", "imageDownloadSuccessful", "Z", "getImageDownloadSuccessful", "()Z", "setImageDownloadSuccessful", "(Z)V", "getImageDownloadSuccessful$annotations", "()V", "localImageUrl", "Ljava/lang/String;", "getLocalImageUrl", "()Ljava/lang/String;", "setLocalImageUrl", "(Ljava/lang/String;)V", "remoteImageUrl", "getRemoteImageUrl", "setRemoteImageUrl", "<init>", "jsonObject", "Lbo/app/r1;", "brazeManager", "(Lcom/amazon/aps/iva/if0/c;Lbo/app/r1;)V", "Companion", "a", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class InAppMessageWithImageBase extends InAppMessageBase implements IInAppMessageWithImage {
    public static final a Companion = new a(null);
    private Bitmap bitmap;
    private boolean imageDownloadSuccessful;
    private String localImageUrl;
    private String remoteImageUrl;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public InAppMessageWithImageBase() {
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public c forJsonPut() {
        c jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        c forJsonPut = super.forJsonPut();
        try {
            forJsonPut.putOpt("image_url", getRemoteImageUrl());
        } catch (b unused) {
        }
        return forJsonPut;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public boolean getImageDownloadSuccessful() {
        return this.imageDownloadSuccessful;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public String getLocalImageUrl() {
        return this.localImageUrl;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        ArrayList arrayList = new ArrayList();
        String remoteImageUrl = getRemoteImageUrl();
        if (remoteImageUrl != null && (!m.b0(remoteImageUrl))) {
            arrayList.add(remoteImageUrl);
        }
        return arrayList;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public String getRemoteImageUrl() {
        return this.remoteImageUrl;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setImageDownloadSuccessful(boolean z) {
        this.imageDownloadSuccessful = z;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setLocalImageUrl(String str) {
        this.localImageUrl = str;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> map) {
        j.f(map, "remotePathToLocalAssetMap");
        if (!map.isEmpty()) {
            setLocalImageUrl(((String[]) map.values().toArray(new String[0]))[0]);
        }
    }

    public void setRemoteImageUrl(String str) {
        this.remoteImageUrl = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageWithImageBase(c cVar, r1 r1Var) {
        super(cVar, r1Var, false, false, 12, null);
        j.f(cVar, "jsonObject");
        j.f(r1Var, "brazeManager");
        setRemoteImageUrl(cVar.optString("image_url"));
    }
}
