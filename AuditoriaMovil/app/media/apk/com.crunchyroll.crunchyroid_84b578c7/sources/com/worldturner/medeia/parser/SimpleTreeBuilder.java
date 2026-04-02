package com.worldturner.medeia.parser;

import com.amazon.aps.iva.fc0.f;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.m;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: SimpleTree.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/worldturner/medeia/parser/SimpleTreeBuilder;", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationBuilder;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/amazon/aps/iva/kb0/q;", "consume", "Lcom/worldturner/medeia/parser/TreeNode;", "takeResult", "Ljava/util/Deque;", "stack", "Ljava/util/Deque;", "", "currentProperty", "Ljava/lang/String;", "result", "Lcom/worldturner/medeia/parser/TreeNode;", "", "startLevel", "I", "getStartLevel", "()I", "<init>", "(I)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class SimpleTreeBuilder implements JsonTokenDataAndLocationBuilder {
    private String currentProperty;
    private TreeNode result;
    private final Deque<TreeNode> stack = new ArrayDeque();
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

    public SimpleTreeBuilder(int i) {
        this.startLevel = i;
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataAndLocationConsumer
    public void consume(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        TreeNode peek;
        TreeNode objectNode;
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (jsonTokenData.getType() == JsonTokenType.FIELD_NAME) {
            String text = jsonTokenData.getText();
            if (text != null) {
                this.currentProperty = text;
                return;
            } else {
                j.l();
                throw null;
            }
        }
        if (jsonTokenData.getType().getFirstToken()) {
            if (this.stack.isEmpty()) {
                peek = null;
            } else {
                peek = this.stack.peek();
            }
            int i = WhenMappings.$EnumSwitchMapping$0[jsonTokenData.getType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    objectNode = new SimpleNode(jsonTokenData, jsonTokenLocation.getLine(), jsonTokenLocation.getColumn());
                } else {
                    objectNode = new ArrayNode(jsonTokenLocation.getLine(), jsonTokenLocation.getColumn(), null, 4, null);
                }
            } else {
                objectNode = new ObjectNode(jsonTokenLocation.getLine(), jsonTokenLocation.getColumn(), null, 4, null);
            }
            if (peek instanceof ObjectNode) {
                Map<String, TreeNode> nodes = ((ObjectNode) peek).getNodes();
                String str = this.currentProperty;
                if (str != null) {
                    nodes.put(str, objectNode);
                } else {
                    j.l();
                    throw null;
                }
            } else if (peek instanceof ArrayNode) {
                ((ArrayNode) peek).getNodes().add(objectNode);
            }
            this.stack.push(objectNode);
        }
        if (jsonTokenData.getType().getLastToken()) {
            TreeNode pop = this.stack.pop();
            if (pop != null) {
                TreeNode treeNode = pop;
                if (jsonTokenLocation.getLevel() == this.startLevel) {
                    this.result = treeNode;
                    return;
                }
                return;
            }
            j.l();
            throw null;
        }
    }

    public final int getStartLevel() {
        return this.startLevel;
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataAndLocationBuilder
    public TreeNode takeResult() {
        m mVar = new m(this) { // from class: com.worldturner.medeia.parser.SimpleTreeBuilder$takeResult$1
            {
                super(this);
            }

            @Override // com.amazon.aps.iva.fc0.m
            public Object get() {
                TreeNode treeNode;
                treeNode = ((SimpleTreeBuilder) this.receiver).result;
                return treeNode;
            }

            @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
            public String getName() {
                return "result";
            }

            @Override // com.amazon.aps.iva.yb0.b
            public f getOwner() {
                return e0.a(SimpleTreeBuilder.class);
            }

            @Override // com.amazon.aps.iva.yb0.b
            public String getSignature() {
                return "getResult()Lcom/worldturner/medeia/parser/TreeNode;";
            }

            @Override // com.amazon.aps.iva.fc0.i
            public void set(Object obj) {
                ((SimpleTreeBuilder) this.receiver).result = (TreeNode) obj;
            }
        };
        V v = mVar.get();
        mVar.set(null);
        return (TreeNode) v;
    }
}
