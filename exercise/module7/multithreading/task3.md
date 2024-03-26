вывод программы:

```
All tasks started
Cannot run tasks in executor anymore. It is shutting down
Task 1 executed by pool-1-thread-2
Task 2 executed by pool-1-thread-3
Task 0 executed by pool-1-thread-1
Task 5 executed by pool-1-thread-2
Task 4 executed by pool-1-thread-3
Task 3 executed by pool-1-thread-1
Task 8 executed by pool-1-thread-1
Task 6 executed by pool-1-thread-3
Task 7 executed by pool-1-thread-2
Task 11 executed by pool-1-thread-2
Task 10 executed by pool-1-thread-3
Task 9 executed by pool-1-thread-1
Task 12 executed by pool-1-thread-2
Task 14 executed by pool-1-thread-1
Task 13 executed by pool-1-thread-3
Task 15 executed by pool-1-thread-2
Task 17 executed by pool-1-thread-3
Task 16 executed by pool-1-thread-1
Task 19 executed by pool-1-thread-3
Task 18 executed by pool-1-thread-2
```

Задачи выполняются в трех потоках, потоки выполняют их по мере их освобождения.

После вызова метода shutdown ExecutorService больше не может быть использован для отправки новых задач и не будет принимать новые задачи для выполнения
