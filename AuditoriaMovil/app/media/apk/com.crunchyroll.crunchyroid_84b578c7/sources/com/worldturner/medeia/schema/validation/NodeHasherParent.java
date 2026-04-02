package com.worldturner.medeia.schema.validation;

import java.security.MessageDigest;
import kotlin.Metadata;
/* compiled from: ArrayUniqueItemsDigestValidatorInstance.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/worldturner/medeia/schema/validation/NodeHasherParent;", "Lcom/worldturner/medeia/schema/validation/NodeHasher;", "hasher", "Lcom/amazon/aps/iva/kb0/q;", "add", "Ljava/security/MessageDigest;", "getParentDigester", "()Ljava/security/MessageDigest;", "parentDigester", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public interface NodeHasherParent extends NodeHasher {
    void add(NodeHasher nodeHasher);

    MessageDigest getParentDigester();
}
