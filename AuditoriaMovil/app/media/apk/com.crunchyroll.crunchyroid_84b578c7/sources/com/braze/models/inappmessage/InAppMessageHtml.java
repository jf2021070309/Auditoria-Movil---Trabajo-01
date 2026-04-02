package com.braze.models.inappmessage;

import bo.app.r1;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.inappmessage.MessageType;
import com.braze.support.JsonUtils;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 '2\u00020\u0001:\u0001(B\t\b\u0016¢\u0006\u0004\b \u0010!B\u0019\b\u0016\u0012\u0006\u0010\"\u001a\u00020\n\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b \u0010%B1\b\u0012\u0012\u0006\u0010\"\u001a\u00020\n\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b \u0010&J\u001c\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R$\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageHtml;", "Lcom/braze/models/inappmessage/InAppMessageHtmlBase;", "", "", "remotePathToLocalAssetMap", "Lcom/amazon/aps/iva/kb0/q;", "setLocalPrefetchedAssetPaths", "getLocalPrefetchedAssetPaths", "", "getRemoteAssetPathsForPrefetch", "Lcom/amazon/aps/iva/if0/c;", "forJsonPut", "messageFields", "Lcom/amazon/aps/iva/if0/c;", "getMessageFields", "()Lcom/amazon/aps/iva/if0/c;", "setMessageFields", "(Lcom/amazon/aps/iva/if0/c;)V", "Ljava/util/Map;", "assetUrls", "Ljava/util/List;", "getAssetUrls", "()Ljava/util/List;", "setAssetUrls", "(Ljava/util/List;)V", "", "isPushPrimer", "()Z", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "<init>", "()V", "jsonObject", "Lbo/app/r1;", "brazeManager", "(Lcom/amazon/aps/iva/if0/c;Lbo/app/r1;)V", "(Lcom/amazon/aps/iva/if0/c;Lbo/app/r1;Lcom/amazon/aps/iva/if0/c;Ljava/util/List;)V", "Companion", "a", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class InAppMessageHtml extends InAppMessageHtmlBase {
    public static final a Companion = new a(null);
    private List<String> assetUrls;
    private c messageFields;
    private Map<String, String> remotePathToLocalAssetMap;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public InAppMessageHtml() {
        this.remotePathToLocalAssetMap = a0.b;
        z zVar = z.b;
        this.assetUrls = zVar;
        this.messageFields = new c();
        this.assetUrls = zVar;
    }

    public Map<String, String> getLocalPrefetchedAssetPaths() {
        return this.remotePathToLocalAssetMap;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.HTML;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        return this.assetUrls;
    }

    public final boolean isPushPrimer() {
        c cVar = this.messageFields;
        if (cVar == null || !cVar.optBoolean("is_push_primer", false)) {
            return false;
        }
        return true;
    }

    @Override // com.braze.models.inappmessage.InAppMessageHtmlBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> map) {
        j.f(map, "remotePathToLocalAssetMap");
        this.remotePathToLocalAssetMap = map;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public c forJsonPut() {
        c jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        c forJsonPut = super.forJsonPut();
        try {
            forJsonPut.put("type", getMessageType().name());
        } catch (b unused) {
        }
        return forJsonPut;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageHtml(c cVar, r1 r1Var) {
        this(cVar, r1Var, cVar.optJSONObject("message_fields"), JsonUtils.convertStringJsonArrayToList(cVar.optJSONArray("asset_urls")));
        j.f(cVar, "jsonObject");
        j.f(r1Var, "brazeManager");
    }

    private InAppMessageHtml(c cVar, r1 r1Var, c cVar2, List<String> list) {
        super(cVar, r1Var);
        this.remotePathToLocalAssetMap = a0.b;
        this.messageFields = cVar2;
        this.assetUrls = list;
    }
}
