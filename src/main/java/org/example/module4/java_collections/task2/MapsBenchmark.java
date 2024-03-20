package org.example.module4.java_collections.task2;

import org.openjdk.jmh.annotations.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(value = 1)
@Warmup(iterations = 1, time = 1)
@Measurement(iterations = 3, time = 10)
public class MapsBenchmark {

    private Map<Integer, String> hashMap;
    private Map<Integer, String> treeMap;

    @Setup
    public void setup() {
        hashMap = new HashMap<>();
        treeMap = new TreeMap<>();

        for (int i = 0; i < 1000; i++) {
            hashMap.put(i, "Value" + i);
            treeMap.put(i, "Value" + i);
        }
    }

    @Benchmark
    public void searchHashMap() {
        String value = hashMap.get(500);
    }

    @Benchmark
    public void searchTreeMap() {
        String value = treeMap.get(500);
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(new String[]{"MapsBenchmark"});
    }
}
