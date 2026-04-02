package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.fc0.f;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.m;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataAndLocationBuilder;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.Deque;
import kotlin.Metadata;
/* compiled from: ArrayUniqueItemsDigestValidatorInstance.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0010\u0010\u001c\u001a\f\u0012\u0004\u0012\u00020\u00060\u001aj\u0002`\u001b¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u001c\u001a\f\u0012\u0004\u0012\u00020\u00060\u001aj\u0002`\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/worldturner/medeia/schema/validation/DigestBuilder;", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationBuilder;", "Lcom/worldturner/medeia/schema/validation/NodeHasher;", "nodeHasher", "Lcom/amazon/aps/iva/kb0/q;", "lastStep", "Ljava/security/MessageDigest;", "findParentDigester", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "processFieldName", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "consume", "Lcom/worldturner/medeia/schema/validation/HashResult;", "takeResult", "Ljava/util/Deque;", "stack", "Ljava/util/Deque;", "result", "Lcom/worldturner/medeia/schema/validation/HashResult;", "", "startLevel", "I", "getStartLevel", "()I", "Lkotlin/Function0;", "Lcom/worldturner/medeia/schema/validation/MessageDigestFactory;", "factory", "Lcom/amazon/aps/iva/xb0/a;", "getFactory", "()Lcom/amazon/aps/iva/xb0/a;", "<init>", "(ILcom/amazon/aps/iva/xb0/a;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class DigestBuilder implements JsonTokenDataAndLocationBuilder {
    private final a<MessageDigest> factory;
    private HashResult result;
    private final Deque<NodeHasher> stack;
    private final int startLevel;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonTokenType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[JsonTokenType.START_OBJECT.ordinal()] = 1;
            iArr[JsonTokenType.START_ARRAY.ordinal()] = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DigestBuilder(int i, a<? extends MessageDigest> aVar) {
        j.g(aVar, "factory");
        this.startLevel = i;
        this.factory = aVar;
        this.stack = new ArrayDeque();
    }

    private final MessageDigest findParentDigester() {
        NodeHasher peek = this.stack.peek();
        if (peek instanceof NodeHasherParent) {
            MessageDigest parentDigester = ((NodeHasherParent) peek).getParentDigester();
            if (parentDigester == null) {
                j.l();
                throw null;
            }
            return parentDigester;
        }
        return this.factory.invoke();
    }

    private final void lastStep(NodeHasher nodeHasher) {
        if (nodeHasher instanceof JsonTokenData) {
            this.result = (HashResult) nodeHasher;
        } else if (nodeHasher instanceof ArrayNodeHasher) {
            MessageDigest parentDigester = ((ArrayNodeHasher) nodeHasher).getParentDigester();
            nodeHasher.digest(parentDigester);
            byte[] digest = parentDigester.digest();
            j.b(digest, "digester.digest()");
            this.result = new DigestHashResult(digest);
        } else if (nodeHasher instanceof ObjectNodeHasher) {
            MessageDigest invoke = this.factory.invoke();
            nodeHasher.digest(invoke);
            byte[] digest2 = invoke.digest();
            j.b(digest2, "digester.digest()");
            this.result = new DigestHashResult(digest2);
        }
    }

    private final void processFieldName(JsonTokenData jsonTokenData) {
        if (!this.stack.isEmpty()) {
            NodeHasher peek = this.stack.peek();
            if (peek instanceof ObjectNodeHasher) {
                ObjectNodeHasher objectNodeHasher = (ObjectNodeHasher) peek;
                String text = jsonTokenData.getText();
                if (text != null) {
                    objectNodeHasher.setCurrentProperty(text);
                    return;
                } else {
                    j.l();
                    throw null;
                }
            }
        }
        throw new IllegalStateException("Received field name outside of Object context");
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataAndLocationConsumer
    public void consume(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        NodeHasher objectNodeHasher;
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (jsonTokenData.getType() == JsonTokenType.FIELD_NAME) {
            processFieldName(jsonTokenData);
            return;
        }
        if (jsonTokenData.getType().getFirstToken()) {
            int i = WhenMappings.$EnumSwitchMapping$0[jsonTokenData.getType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    objectNodeHasher = jsonTokenData;
                } else {
                    objectNodeHasher = new ArrayNodeHasher(findParentDigester());
                }
            } else {
                objectNodeHasher = new ObjectNodeHasher(this.factory);
            }
            this.stack.push(objectNodeHasher);
        }
        if (jsonTokenData.getType().getLastToken()) {
            NodeHasher pop = this.stack.pop();
            if (pop != null) {
                NodeHasher nodeHasher = pop;
                NodeHasher peek = this.stack.peek();
                if (peek instanceof NodeHasherParent) {
                    ((NodeHasherParent) peek).add(nodeHasher);
                    return;
                } else if (jsonTokenLocation.getLevel() == this.startLevel) {
                    lastStep(nodeHasher);
                    return;
                } else {
                    throw new IllegalStateException("Child node seen where this is not allowed");
                }
            }
            j.l();
            throw null;
        }
    }

    public final a<MessageDigest> getFactory() {
        return this.factory;
    }

    public final int getStartLevel() {
        return this.startLevel;
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataAndLocationBuilder
    public HashResult takeResult() {
        m mVar = new m(this) { // from class: com.worldturner.medeia.schema.validation.DigestBuilder$takeResult$1
            {
                super(this);
            }

            @Override // com.amazon.aps.iva.fc0.m
            public Object get() {
                HashResult hashResult;
                hashResult = ((DigestBuilder) this.receiver).result;
                return hashResult;
            }

            @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
            public String getName() {
                return "result";
            }

            @Override // com.amazon.aps.iva.yb0.b
            public f getOwner() {
                return e0.a(DigestBuilder.class);
            }

            @Override // com.amazon.aps.iva.yb0.b
            public String getSignature() {
                return "getResult()Lcom/worldturner/medeia/schema/validation/HashResult;";
            }

            @Override // com.amazon.aps.iva.fc0.i
            public void set(Object obj) {
                ((DigestBuilder) this.receiver).result = (HashResult) obj;
            }
        };
        V v = mVar.get();
        mVar.set(null);
        return (HashResult) v;
    }
}
