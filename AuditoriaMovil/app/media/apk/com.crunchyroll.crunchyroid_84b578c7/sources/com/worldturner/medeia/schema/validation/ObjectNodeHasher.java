package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import java.security.MessageDigest;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
/* compiled from: ArrayUniqueItemsDigestValidatorInstance.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u001e\u001a\f\u0012\u0004\u0012\u00020\u00060\u001cj\u0002`\u001d¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u00068V@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR!\u0010\u001e\u001a\f\u0012\u0004\u0012\u00020\u00060\u001cj\u0002`\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ObjectNodeHasher;", "Lcom/worldturner/medeia/schema/validation/NodeHasherParent;", "Lcom/worldturner/medeia/schema/validation/NodeHasher;", "hasher", "Lcom/amazon/aps/iva/kb0/q;", "add", "Ljava/security/MessageDigest;", "digester", "digest", "Ljava/util/TreeMap;", "", "", "objectHashes", "Ljava/util/TreeMap;", "getObjectHashes", "()Ljava/util/TreeMap;", "currentProperty", "Ljava/lang/String;", "getCurrentProperty", "()Ljava/lang/String;", "setCurrentProperty", "(Ljava/lang/String;)V", "parentDigester", "Ljava/security/MessageDigest;", "getParentDigester", "()Ljava/security/MessageDigest;", "setParentDigester", "(Ljava/security/MessageDigest;)V", "Lkotlin/Function0;", "Lcom/worldturner/medeia/schema/validation/MessageDigestFactory;", "factory", "Lcom/amazon/aps/iva/xb0/a;", "getFactory", "()Lcom/amazon/aps/iva/xb0/a;", "<init>", "(Lcom/amazon/aps/iva/xb0/a;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ObjectNodeHasher implements NodeHasherParent {
    private String currentProperty;
    private final a<MessageDigest> factory;
    private final TreeMap<String, byte[]> objectHashes;
    private MessageDigest parentDigester;

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectNodeHasher(a<? extends MessageDigest> aVar) {
        j.g(aVar, "factory");
        this.factory = aVar;
        this.objectHashes = new TreeMap<>();
    }

    @Override // com.worldturner.medeia.schema.validation.NodeHasherParent
    public void add(NodeHasher nodeHasher) {
        j.g(nodeHasher, "hasher");
        MessageDigest parentDigester = getParentDigester();
        if (parentDigester != null) {
            nodeHasher.digest(parentDigester);
            byte[] digest = parentDigester.digest();
            TreeMap<String, byte[]> treeMap = this.objectHashes;
            String str = this.currentProperty;
            if (str != null) {
                j.b(digest, "hash");
                treeMap.put(str, digest);
                setParentDigester(null);
                return;
            }
            j.l();
            throw null;
        }
        j.l();
        throw null;
    }

    @Override // com.worldturner.medeia.schema.validation.NodeHasher
    public void digest(MessageDigest messageDigest) {
        j.g(messageDigest, "digester");
        messageDigest.update((byte) 4);
        for (Map.Entry<String, byte[]> entry : this.objectHashes.entrySet()) {
            String key = entry.getKey();
            j.g(key, "s");
            byte[] bytes = key.getBytes(com.amazon.aps.iva.oe0.a.b);
            j.b(bytes, "(this as java.lang.String).getBytes(charset)");
            x.s0(messageDigest, bytes);
            messageDigest.update(entry.getValue());
        }
        messageDigest.update((byte) 5);
    }

    public final String getCurrentProperty() {
        return this.currentProperty;
    }

    public final a<MessageDigest> getFactory() {
        return this.factory;
    }

    public final TreeMap<String, byte[]> getObjectHashes() {
        return this.objectHashes;
    }

    @Override // com.worldturner.medeia.schema.validation.NodeHasherParent
    public MessageDigest getParentDigester() {
        if (this.parentDigester == null) {
            this.parentDigester = this.factory.invoke();
        }
        return this.parentDigester;
    }

    public final void setCurrentProperty(String str) {
        this.currentProperty = str;
    }

    public void setParentDigester(MessageDigest messageDigest) {
        this.parentDigester = messageDigest;
    }
}
