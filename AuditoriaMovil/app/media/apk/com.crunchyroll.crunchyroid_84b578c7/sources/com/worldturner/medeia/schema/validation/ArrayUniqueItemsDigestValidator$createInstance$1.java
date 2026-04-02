package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.security.MessageDigest;
import kotlin.Metadata;
/* compiled from: ArrayUniqueItemsDigestValidatorInstance.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/security/MessageDigest;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class ArrayUniqueItemsDigestValidator$createInstance$1 extends l implements a<MessageDigest> {
    final /* synthetic */ ArrayUniqueItemsDigestValidator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrayUniqueItemsDigestValidator$createInstance$1(ArrayUniqueItemsDigestValidator arrayUniqueItemsDigestValidator) {
        super(0);
        this.this$0 = arrayUniqueItemsDigestValidator;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final MessageDigest invoke() {
        MessageDigest messageDigest = MessageDigest.getInstance(this.this$0.getDigestAlgorithm());
        if (messageDigest != null) {
            return messageDigest;
        }
        j.l();
        throw null;
    }
}
