package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.j0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: Reader.java */
/* loaded from: classes.dex */
public interface f1 {
    <T> T a(g1<T> g1Var, p pVar) throws IOException;

    <K, V> void b(Map<K, V> map, j0.a<K, V> aVar, p pVar) throws IOException;

    @Deprecated
    <T> T c(g1<T> g1Var, p pVar) throws IOException;

    <T> void d(List<T> list, g1<T> g1Var, p pVar) throws IOException;

    @Deprecated
    <T> void e(List<T> list, g1<T> g1Var, p pVar) throws IOException;

    int getFieldNumber() throws IOException;

    int getTag();

    boolean readBool() throws IOException;

    void readBoolList(List<Boolean> list) throws IOException;

    i readBytes() throws IOException;

    void readBytesList(List<i> list) throws IOException;

    double readDouble() throws IOException;

    void readDoubleList(List<Double> list) throws IOException;

    int readEnum() throws IOException;

    void readEnumList(List<Integer> list) throws IOException;

    int readFixed32() throws IOException;

    void readFixed32List(List<Integer> list) throws IOException;

    long readFixed64() throws IOException;

    void readFixed64List(List<Long> list) throws IOException;

    float readFloat() throws IOException;

    void readFloatList(List<Float> list) throws IOException;

    int readInt32() throws IOException;

    void readInt32List(List<Integer> list) throws IOException;

    long readInt64() throws IOException;

    void readInt64List(List<Long> list) throws IOException;

    int readSFixed32() throws IOException;

    void readSFixed32List(List<Integer> list) throws IOException;

    long readSFixed64() throws IOException;

    void readSFixed64List(List<Long> list) throws IOException;

    int readSInt32() throws IOException;

    void readSInt32List(List<Integer> list) throws IOException;

    long readSInt64() throws IOException;

    void readSInt64List(List<Long> list) throws IOException;

    String readString() throws IOException;

    void readStringList(List<String> list) throws IOException;

    void readStringListRequireUtf8(List<String> list) throws IOException;

    String readStringRequireUtf8() throws IOException;

    int readUInt32() throws IOException;

    void readUInt32List(List<Integer> list) throws IOException;

    long readUInt64() throws IOException;

    void readUInt64List(List<Long> list) throws IOException;

    boolean skipField() throws IOException;
}
