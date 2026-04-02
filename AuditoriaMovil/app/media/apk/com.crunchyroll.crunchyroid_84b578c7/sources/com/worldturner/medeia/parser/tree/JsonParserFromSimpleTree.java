package com.worldturner.medeia.parser.tree;

import com.amazon.aps.iva.fc0.f;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.m;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.ArrayNode;
import com.worldturner.medeia.parser.JsonParserAdapter;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataAndLocationConsumer;
import com.worldturner.medeia.parser.JsonTokenDataKt;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.parser.ObjectNode;
import com.worldturner.medeia.parser.SimpleNode;
import com.worldturner.medeia.parser.TreeNode;
import com.worldturner.medeia.pointer.JsonPointer;
import com.worldturner.medeia.pointer.JsonPointerBuilder;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: JsonParserFromSimpleTree.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001 B!\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u00060\rR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/worldturner/medeia/parser/tree/JsonParserFromSimpleTree;", "Lcom/worldturner/medeia/parser/JsonParserAdapter;", "Lcom/worldturner/medeia/parser/TreeNode;", "node", "Lcom/amazon/aps/iva/kb0/q;", "generateEvents", "parseAll", "close", "Ljava/util/ArrayDeque;", "", "", "propertyNamesStack", "Ljava/util/ArrayDeque;", "Lcom/worldturner/medeia/parser/tree/JsonParserFromSimpleTree$DynamicTokenLocation;", "dynamicLocation", "Lcom/worldturner/medeia/parser/tree/JsonParserFromSimpleTree$DynamicTokenLocation;", "", FirebaseAnalytics.Param.LEVEL, "I", "Lcom/worldturner/medeia/pointer/JsonPointerBuilder;", "jsonPointerBuilder", "Lcom/worldturner/medeia/pointer/JsonPointerBuilder;", "currentNode", "Lcom/worldturner/medeia/parser/TreeNode;", "tree", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationConsumer;", "consumer", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationConsumer;", "inputSourceName", "Ljava/lang/String;", "<init>", "(Lcom/worldturner/medeia/parser/TreeNode;Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationConsumer;Ljava/lang/String;)V", "DynamicTokenLocation", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class JsonParserFromSimpleTree implements JsonParserAdapter {
    private final JsonTokenDataAndLocationConsumer consumer;
    private TreeNode currentNode;
    private final DynamicTokenLocation dynamicLocation;
    private final String inputSourceName;
    private final JsonPointerBuilder jsonPointerBuilder;
    private int level;
    private final ArrayDeque<Set<String>> propertyNamesStack;
    private final TreeNode tree;

    /* compiled from: JsonParserFromSimpleTree.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/worldturner/medeia/parser/tree/JsonParserFromSimpleTree$DynamicTokenLocation;", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "(Lcom/worldturner/medeia/parser/tree/JsonParserFromSimpleTree;)V", "column", "", "getColumn", "()I", "inputSourceName", "", "getInputSourceName", "()Ljava/lang/String;", FirebaseAnalytics.Param.LEVEL, "getLevel", "line", "getLine", "pointer", "Lcom/worldturner/medeia/pointer/JsonPointer;", "getPointer", "()Lcom/worldturner/medeia/pointer/JsonPointer;", "propertyNames", "", "getPropertyNames", "()Ljava/util/Set;", "toString", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final class DynamicTokenLocation implements JsonTokenLocation {
        public DynamicTokenLocation() {
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public int getColumn() {
            TreeNode treeNode = JsonParserFromSimpleTree.this.currentNode;
            if (treeNode != null) {
                return treeNode.getColumn();
            }
            return -1;
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public String getInputSourceName() {
            return JsonParserFromSimpleTree.this.inputSourceName;
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public int getLevel() {
            return JsonParserFromSimpleTree.this.level;
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public int getLine() {
            TreeNode treeNode = JsonParserFromSimpleTree.this.currentNode;
            if (treeNode != null) {
                return treeNode.getLine();
            }
            return -1;
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public JsonPointer getPointer() {
            return JsonParserFromSimpleTree.this.jsonPointerBuilder.toJsonPointer();
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public Set<String> getPropertyNames() {
            Set<String> set = (Set) JsonParserFromSimpleTree.this.propertyNamesStack.peek();
            if (set == null) {
                return b0.b;
            }
            return set;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("at ");
            if (getLine() != -1) {
                sb.append(getLine());
                if (getColumn() != -1) {
                    sb.append(':');
                    sb.append(getColumn());
                }
                sb.append(" (");
                sb.append(getPointer());
                sb.append(')');
            } else {
                sb.append(getPointer());
            }
            String inputSourceName = getInputSourceName();
            if (inputSourceName != null) {
                sb.append(" in ");
                sb.append(inputSourceName);
            }
            String sb2 = sb.toString();
            j.b(sb2, "b.toString()");
            return sb2;
        }
    }

    public JsonParserFromSimpleTree(TreeNode treeNode, JsonTokenDataAndLocationConsumer jsonTokenDataAndLocationConsumer, String str) {
        j.g(treeNode, "tree");
        j.g(jsonTokenDataAndLocationConsumer, "consumer");
        this.tree = treeNode;
        this.consumer = jsonTokenDataAndLocationConsumer;
        this.inputSourceName = str;
        this.propertyNamesStack = new ArrayDeque<>();
        this.dynamicLocation = new DynamicTokenLocation();
        this.jsonPointerBuilder = new JsonPointerBuilder();
    }

    private final void generateEvents(TreeNode treeNode) {
        m mVar = new m(this) { // from class: com.worldturner.medeia.parser.tree.JsonParserFromSimpleTree$generateEvents$1
            {
                super(this);
            }

            @Override // com.amazon.aps.iva.fc0.m
            public Object get() {
                return ((JsonParserFromSimpleTree) this.receiver).currentNode;
            }

            @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
            public String getName() {
                return "currentNode";
            }

            @Override // com.amazon.aps.iva.yb0.b
            public f getOwner() {
                return e0.a(JsonParserFromSimpleTree.class);
            }

            @Override // com.amazon.aps.iva.yb0.b
            public String getSignature() {
                return "getCurrentNode()Lcom/worldturner/medeia/parser/TreeNode;";
            }

            @Override // com.amazon.aps.iva.fc0.i
            public void set(Object obj) {
                ((JsonParserFromSimpleTree) this.receiver).currentNode = (TreeNode) obj;
            }
        };
        V v = mVar.get();
        mVar.set(treeNode);
        try {
            if (treeNode instanceof SimpleNode) {
                this.jsonPointerBuilder.consume(((SimpleNode) treeNode).getToken());
                this.consumer.consume(((SimpleNode) treeNode).getToken(), this.dynamicLocation);
            } else if (treeNode instanceof ArrayNode) {
                this.jsonPointerBuilder.consume(JsonTokenDataKt.getTOKEN_START_ARRAY());
                this.consumer.consume(JsonTokenDataKt.getTOKEN_START_ARRAY(), this.dynamicLocation);
                this.level++;
                for (TreeNode treeNode2 : ((ArrayNode) treeNode).getNodes()) {
                    generateEvents(treeNode2);
                }
                this.level--;
                this.jsonPointerBuilder.consume(JsonTokenDataKt.getTOKEN_END_ARRAY());
                this.consumer.consume(JsonTokenDataKt.getTOKEN_END_ARRAY(), this.dynamicLocation);
            } else if (treeNode instanceof ObjectNode) {
                this.jsonPointerBuilder.consume(JsonTokenDataKt.getTOKEN_START_OBJECT());
                this.consumer.consume(JsonTokenDataKt.getTOKEN_START_OBJECT(), this.dynamicLocation);
                this.level++;
                this.propertyNamesStack.addFirst(new HashSet());
                for (Map.Entry<String, TreeNode> entry : ((ObjectNode) treeNode).getNodes().entrySet()) {
                    JsonTokenData jsonTokenData = new JsonTokenData(JsonTokenType.FIELD_NAME, entry.getKey(), 0L, null, null, 28, null);
                    this.jsonPointerBuilder.consume(jsonTokenData);
                    this.consumer.consume(jsonTokenData, this.dynamicLocation);
                    generateEvents(entry.getValue());
                    this.propertyNamesStack.peek().add(entry.getKey());
                }
                this.propertyNamesStack.removeFirst();
                this.level--;
                this.jsonPointerBuilder.consume(JsonTokenDataKt.getTOKEN_END_OBJECT());
                this.consumer.consume(JsonTokenDataKt.getTOKEN_END_OBJECT(), this.dynamicLocation);
            }
        } finally {
            mVar.set(v);
        }
    }

    @Override // com.worldturner.medeia.parser.JsonParserAdapter
    public void parseAll() {
        generateEvents(this.tree);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
