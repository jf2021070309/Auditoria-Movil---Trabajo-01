package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.j;
import java.security.MessageDigest;
import kotlin.Metadata;
/* compiled from: ArrayUniqueItemsDigestValidatorInstance.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ArrayNodeHasher;", "Lcom/worldturner/medeia/schema/validation/NodeHasherParent;", "Lcom/worldturner/medeia/schema/validation/NodeHasher;", "hasher", "Lcom/amazon/aps/iva/kb0/q;", "add", "Ljava/security/MessageDigest;", "digester", "digest", "parentDigester", "Ljava/security/MessageDigest;", "getParentDigester", "()Ljava/security/MessageDigest;", "<init>", "(Ljava/security/MessageDigest;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ArrayNodeHasher implements NodeHasherParent {
    private final MessageDigest parentDigester;

    public ArrayNodeHasher(MessageDigest messageDigest) {
        j.g(messageDigest, "parentDigester");
        this.parentDigester = messageDigest;
        getParentDigester().update((byte) 2);
    }

    @Override // com.worldturner.medeia.schema.validation.NodeHasherParent
    public void add(NodeHasher nodeHasher) {
        j.g(nodeHasher, "hasher");
        nodeHasher.digest(getParentDigester());
    }

    @Override // com.worldturner.medeia.schema.validation.NodeHasher
    public void digest(MessageDigest messageDigest) {
        j.g(messageDigest, "digester");
        if (!(!j.a(messageDigest, getParentDigester()))) {
            messageDigest.update((byte) 3);
            return;
        }
        throw new IllegalStateException("Digesters differ");
    }

    @Override // com.worldturner.medeia.schema.validation.NodeHasherParent
    public MessageDigest getParentDigester() {
        return this.parentDigester;
    }
}
