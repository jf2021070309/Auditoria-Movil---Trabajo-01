package com.braze.models.inappmessage;

import bo.app.r1;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.MessageType;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageFull;", "Lcom/braze/models/inappmessage/InAppMessageImmersiveBase;", "Lcom/amazon/aps/iva/if0/c;", "forJsonPut", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "<init>", "()V", "jsonObject", "Lbo/app/r1;", "brazeManager", "(Lcom/amazon/aps/iva/if0/c;Lbo/app/r1;)V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class InAppMessageFull extends InAppMessageImmersiveBase {
    public InAppMessageFull() {
        setCropType(CropType.CENTER_CROP);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.FULL;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.inappmessage.InAppMessageImmersiveBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageFull(c cVar, r1 r1Var) {
        super(cVar, r1Var);
        String upperCase;
        CropType[] values;
        int i;
        j.f(cVar, "jsonObject");
        j.f(r1Var, "brazeManager");
        CropType cropType = CropType.CENTER_CROP;
        try {
            com.braze.support.c cVar2 = com.braze.support.c.a;
            String string = cVar.getString("crop_type");
            j.e(string, "jsonObject.getString(key)");
            Locale locale = Locale.US;
            j.e(locale, "US");
            upperCase = string.toUpperCase(locale);
            j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        } catch (Exception unused) {
        }
        for (CropType cropType2 : CropType.values()) {
            if (j.a(cropType2.name(), upperCase)) {
                cropType = cropType2;
                setCropType(cropType);
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
