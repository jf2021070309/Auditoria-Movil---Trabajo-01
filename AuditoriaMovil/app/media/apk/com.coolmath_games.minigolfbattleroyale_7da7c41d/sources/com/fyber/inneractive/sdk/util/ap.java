package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/* loaded from: classes.dex */
public final class ap {
    public static Node a(Node node, String str) {
        if (node == null) {
            return null;
        }
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeName().equals(str)) {
                return item;
            }
        }
        return null;
    }

    public static List<Node> b(Node node, String str) {
        ArrayList arrayList = new ArrayList();
        if (node != null) {
            NodeList childNodes = node.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item.getNodeName().equals(str)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }

    public static String c(Node node, String str) {
        Node namedItem;
        if (node == null || str == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    public static Integer d(Node node, String str) {
        String c = c(node, str);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        try {
            return Integer.valueOf(c);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean e(Node node, String str) {
        String c = c(node, str);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        try {
            return Boolean.valueOf(c);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String a(Node node) {
        if (node == null || node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }
}
