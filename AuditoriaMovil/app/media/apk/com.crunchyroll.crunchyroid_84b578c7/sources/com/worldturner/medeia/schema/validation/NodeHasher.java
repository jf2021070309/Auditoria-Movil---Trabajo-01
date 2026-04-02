package com.worldturner.medeia.schema.validation;

import java.security.MessageDigest;
import kotlin.Metadata;
/* compiled from: ArrayUniqueItemsDigestValidatorInstance.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/worldturner/medeia/schema/validation/NodeHasher;", "", "Ljava/security/MessageDigest;", "digester", "Lcom/amazon/aps/iva/kb0/q;", "digest", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public interface NodeHasher {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final byte TYPE_ARRAY_END = 3;
    public static final byte TYPE_ARRAY_START = 2;
    public static final byte TYPE_OBJECT_END = 5;
    public static final byte TYPE_OBJECT_START = 4;
    public static final byte TYPE_TOKEN = 1;

    /* compiled from: ArrayUniqueItemsDigestValidatorInstance.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/worldturner/medeia/schema/validation/NodeHasher$Companion;", "", "()V", "TYPE_ARRAY_END", "", "TYPE_ARRAY_START", "TYPE_OBJECT_END", "TYPE_OBJECT_START", "TYPE_TOKEN", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final byte TYPE_ARRAY_END = 3;
        public static final byte TYPE_ARRAY_START = 2;
        public static final byte TYPE_OBJECT_END = 5;
        public static final byte TYPE_OBJECT_START = 4;
        public static final byte TYPE_TOKEN = 1;

        private Companion() {
        }
    }

    void digest(MessageDigest messageDigest);
}
