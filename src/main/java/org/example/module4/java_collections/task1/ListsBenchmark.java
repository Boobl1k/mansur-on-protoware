package org.example.module4.java_collections.task1;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.All)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(value = 1)
@Warmup(iterations = 1, time = 1)
@Measurement(iterations = 3, time = 10)
public class ListsBenchmark {

    @Param({"1000000"})
    private int size;

    private ArrayList<Integer> arrayList;
    private LinkedList<Integer> linkedList;

    @Setup(Level.Invocation)
    public void setup() {
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
    }

    @Benchmark
    public void addArrayListBeginning() {
        arrayList.add(0, 9999999);
    }

    @Benchmark
    public void addArrayListMiddle() {
        arrayList.add(size / 2, 9999999);
    }

    @Benchmark
    public void addArrayListEnd() {
        arrayList.add(9999999);
    }

    @Benchmark
    public void addLinkedListBeginning() {
        linkedList.addFirst(9999999);
    }

    @Benchmark
    public void addLinkedListMiddle() {
        linkedList.add(size / 2, 9999999);
    }

    @Benchmark
    public void addLinkedListEnd() {
        linkedList.addLast(9999999);
    }

    @Benchmark
    public void removeArrayListBeginning() {
        arrayList.remove(0);
    }

    @Benchmark
    public void removeArrayListMiddle() {
        arrayList.remove(size / 2);
    }

    @Benchmark
    public void removeArrayListEnd() {
        arrayList.remove(arrayList.size() - 1);
    }

    @Benchmark
    public void removeLinkedListBeginning() {
        linkedList.removeFirst();
    }

    @Benchmark
    public void removeLinkedListMiddle() {
        linkedList.remove(size / 2);
    }

    @Benchmark
    public void removeLinkedListEnd() {
        linkedList.removeLast();
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(new String[]{"ListsBenchmark"});
    }
}